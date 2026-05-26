package ru.ystu.math.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.ystu.math.model.RatingResult;

import java.util.List;
import java.util.UUID;

@Repository
public interface RatingResultRepository extends JpaRepository<RatingResult, Long> {

    @Query("SELECT rating FROM RatingResult rating WHERE rating.batchId.batchId  = :batchId")
    List<RatingResult> findByBatchId(@Param("batchId") UUID batchId);
}
