package com.kuzmin.evgenii.sibintek.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "DEPARTMENT")
//Таблица отделов
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //Имя отдела
    private String departmentName;
    //Список рабочих департамента
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private Set<Worker> workerList;
}
