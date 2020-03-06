package io.syy.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.syy.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.syy.jcartadministrationback.dto.out.OrderInvoiceShowOutDTO;
import io.syy.jcartadministrationback.dto.out.OrderListOutDTO;
import io.syy.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.syy.jcartadministrationback.dto.out.PageOutDTO;
import io.syy.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        Page<OrderListOutDTO> page = orderService.search(pageNum);

        PageOutDTO<OrderListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        OrderShowOutDTO orderShowOutDTO = orderService.getById(orderId);
        return orderShowOutDTO;
    }

    @GetMapping("/getInvoice")
    public OrderInvoiceShowOutDTO getInvoice(@RequestParam Long orderid){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShowOutDTO getShipInfo(@RequestParam Long orderId){
        return null;
    }

}
