package com.kuzmin.evgenii.sibintek.controller;


import com.kuzmin.evgenii.sibintek.dto.WorkShiftDto;
import com.kuzmin.evgenii.sibintek.model.Worker;
import com.kuzmin.evgenii.sibintek.service.WorkerRepoImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/control/v1/worker")
public class WorkerController {

    final private WorkerRepoImpl workerRepoImpl;

    public WorkerController(WorkerRepoImpl workerRepoImpl) {
        this.workerRepoImpl = workerRepoImpl;
    }

    @PostMapping(path = "/addWorker")
    void addWorker(@RequestBody Worker worker) {
        workerRepoImpl.addNewWorker(worker);
    }

    @PostMapping(path = "/addWorkShift")
    void addWorkShift(@RequestBody WorkShiftDto workShiftDto) {
        workerRepoImpl.addWorkShift(workShiftDto);
    }

    @GetMapping(path = "/findWorkerByName")
    Worker findWorkerByName(@RequestParam String workerName) {
        return workerRepoImpl.findWorkerByName(workerName);
    }
}

