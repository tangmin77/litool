package io.leaderli.litool.dom.sax;

import io.leaderli.litool.core.lang.TupleMap;
import io.leaderli.litool.core.meta.Lira;
import io.leaderli.litool.core.type.ComponentType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leaderli
 * @since 2022/7/9 10:32 AM
 * <p>
 * 用于多个不同标签名的集合类标签
 */
public abstract class SaxList<T extends SaxBean> implements ComponentType<T> {

    private final List<T> children = new ArrayList<>();


    public void add(T t) {
        children.add(t);
    }

    public Lira<T> lira() {
        return Lira.of(children);
    }

}
