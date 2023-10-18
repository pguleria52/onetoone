package com.map.onetonejpa.entity;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AddId")
    private int addId;

    @Column(name = "City")
    private String city;

    @Column(name = "AddressType")
    private String addressType;

    @OneToOne(mappedBy = "address")
    private Employee employee;
}
