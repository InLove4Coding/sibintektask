package com.kuzmin.evgenii.sibintek.service;

import com.kuzmin.evgenii.sibintek.model.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class WorkerRepoImpl {


    private WorkerRepo workerRepo;

    public WorkerRepoImpl(WorkerRepo workerRepo) {
        this.workerRepo = workerRepo;
    }

    public void addNewWorker(Worker worker) {
        workerRepo.save(worker);
        log.info("Добавлен новый рабочий: {} в отдел: {}", worker.getName(), worker.getDepartment());
    }
}
