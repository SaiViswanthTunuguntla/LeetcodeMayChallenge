import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> alist= new ArrayList<>();
        int m=s.length(); int n=p.length();
        if(n>m) return alist;
        int[] charArr=new int[26];

        for (int i = 0; i < n; i++) {
            charArr[s.charAt(i)-'a']++;
            charArr[p.charAt(i)-'a']--;
        }
        for (int i = n; i <m ; i++) {
            if(allZeros(charArr)){
                alist.add(i-n);
            }
            charArr[s.charAt(i)-'a']++;
            charArr[s.charAt(i-n)-'a']--;
        }
        if(allZeros(charArr)){
            alist.add(m-n);
        }

        return alist;
    }
 static  boolean allZeros(int[] charArr){
     for (int i = 0; i <charArr.length ; i++) {
         if(charArr[i]!=0) return false;
     }
     return true;
    }

    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
     //   List<Integer> anagrams = findAnagrams(s, p);
        //System.out.println(anagrams);

    }
}
