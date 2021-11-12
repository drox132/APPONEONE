package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.Shopping;
import com.fran.AppOneOne.Service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ShoppingConroller {
    private final ShoppingService shoppingService;

    @Autowired
    public ShoppingConroller(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping("/selectallshopping")
    public List<Shopping>selectAllShopping(){
        return shoppingService.selectAllShopping();
    }
    @GetMapping("/selectshoppingby/{id}")
    public Shopping selectAlShoppingById (@PathVariable int id){
        return shoppingService.selectAllShoppingById(id);
    }

    @PostMapping("/insertshopping")
    public void insertShopping(@RequestBody Shopping nuevoShopping){
        shoppingService.insertShopping(nuevoShopping);
    }

    @PutMapping("/updateshopping")
    public void updateShoppingById(@RequestBody Shopping updateShopping){
        shoppingService.updateShoppingBy(updateShopping);
    }

    @DeleteMapping("/deleteshoppingby/{id}")
    public void deleteShoppingById(@PathVariable int id){
        shoppingService.deleteShoppingById(id);
    }

}

