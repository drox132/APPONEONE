package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Exception.DatoDeNameEsVacioException;
import com.fran.AppOneOne.Model.Product;
import com.fran.AppOneOne.Repository.ProductRepository;
import com.fran.AppOneOne.Service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import java.util.FormatterClosedException;
import java.util.List;

@Service
public class ProductServiceImplentation implements ProductService {

    Logger logger= LoggerFactory.getLogger(ProductServiceImplentation.class);

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImplentation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> selectAllProduct() {

       try {
           logger.info("Iniciando proceso de select All");


           List<Product> products = productRepository.selectAllProduct();
           if (products == null) {
               throw new IllegalArgumentException("ha ocurrido un error al retornar la lista de product");
           }

           return products;

       } catch (Exception error){
           logger.error("ha ocurrido un error en el metodo selectAllProduct");
            return null;
       }
    }

    @Override
    public void insertProduct(Product nuevoProduct) {

        try {
            logger.info("Inicializando la insercion del product");

            if (nuevoProduct.getName() == "") {
                throw new DatoDeNameEsVacioException();
            }
            if (nuevoProduct.getName() == null ||
                    nuevoProduct.getPrice() == 0 ||
                    nuevoProduct.getQuantity() == 0) {
                throw new IllegalArgumentException("El dato del product a insertar es null");

            }
            productRepository.insertProduct(nuevoProduct.getName(), nuevoProduct.getPrice(), nuevoProduct.getQuantity());

            logger.info("La insercion del product ha sido ejecutada");
        } catch (JpaSystemException | IllegalArgumentException mensajeError) {
            logger.error("Ha ocurrido un error en el metodo insert product");

        }
    }

    @Override
    public Product selectProductById(int id) {

        try {
            logger.info("Iniciando el metodo select All Product By Id");

            if (id == 0) {
                throw new IllegalArgumentException("El dato ingresado en el id es incorrecto");
            }

            return productRepository.selectProductById(id);
        } catch (Exception error){
            logger.error("Ha ocurrido un error en el metodo selectProductById");
            return null;
        }
    }

    @Override
    public void deleteProductById(int id ) {

        try {
            logger.info("Iniciando el metodo delete Product By Id");

            if (id == 0) {
                throw new IllegalArgumentException("el dato ingresado es incorrecto");
            }
            productRepository.deleteProductById(id);

        }catch (Exception error){
            logger.error("Ha ocurrido un error en el metodo delete");

        }
    }

    @Override
    public void updateProductByid(Product updateProduct) {

        try {
            logger.info("iniciando el metodo updateProductById");

            if (updateProduct.getName() == null ||
                    updateProduct.getPrice() == 0 ||
                    updateProduct.getQuantity() == 0) {
                throw new IllegalArgumentException("Ha ocurrido un error en el dato ingresado");
            }
            productRepository.updateProductById(updateProduct.getId(), updateProduct.getName(), updateProduct.getPrice(), updateProduct.getQuantity());
        }catch (Exception error){
            logger.error("Ha ocurrido un error en el metodo updateProduct");
        }
    }
}
