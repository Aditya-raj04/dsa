
// package JavaBasics;
class calculator {
    int a ;
    public int add(int n1, int n2){
        int r = n1 + n2;
        System.out.println("hello jee");
        return r;
    }
}
public class 3classes{
    public static void main(String[] args) {
        System.out.println("welcome!");
        calculator calc = new calculator();
        int num1 =4;
        int num2 =5;
        int result = calc.add(num1,num2);
       System.out.println(result);
    }
}


