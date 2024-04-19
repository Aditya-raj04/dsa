// package basics;

// class student{
//     int roll;
//     String name;
//     int marks;

// }


class array{
    public static void main(String arga[]){

        // student s1 = new student();
        // s1.roll = 01;
        // s1.name = "aditya";
        // s1.marks = 98;

        // student s2 = new student();
        // s2.roll = 02;
        // s2.name = "rahul";
        // s2.marks = 89;

        // student s3 = new student();
        // s3.roll = 03;
        // s3.name = "chintu";
        // s3.marks = 80;

        // student s4 = new student();
        // s4.roll = 04;
        // s4.name = "bholi";
        // s4.marks = 77;

        // student students[] = new student[4];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;
        // students[3] = s4;

        // for(int i = 0 ; i < students.length ; i++){
        //     System.out.println(students[i].name + "  roll = " + students[i].roll + "  marks = " + students[i].marks);
        // }

//enhanced for loop or for each loop

        // for(student stud : students){
        //     System.out.println(stud.name + stud.roll + stud.marks);
        // }





    



        int num[] = new int[4];
        num[0] = 5;
        num[1] = 15;
        num[2] = 25;
        num[3] = 35;
        
        // for(int i = 0; i<num.length ; i++){
        //     System.out.println(num[i]);
        // }
        for(int n: num){
            System.out.println(n);
        }
    }
}
