package com.kuzmin.evgenii.sibintek.service;

import com.kuzmin.evgenii.sibintek.model.Department;
import com.kuzmin.evgenii.sibintek.model.WorkShift;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkShiftRepo extends CrudRepository<WorkShift, Long> {


}
