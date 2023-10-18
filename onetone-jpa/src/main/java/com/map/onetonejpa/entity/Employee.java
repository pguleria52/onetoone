package com.map.onetonejpa.entity;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmpId")
    private int empId;

    @Column(name = "EmpName")
    private String name;

    @Column(name = "EmpAge")
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk")
        private Address address;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_emp_id", referencedColumnName = "EmpId")
//    private List<Address> address;
}
