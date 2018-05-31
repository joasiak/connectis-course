package pl.cschool.week1;

public class TasksString {

    //task10
    static boolean isEquals(String str1, String str2) {
        return (str1.equals(str2));
    }

    static boolean isEquals2(String str1, String str2) {
        if (str1.length()!=str2.length()) return false;
        for (int i=0; i<str1.length(); i++) {
            if (str1.charAt(i)!=str2.charAt(i)) return false;
        }
        return true;
    }

    //task 11
    static char getChar(String str, int k) {
        return str.charAt(k);
    }

    //task12
    static StringBuilder strReverse(String str) {
        StringBuilder s = new StringBuilder();
        s.append(str);
        return s.reverse();
    }

    static String strReverse2(String str) {
        String s = "";
        for (int i=str.length()-1; i>=0; i--) {
            s+=str.charAt(i);
        }
        return s;
    }

    //task13
    static boolean isStartedWith(String str, String s) {
        return str.startsWith(s);
    }

    static boolean isStartedWith2(String str, String s) {
        String subStr="";
        if (s.length()>str.length()) return false;
        for (int i=0; i<s.length(); i++) {
                subStr+=str.charAt(i);
        }
        return isEquals(s,subStr);
    }

    //task14
    static boolean isContainGivenStr(String str, String s) {
        return str.contains(s);
    }

    static boolean isContainGivenStr2(String str, String s) {
        if (s.length()>str.length()) return false;
        for (int i = 0; i<=str.length()-s.length(); i++) {
            if (isEquals(str.substring(i,i+s.length()), s)) return true;
        }
        return false;
    }

    //task15
    static int wordsCount(String str) {
        str = str.trim();
        return str.length()- str.replaceAll(" ","").length() +1;
    }

    //task16 task24
    static String strWithoutWhitespaces(String str) {
        return str.replace(" ","");
    }

    static String strWithoutWhitespaces2(String str) {
        String s="";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)!=' ') s+=str.charAt(i);
        }
        return s;
    }

    //task17
    static String addSpacesAfterGivenChar(String str, String c) {
        return str.replaceAll(c,c+" ");
    }

    static String addSpacesAfterGivenChar2(String str, char c) {
        String s="";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==c) s+=str.charAt(i) + " ";
            else s+=str.charAt(i);
        }
        return s;
    }

    //task18
    static String addNth(String str, String delimiter, int n) {
        String s=str;
        for (int i = 1; i<n; i++) {
            s+=delimiter + str;
        }
        return s;
    }

    //task19
    static int strLength(String str) {
        return str.length();
    }

    //task20
    static int strLenToGivenChar(String str) {
        if (!str.contains("c")) return 0;
        return str.substring(0,str.indexOf('c')).length();
    }

    //task21
    static char[] strToCharArr(String str) {
        return str.toCharArray();
    }

    static char[] strToCharArr2(String str) {
        char[] charArr = new char[str.length()];
        for (int i=0; i<str.length(); i++) {
            charArr[i]=str.charAt(i);
        }
        return charArr;
    }

    //task22
    static String strToLowerCase(String str) {
        return str.toLowerCase();
    }

    //task23
    static String halfStrToUpperCase(String str) {
        return str.substring(0,str.length()/2).toUpperCase()+str.substring(str.length()/2+1);
    }
}
