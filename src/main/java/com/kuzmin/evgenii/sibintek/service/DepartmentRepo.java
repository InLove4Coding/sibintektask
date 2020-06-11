package com.kuzmin.evgenii.sibintek.service;

import com.kuzmin.evgenii.sibintek.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Long> {



}
