package io.syy.jcartstoreback.controller;

import io.syy.jcartstoreback.dto.in.AddresUpdateInDTO;
import io.syy.jcartstoreback.dto.in.AddressCreateInDTO;
import io.syy.jcartstoreback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getAddressByCustomer")
    public List<AddressListOutDTO> getAddressByCustomerId(@RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/create")
    public  Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO,@RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/update")
    public  void update(@RequestBody AddresUpdateInDTO addresUpdateInDTO,@RequestAttribute Integer customerId ){
        
    }
}
