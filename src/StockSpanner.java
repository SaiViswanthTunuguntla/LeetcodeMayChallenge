import java.util.ArrayList;
import java.util.List;

public class StockSpanner {
    List<Integer> stockPrice;
    public StockSpanner() {

        stockPrice=new ArrayList<>();
    }

    public int next(int price) {
        stockPrice.add(price);
        int cnt=0;
        for(int i=stockPrice.size()-1;i>=0;i--) {
            if (stockPrice.get(i) <= price)
                cnt++;
            else
                break;
        }
        System.out.println(price+" : "+cnt);
        return cnt;
        //Integer cnt= (int)stockPrice.stream().filter(i -> i<=price).count();
    }

    public static void main(String[] args) {
        StockSpanner S=new StockSpanner();
        S.next(70);
        //S.next(100);
        S.next(80);
        S.next(60);
        S.next(70);
        S.next(60);
        S.next(75);
        S.next(85);

    }

}
