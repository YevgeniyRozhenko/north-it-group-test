package conditional_operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Order {
    private List<Integer> selectedProductPositions = new ArrayList<>();
    private List<String> productNames = new ArrayList<>();
    private double totalCost;

    public void makeOrder(Store store) {
        selectMenuPositions(store);
        setProductNames(store);
        countTotalCost(store);
    }

    public List<Integer> getSelectedProductPositions() {
        return selectedProductPositions;
    }

    public List<String> getProductNames() {
        return productNames;
    }

    public double getTotalCost() {
        return totalCost;
    }

    private void selectMenuPositions(Store store) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Выберите продукты из меню магазина по номеру позиции.\nВведите 0, если закончили заказ.");
        int position;
        while((position = scr.nextInt()) != 0) {
            if (position < 0 || position > store.getProductPosition().size()) {
                System.out.println("Вы ввели некорректный номер позиции.");
            } else {
                this.selectedProductPositions.add(position);
            }
        }
    }

    private void setProductNames(Store store) {
        for(Integer position : selectedProductPositions) {
            String productName = store.getProductPosition().get(position);
            if (productName != null) {
                this.productNames.add(store.getProductPosition().get(position));
            }
        }
    }

    private void countTotalCost(Store store) {
        double countBuff = 0;
        for (String productName : productNames) {
            countBuff += store.getMenu().get(productName);
        }
        this.totalCost = (double) (int) (countBuff * 100) / 100;
    }

    public void printOrder() {
        System.out.println("Ваш заказ:");
        for (int i = 0; i < selectedProductPositions.size(); i++) {
            System.out.println((i + 1) + ". " + productNames.get(i));
        }
        System.out.println("Общая сумма заказа: " + totalCost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(totalCost, order.totalCost) == 0
                && Objects.equals(selectedProductPositions, order.selectedProductPositions)
                && Objects.equals(productNames, order.productNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectedProductPositions, productNames, totalCost);
    }
}
