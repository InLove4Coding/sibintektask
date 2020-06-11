package com.kuzmin.evgenii.sibintek.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "WORK_SHIFT")
//Рабочая смена
public class WorkShift {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    //Дата смены
    private LocalDate date;
    //Продолжительность смены в часах
    private int shiftHour;
    //Зарплата за смену
    private long salary;
    //Рабочий на смене
    @JoinColumn(name = "worker_id", foreignKey = @ForeignKey(name = "work_shift_to_worker"))
    @ManyToOne(fetch = FetchType.LAZY)
    private Worker worker;

}
