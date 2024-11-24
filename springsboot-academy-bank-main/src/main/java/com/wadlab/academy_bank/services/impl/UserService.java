package com.wadlab.academy_bank.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wadlab.academy_bank.dto.BankResponse;
import com.wadlab.academy_bank.dto.UserRequest;
import com.wadlab.academy_bank.dto.UserResponse;
import com.wadlab.academy_bank.entity.User;
import com.wadlab.academy_bank.repository.UserRepository;


public interface UserService {
    public BankResponse createAccount(UserRequest userRequest);
    public List<UserResponse> getAllUsers() ;
    public UserResponse getUserById(Long id) ;
    public UserResponse updateUser(Long id, UserRequest userRequest);
    public void deleteUser(Long id);
}
