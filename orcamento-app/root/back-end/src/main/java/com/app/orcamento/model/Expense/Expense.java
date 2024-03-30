package com.app.orcamento.model.Expense;

import java.math.BigDecimal;

import jakarta.persistence.*;;

@Entity
@Table(name = "Expense")
public class Expense {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "categories")
    private String[] categories;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String[] getCategories(){
        return categories;
    }
    public void setCategories(String[] categories){
        this.categories = categories;
    }
    
}
