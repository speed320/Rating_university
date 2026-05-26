package ru.ystu.math.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import ru.ystu.math.model.json.name.NameData;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "batch_name_groups")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BatchNameGroups {
    @Id
    @Column(name = "batch_id", nullable = false)
    private UUID batchId;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "name_groups", columnDefinition = "jsonb", nullable = false)
    private NameData nameGroups;

    @OneToMany(mappedBy = "batchId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RatingResult> ratings = new ArrayList<>();
}
