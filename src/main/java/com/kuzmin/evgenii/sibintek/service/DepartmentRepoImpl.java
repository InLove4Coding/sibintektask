package com.kuzmin.evgenii.sibintek.service;

import com.kuzmin.evgenii.sibintek.model.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DepartmentRepoImpl {


    private final DepartmentRepo departmentRepo;

    public DepartmentRepoImpl(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public void addNewDepartment(Department department) {
        departmentRepo.save(department);
        log.info("Добавлен новый департамент: {}", departmentRepo);
    }
}

