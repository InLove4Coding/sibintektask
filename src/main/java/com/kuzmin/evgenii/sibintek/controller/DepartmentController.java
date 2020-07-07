package com.kuzmin.evgenii.sibintek.controller;


import com.kuzmin.evgenii.sibintek.model.Department;
import com.kuzmin.evgenii.sibintek.model.Worker;
import com.kuzmin.evgenii.sibintek.service.DepartmentRepoImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/control/v1/department")
public class DepartmentController {


    private final DepartmentRepoImpl departmentRepo;

    public DepartmentController(DepartmentRepoImpl departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @PostMapping(path = "/addDepartment")
    void addDepartment(@RequestBody Department department) {
        departmentRepo.addNewDepartment(department);
    }

    @GetMapping(path = "/getAllWorkerByDepartment")
    List<Worker> getAllWorkerByDepartment(@RequestParam long departmentId) {
        return departmentRepo.getAllWorkerByDepartment(departmentId);
    }

}
