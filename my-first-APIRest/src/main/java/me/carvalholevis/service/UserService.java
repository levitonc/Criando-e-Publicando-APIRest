package me.carvalholevis.service;

import me.carvalholevis.domain.model.User;

public interface UserService  {

    User findById(Long id);

    User create(User userToCreate);
}
