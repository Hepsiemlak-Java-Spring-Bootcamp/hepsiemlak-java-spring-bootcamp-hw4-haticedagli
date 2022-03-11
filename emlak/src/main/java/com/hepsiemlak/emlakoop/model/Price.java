package com.hepsiemlak.emlakoop.model;

import com.hepsiemlak.emlakoop.enums.Currency;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "value")
    private Integer value;
    @Enumerated(EnumType.STRING)
    private Currency currency;
}
