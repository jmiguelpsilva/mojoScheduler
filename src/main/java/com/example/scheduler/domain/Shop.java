package com.example.scheduler.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Address address;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Employee> employees;

    String phoneNumber;
    String email;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Employee manager;
}
