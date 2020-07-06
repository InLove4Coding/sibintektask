package com.kuzmin.evgenii.sibintek.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "WORKER")
//Таблица рабочих
public class Worker {

    //sequence - На стороне бд. Чтобы не было 1 одинаковый Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //Имя рабочего
    private String name;
    //Отдел, где работает работник
    @JoinColumn(name = "department_id",foreignKey =@ForeignKey(name = "worker_to_department"))
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;
    //Список его смен

    //mapped By Названия поля в workshift
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "worker")
    private Set<WorkShift> workShiftList;


}
