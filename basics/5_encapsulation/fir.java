class human{
    private int age;
    private String name;

    public int  getAge(){
    return age;
    }

    public void  setAge(int a){
     age = a;
     System.out.println("djcs");
    }

    public String getName(){
    return name;
    }

    public void setName(String n){
    name = n;
    }



class fir {
    public static void main (String args[]){

         human obj = new human();
        obj.setAge(20);
        obj.setName("aditya");
        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}