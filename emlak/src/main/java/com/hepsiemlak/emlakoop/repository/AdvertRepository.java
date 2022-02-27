package com.hepsiemlak.emlakoop.repository;


import com.hepsiemlak.emlakoop.model.Advert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public interface AdvertRepository extends JpaRepository<Advert, Integer> {

}
