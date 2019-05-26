package com.dived2014.offer;
/**
 *国伟
 *2019/5/26
 *13:16
 *题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 *
 *
 */

public class replaceSpace {
    public String replaceSpace(StringBuffer str) {
        String sti = str.toString();
        char[] strChar = sti.toCharArray();
        StringBuffer stb = new StringBuffer();
        for(int i=0;i<strChar.length;i++){
            if(strChar[i]==' '){
                stb.append("%20");
            }else{
                stb.append(strChar[i]);
            }
        }
        return stb.toString();
    }
}
