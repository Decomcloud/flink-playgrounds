package org.apache.flink.playgrounds.spendreport;

import org.apache.flink.table.annotation.DataTypeHint;
import org.apache.flink.table.functions.ScalarFunction;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @date 2022/11/28 10:25
 */
public class MyFloor extends ScalarFunction {
    public @DataTypeHint("TIMESTAMP(3)") LocalDateTime eval(
            @DataTypeHint("TIMESTAMP(3)") LocalDateTime timestamp) {

        return timestamp.truncatedTo(ChronoUnit.HOURS);
    }
}
