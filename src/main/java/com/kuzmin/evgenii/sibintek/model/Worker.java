package com.kuzmin.evgenii.sibintek.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "WORKER")
//Таблица рабочих
public class Worker {

    //Имя рабочего
    String name;

    //Отдел, где работает работник
    Department department;

    //Список его смен
    List<WorkShift> workShiftList = new ArrayList<>();


}
