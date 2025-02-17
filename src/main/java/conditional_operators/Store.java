package conditional_operators;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Store {
    private final String storeName;
    private Map<String, Double> menu = new HashMap<>();
    private Map<Integer, String> productPosition = new HashMap<>();
    Order order;

    public Store(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public Map<String, Double> getMenu() {
        return this.menu;
    }

    public void setMenu(HashMap<String, Double> productWithPrice) {
        int index = 1;
        for(Map.Entry<String, Double> product : productWithPrice.entrySet()) {
            this.menu.put(product.getKey(), product.getValue());
            this.productPosition.put(index, product.getKey());
            index++;
        }
    }

    public Map<Integer, String> getProductPosition() {
        return this.productPosition;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void printMenu() {
        System.out.println("Меню магазина \"" + this.storeName + "\":");
        final int[] position = {1};
        this.menu.forEach((key, value) -> {
            System.out.println(String.format("%s. %s, цена: %s евро", position[0], key, value));
            position[0]++;
        });
    }

    public void makeCheckout() {
        Scanner scr = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите вашу сумму денег...");
        double clientMoney = Math.abs(scr.nextDouble());
        if (clientMoney < order.getTotalCost()) {
            System.out.println("Денег не хватает!");
        } else if(clientMoney == order.getTotalCost()) {
            System.out.println("Спасибо за покупку!");
        } else {
            double change = clientMoney - order.getTotalCost();
            int rounded = (int) Math.round(change * 100);
            System.out.println("Ваша сдача: " + (double) rounded / 100);
        }
    }
}
