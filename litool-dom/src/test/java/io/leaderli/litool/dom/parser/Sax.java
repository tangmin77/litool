package io.leaderli.litool.dom.parser;

import io.leaderli.litool.core.meta.Lino;
import io.leaderli.litool.dom.sax.SaxBean;

/**
 * @author leaderli
 * @since 2022/8/11
 */
public class Sax implements SaxBean {

    Color color;


    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Lino<?> complexField(Class<?> parameterType, String value) {
        if (parameterType == Color.class) {

            return Lino.of(Color.valueOf(value.toUpperCase()));
        }
        return SaxBean.super.complexField(parameterType, value);
    }
}
