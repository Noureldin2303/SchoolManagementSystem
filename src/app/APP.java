/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author The_Legend
 */
import java.util.*;
import java.util.concurrent.TimeUnit;
public class APP {
    public static void main(String[] args) {
        
        DisplayMenu();

    }
public static void DisplayMenu(){
    Scanner s = new Scanner(System.in);
    DoubleLinkedList students = new DoubleLinkedList();
        int choice,locationStartingFromZero;
        String NAME,DEP;
        long ID;
        double GPA;
        System.out.println("   _____      _                 _   __  __                                             _");
        System.out.println("  / ____|    | |               | | |  \\/  |                                           | |");
        System.out.println(" | (___   ___| |__   ___   ___ | | | \\  / | __ _ _ __   ___  __ _ _ __ ___   ___ _ __ | |_ ");
        System.out.println("  \\___ \\ / __| '_ \\ / _ \\ / _ \\| | | |\\/| |/ _` | '_ \\ / _ \\/ _` | '_ ` _ \\ / _ \\ '_ \\| __|");
        System.out.println("  ____) | (__| | | | (_) | (_) | | | |  | | (_| | | | |  __/ (_| | | | | | |  __/ | | | |_ ");
        System.out.println(" |_____/ \\___|_| |_|\\___/ \\___/|_| |_|  |_|\\__,_|_| |_|\\___|\\__, |_| |_| |_|\\___|_| |_|\\__|");
        System.out.println("                                                             __/ |                         ");
        System.out.println("                                                            |___/                          ");
        System.out.println("[1] Add a student: ");
        System.out.println("[2] Search for a student: ");
        System.out.println("[3] Insert a student: ");
        System.out.println("[4] Delete a student: ");
        System.out.println("[5] Update a student info: ");
        System.out.println("[6] Display the students info: ");
        System.out.println("[-1] To Exit the Program: ");
        System.out.print("Enter your choice: ");
        choice = s.nextInt();
        switch(choice){
            case 1:
            System.out.print("Enter the student's name: ");
            NAME = s.next();
            System.out.print("Enter the student's Id: ");
            ID = s.nextLong();
            System.out.print("Enter the student's GPA: ");
            GPA = s.nextDouble();
            System.out.print("Enter the student's Department: ");
            DEP = s.next();
            students.addNode(NAME, ID, GPA, DEP);
            System.out.println("================================================================");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            DisplayMenu();
            break;
            case 2:
            System.out.print("Enter the student's Id: ");
            ID = s.nextLong();
            students.searchnode(ID);
            System.out.println("================================================================");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            DisplayMenu();
            break;
            case 3:
            System.out.print("Enter the student's name: ");
            NAME = s.next();
            System.out.print("Enter the student's Id: ");
            ID = s.nextLong();
            System.out.print("Enter the student's GPA: ");
            GPA = s.nextDouble();
            System.out.print("Enter the student's Department: ");
            DEP = s.next();
            System.out.print("Enter the location Starting from zero to insert the student at: ");
            locationStartingFromZero = s.nextInt();
            students.insertNode(NAME, ID, GPA, DEP, locationStartingFromZero);
            System.out.println("================================================================");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            DisplayMenu();
            break;
            case 4:
            System.out.print("Delete by id or name[i/n]: ");
            char c = s.next().charAt(0);   
            if(c == 'i' || c == 'I'){
            System.out.print("Enter the student's Id: ");
            ID = s.nextLong();
            students.DeleteById(ID);
            System.out.println("================================================================");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            DisplayMenu();
            break;
            }else if(c == 'n' || c =='N'){
            System.out.print("Enter the student's name: ");
            NAME = s.next();
            System.out.println(NAME);
            students.DeleteByName(NAME);
            System.out.println("================================================================");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            DisplayMenu();
            break;
            }else{
                System.out.println("Please Enter a Valid Symbol!!! ");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println("================================================================");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            DisplayMenu();
            }
            break;
            case 5:
            System.out.print("Enter the student's Id: ");
            ID = s.nextLong();
            students.updateNode(ID);
            DisplayMenu();
            break;
            case 6:
            students.displayList();
            System.out.println("================================================================");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            DisplayMenu();
            break;
            case -1:
                System.out.println("Have a Good Day <3");
                break;
            default:
            System.out.println("Please Enter a Valid Symbol!!! ");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
            System.out.println("================================================================");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            DisplayMenu();
            break;
            }
}
}

