package com.train_project.trainTicket_project.services;

import java.util.List;

import com.train_project.trainTicket_project.Entities.*;

public interface UserDetailsService {
    UserDetails addUser(UserDetails userDetails);

    UserDetails getUserById(Long userId);

    List<UserDetails> getAllUsers();

    UserDetails updateUser(Long userId, UserDetails userDetails);

    void removeUser(Long userId);
}
