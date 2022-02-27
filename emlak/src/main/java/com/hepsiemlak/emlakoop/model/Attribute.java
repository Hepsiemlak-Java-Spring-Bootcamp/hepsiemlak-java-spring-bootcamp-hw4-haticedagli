package com.hepsiemlak.emlakoop.model;

import com.hepsiemlak.emlakoop.enums.AttributeType;
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
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private AttributeType attributeType;
    @Column(name = "value")
    private String value;
}
