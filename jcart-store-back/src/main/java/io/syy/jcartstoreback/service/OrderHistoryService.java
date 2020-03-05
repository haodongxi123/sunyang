package io.syy.jcartstoreback.service;

import io.syy.jcartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
