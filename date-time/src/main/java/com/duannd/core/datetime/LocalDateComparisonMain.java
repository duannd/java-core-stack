package com.duannd.core.datetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class LocalDateComparisonMain {

    public static void main(String[] args) {
        afterAndLog(LocalDate.of(2022, 2, 1),
                LocalDate.of(2022, 1, 31));

        beforeAndLog(LocalDate.of(2022, 1, 31),
                LocalDate.of(2022, 2, 1));

        equalAndLog(LocalDate.of(2022, 1, 31).withDayOfMonth(1),
                LocalDate.of(2022, 1, 1));

        // 2022-01-31
        equalAndLog(LocalDate.of(2022, 1, 10)
                        .plusMonths(1) // return 2022-02-10
                        .withDayOfMonth(1) // return 2022-02-01
                        .minusDays(1), // return 2022-01-31
                LocalDate.of(2022, 1, 31));

        // 2022-02-28
        equalAndLog(LocalDate.of(2022, 2, 10)
                        .plusMonths(1) // return 2022-03-10
                        .withDayOfMonth(1) // return 2022-03-01
                        .minusDays(1), // return 2022-02-28
                LocalDate.of(2022, 2, 28));
    }

    private static void afterAndLog(LocalDate date1, LocalDate date2) {
        log.info("{} is after {}: {}", date1, date2, date1.isAfter(date2));
    }

    private static void beforeAndLog(LocalDate date1, LocalDate date2) {
        log.info("{} is before {}: {}", date1, date2, date1.isBefore(date2));
    }

    private static void equalAndLog(LocalDate date1, LocalDate date2) {
        log.info("{} is equal {}: {}", date1, date2, date1.isEqual(date2));
    }

}
