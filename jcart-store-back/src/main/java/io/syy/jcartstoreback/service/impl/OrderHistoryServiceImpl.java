package io.syy.jcartstoreback.service.impl;

import io.syy.jcartstoreback.dao.OrderHistoryMapper;
import io.syy.jcartstoreback.po.OrderHistory;
import io.syy.jcartstoreback.service.OrderHistoryService;
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
}
