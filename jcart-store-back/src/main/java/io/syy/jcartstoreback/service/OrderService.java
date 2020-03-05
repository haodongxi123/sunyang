package io.syy.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.syy.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.syy.jcartstoreback.dto.out.OrderShowOutDTO;
import io.syy.jcartstoreback.po.Order;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
