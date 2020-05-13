import java.io.StringReader;
import java.util.Stack;

public class removeKdigits {

    //Logic is not correct as per the question.
    public static String removeKdigits(String num, int k) {
        char[] chars = num.toCharArray();
        int j;
        int snum=Integer.MAX_VALUE;
        int sbnum=0;
        for(int n=k-1;n<chars.length;n++)
        {
            j=n;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<chars.length;i++)
            {
                for(int q=0;q<k;q++)
                {
                    if(!(i==j--))sb.append(chars[i]);
                }

            }
           sbnum= Integer.parseInt(sb.toString());
            if(snum>sbnum) snum=sbnum;
        }

        return String.valueOf(snum);
    }

    public static String removeKdigitsMethod2(String num, int k) {
            if(num.length()==k) return "0";
            if(k==0) return num;
        Stack<Character> stk = new Stack<>();
        for(char c:num.toCharArray())
        {
            while (k>0  && !stk.isEmpty() && stk.peek()>c)
            {
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        for(int i=0;i<k;i++) stk.pop();

        StringBuilder sb =new StringBuilder();
        while(!stk.empty()) sb.append(stk.pop());
        sb.reverse();
        while (sb.charAt(0)=='o') sb.deleteCharAt(0);

        return sb.toString();

       // return "";
    }

    public static void main( String[] args ){

        System.out.println(removeKdigitsMethod2("1432219",2));
    }


}
