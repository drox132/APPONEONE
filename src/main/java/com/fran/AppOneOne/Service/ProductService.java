package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.Product;

import java.util.List;

public interface ProductService {

    List<Product> selectAllProduct();

    void insertProduct (Product nuevoProduct);

    Product selectProductById(int id);

    void deleteProductById (int id);

    void updateProductByid(Product updateProduct);



}
