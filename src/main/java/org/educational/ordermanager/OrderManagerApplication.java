package org.educational.ordermanager;

import org.educational.ordermanager.repository.CategoryRepository;
import org.educational.ordermanager.repository.ClientRepository;
import org.educational.ordermanager.repository.OrderRepository;
import org.educational.ordermanager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class OrderManagerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrderManagerApplication.class, args);
    }

    @Autowired
    private ProductRepository prodRepo;

    @Autowired
    private ClientRepository clientRepo;

    @Autowired
    private OrderRepository ordRepo;

    @Autowired
    private CategoryRepository catRepo;

    @Override
    public void run(String... args) throws Exception {

        // 1 - Retorne todos os produtos com o nome exato fornecido.
        //System.out.println(ProdRepo.findByName("Notebook Gamer"));
        // 2 - Retorne todos os produtos associados a uma categoria específica.
        //System.out.println(ProdRepo.findByCategoryName("Aparelhos"));
        // 3 - Retorne produtos com preço maior que o valor fornecido.
        //System.out.println(ProdRepo.findByPriceGreaterThan(200.00));
        // 4 - Retorne produtos com preço menor que o valor fornecido.
        //System.out.println(ProdRepo.findByPriceLessThan(600.00));
        // 5 - Retorne produtos cujo nome contenha o termo especificado.
        //System.out.println(prodRepo.findByNameContaining("Not"));
        // 6 - Retorne pedidos que ainda não possuem uma data de entrega.
        // sei que para isso teria que adicionar uma coluna que aceita valores nulos
        // 7 - Retorne pedidos com data de entrega preenchida.
        // e depois fazer a validação com 'isNull' e 'isNotNull' no final.
        // 8 - Retorne produtos de uma categoria ordenados pelo preço de forma crescente.
        //System.out.println(prodRepo.findByCategoryIdOrderByPrice(1));
        // 9 - Retorne produtos de uma categoria ordenados pelo preço de forma decrescente.
        //System.out.println(prodRepo.findByCategoryIdOrderByPriceDesc(2));
        // 10 - Retorne a contagem de produtos em uma categoria específica.
        //System.out.println(prodRepo.countByCategoryId(1));
        // 11 - Retorne a contagem de produtos cujo preço seja maior que o valor fornecido.
        //System.out.println(prodRepo.countByPriceIsGreaterThan(200));
        // 12 - Retorne produtos com preço menor que o valor fornecido ou cujo nome contenha o termo especificado.
        //System.out.println(prodRepo.findByPriceLessThanOrNameContains(200,null));
        // 13 - Retorne pedidos feitos após uma data específica.
        //System.out.println(ordRepo.findByOrderDateAfter(LocalDateTime.now().minusDays(3)));
        // 14 - Retorne pedidos feitos antes de uma data específica.
        //System.out.println(ordRepo.findByOrderDateBefore(LocalDateTime.now()));
        // 15 - Retorne pedidos feitos em um intervalo de datas.
        //System.out.println(ordRepo.findByOrderDateBetween(LocalDateTime.now().minusDays(3),LocalDateTime.now()));
        // 16 - Retorne os três produtos mais caros.
        //System.out.println(prodRepo.findTopOrderByPrice());
        // 17 - Retorne os cinco produtos mais baratos de uma categoria.
        //System.out.println(prodRepo.findCheaperProductsFromCategoryId(1));


        //1 - Crie uma consulta que retorne os produtos com preço maior que um valor
        //System.out.println(prodRepo.productsWithValueGreaterThan(300.00));
        //2 - Crie uma consulta que retorne os produtos ordenados pelo preço crescente.
        //System.out.println(prodRepo.productsOrderAscendent());
        //3 - Crie uma consulta que retorne os produtos ordenados pelo preço decrescente.
        //System.out.println(prodRepo.productsOrderDescendent());
        //4 - Crie uma consulta que retorne os produtos que comecem com uma letra específica.
        //System.out.println(prodRepo.productsNamesStartingWith('M'));
        //5 - Crie uma consulta que retorne os pedidos feitos entre duas datas.
        //System.out.println(ordRepo.findOrdersBetween(LocalDateTime.now().minusDays(4),LocalDateTime.now()));
        //6 - Crie uma consulta que retorne a média de preços dos produtos.
        //System.out.println(prodRepo.averageProductsPrice());
        //7 - Crie uma consulta que retorne o preço máximo de um produto em uma categoria
        //System.out.println(prodRepo.maxProductPriceOfCategory(2));
        //8 - Crie uma consulta para contar o número de produtos por categoria.
        //System.out.println(prodRepo.numberOfProductsByCategory(2));
        //9 - Crie uma consulta para filtrar categorias com mais de 10 produtos.
        // Query: select * from categoria where categoria.produtos > 10;
        //10 - Crie uma consulta para retornar os produtos filtrados por nome ou por categoria.
        //System.out.println(prodRepo.filterByNameOrCategory(null,"Miscelânea"));
        //11 - Crie uma consulta nativa para buscar os cinco produtos mais caros
        System.out.println(prodRepo.findTopFiveExpensiveProducts());
    }
}
