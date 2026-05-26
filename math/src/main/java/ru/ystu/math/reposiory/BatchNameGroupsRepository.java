package ru.ystu.math.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.ystu.math.model.BatchNameGroups;

import java.util.List;
import java.util.UUID;

@Repository
public interface BatchNameGroupsRepository extends JpaRepository<BatchNameGroups, Long> {

    @Query("SELECT b FROM BatchNameGroups b LEFT JOIN FETCH b.ratings WHERE b.batchId IN :batchIds")
    List<BatchNameGroups> findAllByIdWithResults(@Param("batchIds") List<UUID> batchIds);
}
