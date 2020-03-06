package io.syy.jcartadministrationback.service;

import io.syy.jcartadministrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);
}
