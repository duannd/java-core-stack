package com.duannd.core.datetime;

import java.time.LocalDate;

public class DateUtils {

    public static int diffMonths(LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null) {
            return 0;
        }

        // startDate > endDate
        if (startDate.isAfter(endDate)) {
            return 0;
        }

        // startDate <= endDate
        int diff = 0;
        LocalDate endMonth;
        do {
            endMonth = startDate
                    .plusMonths(diff + 1)
                    .withDayOfMonth(1)
                    .minusDays(1);
            diff = diff + 1;
        } while (endDate.isAfter(endMonth));
        return diff;
    }

}
