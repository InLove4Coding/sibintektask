package com.kuzmin.evgenii.sibintek.controller;


import com.kuzmin.evgenii.sibintek.model.Department;
import com.kuzmin.evgenii.sibintek.service.DepartmentRepoImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/control/v1/department")
public class DepartmentController {


    private DepartmentRepoImpl departmentRepo;

    public DepartmentController(DepartmentRepoImpl departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @PostMapping(path = "/addDepartment")
    void addDepartment(@RequestBody Department department) {
        departmentRepo.addNewDepartment(department);
    }


}
