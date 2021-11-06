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

    @Override
    public void insertProduct(Product nuevoProduct) {
        productRepository.insertProduct(nuevoProduct.getName(), nuevoProduct.getPrice(),nuevoProduct.getQuantity());
    }

    @Override
    public Product selectProductById(int id) {
        return productRepository.selectProductById(id);
    }

    @Override
    public void deleteProductById(int id ) {
         productRepository.deleteProductById(id);

    }

    @Override
    public void updateProductByid(Product updateProduct) {
        productRepository.updateProductById(updateProduct.getId(),updateProduct.getName(),updateProduct.getPrice(),updateProduct.getQuantity());
    }
}
