package io.syy.jcartadministrationback.controller;

import io.syy.jcartadministrationback.dto.in.AdministratorLogInDTO;
import io.syy.jcartadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class Administrator {

        @GetMapping("/login")
        public  String login(AdministratorLogInDTO administratorLogInDTO){
            return null;
        }

        @GetMapping("/getProfile")
        public  AdministratorLogInDTO getProfile(Integer adminstratorId){
            return null;
        }

        @PostMapping("/updateProdfile")
         public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

        }


}
