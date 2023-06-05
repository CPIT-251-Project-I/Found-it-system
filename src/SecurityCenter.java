
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
        for (int i = 0; i < founditem.size(); i++) {
            FoundItem foundItem = founditem.get(i);
            if (Item.MatchingFoundItemInfo(Student.searchByDescription(), foundItem) != null) {
                Item.displayMatchingFoundItemInfo(foundItem);
                registerRecipientInfo(foundItem);
            } else {
                System.out.println("No matching found item found.");
            }
        }
    }

    // Method to register recipient information
    static void registerRecipientInfo(FoundItem founditem) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter recipient Name: ");
        String RecipientName = input.nextLine();

        System.out.print("Enter recipient KAU ID: ");
        String RecipientID = input.nextLine();

        Student student = new Student(RecipientID, RecipientName);

        changeItemStatus(founditem, input);
        // Code to register recipient information goes here
        System.out.println(updateItemInfo(founditem, student));
    }

    // Method to change lost item status
    static void changeItemStatus(FoundItem founditem, Scanner input) {
        // Code to changelost item status goes here
        System.out.println("\nReceived: true/false");
        founditem.setisReceived(input.nextBoolean());
    }
    
    static String updateItemInfo(FoundItem founditem, Student student){
        founditem.setStudent(student);
        return "Recipient " + student.getName() + " with ID " + student.getID() + " successfully registered."
                + "\n_______________________________________________"
                + "\nThe Item has been received!";
    }

    @Override
    public String toString() {
        return this.securityLocation;
    }

}
