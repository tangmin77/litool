package io.leaderli.litool.core.meta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author leaderli
 * @since 2022/6/19
 */
class LiraTest {


    @Test
    void of() {

        String[] ss = new String[]{"1", "2"};
        Assertions.assertSame(2, Lira.of(ss).size());

        Assertions.assertSame(1, Lira.of("1").size());
        Assertions.assertSame(3, Lira.of(Arrays.asList(1, 2, 3)).size());
        Assertions.assertSame(2, Lira.of("1", null).size());
        Assertions.assertSame(Lira.none(), Lira.of());


        Assertions.assertSame(Lira.none(), Lira.of());
        Assertions.assertSame(Lira.none(), Lira.of((Object) null));
        Assertions.assertSame(Lira.none(), Lira.of(Collections.emptyIterator()));
        Assertions.assertSame(Lira.none(), Lira.of(Collections.emptyList()));
        Assertions.assertNotSame(Lira.none(), Lira.of(1));
        Assertions.assertNotSame(Lira.of(1), Lira.of(1));


    }
    @Test
    public void filter() {

        Assertions.assertTrue(Lira.of(1, 2, 3).filter(i -> i > 4).notPresent());
        Assertions.assertSame(2, Lira.of(1, 2, 3).filter(i -> i > 1).size());
        Assertions.assertSame(2, Lira.of(1, 2, 3).filter(i -> i > 1).get().get(0).get());

        Assertions.assertEquals(3, Lira.of(1, 2, 3).filter().size());
        Assertions.assertEquals(2, Lira.of(1, null, 3).filter().size());
        Assertions.assertEquals(0, Lira.of((Object) null).filter().size());
    }
    @Test
    void get() {

        Assertions.assertTrue(Lira.none().get().isEmpty());
        Assertions.assertFalse(Lira.of(1).get().isEmpty());
        Assertions.assertSame(2, Lira.of(1, 2).size());
    }


    @Test
    void or() {

        Lira<String> none = Lira.none();

        Assertions.assertEquals("1", none.or("1").getRaw().get(0));
        Assertions.assertEquals("1", Lira.of("1", "2").or(Arrays.asList("5", "4")).getRaw().get(0));

    }

    @Test
    void equals(){
        Assertions.assertEquals(Lira.of(1,2),Lira.of(1,2));
        Assertions.assertNotEquals(Lira.of(2),Lira.of(1,2));
    }
}