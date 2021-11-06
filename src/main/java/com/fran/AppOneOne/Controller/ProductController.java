package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.Product;
import com.fran.AppOneOne.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/selectallproduct")
    public List<Product> SelectAllProduct() {
        return productService.selectAllProduct();
    }

    @PostMapping("/insertproduct")
    public void insertProduct(@RequestBody Product product) {
        productService.insertProduct(product);
    }

    @GetMapping("/selectproductby/{id}")
    public Product selectProductById(@PathVariable int id) {
        return productService.selectProductById(id);
    }

    /*
        @GetMapping ("/select/by/id")
        public Product selectProductByIdBody(@RequestBody int id){
            return productService.selectProductById(id);
        }*/
    @DeleteMapping("/deleteproductby/{id}")
    public void deleteProductById(@PathVariable int id) {
        productService.deleteProductById(id);
    }


    @PostMapping("/updateproductbyid")
    public void updateProductById (@RequestBody Product updateProduct){
        productService.updateProductByid(updateProduct);
    }

}
//bienvenido a la tierra de lo imposible Xd