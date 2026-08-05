package org.educational.ordermanager.repository;

import org.educational.ordermanager.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByOrderDateAfter(LocalDateTime orderDate);
    List<Order> findByOrderDateBefore(LocalDateTime orderDate);
    List<Order> findByOrderDateBetween(LocalDateTime initialOrderDate,LocalDateTime finalOrderDate);

    @Query("select o from Order o where o.orderDate between ?1 and ?2")
    List<Order> findOrdersBetween(LocalDateTime initialDate, LocalDateTime finalDate);
}
