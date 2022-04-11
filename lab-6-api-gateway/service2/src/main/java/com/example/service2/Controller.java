package com.example.service2;
import com.example.service2.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class Controller {

    private List<Product> products = new ArrayList<Product>();

    @Autowired
    public Controller() {}

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/create")
    public void create(@RequestBody Product product, BindingResult result) {
        if(result.hasErrors())
            throw new RuntimeException("Product creation exception");
        products.add(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return products;
    }
}