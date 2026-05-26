package ru.ystu.math.cache;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.ystu.math.core.model.NameGroups;
import ru.ystu.math.model.MathConstant;
import ru.ystu.math.reposiory.MathConstantRepository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Component
@RequiredArgsConstructor
public class MathConstantCache {
    private final MathConstantRepository mathConstantRepository;

    private final Map<String, MathConstant> cache = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        log.info("Загрузка констант в кеш...");
        List<MathConstant> latestConstants = mathConstantRepository.findLatestMathConstants();
        cache.clear();
        for (MathConstant mathConstant : latestConstants) {
            updateCache(mathConstant);
        }
        log.info("Успешно загружено {} констант", cache.size());
    }


    public MathConstant getConstant(NameGroups nameGroups) {
        MathConstant mathConstant = cache.get(nameGroups.name());
        if (mathConstant == null) {
            throw new IllegalArgumentException("Константа не найдена: " + nameGroups.name());
        }
        return mathConstant;
    }

    @Transactional
    public MathConstant saveConstant(MathConstant newMathConstant) {
        newMathConstant.setId(null);
        MathConstant savedConstant = mathConstantRepository.save(newMathConstant);

        log.info("Константы {} успешно сохранены в базе данных", savedConstant.getNameGroup());

        updateCache(savedConstant);

        return savedConstant;
    }

    private void updateCache(MathConstant newMathConstant) {
        cache.put(newMathConstant.getNameGroup(), newMathConstant);
        log.debug("Кеш успешно обновлен");
    }
}
