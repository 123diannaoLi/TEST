package com.auth.server.utils;

/**
 * secure util
 */
public class SecureUtil {

    /**
     * encrypt
     *
     * @param inStr
     * @return String
     */
    public static String encrypt(String inStr) {
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            //二进制异或运算
            a[i] = (char) (a[i] ^ 'a');
        }
        return new String(a);
    }

    /**
     * decrypt
     *
     * @param inStr
     * @return String
     */
    public static String decrypt(String inStr) {
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 'a');
        }
        return new String(a);
    }

}
