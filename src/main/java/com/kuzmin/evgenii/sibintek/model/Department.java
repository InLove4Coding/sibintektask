package com.kuzmin.evgenii.sibintek.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "DEPARTMENT")
//Таблица отделов
public class Department {

    //Имя отдела
    String departmentName;


    //Список рабочих департамента
    List<Worker> workerList = new ArrayList();
}
