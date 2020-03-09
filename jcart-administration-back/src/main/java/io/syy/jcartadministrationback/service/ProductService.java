package io.syy.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.syy.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.syy.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.syy.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.syy.jcartadministrationback.dto.out.ProductListOutDTO;
import io.syy.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                   Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}

