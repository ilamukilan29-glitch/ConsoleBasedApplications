package Students_Details_CRUD_System;
import java.util.HashMap;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,information> map = new HashMap<>();
        int reg =100;
        while(true){
            System.out.println("PLEASE SELECT ANYONE OF THESE PROCESS");
            System.out.println();
            System.out.println("1-For Enter Student Details");
            System.out.println("2-For Edit Student Details");
            System.out.println("3-For Search Student Details");
            System.out.println("4-Delete Student Details");
            System.out.println("5-For EXIT");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                // -- If User Enters 1 Add the Details of the Students Informations --
                case 1: 
                    information stu = new information();
                    System.out.println("Enter the Name of the Student: ");
                    stu.name = sc.nextLine();
                    System.out.println("Enter the Native: ");
                    stu.place = sc.nextLine();
                    System.out.println("Enter the Phone Number: ");
                    stu.Phone = sc.nextLine();
                    System.out.println("Enter the Mark of Subject 1");
                    stu.sb1 = sc.nextInt();
                    System.out.println("Enter the Mark of Subject 2");
                    stu.sb2 = sc.nextInt();
                    System.out.println("Enter the Mark of Subject 3");
                    stu.sb3 = sc.nextInt();
                    sc.nextLine();
                    stu.tot = stu.sb1+stu.sb2+stu.sb3;
                    stu.avg = stu.tot/3;
                    map.put(++reg,stu);
                    System.out.println("INFORMATION ADDED SUCCESSFULLY");
                    break;
                // -- If user Enters 2 Edit the Particular Students Information based on the entered Register Number --
                case 2:
                    System.out.println("Enter the Register number of the Student for Editing Details: ");
                    int registerNo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("This is the Available Data: ");
                    information stuu=map.get(registerNo);
                    System.out.println("Name: "+stuu.name);
                    System.out.println("Register No: "+ registerNo);
                    System.out.println("Place: "+stuu.place);
                    System.out.println("PhoneNo: "+stuu.Phone);
                    System.out.println("Subject 1 Mark: "+stuu.sb1);
                    System.out.println("Subject 2 Mark: "+stuu.sb2);
                    System.out.println("Subject 3 Mark: "+stuu.sb3);
                    System.out.println("Total: "+stuu.tot);
                    System.out.println("Average: "+stuu.avg);
                    System.out.println();
                    System.out.println(" -- Enter the Details For Edit -- ");
                    System.out.println("Enter the Name: ");
                    stuu.name=sc.nextLine();
                    System.out.println("Enter the Place: ");
                    stuu.place = sc.nextLine();
                    System.out.println("Enter the PhoneNo: ");
                    stuu.Phone = sc.nextLine();
                    System.out.println("Enter the Subject 1 Mark: ");
                    stuu.sb1 = sc.nextInt();
                     System.out.println("Enter the Subject 2 Mark: ");
                    stuu.sb2 = sc.nextInt();
                     System.out.println("Enter the Subject 3 Mark: ");
                    stuu.sb3 = sc.nextInt();
                      sc.nextLine();
                    stuu.tot = stuu.sb1+stuu.sb2+stuu.sb3;
                    stuu.avg = stuu.tot/3;
                    map.put(registerNo,stuu);
                     System.out.println("INFORMATION EDITED SUCCESSFULLY ");
                    break;
                    // -- If the user Enters 3 Search and show the details of a particular student as per the entered Register Number --
                case 3:
                      System.out.println("Enter the Register number of the Student for searching: ");
                    int regi = sc.nextInt();
                    sc.nextLine();
                    System.out.println("This is the Available Data: ");
                    information stu2=map.get(regi);
                    System.out.println("Name: "+stu2.name);
                    System.out.println("Register No: "+ regi);
                    System.out.println("Place: "+stu2.place);
                    System.out.println("PhoneNo: "+stu2.Phone);
                    System.out.println("Subject 1 Mark: "+stu2.sb1);
                    System.out.println("Subject 2 Mark: "+stu2.sb2);
                    System.out.println("Subject 3 Mark: "+stu2.sb3);
                    System.out.println("Total: "+stu2.tot);
                    System.out.println("Average: "+stu2.avg);
                    break;
                    // -- If the user Enters 4 Deletes a Particulr Student's Details --
                case 4:
                    System.out.println("Enter the Register Number of the student for deleting: ");
                    int reg1 = sc.nextInt();
                    map.remove(reg1);
                     System.out.println("INFORMATION DELETED ");
                    break;
                    // -- If the user Enter 5 Terminates the Program --
                case 5:
                    System.out.println("Bye!! Program Terminated");
                    return;
            }

        }
    }
}
