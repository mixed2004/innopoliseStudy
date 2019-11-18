package ru.MaximBorisov.Lesson31;

import static java.lang.String.copyValueOf;

public class Palindrom {
    public boolean isPalindromStandart(String str) {
        StringBuffer sbf = new StringBuffer(str);
        return str.equalsIgnoreCase(sbf.reverse().toString());
    }

    public boolean isPalindromReplace(String str) {
        char[] ar = str.toCharArray();
        int arLength = ar.length;
        char temp;
        for (int i = 0; i < arLength / 2; i++) {
            temp = ar[i];
            ar[i] = ar[arLength - i - 1];
            ar[arLength - i - 1] = temp;
        }
        return str.equalsIgnoreCase(copyValueOf(ar));
    }
}
