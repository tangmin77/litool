package io.leaderli.litool.runner.instruct;

import io.leaderli.litool.core.text.StringUtils;
import org.joda.time.DateTime;

public class TimeInstruct implements Instruct {

    @Override
    public Object apply(Object[] objects) {
        return invoke((String)objects[0], (String)objects[1], (String) objects[2]);
    }

    public String invoke(String formatStr, String currentDate, String test) {

        if (StringUtils.isBlank(formatStr)) {
            formatStr = "HHmm";
        }
        if (StringUtils.equals(test, "local_test")) {
            return currentDate;
        }
        return DateTime.now().toString(formatStr);
    }

    @Override
    public String name() {
        return "time";
    }

    @Override
    public FuncScope getScope() {
        return FuncScope.RUNTIME;
    }
}
