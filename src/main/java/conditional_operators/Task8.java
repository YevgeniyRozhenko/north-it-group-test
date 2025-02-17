package conditional_operators;

import java.util.HashMap;

/*
Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
[сумма сдачи]”
 */
public class Task8 {
    public static void main(String[] args) {
        Store store = new Store("Европейская кулинария");
        store.setMenu(new HashMap<>() {{
            put("Старые добрые вареники по-урсуловски", 10.);
            put("Ливерная колбаса Шольца", 5.70);
            put("Сосиска с паприкашем Орбана", 24.89);
        }});
        store.printMenu();
        Order order = new Order();
        order.makeOrder(store);
        order.printOrder();
        store.setOrder(order);
        store.makeCheckout();
    }
}
