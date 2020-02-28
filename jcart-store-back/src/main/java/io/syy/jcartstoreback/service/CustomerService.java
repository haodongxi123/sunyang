package io.syy.jcartstoreback.service;

import io.syy.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.syy.jcartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

}
