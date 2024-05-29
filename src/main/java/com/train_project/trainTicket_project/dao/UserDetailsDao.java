package com.train_project.trainTicket_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train_project.trainTicket_project.Entities.*;

public interface UserDetailsDao extends JpaRepository<UserDetails, Long> {

}
