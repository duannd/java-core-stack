package com.duannd.core.datetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Slf4j
public class MonthDiffMain {

    public static void main(String[] args) {
        diffMonthAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 1, 31));

        diffMonthAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 2, 1));

        diffMonthAndLog(LocalDate.of(2022, 1, 31),
                LocalDate.of(2022, 2, 28));

        diffMonthAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 2, 28));
    }

    private static void diffMonthAndLog(LocalDate startDate, LocalDate endDate) {
        log.info("Diff Month between {} and {} are {}", startDate, endDate,
                ChronoUnit.MONTHS.between(startDate, endDate));
    }


}
