import java.util.ArrayList;
import java.util.List;

public class checkInclusion {

    public static boolean checkInclusion(String s1, String s2) {

    int m=s2.length(); int n=s1.length();
        if(n>m) return false;
        int[] charArr=new int[26];

        for (int i = 0; i < n; i++) {
        charArr[s2.charAt(i)-'a']++;
        charArr[s1.charAt(i)-'a']--;
        }
        for (int i = n; i <m ; i++) {
        if(allZeros(charArr)){
            return true;
        }
        charArr[s2.charAt(i)-'a']++;
        charArr[s2.charAt(i-n)-'a']--;
        }
        if(allZeros(charArr)){
            return true;
        }
        return false;
    }
    static  boolean allZeros(int[] charArr){
        for (int i = 0; i <charArr.length ; i++) {
            if(charArr[i]!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s2="eidboaoo";
        String s1="ab";
        //List<Integer> anagrams = ;
        System.out.println(checkInclusion(s1, s2));
    }
}
