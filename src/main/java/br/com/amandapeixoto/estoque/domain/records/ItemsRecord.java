package br.com.amandapeixoto.estoque.domain.records;

import java.math.BigDecimal;

public record ItemsRecord(Long id, String name, String description, BigDecimal value) {
}
