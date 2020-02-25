package io.syy.jcartadministrationback.controller;

import io.syy.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.syy.jcartadministrationback.dto.out.OrderInvoiceShowOutDTO;
import io.syy.jcartadministrationback.dto.out.OrderListOutDTO;
import io.syy.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.syy.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getInvoice")
    public OrderInvoiceShowOutDTO getInvoice(@RequestParam Long orderid){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShowOutDTO getShipInfo(@RequestParam Long orderId)【
    return null;
}
