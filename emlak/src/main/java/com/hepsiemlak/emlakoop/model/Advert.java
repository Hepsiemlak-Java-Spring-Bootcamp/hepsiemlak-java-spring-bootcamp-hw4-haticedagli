package com.hepsiemlak.emlakoop.model;

import com.hepsiemlak.emlakoop.enums.Status;
import com.hepsiemlak.emlakoop.model.estate.Estate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Estate estate;
    //private User owner;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Price price;
    @Column(name = "boost")
    boolean boost;
    @Column(name = "createdDate")
    private Date createdDate;
    @Column(name = "updatedDate")
    private Date updatedDate;

    //relations
    //private List<User> favoriteBy = new ArrayList<>();

}
