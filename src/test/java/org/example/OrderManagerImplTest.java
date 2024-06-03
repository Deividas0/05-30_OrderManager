package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerImplTest {
    OrderManagerImpl OMI = new OrderManagerImpl();


    @Test
    void addOrderTest() {
        //Setup
        Order order1 = new Order(1,"1",19.99,"PENDING");
        Order order2 = new Order(2,"2",29.99,"APPROVED");
        //Execute
        OMI.addOrder(order1);
        OMI.addOrder(order2);
        //Assert
        assertTrue(OMI.getOrderById(1).getId() == 1);
        assertEquals("APPROVED", OMI.getOrderById(2).getStatus());
        assertNull(OMI.getOrderById(3));
    }

    @Test
    void removeOrderTest() {
        //Setup
        Order order1 = new Order(1,"1",19.99,"PENDING");
        Order order2 = new Order(2,"2",29.99,"APPROVED");
        //Execute
        OMI.addOrder(order1);
        OMI.addOrder(order2);
        OMI.removeOrder(2);
        //Assert
        assertEquals("PENDING", OMI.getOrderById(1).getStatus());
        assertTrue(OMI.getOrderById(1).getId() == 1);
        assertTrue(OMI.getOrderById(2) == null);
    }

    @Test
    void getOrderByIdTest() {
        //Setup
        Order order1 = new Order(1,"1",19.99,"PENDING");
        Order order2 = new Order(2,"2",29.99,"APPROVED");
        //Execute
        OMI.addOrder(order1);
        OMI.addOrder(order2);
        //Assert
        assertEquals(1, OMI.getOrderById(1).getId());
        assertFalse(OMI.getOrderById(1).getId() == 2);
        assertSame(OMI.getOrderById(1), OMI.getOrderById(1));
        assertNull(OMI.getOrderById(3));
        assertNotEquals("APPROVED", OMI.getOrderById(1).getStatus());
    }

    @Test
    void getOrdersByCustomerTest() {
        //Setup
        Order order1 = new Order(1,"1",19.99,"PENDING");
        Order order2 = new Order(2,"2",29.99,"APPROVED");
        //Execute
        OMI.addOrder(order1);
        OMI.addOrder(order2);
        Order stringOrder1 = OMI.getOrderById(1);
        String stringOrder2 = String.valueOf(OMI.getOrderById(2));
        //Assert
        assertEquals(String.valueOf(stringOrder1),String.valueOf(OMI.getOrdersByCustomer("1").getFirst()));
    }

    @Test
    void calculateTotalRevenueTest() {
        //Setup
        // ---
        //Execute
        // ---
        //Assert
        // ---
    }

    @Test
    void updateOrderStatusTest() {
        //Setup
        // ---
        //Execute
        // ---
        //Assert
        // ---
    }

    @Test
    void filterOrdersByStatusTest() {
        //Setup
        // ---
        //Execute
        // ---
        //Assert
        // ---
    }

    @Test
    void getOrdersAboveCertainValueTest() {
        //Setup
        // ---
        //Execute
        // ---
        //Assert
        // ---
    }
}