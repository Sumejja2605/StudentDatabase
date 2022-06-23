package StudentDatabaseApp;

import java.util.Scanner;

public class Student {


    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses= null;
    private int balance=0;
    private static int costOfCourses=600;
    private static int id=1000;



    //constructor: name, year

 public Student(){
     Scanner scanner= new Scanner(System.in);

     System.out.println("Enter your first name: ");
     this.firstName= scanner.nextLine();

     System.out.println("Enter your last name: ");
     this.lastName= scanner.nextLine();

     System.out.println("1-Freshman\n 2-Sophmore\n 3-Junior\n 4-Senior\n Enter your grade level: ");
     this.gradeYear=scanner.nextInt();

     setStudentID();



 }


    // generate id

    private void setStudentID(){
     // grade level + id
        id++;
        this.studentID = gradeYear + " " + id;

    }
    //  enroll in courses
    public void enroll(){
     //get inside a loop, user hits 0
do{
        System.out.println("Enter course to enroll (Q to quite): ");
        Scanner sc = new Scanner(System.in);

        String course = sc.nextLine();

        if ( !course.equals("Q")) {
            courses = courses + "\n" + course;
            balance = balance + costOfCourses;
        }else
        {
            System.out.println("Break!");
            break;
        }
} while(1!=0);


 }
    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: " + balance + "$");
    }
    //pay tuition

    public void payTuition(){
     viewBalance();
        System.out.println("Enter your payment: ");
     Scanner sc = new Scanner(System.in);
     int payment= sc.nextInt();
     balance= balance-payment;
        System.out.println("Thank you for your  payment of $: "
        + payment);
        viewBalance();
    }
    // show status
    public String info(){
        return "Name: " + firstName +" " + lastName +
                "\n Grade level: " + gradeYear +
                "\n Student ID: " + studentID +
                "\n Courses Enrolled: " + courses +
                "\n Balance: " + balance;
    }
}
