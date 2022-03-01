package rest.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import rest.entities.Product;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product>{

}
