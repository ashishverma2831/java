package oops.classAndObjects;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentSchool student_1 = new studentSchool();
        System.out.println("Enter the name of the student : ");
        student_1.name = sc.nextLine();
        System.out.println("Enter the roll number : ");
        student_1.rollNO = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the course : ");
        student_1.course = sc.nextLine();
        System.out.println("Enter the marks of the subjects : ");
        student_1.marks_1 = sc.nextDouble();
        student_1.marks_2 = sc.nextDouble();
        student_1.marks_3 = sc.nextDouble();

        System.out.println("The name of the student is "+student_1.name);
        System.out.println("The roll number is "+student_1.rollNO);
        System.out.println("The course selected by the student is "+student_1.course);
        System.out.println("The marks of the three subjects are "+student_1.marks_1+" , "+student_1.marks_2+" & "+student_1.marks_3);
        System.out.println("The total marks obtained by the  student is "+student_1.total());
        System.out.println("The average of the marks is "+student_1.average());
        System.out.println("The grade of the student is "+student_1.grades());
        sc.close();
    }
}

class studentSchool {
    public int rollNO;
    public String name;
    public String course;
    public double marks_1,marks_2,marks_3;

    public double total() {
        return marks_1 + marks_2 + marks_3;
    }

    public double average() {
        return total()/3;
    }

    public char grades() {
        if(total()>250){
            return 'A';
        }
        else if(total()>200 && total()<=250){
            return 'B';
        }
        else if(total()>150 && total()<=200){
            return 'C';
        }
        else {
            return 'D';
        }
    }
}