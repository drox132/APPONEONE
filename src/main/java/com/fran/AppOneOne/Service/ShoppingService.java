package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.Shopping;

import java.util.List;

public interface ShoppingService {

    List<Shopping> selectAllShopping();
    Shopping selectAllShoppingById(int id);
    void insertShopping (Shopping nuevoShopping);
    void updateShoppingBy (Shopping updateShopping);
    void deleteShoppingById (int id);

}
