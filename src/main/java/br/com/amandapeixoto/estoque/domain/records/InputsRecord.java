package br.com.amandapeixoto.estoque.domain.records;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record InputsRecord(
        Integer quantity,
        BigDecimal unitValue,
        LocalDateTime inputDate,
        LocalDateTime canceledDate
) {

}
