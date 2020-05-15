public class KadaneAlgo {


    //Maximum sub Array
    static int maxSubArraySum(int a[])
    {
       // int[] new_a = new int[a.length];
       // new_a[0]=a[a.length-1];
       // for(int j=1,i=0;j<a.length&i<a.length-1;j++,i++ )new_a[j]=a[i];
        int max_a= max(a);
        //int max_new_a=max(new_a);
        return max_a;
    }
    static int max(int[] a){
        int max_so_far=0;
        int max_ending_here=0;
        for (int i : a) {
            max_ending_here = max_ending_here + i;
            if (max_ending_here > 0 && max_so_far < max_ending_here) max_so_far = max_ending_here;
            else if (max_ending_here < 0) max_ending_here = 0;
        }
        if (max_ending_here == 0 && max_so_far == 0) {
            max_so_far = a[0];
            for (int i = 1; i < a.length; i++) {
                max_so_far = Math.max(max_so_far, a[i]);
            }
        }
        return max_so_far;
    }
    public static void main( String[] args ){
        int[] a=  {2,-2,2,7,8,0};
       System.out.println(maxSubArraySum(a));












//        int[] new_a = new int[a.length];
//        new_a[0]=a[a.length-1];
//        for(int j=1,i=0;j<a.length&i<a.length-1;j++,i++ )new_a[j]=a[i];
//        int[] new_a = new int[a.length*2-1];
//        for(int j=0;j<a.length;j++) new_a[j]=a[j];
//        for(int i=a.length,j=0;i<new_a.length&&j<a.length-1;i++,j++ )new_a[i]=a[j];
        //new_a=a.clone();
//        for (int i:new_a
//             ) {
//            System.out.println(i);
//
//        }
//        System.out.println("size of new_a: "+new_a.length);

    }
    }
