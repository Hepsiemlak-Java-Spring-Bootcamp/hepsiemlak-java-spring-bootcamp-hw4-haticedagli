package com.hepsiemlak.emlakoop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "campaign_message_active")
    private boolean campaignMessageActive;

    //relations
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Advert> adverts = new ArrayList<>();
    //private List<Advert> favoriteAdverts = new ArrayList<>();
    //private List<Search> savedSearches = new ArrayList<>();
    //private List<Message> messages = new ArrayList<>();
}
