package com.microservices.accounts.service;

import com.microservices.accounts.dto.CustomerDto;
import com.microservices.accounts.dto.ResponseDto;

public interface IAccountsService {
    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
