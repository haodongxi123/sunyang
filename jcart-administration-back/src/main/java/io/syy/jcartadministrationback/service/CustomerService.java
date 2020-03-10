package io.syy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.syy.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.syy.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.syy.jcartadministrationback.po.Customer;

public interface CustomerService {
    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
