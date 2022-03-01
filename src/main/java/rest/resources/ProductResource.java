package rest.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.reactive.RestPath;

import io.smallrye.mutiny.Uni;
import rest.entities.Product;
import rest.services.ProductService;

@Path("/products")
public class ProductResource {
    
    @Inject 
    ProductService productService;

    @GET
    public Uni<List<Product>> getAllProducts() {
        return productService.getAllProducts();
    }

    @GET
    @Path("{id}")
    public Uni<Product> getSingleProduct(@RestPath Long id){
        return productService.getSingleProduct(id);
    }

    @POST
    public Uni<Response> addProduct(Product product){
        return productService.addProduct(product);
    }

    @PATCH
    @Path("{id}")
    public Uni<Response> updateProductName(@RestPath Long id, Product product) {
        return productService.updateProductName(id, product);
    }

    @PATCH
    @Path("{id}/stockProduct")
    public Uni<Response> addCountToProductStock(@RestPath Long id, Product product) {
        return productService.addCountToProductStock(id, product);
    }

    @DELETE
    @Path("{id}")
    public Uni<Void> deleteProduct(@RestPath Long id) {
        return productService.deleteProduct(id);
    }
}
