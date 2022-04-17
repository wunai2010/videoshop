package com.wunai.front.controller;

import com.wunai.bo.Product;
import com.wunai.result.Result;
import com.wunai.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/portal/product/")
public class MainPageController {

    @Autowired
    private IProductService  productService;

    @GetMapping("/list")
    public Result<List<Product>> list(){
        return new Result<>(productService.query(null));
    }
}
