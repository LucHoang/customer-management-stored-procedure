package com.hsl.service;

import com.hsl.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}