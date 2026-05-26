package ru.ystu.math.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;


@Entity
@Table(name = "math_constant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MathConstant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_group", length = 10, nullable = false)
    private String nameGroup;

    @Column(name = "max_param", nullable = false)
    private Double maxParam;

    @Column(name = "min_param", nullable = false)
    private Double minParam;

    @Column(name = "weight_param", nullable = false)
    private Double weightParam;

    @Column(name = "max_group", nullable = false)
    private Double maxGroup;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;
}
