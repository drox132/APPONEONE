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












//no puedo ayudarte si no me dices que quieres que te ayude
// no se como hacer la query para insert product debo clocarle los dos puntos y creo que va sin el @
//correcto
// y en el arumento lo hao asi @Param("nameVariable") String name, @Param("priceVariable") int price
//me lo preguntas o me lo dices? te lopregunto
//si mmm entonces lo voy a hacer pero no me dejes solo que me da miedo <- 💩💩💩💩 jajajja puedes seguir si dale cualquier cosa
//te escribo si, recuerda revisar lo que ya hiciste en proyectos anteriores y si no entiendes me escribes ok
//no
//esta mal?
