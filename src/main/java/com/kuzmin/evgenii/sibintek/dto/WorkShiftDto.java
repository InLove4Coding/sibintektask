package com.kuzmin.evgenii.sibintek.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkShiftDto {
    private long workerId;
    private int shiftHours;
    private String shiftDate;
}
