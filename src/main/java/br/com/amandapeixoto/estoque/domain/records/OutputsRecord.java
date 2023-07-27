package br.com.amandapeixoto.estoque.domain.records;

import br.com.amandapeixoto.estoque.domain.Items;
import br.com.amandapeixoto.estoque.domain.PaymentType;
import br.com.amandapeixoto.estoque.domain.Users;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OutputsRecord(
        Items items,
        Integer quantity,
        BigDecimal outputValue,
        BigDecimal discountValue,
        PaymentType type,
        LocalDateTime outputDate,
        LocalDateTime canceledDate,
        Users users
) {
}
