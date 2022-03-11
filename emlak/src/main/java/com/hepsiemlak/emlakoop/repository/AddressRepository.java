package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
