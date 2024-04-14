// package java;

class compute{
    public void PlayMusic(){
        System.out.println("playing");
    }

    public String getMePen(int cost){
        // System.out.println();
        if (cost <= 10)return "nothing";
        return "pen";
    }
}

class 2computer {
    public static void main(String[] args) {
        compute obj = new compute();
        obj.PlayMusic();
        String price =  obj.getMePen(20);
        System.out.println(price);
    }
}
