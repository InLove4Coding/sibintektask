package com.kuzmin.evgenii.sibintek.model;


import lombok.Data;

import java.time.LocalDate;

@Data
//Рабочая смена
public class WorkShift {


    //Дата смены
    LocalDate date;

    //Продолжительность смены в часах
    int shiftHour;

    //Зарплата в смену
    long salary;


}
