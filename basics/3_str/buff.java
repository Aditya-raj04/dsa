class buff{
    public static void main(String args[]){
        //stringbuffer thread safe and stringbuilder is  not thread safe;

        StringBuffer sb = new StringBuffer("Aditya");
        sb.append(" Reddy");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // sb.insert(0 , " java ");
        // sb.deleteCharAt(2);
        // sb.setLength(30);            //reaing size will be empty;
        // sb.ensureCapacity(100);          //minimum capacity will be 100;
        


        System.out.println(sb);

        
                  // String str = sb;        //STING BUFFER CANNOT BE CONVERTED TO STRING ;
                  //String str = sb.toString(); //this will change to string;
    }
}