package com.zeroten.common.util;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CheckUtilsTest {
//    判断如果 strings 中有任意⼀个字符串为空，则返回 false，否则返回 true。函数：isAnyEmpty(String... strings)
    @Test
    public void testIsAnyEmpty(){
        Assert.assertEquals(CheckUtils.isAnyEmpty(new String[]{"123456", "b ", "fewe"}), true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(new String[]{"123456", "", "fewe"}), false);
    }

//    判断引⽤类型数组是否为空，为空或 null 则返回 true，否则返回 false
    @Test
    public void testIsEmpty(){
        Assert.assertEquals(CheckUtils.isEmpty(new String[]{"123456", "b ", "fewe"}), false);
        Assert.assertEquals(CheckUtils.isEmpty(new String[]{}), true);
        Assert.assertEquals(CheckUtils.isEmpty(new String[2]), false);
    }

//    判断 str1 和 str2 字符串是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回false。
//    boolean equals(String str1, String str2)
    @Test
    public void testStringEquals(){
        Assert.assertEquals(CheckUtils.equals("abc", "bc"), false);
        Assert.assertEquals(CheckUtils.equals(null, "bc"), false);
        Assert.assertEquals(CheckUtils.equals("abc", null), false);
        Assert.assertEquals(CheckUtils.equals("abc", "abc"), true);
    }

//    boolean equals(Integer n1, Integer n2)
//    判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回false。
    @Test
    public void testIntegerEquals(){
        Assert.assertEquals(CheckUtils.equals(new Integer(3), new Integer(4)), false);
        Assert.assertEquals(CheckUtils.equals(null, new Integer(4)), false);
        Assert.assertEquals(CheckUtils.equals(new Integer(3), null), false);
        Assert.assertEquals(CheckUtils.equals(new Integer(4), new Integer(4)), true);
    }

}
