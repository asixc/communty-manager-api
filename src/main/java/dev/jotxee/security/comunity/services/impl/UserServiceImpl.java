package dev.jotxee.security.comunity.services.impl;

import org.springframework.stereotype.Service;

import dev.jotxee.security.comunity.services.UserService;
import dev.jotxee.security.user.User;
import dev.jotxee.security.user.UserRepository;
import lombok.Value;

@Value
@Service
public class UserServiceImpl implements UserService {
    UserRepository repository;
    @Override
    public User getUserById(Integer id) {
        return repository.getReferenceById(id);
    }
}
