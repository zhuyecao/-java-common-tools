package com.zeroten.common.util;

public class CheckUtils {
//    String... strings 为可变参数，你可以认为它是 String[] strings。如果 strings 中有任
//    意⼀个字符串为空，则返回 false，否则返回 true。
    public static boolean isAnyEmpty(String... strings){
        for(int i = 0; i < strings.length; i++){
            if(strings[i].equals(""))
                return false;
        }
        return true;
    }

//    public static boolean isEmpty(Object[] arr)
//    判断引⽤类型数组是否为空，为空或 null 则返回 true，否则返回 false
    public static boolean isEmpty(Object[] arr){
        if(arr == null)
            return true;
        if(arr.length == 0)
            return true;
        return false;
    }

//    public static boolean equals(String str1, String str2)
//    判断 str1 和 str2 字符串是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回false。
    public static boolean equals(String str1, String str2){
        if((str1 == null) | (str2 == null))
            return false;
//        if(str1.equals(str2))
//            return true;
        if(str1.length() == str2.length()){
            for(int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i))
                    return false;
            }
            return true;
        }
        return false;
    }
//    public static boolean equals(Integer n1, Integer n2)
//    判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回false。
    public static boolean equals(Integer n1, Integer n2){
        if((n1 == null) | (n2 == null))
            return false;
        if(n1.equals(n2))
            return true;
        return false;
    }

}
