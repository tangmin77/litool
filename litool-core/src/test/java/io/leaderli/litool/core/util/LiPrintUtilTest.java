package io.leaderli.litool.core.util;

import java.util.Arrays;

/**
 * @author leaderli
 * @since 2022/6/25
 */
class LiPrintUtilTest {


    //    @Test
    public void print() {

        LiPrintUtil.print0("123", 4565);
        LiPrintUtil.print("123", "456");
        LiPrintUtil.print(1, null, 1, Arrays.asList(1, null));
        LiPrintUtil.print(null, null, 1, Arrays.asList(1, null));

        LiPrintUtil.print_format("a {0}", 2, 3);


        LiPrintUtil.print0("_", "1", "2");


        LiPrintUtil.print(1, 2, 3);
        LiPrintUtil.println(1, 2, 3);
        LiPrintUtil.println(Arrays.asList(1, 2, 3));


    }
}
