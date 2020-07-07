package com.kuzmin.evgenii.sibintek.service;

import com.kuzmin.evgenii.sibintek.dto.WorkShiftDto;
import com.kuzmin.evgenii.sibintek.model.WorkShift;
import com.kuzmin.evgenii.sibintek.model.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;


@Slf4j
@Service
public class WorkerRepoImpl {


    final private WorkerRepo workerRepo;
    final private WorkShiftRepo workShiftRepo;

    public WorkerRepoImpl(WorkerRepo workerRepo, WorkShiftRepo workShiftRepo) {
        this.workerRepo = workerRepo;
        this.workShiftRepo = workShiftRepo;
    }

    public void addNewWorker(Worker worker) {
        workerRepo.save(worker);
        log.info("Добавлен новый рабочий: {} в отдел: {}", worker.getName(), worker.getDepartment());
    }

    public void addWorkShift(WorkShiftDto workShiftDto) {
        WorkShift workShift = new WorkShift();
        workShift.setShiftHour(workShiftDto.getShiftHours());
        workShift.setDate(LocalDate.parse(workShiftDto.getShiftDate(), DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        //isPresent -> возвращает true когда в Optional поле не пустое. А false, то там null
        //ifPresent
        workerRepo.findById(workShiftDto.getWorkerId()).ifPresent(worker -> {
            workShift.setWorker(worker);
            workShiftRepo.save(workShift);
        });
    }

    public Worker findWorkerByName(String workerName) {
        Optional<Worker> byName = workerRepo.findByName(workerName);
        return byName.orElse(null);
    }
}
