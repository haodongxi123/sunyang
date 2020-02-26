package io.syy.jcartstoreback.controller;

;
import io.syy.jcartstoreback.dto.in.ProductSearchInDTO;
import io.syy.jcartstoreback.dto.out.PageOutDTO;
import io.syy.jcartstoreback.dto.out.ProductListOutDTO;
import io.syy.jcartstoreback.dto.out.ProductShowOutDTO;
import io.syy.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }

}
