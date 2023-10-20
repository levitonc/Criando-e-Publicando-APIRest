package me.carvalholevis.service.impl;

import me.carvalholevis.domain.repository.UserRepository;
import me.carvalholevis.service.UserService;
import me.carvalholevis.domain.model.User;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }



    @Override
    public User findById(Long id) {
            return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account Number already exists");

        }
            return userRepository.save(userToCreate);
        }
        ;


    }