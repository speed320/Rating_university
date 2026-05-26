-- liquibase formatted sql
-- changeset sergey:0000_init_table

CREATE TABLE IF NOT EXISTS batch_name_groups (
    batch_id         UUID PRIMARY KEY,
    name_groups      JSONB NOT NULL,
    created_at       TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS university_rating_result (
    id                 BIGSERIAL PRIMARY KEY,
    rating_class       VARCHAR(1)  NOT NULL,
    rating_year        INTEGER NOT NULL,
    rating             JSONB NOT NUll,
    batch_id           UUID NOT NULL,


    CONSTRAINT fk_batch_name_groups
    FOREIGN KEY (batch_id)
    REFERENCES batch_name_groups(batch_id)
    ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS math_constant (
    id                  BIGSERIAL PRIMARY KEY,
    name_group          VARCHAR(10) NOT NULL,
    max_param           REAL NOT NULL,
    min_param           REAL NOT NULL,
    weight_param        REAL NOT NULL,
    max_group           REAL NOT NULL,
    created_at          TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP
);
