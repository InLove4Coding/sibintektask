package com.kuzmin.evgenii.sibintek.service;

import com.kuzmin.evgenii.sibintek.model.Worker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkerRepo extends CrudRepository<Worker, Long> {
    //using hql for example
    @Query("SELECT D.workerList FROM Department D WHERE D.id=:departmentId")
    List<Worker> getAllWorkerByDepartment(@Param("departmentId") long departmentId);

    //using spring data+optional Wrapper for example
    Optional<Worker> findByName(String workerName);

}
