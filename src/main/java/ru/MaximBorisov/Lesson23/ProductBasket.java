package ru.MaximBorisov.Lesson23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductBasket implements Basket {
//    private List<Product> productList = new ArrayList<>();
    private Map<String, Integer> productList = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (!productList.containsKey(product)){
            this.productList.put(product,quantity);
        }else{
            System.out.println("продукт с данным названием существует");
        }
    }

    @Override
    public void removeProduct(String product) {
        if(productList.containsKey(product)){
            productList.remove(product);
        }else{
            System.out.println("Данного продукта не существует");
        }

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if(productList.containsKey(product)){
            productList.replace(product, quantity);
        }else{
            System.out.println("Данного продукта не существует");
        }
    }

    @Override
    public void clear() {
        this.productList.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> item : productList.entrySet()){

            result.add("Product: " + item.getKey() +  "Quantity: " + item.getValue());
        }

        return result;
    }

    @Override
    public int getProductQuantity(String product) {
        int result = 0;
        if(productList.containsKey(product)){
           result= productList.get(product);
        }else{
            System.out.println("Данного продукта не существует");
        }
        return result;
    }
}
