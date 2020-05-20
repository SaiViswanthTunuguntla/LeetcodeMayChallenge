import java.util.*;

public class StockspannerSecondMethod {
    Stack<int[]> stockPrice;
    public StockspannerSecondMethod() {
        stockPrice=new Stack<>();
    }

    public int next(int price) {
        int span=1;
        while (!stockPrice.isEmpty()&& price>=stockPrice.peek()[0])
        {
            span+=stockPrice.peek()[1];
            stockPrice.pop();
        }

        stockPrice.push(new int[]{price, span});
        System.out.println(span);
        return span;

    }

    public static void main(String[] args) {
        StockspannerSecondMethod S=new StockspannerSecondMethod();
        S.next(70);
        S.next(80);
        S.next(60);
        S.next(70);
        S.next(60);
        S.next(75);
        S.next(85);
//        70 : 1
//        80 : 2
//        60 : 1
//        70 : 2
//        60 : 1
//        75 : 4
//        85 : 7

    }
}
