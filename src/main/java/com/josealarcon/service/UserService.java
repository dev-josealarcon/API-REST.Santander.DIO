package com.josealarcon.service;

import com.josealarcon.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
