package me.dio.api.project.service;

import me.dio.api.project.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
