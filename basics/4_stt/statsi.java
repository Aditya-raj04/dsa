class mobile{
    String brand;
    int price;
    static String name;

    static{
         name = "phone";
         System.out.println("inside static block");
    }


    public  mobile(){
        brand = "";
        price = 2000;
         System.out.println("inside constructor block ");
       
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name + " : ");
    }
}

class statsi{
    public static void main (String args[]){

        
        mobile obj1 = new mobile();
        obj1.name = "oppo f15" ;
        obj1.price = 15_000;
        obj1.brand = "oppo";

        mobile obj2 =new mobile();


        // obj1.brand = "motorola";

        System.out.println(obj1.name);

        obj1.show();

    }
    
}