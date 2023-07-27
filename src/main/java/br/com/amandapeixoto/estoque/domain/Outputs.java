package br.com.amandapeixoto.estoque.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Outputs implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer quantity;
    private BigDecimal outputValue;
    private BigDecimal discountValue;
    @Enumerated(EnumType.STRING)
    private PaymentType type;
    private LocalDateTime outputDate;
    private LocalDateTime canceledDate;
    @ManyToOne
    @JoinColumn(name = "id_items")
    private Items items;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users users;
}
