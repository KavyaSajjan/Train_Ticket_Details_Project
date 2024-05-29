package com.train_project.trainTicket_project.controller;

import com.train_project.trainTicket_project.Entities.UserDetails;
import com.train_project.trainTicket_project.dao.UserDetailsDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private UserDetailsDao userDetailsDao;

    @PostMapping("/purchase")
    public UserDetails purchaseTicket(@RequestBody UserDetails userDetails) {
        return userDetailsDao.save(userDetails);
    }
    
    @GetMapping("/purchases")
    public List<UserDetails> getAllPurchases() {
        return userDetailsDao.findAll();
    }

    @GetMapping("/receipt/{id}")
    public UserDetails getReceipt(@PathVariable Long id) {
        return userDetailsDao.findById(id).orElse(null);
    }

    @GetMapping("/users/{section}")
    public List<UserDetails> getUsersBySection(@PathVariable String section) {
        // Logic to get users by section
        return null;
    }

    @DeleteMapping("/remove/{id}")
    public void removeUser(@PathVariable Long id) {
        userDetailsDao.deleteById(id);
    }

    @PutMapping("/modify/{id}")
    public UserDetails modifyUserSeat(@PathVariable Long id, @RequestParam String newSeat) {
        UserDetails userDetails = userDetailsDao.findById(id).orElse(null);
        if (userDetails != null) {
            userDetails.setSeatAllocation(newSeat);
            return userDetailsDao.save(userDetails);
        }
        return null;
    }
}

