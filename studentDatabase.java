package StudentDatabaseApp;

import java.util.Scanner;

public class studentDatabase {

    public static void main(String[] args) {
     Student student= new Student();
       student.enroll();
       student.payTuition();
       System.out.println(student.info());


        // ask how many students want to add

        System.out.println("Enter number of students to enroll: ");
        Scanner sc= new Scanner(System.in);

        int numOfStudent = sc.nextInt();
        Student[] students= new Student[numOfStudent];


        // n num
        for (int i=0; i<numOfStudent;i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].info());
        }


    }
}
