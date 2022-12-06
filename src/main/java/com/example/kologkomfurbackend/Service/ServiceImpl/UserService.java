package com.example.kologkomfurbackend.Service.ServiceImpl;

import com.example.kologkomfurbackend.Model.Product;

import com.example.kologkomfurbackend.Model.User;
import com.example.kologkomfurbackend.Repository.UserRepository;
import com.example.kologkomfurbackend.Service.IService.IUserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService implements IUserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        Set<User> users = new HashSet<>();
       userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User save(User object) {
        return userRepository.save(object);
    }

    @Override
    public void delete(User object) {
      userRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        userRepository.deleteById(aLong);

    }

    @Override
    public Optional<User> findById(Long aLong) {
        return userRepository.findById(aLong);
    }
}
