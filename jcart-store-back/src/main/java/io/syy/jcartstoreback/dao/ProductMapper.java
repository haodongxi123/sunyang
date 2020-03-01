package io.syy.jcartstoreback.dao;

import com.github.pagehelper.Page;
import io.syy.jcartstoreback.dto.out.ProductListOutDTO;
import io.syy.jcartstoreback.po.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);



    Page<ProductListOutDTO> search();

}