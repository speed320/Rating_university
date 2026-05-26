-- liquibase formatted sql
-- changeset sergey:0000_init_table

CREATE TABLE IF NOT EXISTS user_entered_parameters (
    id BIGSERIAL                PRIMARY KEY,
    param_class                 VARCHAR(1) NOT NULL,
    param_year                  INTEGER NOT NULL,
    params                      JSONB NOT NULL,
    batch_id                    UUID NOT NULL,
    user_id                     BIGINT NOT NULL,
    created_at TIMESTAMPTZ      NOT NULL DEFAULT CURRENT_TIMESTAMP
);