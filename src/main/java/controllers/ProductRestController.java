package controllers;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repos.ProductRepo;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {

    @Autowired
    private ProductRepo repo;

    @PostMapping("/products")
    public Product create(@RequestBody Product product){
        return repo.save(product);
    }

}
