package org.educational.ordermanager.repository;

import org.educational.ordermanager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);

    List<Product> findByCategoryName(String categoryName);

    List<Product> findByPriceGreaterThan(double value);

    List<Product> findByPriceLessThan(double value);

    List<Product> findByNameContaining(String name);

    List<Product> findByCategoryIdOrderByPrice(long id);

    List<Product> findByCategoryIdOrderByPriceDesc(long id);

    int countByCategoryId(long id);

    int countByPriceIsGreaterThan(double price);

    List<Product> findByPriceLessThanOrNameContains(double value, String text);

    @Query("Select p from Product p order by p.price desc limit 3")
    List<Product> findTopOrderByPrice();

    @Query("select p from Product p where p.category.id= ?1 order by p.price desc limit 3")
    List<Product> findCheaperProductsFromCategoryId(long id);

    @Query("select p from Product p where p.price > ?1")
    List<Product> productsWithValueGreaterThan(double value);

    @Query("select p from Product p order by p.price")
    List<Product> productsOrderAscendent();

    @Query("select p from Product p order by p.price desc")
    List<Product> productsOrderDescendent();

    @Query("select p from Product p where p.name like ?1%")
    List<Product> productsNamesStartingWith(char firstLetter);

    @Query("select avg(p.price) from Product p")
    double averageProductsPrice();

    @Query("select max(p.price) from Product p where p.category.id= ?1")
    double maxProductPriceOfCategory(long id);

    @Query("select count(p) from Product p where p.category.id=?1")
    int numberOfProductsByCategory(long id);

    @Query("select p from Product p where p.name=?1 or p.category.name=?2")
    List<Product> filterByNameOrCategory(String name, String miscelanea);

    @Query("select p from Product p order by p.price desc limit 5")
    List<Product> findTopFiveExpensiveProducts();
}
