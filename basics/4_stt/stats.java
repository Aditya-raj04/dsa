class mobile{
    int price;
    String name;
    String network;
    static String brand;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name + " : ");
    }

}


class sta{
    public static void main(String args[]){

        mobile obj1 = new mobile();
        obj1.name = "oppo f15" ;
        obj1.price = 15_000;
        obj1.network = "5g";
        obj1.brand = "oppo";

        // obj1.brand = "motorola";

        System.out.println(obj2.name);

        obj1.show();

        


    }
}