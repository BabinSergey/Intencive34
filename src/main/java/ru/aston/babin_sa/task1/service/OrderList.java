package ru.aston.babin_sa.task1.service;

import ru.aston.babin_sa.task1.model.Order;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderList {

    List<Order> orderList;

    public OrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public BigDecimal calcAmount() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Order order : orderList) {
            sum = sum.add(order.getResultTicket());
        }
        System.out.println("Сумма всех заказов " + sum);
        return sum;
    }

    public void sortTicket() {
        Collections.sort(orderList, Comparator.comparing(o -> o.getUser()
                .getSurname()));

        for (Order order : orderList) {
            System.out.println(order);
        }
    }
}
