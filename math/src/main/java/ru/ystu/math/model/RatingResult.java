package ru.ystu.math.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import ru.ystu.math.model.json.calc.Rating;

import java.time.Instant;

@Entity
@Table(name = "university_rating_result")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RatingResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rating_class", nullable = false)
    private String ratingClass;

    @Column(name = "rating_year", nullable = false)
    private Integer ratingYear;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "rating", columnDefinition = "jsonb", nullable = false)
    private Rating rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batch_id", nullable = false)
    private BatchNameGroups batchId;
}
