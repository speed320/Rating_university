package ru.ystu.input.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import ru.ystu.input.model.json.Params;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "user_entered_parameters")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEnteredParameters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "param_class", nullable = false)
    private String paramClass;

    @Column(name = "param_year", nullable = false)
    private Integer paramYear;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "params", nullable = false)
    private Params params;

    @Column(name = "batch_id", nullable = false)
    private UUID batchId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;
}
