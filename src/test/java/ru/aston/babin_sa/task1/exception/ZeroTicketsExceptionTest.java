package ru.aston.babin_sa.task1.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.babin_sa.task1.Route;
import ru.aston.babin_sa.task1.model.User;
import ru.aston.babin_sa.task1.service.OrderTicketInternationalFlight;
import ru.aston.babin_sa.task1.service.OrderTicketRegionalFlight;

import java.math.BigDecimal;

public class ZeroTicketsExceptionTest {

    @Test
    public void negativeNumberOfTicketsRegional() {
        User user1 = new User("Ivan", "Mamai", 44);
        OrderTicketRegionalFlight ticket1 = new OrderTicketRegionalFlight(
                1,
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(-2), // отрицательное число
                user1,
                Route.BUSINESS);
        ticket1.getDiscount();

        Assertions.assertThrows(ZeroTicketsException.class, ticket1 :: getTicketAmount2);
    }

    @Test
    public void zeroNumberOfTicketsRegional() {
        User user1 = new User("Ivan", "Mamai", 44);
        OrderTicketRegionalFlight ticket1 = new OrderTicketRegionalFlight(
                1,
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(0), // число 0
                user1,
                Route.BUSINESS);
        ticket1.getDiscount();

        Assertions.assertThrows(ZeroTicketsException.class, ticket1 :: getTicketAmount2);
    }

    @Test
    public void positiveNumberOfTicketsRegional() {
        User user1 = new User("Ivan", "Mamai", 44);
        OrderTicketRegionalFlight ticket1 = new OrderTicketRegionalFlight(
                1,
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(2), // положительное число
                user1,
                Route.BUSINESS);
        ticket1.getDiscount();

        Assertions.assertDoesNotThrow(ticket1 :: getTicketAmount2);
    }

    @Test
    public void negativeNumberOfTicketsInternational() {
        User user1 = new User("Sergey", "Petrov", 24);
        OrderTicketInternationalFlight ticket5 = new OrderTicketInternationalFlight(
                1,
                BigDecimal.valueOf(15),
                BigDecimal.valueOf(-4), // отрицательное число
                user1,
                Route.BUSINESS);
        ticket5.getDiscount();

        Assertions.assertThrows(ZeroTicketsException.class, ticket5 :: getTicketAmount2);
    }

    @Test
    public void zeroNumberOfTicketsInternational() {
        User user1 = new User("Sergey", "Petrov", 24);
        OrderTicketInternationalFlight ticket5 = new OrderTicketInternationalFlight(
                1,
                BigDecimal.valueOf(15),
                BigDecimal.valueOf(0), // число 0
                user1,
                Route.BUSINESS);
        ticket5.getDiscount();

        Assertions.assertThrows(ZeroTicketsException.class, ticket5 :: getTicketAmount2);
    }

    @Test
    public void positiveNumberOfTicketsInternational() {
        User user1 = new User("Sergey", "Petrov", 24);
        OrderTicketInternationalFlight ticket5 = new OrderTicketInternationalFlight(
                1,
                BigDecimal.valueOf(15),
                BigDecimal.valueOf(4), // положительное число
                user1,
                Route.BUSINESS);
        ticket5.getDiscount();

        Assertions.assertDoesNotThrow(ticket5 :: getTicketAmount2);
    }
}
