package ru.aston.babin_sa.task1.service;

import ru.aston.babin_sa.task1.Route;
import ru.aston.babin_sa.task1.exception.ZeroTicketsException;
import ru.aston.babin_sa.task1.model.Order;
import ru.aston.babin_sa.task1.model.User;

import java.math.BigDecimal;

public class OrderTicketRegionalFlight extends Order {

    private Route route;  // класс в самолете
    private BigDecimal resultTicket = new BigDecimal(0.0); // цена билета

    public OrderTicketRegionalFlight(int id, BigDecimal coefficient, BigDecimal amount, User user, Route route) {
        super(id, coefficient, amount, user);
        this.route = route;
    }

    // получаем цену с учетом скидки в зависимости от класса в самолете
    public BigDecimal getDiscount() {
        switch (route) {
            case BUSINESS -> resultTicket = BigDecimal.valueOf(250.0);
            case ECONOMY -> resultTicket = BigDecimal.valueOf(100.0);
            default -> resultTicket = BigDecimal.valueOf(0);
        }
        if (getCoefficient().compareTo(BigDecimal.ZERO) > 0) {
            resultTicket = resultTicket.subtract((resultTicket.divide(BigDecimal.valueOf(100))).multiply(getCoefficient()));
        }
        return resultTicket;
    }

    // сумма билетов
    public BigDecimal getTicketAmount2() throws ZeroTicketsException {
        if (getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            resultTicket = BigDecimal.valueOf(0.0);
            throw new ZeroTicketsException(800, "Вы не приобрели ни одного билета");
        } else {
            resultTicket = resultTicket.multiply(getAmount());
        }
        return resultTicket;
    }

    // прошлая реализация метода
    public BigDecimal getTicketAmount() {
        if (getAmount().compareTo(BigDecimal.ZERO) > 0) {
            resultTicket = resultTicket.multiply(getAmount());
        } else {
            resultTicket = BigDecimal.valueOf(0.0);
        }
        return resultTicket;
    }


    public BigDecimal getResultTicket() {
        return resultTicket;
    }

    @Override
    public String toString() {
        return "Пользователь " + getUser().getSurname() +
                " заказ билетов на сумму " + resultTicket + "";
    }
}
