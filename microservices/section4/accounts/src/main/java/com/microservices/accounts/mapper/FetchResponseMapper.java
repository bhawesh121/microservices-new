package com.microservices.accounts.mapper;

import com.microservices.accounts.dto.AccountsDto;
import com.microservices.accounts.dto.CustomerDto;
import com.microservices.accounts.dto.FetchResponse;
import com.microservices.accounts.dto.ResponseDto;
import com.microservices.accounts.entity.Accounts;
import com.microservices.accounts.entity.Customer;

public class FetchResponseMapper {

    public static FetchResponse mapToAccountsAndCustomerDto(Accounts accounts, Customer customer, FetchResponse fetchResponse) {
        fetchResponse.setAccountNumber(accounts.getAccountNumber());
        fetchResponse.setAccountType(accounts.getAccountType());
        fetchResponse.setBranchAddress(accounts.getBranchAddress());
        fetchResponse.setName(customer.getName());
        fetchResponse.setEmail(customer.getEmail());
        fetchResponse.setMobileNumber(customer.getMobileNumber());
        return fetchResponse;
    }
}
