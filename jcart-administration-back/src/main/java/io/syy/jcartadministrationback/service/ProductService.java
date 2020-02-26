package io.syy.jcartadministrationback.service;

import io.syy.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.syy.jcartadministrationback.dto.in.ProductUpdateInDTO;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);
}

