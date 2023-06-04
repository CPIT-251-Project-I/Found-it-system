
import java.util.ArrayList;
import java.util.Scanner;

public class SecurityCenter {

    private String securityLocation;

    // Constructor
    public SecurityCenter(String securityLocation) {
        this.securityLocation = securityLocation;
    }

    // Getters and setters
    public String getSecurityLocation() {
        return securityLocation;
    }

    public void setSecurityLocation(String securityLocation) {
        this.securityLocation = securityLocation;
    }

    static void ItemToEdit(ArrayList<FoundItem> founditem) {
        FoundItem MatchedFoundItem = Item.MatchingFoundItemInfo(Student.searchByDescription(), founditem);
        if (MatchedFoundItem != null) {
            Item.displayMatchingFoundItemInfo(MatchedFoundItem);
        } else {
            System.out.println("No matching found item found.");
        }
        registerRecipientInfo(MatchedFoundItem);
    }

    // Method to register recipient information
    static void registerRecipientInfo(FoundItem founditem) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter recipient Name: ");
        String RecipientName = input.nextLine();

        System.out.print("Enter recipient KAU ID: ");
        String RecipientID = input.nextLine();

        Student student = new Student(RecipientID, RecipientName);

        founditem.setStudent(student);

        System.out.println("Recipient " + student.getName() + " with ID " + student.getID() + " successfully registered.");

        System.out.println("_______________________________________________");

        changeItemStatus(founditem, input);
        // Code to register recipient information goes here
    }

    // Method to change lost item status
    static void changeItemStatus(FoundItem founditem, Scanner input) {
        // Code to changelost item status goes here
        System.out.println("\nReceived: true/false");
        founditem.setisReceived(input.nextBoolean());
    }

    @Override
    public String toString() {
        return this.securityLocation;
    }

}
