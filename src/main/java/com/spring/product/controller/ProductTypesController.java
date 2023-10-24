package com.spring.product.controller;

import com.spring.product.ProductTypeApiController;
import com.spring.product.ProductTypeApiDelegate;
import com.spring.product.model.ProductType;
import com.spring.product.model.ProductTypeSuccessResponse;
import com.spring.product.service.ProductTypeByIdService;
import com.spring.product.service.ProductTypeWriteService;
import com.spring.product.service.ProductTypeReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product/v1/type")
public class ProductTypesController extends ProductTypeApiController {

    @Autowired
    ProductTypeReadService productTypeService;

    @Autowired
    ProductTypeWriteService productTypeCreateService;

    @Autowired
    ProductTypeByIdService productTypeByIdService;

    public ProductTypesController(ProductTypeApiDelegate delegate) {
        super(delegate);
    }

    @GetMapping("/get-product-types")
    public ResponseEntity<ProductTypeSuccessResponse> getProductTypeData(){
        return productTypeService.getProductType();
    }

    @PostMapping("/product-types")
    public ResponseEntity<ProductType> createProductTypeData(@RequestBody ProductType productType){
        productTypeCreateService.createProductType(productType);
        return new ResponseEntity<>(productType, HttpStatus.OK);
    }

    @GetMapping("/get-product-type-by-id/{id}")
    public ResponseEntity<ProductTypeSuccessResponse> getProductById(@PathVariable("id") String id){

        return productTypeByIdService.getProductTypeById(id);
    }
}
