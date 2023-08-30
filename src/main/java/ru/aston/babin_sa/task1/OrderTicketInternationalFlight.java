package ru.aston.babin_sa.task1;

import java.math.BigDecimal;

public class OrderTicketInternationalFlight extends Order{

    private Route route;  // класс в самолете
    private BigDecimal resultTicket = new BigDecimal(0.0); // цена билета

    public OrderTicketInternationalFlight(int id, BigDecimal coefficient, BigDecimal amount, User user, Route route) {
        super(id, coefficient, amount, user);
        this.route = route;
    }

    // получаем цену с учетом скидки в зависимости от класса в самолете
    public BigDecimal getDiscount() {
        switch (route) {
            case BUSINESS -> resultTicket = BigDecimal.valueOf(550.0);
            case ECONOMY -> resultTicket = BigDecimal.valueOf(300.0);
            default -> resultTicket = BigDecimal.valueOf(0);
        }
        if (getCoefficient().compareTo(BigDecimal.ZERO) > 0) {
            resultTicket = resultTicket.subtract((resultTicket.divide(BigDecimal.valueOf(100))).multiply(getCoefficient()));
        }
        return resultTicket;
    }

    // сумма билетов
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
