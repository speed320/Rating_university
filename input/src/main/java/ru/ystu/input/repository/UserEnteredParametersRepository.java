package ru.ystu.input.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.ystu.input.model.UserEnteredParameters;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserEnteredParametersRepository extends JpaRepository<UserEnteredParameters, Long> {

    @Query("SELECT u.batchId FROM UserEnteredParameters u " +
            "WHERE u.userId = :userId " +
            "GROUP BY u.batchId " +
            "ORDER BY MAX(u.createdAt) DESC")
    List<UUID> findBatchIdsByUserId(@Param("userId") Long userId, Pageable pageable);
}
