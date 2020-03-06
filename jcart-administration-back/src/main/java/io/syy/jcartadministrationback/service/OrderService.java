package io.syy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.syy.jcartadministrationback.dto.out.OrderListOutDTO;
import io.syy.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
