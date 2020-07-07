package com.kuzmin.evgenii.sibintek.service;

import com.kuzmin.evgenii.sibintek.model.Department;
import com.kuzmin.evgenii.sibintek.model.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DepartmentRepoImpl {


    private final DepartmentRepo departmentRepo;
    private final WorkerRepo workerRepo;

    public DepartmentRepoImpl(DepartmentRepo departmentRepo, WorkerRepo workerRepo) {
        this.departmentRepo = departmentRepo;
        this.workerRepo = workerRepo;
    }

    public void addNewDepartment(Department department) {
        departmentRepo.save(department);
        log.info("Добавлен новый департамент: {}", departmentRepo);
    }

    public List<Worker> getAllWorkerByDepartment(long departmentId) {
        return workerRepo.getAllWorkerByDepartment(departmentId);
    }


}

