package it.raffo.raffopizza.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SALE")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "START_SALE", nullable = false)
    private LocalDate startSale;

    @Column(name = "FINISH_SALE", nullable = false)
    private LocalDate finishSale;

    @Column(name = "DISCOUNT", nullable = false)
    private String discount;

    @ManyToOne
    @JoinColumn(name = "Pizza.id", nullable = false)
    private Pizza pizza;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getStartSale() {
        return startSale;
    }

    public void setStartSale(LocalDate startSale) {
        this.startSale = startSale;
    }

    public LocalDate getFinishSale() {
        return finishSale;
    }

    public void setFinishSale(LocalDate finishSale) {
        this.finishSale = finishSale;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizzaSale(Pizza pizza) {
        this.pizza = pizza;
    }

}
