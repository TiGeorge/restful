package com.example.restfuldemo.payroll;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "CUSTOMER_ORDRER")
public class Order {

    private @Id @GeneratedValue Long id;

    private String description;
    private Status status;


    public Order(String description, Status status) {
        this.description = description;
        this.status = status;
    }
}
