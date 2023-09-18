package ru.aston.babin_sa.task1.model;

import ru.aston.babin_sa.task1.model.Discount;
import ru.aston.babin_sa.task1.model.User;

import java.math.BigDecimal;

public abstract class Order implements Discount {

    private int id;
    private BigDecimal coefficient;
    private BigDecimal amount;
    private User user;

    public Order(int id, BigDecimal coefficient, BigDecimal amount, User user) {
        this.id = id;
        this.coefficient = coefficient;
        this.amount = amount;
        this.user = user;
    }

    public abstract BigDecimal getTicketAmount();

    public abstract BigDecimal getResultTicket();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(BigDecimal coefficient) {
        this.coefficient = coefficient;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
