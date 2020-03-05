package io.syy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.syy.jcartadministrationback.dto.out.OrderListOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);
}
