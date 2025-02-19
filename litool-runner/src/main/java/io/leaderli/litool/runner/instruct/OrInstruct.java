package io.leaderli.litool.runner.instruct;

import io.leaderli.litool.core.meta.Lira;

public class OrInstruct implements Instruct {
    @Override
    public Object apply(Object[] objects) {
        return invoke(Lira.of(objects).cast(Boolean.class).toArray(Boolean.class));
    }

    public Boolean invoke(Boolean... conditions) {

        for (Boolean condition : conditions) {
            if (condition) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String name() {
        return null;
    }
}
