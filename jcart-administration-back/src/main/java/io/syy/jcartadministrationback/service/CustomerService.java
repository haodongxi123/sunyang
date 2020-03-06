package io.syy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.syy.jcartadministrationback.po.Customer;

public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);
}
