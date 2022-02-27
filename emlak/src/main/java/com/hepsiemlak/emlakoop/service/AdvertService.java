package com.hepsiemlak.emlakoop.service;

import com.hepsiemlak.emlakoop.model.Advert;
import com.hepsiemlak.emlakoop.model.User;
import com.hepsiemlak.emlakoop.model.dto.AdvertSearchRequest;
import com.hepsiemlak.emlakoop.model.estate.House;
import com.hepsiemlak.emlakoop.repository.AdvertRepository;
import com.hepsiemlak.emlakoop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdvertService {

    public final AdvertRepository advertRepository;
    public final UserRepository userRepository;

    public void save(Advert advert){
        advertRepository.save(advert);
    }

    public List<Advert> searchAdverts(AdvertSearchRequest searchRequest){

        List<Advert> adverts = advertRepository.findAll();

        if(searchRequest.getEstateType() != null){
            adverts = adverts.stream()
                    .filter(advert -> advert.getEstate().getEstateType().equals(searchRequest.getEstateType()))
                    .collect(Collectors.toList());
        }

        if(searchRequest.getProvince() != null){
            adverts = adverts.stream()
                    .filter(advert -> advert.getEstate().getAddress().getProvince().equals(searchRequest.getProvince()))
                    .collect(Collectors.toList());
        }

        switch (searchRequest.getEstateType()){
            case HOUSE -> {

                if(searchRequest.getNumberOfBathrooms() != null){
                    adverts = adverts.stream()
                            .filter(advert -> ((House)advert.getEstate()).getNumberOfBathrooms().equals(searchRequest.getNumberOfBathrooms()))
                            .collect(Collectors.toList());
                }

                if(searchRequest.getNumberOfRooms() != null){
                    adverts = adverts.stream()
                            .filter(advert -> ((House)advert.getEstate()).getNumberOfRooms().equals(searchRequest.getNumberOfRooms()))
                            .collect(Collectors.toList());
                }

            }
        }

        return adverts;
    }

    public List<Advert> getFavoriteAdvertsOfUser(String email){
        User user = userRepository.findByEmail(email);
        return new ArrayList<>(); //user.getFavoriteAdverts();
    }

    public List<Advert> getFavoriteAdvertsOfUserByUserId(Integer id){
        User user = userRepository.findById(id).get();
        return new ArrayList<>(); //user.getFavoriteAdverts();
    }
}
