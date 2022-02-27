package com.hepsiemlak.emlakoop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "province", nullable = false)
    private String province;
    @Column(name = "district", nullable = false)
    private String district;
    @Column(name = "neighborhood", nullable = false)
    private String neighborhood;
    @Column(name = "address", nullable = false)
    private String address;
}
