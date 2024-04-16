class arra{
    public static void main(String args[]){

          int num[][] = new int[3][];                        // jagged arrays

    num[0] = new int[4];
    num[1] = new int[2];
    num[2] = new int[8];

    for(int i = 0 ; i < num.length ; i++){
        for(int j = 0; j< num[i].length;j++){
            num[i][j] = (int)(Math.random() * 100);
            System.out.print(num[i][j] + " ");
        }
        System.out.println();
    }
System.out.println();

//best to use this loops make it more easier as we don't have to enter the values;
//enhanced for loops;
for( int n[] : num){
    for( int m : n){
       
        System.out.print(m + " ");
    }
    System.out.println();
}




    }

}