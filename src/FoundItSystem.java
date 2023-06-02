
import java.util.ArrayList;
import java.util.Scanner;

public class FoundItSystem {
    
    public static void main(String[] args) {
                
        System.out.println("\t\tWelcome to Found it system!\n"
                + "\t_______________________________________________\n");
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<LostItem> lostitem = new ArrayList<LostItem>();
        ArrayList<FoundItem> founditem = new ArrayList<FoundItem>();
        
        int choice = 0;
        String anotherService = "";
        
        while(!anotherService.equalsIgnoreCase("No") && choice != 5){
            
            printMassageChoice();
            choice = input.nextInt();
            
            if (choice == 1){
                Student.addMissingItem(lostitem);
            } else if (choice == 2){
                Student.addFoundItem(founditem);
            } else if (choice == 3){
                
            } else if (choice == 4){
                // No implementation
                break;   
            } else if (choice == 5){
                break;
            } else {
                System.out.println("please Enter a correct number");
                printMassageChoice();
            }
            System.out.println("_______________________________________________"
                    + "\n\nWould you like to use another services? (yes/no)");
            anotherService = input.next();
        }
        
        System.out.println("\t\tSecurity Center Services"
                + "\n\t_______________________________________________\n");
        
    }
  
    static void printMassageChoice() {
        System.out.print("press 1: if you lost an item\n"
                + "press 2: if you found an item\n"
                + "press 3: to search for a missing item by description\n"
                + "press 4: to search for a missing item by photo\n"
                + "press 5: to exit from the system\n"
                + "_______________________________________________\n"
                + "\nyour choice is: ");
    }

}
