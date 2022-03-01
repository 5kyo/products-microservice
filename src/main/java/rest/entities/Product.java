package rest.entities;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Cacheable
@Table(name = "product")
public class Product extends PanacheEntity{

    @Column(length = 40, unique = true)
    private String productName;
    
    private Integer productStock;
    private double productPrice; 

    public Product(){

    }

    public Product(String productName, Integer productStock, double productPrice) {
        this.productName = productName;
        this.productStock = productStock;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductStock() {
        return this.productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void addCountToStock(Integer productStock){
        this.productStock+=productStock;
    }

}
