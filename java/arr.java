public class arr{
    public static void main(String args[]){
        int array[] = {2,3,4};
        array[2] = 99999999;
        System.out.println(array[2]);

        int nums[]= new int[4];
        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        nums[3]=40;
        for(int a = 0 ; a <= 3 ; a++){
             System.out.println(nums[a]);
        }
        
    }
}
