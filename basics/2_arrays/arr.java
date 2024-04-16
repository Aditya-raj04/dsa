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

        int a[][] = new int[3][4];
        a[1][3]= 164545450;
        System.out.println(a[1][3]);

        int num[][] = new int[3][4];
    //    int random= (int)(Math.random() * 10) + 1;
    //    System.out.println(random);

    // int num[][] = new int[3][];                        // jagged arrays //
    // int num[0] = new int [4];
    // int num[1] = new int [2];
    // int num[2] = new int [1];

//give the randdom values for the a[i][j];
        for(int i =0;i<3;i++){
            for(int j = 0 ; j<4;j++){
                num[i][j] = (int)(Math.random() * 10 + 1);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

System.out.println();
// System.out.println();
// System.out.println();

//advanced for loop but same output as above;
        for(int n[] : num){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();

        }



        
    }
}
