##maven 项⽬
com.zeroten.common.util（src/main/java⽬录下）编写练习代码，src/main/test目录下com.zeroten.common.util编写课堂示例和测试代码
##### 1.CheckUtils类有如下几个静态方法：
- public static boolean isAnyEmpty(String... strings)
    `String... strings` 为可变参数，你可以认为它是 String[] strings。如果 strings 中有任意一个字符串为空，则返回 false，否则返回 true。

- public static boolean isEmpty(Object[] arr)
    判断引用类型数组是否为空，为空或 null 则返回 true，否则返回 false。

- public static boolean equals(String str1, String str2)
    判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中一个是 null 时返回 false。

- public static boolean equals(Integer n1, Integer n2)
    判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中一个是 null 时返回 false。
#####测试类 CheckUtilsTest对CheckUtils的静态方法进行测试。
#####2.


