package io.syy.jcartstoreback.service;


import io.syy.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

}
