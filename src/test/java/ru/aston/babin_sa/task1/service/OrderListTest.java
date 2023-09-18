package ru.aston.babin_sa.task1.service;

import org.junit.jupiter.api.Test;
import ru.aston.babin_sa.task1.Route;
import ru.aston.babin_sa.task1.model.Order;
import ru.aston.babin_sa.task1.model.User;
import ru.aston.babin_sa.task1.service.OrderList;
import ru.aston.babin_sa.task1.service.OrderTicketInternationalFlight;
import ru.aston.babin_sa.task1.service.OrderTicketRegionalFlight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderListTest {

    @Test
    public void shouldOrderAmountAndList() {

        // Создаем пользователей
        User user1 = new User("Ivan", "Ivanov", 23);
        User user2 = new User("Sergey", "Petrov", 30);
        User user3 = new User("Petr", "Sidorov", 34);
        User user4 = new User("Maxim", "Matveev", 41);

        // Создаем заказы билетов для региональных рейсов
        OrderTicketRegionalFlight ticket1 = new OrderTicketRegionalFlight(1, BigDecimal.valueOf(10), BigDecimal.valueOf(2), user1, Route.BUSINESS);
        OrderTicketRegionalFlight ticket2 = new OrderTicketRegionalFlight(2, BigDecimal.valueOf(10), BigDecimal.valueOf(1), user2, Route.BUSINESS);
        OrderTicketRegionalFlight ticket3 = new OrderTicketRegionalFlight(3, BigDecimal.valueOf(10), BigDecimal.valueOf(3), user3, Route.ECONOMY);
        OrderTicketRegionalFlight ticket4 = new OrderTicketRegionalFlight(4, BigDecimal.valueOf(10), BigDecimal.valueOf(4), user4, Route.ECONOMY);

        ticket1.getDiscount();
        ticket2.getDiscount();
        ticket3.getDiscount();
        ticket4.getDiscount();

        ticket1.getTicketAmount();
        ticket2.getTicketAmount();
        ticket3.getTicketAmount();
        ticket4.getTicketAmount();

        // Создаем заказы билетов для международных рейсов
        OrderTicketInternationalFlight ticket5 = new OrderTicketInternationalFlight(1, BigDecimal.valueOf(20), BigDecimal.valueOf(3), user1, Route.BUSINESS);
        OrderTicketInternationalFlight ticket6 = new OrderTicketInternationalFlight(2, BigDecimal.valueOf(20), BigDecimal.valueOf(2), user2, Route.BUSINESS);
        OrderTicketInternationalFlight ticket7 = new OrderTicketInternationalFlight(3, BigDecimal.valueOf(5), BigDecimal.valueOf(2), user3, Route.ECONOMY);
        OrderTicketInternationalFlight ticket8 = new OrderTicketInternationalFlight(4, BigDecimal.valueOf(5), BigDecimal.valueOf(5), user4, Route.ECONOMY);

        ticket5.getDiscount();
        ticket6.getDiscount();
        ticket7.getDiscount();
        ticket8.getDiscount();

        ticket5.getTicketAmount();
        ticket6.getTicketAmount();
        ticket7.getTicketAmount();
        ticket8.getTicketAmount();

        // Помещаем заказы в список
        List<Order> orderList = new ArrayList<>();
        orderList.add(ticket1);
        orderList.add(ticket2);
        orderList.add(ticket3);
        orderList.add(ticket4);
        orderList.add(ticket5);
        orderList.add(ticket6);
        orderList.add(ticket7);
        orderList.add(ticket8);

        // Выводим результат
        OrderList orderListNew = new OrderList(orderList);
        orderListNew.calcAmount();
        orderListNew.sortTicket();

    }
}
