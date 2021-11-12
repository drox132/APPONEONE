package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.Shopping;
import com.fran.AppOneOne.Repository.ShoppingRepository;
import com.fran.AppOneOne.Service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImplementation implements ShoppingService {

    private final ShoppingRepository shoppingRepository;

    @Autowired
    public ShoppingServiceImplementation(ShoppingRepository shoppingRepository) {
        this.shoppingRepository = shoppingRepository;
    }

    @Override
    public List<Shopping> selectAllShopping() {
        return shoppingRepository.selectAllShopping();
    }

    @Override
    public Shopping selectAllShoppingById(int id) {
        return shoppingRepository.selectAllShoppingById(id);
    }

    @Override
    public void insertShopping(Shopping nuevoShopping) {
        shoppingRepository.insertshopping(nuevoShopping.getName(),nuevoShopping.getAddress());

    }

    @Override
    public void updateShoppingBy(Shopping updateShopping) {
        shoppingRepository.updateshoppingById(updateShopping.getId(),updateShopping.getName(),updateShopping.getAddress());
    }

    @Override
    public void deleteShoppingById(int id) {
        shoppingRepository.deleteShoppingById(id);

    }
}
