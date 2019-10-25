package ru.MaximBorisov.Lesson23;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket implements Basket {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        this.productList.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {
        for (int i = 0; i < this.productList.size(); i++) {
            if (productList.get(i) != null && productList.get(i).getProduct().equals(product)) {
                this.productList.remove(i);
                break;
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product pr : productList) {
            if (pr != null && pr.getProduct().equals(product)) {
                pr.setQuantity(quantity);
            }
        }
    }

    @Override
    public void clear() {
        this.productList.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> result = new ArrayList<>();
        for (Product pr : productList) {
            if (pr != null) {
                result.add(pr.toString());
            }
        }
        return result;
    }

    @Override
    public int getProductQuantity(String product) {
        int result = 0;
        for (Product pr : productList) {
            if (pr != null && pr.getProduct().equals(product)) {
                result = pr.getQuantity();
            }
        }
        return result;
    }
}
