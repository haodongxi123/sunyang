package io.syy.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.syy.jcartstoreback.dto.out.ProductListOutDTO;
import io.syy.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
