package com.kuzmin.evgenii.sibintek.service;

import com.kuzmin.evgenii.sibintek.model.Department;
import com.kuzmin.evgenii.sibintek.model.Worker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Long> {


}
