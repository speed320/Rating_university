package ru.ystu.math.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.ystu.math.model.MathConstant;

import java.util.List;

@Repository
public interface MathConstantRepository extends JpaRepository<MathConstant, Long> {

    @Query("select m from MathConstant m where m.createdAt = (select max(m2.createdAt) from MathConstant m2 where m2.nameGroup = m.nameGroup)")
    List<MathConstant> findLatestMathConstants();
}
