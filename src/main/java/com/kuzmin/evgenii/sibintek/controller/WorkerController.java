package com.kuzmin.evgenii.sibintek.controller;


import com.kuzmin.evgenii.sibintek.model.Worker;
import com.kuzmin.evgenii.sibintek.service.WorkerRepoImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/control/v1/worker")
public class WorkerController {


    private WorkerRepoImpl workerRepoImpl;

    public WorkerController(WorkerRepoImpl workerRepoImpl) {
        this.workerRepoImpl = workerRepoImpl;
    }

    @PostMapping(path = "addWorker")
    void addWorker(@RequestBody Worker worker) {
        workerRepoImpl.addNewWorker(worker);
    }


}
