package io.syy.jcartadministrationback.service.impl;

import io.syy.jcartadministrationback.dao.OrderHistoryMapper;
import io.syy.jcartadministrationback.po.OrderHistory;
import io.syy.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }

    @Override
    public Long create(OrderHistory orderHistory) {
        orderHistoryMapper.insertSelective(orderHistory);
        Long orderHistoryId = orderHistory.getOrderHistoryId();
        return orderHistoryId;
    }
}
