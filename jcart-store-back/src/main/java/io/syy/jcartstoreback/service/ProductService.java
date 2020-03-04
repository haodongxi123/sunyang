package io.syy.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.syy.jcartstoreback.dto.out.ProductListOutDTO;
import io.syy.jcartstoreback.dto.out.ProductShowOutDTO;
import io.syy.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
