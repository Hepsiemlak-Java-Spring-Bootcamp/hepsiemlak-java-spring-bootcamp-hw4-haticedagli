package com.hepsiemlak.emlakoop.service;

import com.hepsiemlak.emlakoop.model.User;
import com.hepsiemlak.emlakoop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    public final UserRepository userRepository;

    public void saveUser(User user){
       userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(Integer id){
        return userRepository.getById(id);
    }
}
