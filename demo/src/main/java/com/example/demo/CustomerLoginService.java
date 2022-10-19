package com.example.demo;

public interface CustomerLoginService {
    public  String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException;
}
