package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product, Integer> {




    @Query(value = "SELECT * FROM  product", nativeQuery = true)
    List<Product> selectAllProduct();


    @Query(value = "INSERT INTO product (name, price,quantity)values( :name, :price, :quantity)", nativeQuery = true)
    void insertProduct(@Param("name") String name, @Param("price") int price, @Param("quantity") int quantity);


    @Query(value = "SELECT * FROM product WHERE id= :idusuario ", nativeQuery = true)
    Product selectProductById(@Param("idusuario") int id );


    @Query (value= "DELETE FROM PRODUCT WHERE ID = :idusuario ", nativeQuery = true)
    void deleteProductById(@Param("idusuario") int id);

   
   

    @Query (value="UPDATE product SET name= :nameusuario , price = :priceusuario, quantity= :quantityusuario WHERE id = :idusuario ", nativeQuery = true)
    void updateProductById(@Param("idusuario") int id, @Param("nameusuario") String name, @Param("priceusuario") int price, @Param("quantityusuario") int quantity );


}










