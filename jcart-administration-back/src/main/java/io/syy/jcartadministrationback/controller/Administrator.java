package io.syy.jcartadministrationback.controller;

import io.syy.jcartadministrationback.dto.in.*;
import io.syy.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.syy.jcartadministrationback.dto.out.AdministratorShowOutDTO;
import io.syy.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class Administrator {

        @GetMapping("/login")
        public  String login(AdministratorLogInDTO administratorLogInDTO){
            return null;
        }

        @GetMapping("/getProfile")
        public  AdministratorLogInDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
            return null;
        }

        @PostMapping("/updateProfile")
         public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

        }

        @GetMapping("/getpwdResetCode")
        public  String getpwdResetCode(@RequestParam String email){
            return null;
        }

        @PostMapping("/resetPwd")
        public  void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

        }

        @GetMapping("/getList")
        public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
            return  null;
        }

        @GetMapping("/getById")
        public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
            return null;
        }

        @PostMapping("/create")
        public  Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
            return null;
        }

        @PostMapping("/update")
        public  void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

        }
}
