package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.Product;
import com.fran.AppOneOne.Repository.ProductRepository;
import com.fran.AppOneOne.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplentation implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImplentation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> selectAllProduct() {
        return productRepository.selectAllProduct();

    }
}
