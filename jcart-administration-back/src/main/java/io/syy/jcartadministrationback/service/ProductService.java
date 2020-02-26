package io.syy.jcartadministrationback.service;

import io.syy.jcartadministrationback.dto.in.ProductCreateInDTO;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);
}

