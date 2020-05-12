import java.util.ArrayList;

public class singleNonDuplicateArray {

    public static int singleNonDuplicate(int[] nums) {
        int counter=0;
        ArrayList visitedList = new ArrayList();
        int j,i=0;
        int returnval=0;
        //int j;
        while(i< nums.length)
        {
            if(visitedList.contains(i))
            {
                i=i+1;
                continue;
            }
            counter=1;
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    counter=2;
                    break;
                }
            }
            if(counter!=2)
                returnval =nums[i];
            if(j!=i+1)
            {
                visitedList.add(j);
                i=i+1;
            }
            else i=i+2;


        }
        return returnval;
    }

    public static void main( String[] args ){
        int[] nums={1,2,2,3,3,4,1};
        System.out.println(singleNonDuplicate(nums));

    }

}
