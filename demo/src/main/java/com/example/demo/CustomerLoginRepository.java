package com.example.demo;

public interface CustomerLoginRepository {
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
