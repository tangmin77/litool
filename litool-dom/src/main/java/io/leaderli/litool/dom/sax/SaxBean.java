package io.leaderli.litool.dom.sax;

/**
 * @author leaderli
 * @since 2022/7/9 10:32 AM
 * <p>
 * 用于指定名称 {@link #name()} 的复杂成员变量
 */
public interface SaxBean extends SaxEventHandler {


    default String name() {
        return this.getClass().getSimpleName().toLowerCase();
    }


    /**
     * @param root 入口类
     * @see io.leaderli.litool.dom.parser.SaxEventInterceptor#parse(String)
     */
    default void setRoot(SaxBean root) {
    }


}
