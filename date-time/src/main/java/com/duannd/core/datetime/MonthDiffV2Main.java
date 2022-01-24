package com.duannd.core.datetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class MonthDiffV2Main {

    public static void main(String[] args) {
        diffAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 1, 10)); // 1

        diffAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 1, 31)); // 1

        diffAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 2, 1)); // 2

        diffAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 2, 28)); // 2

        diffAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 3, 1)); // 3

        diffAndLog(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 3, 31)); // 3
    }

    private static void diffAndLog(LocalDate startDate, LocalDate endDate) {
        log.info("Month diff between {} and endDate {} are {}", startDate, endDate,
                DateUtils.diffMonths(startDate, endDate));
    }

}
