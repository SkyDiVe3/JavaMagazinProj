package com.step.manager;

import com.step.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static List <Product> products  = new ArrayList<>();
    private static BoxOffice boxOffice = new BoxOffice();

    public static void seeAllStock(int id){
        System.out.println("A stock of " + products.get(id).getStock() +
                "units for product " + products.get(id).getProductName());
    }

    public static void sellProduct(int id, int quantity){
         products.get(id).setStock( products.get(id).getStock()- quantity);
         boxOffice.setIncome(quantity * products.get(id).getOutPrice());
         boxOffice.setProfit((quantity * products.get(id).getOutPrice()) -
                 (quantity * products.get(id).getOutPrice())*(quantity * products.get(id).getInPrice()));
    }


}
