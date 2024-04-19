class mobile{
    int price;
    String name;
    String network;
    static String brand;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name + " : ");
    }

    public static void show1(){
        System.out.println("in static method");
        // System.out.println(brand + " : " + price + " : " + name + " : ");
    }
}


class sta{
    public static void main(String args[]){

        mobile obj1 = new mobile();
        obj1.name = "oppo f15" ;
        obj1.price = 15_000;
        obj1.network = "5g";
        obj1.brand = "oppo";

        mobile obj2 = new mobile();
        obj2.name = "iphone 15" ;
        obj2.price = 1_00_000;
        obj2.network = "5g";
        obj2.brand = "Apple";

        // obj1.name = "motorola";

        System.out.println(obj2.name);

        obj2.show();
        obj1.show();

        mobile.show1();


    }
}