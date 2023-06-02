
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    
    static Scanner input = new Scanner(System.in);
    
    private String ID;
    private String name;

    public Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void addMissingItem(ArrayList<LostItem> lostItem) {
        System.out.println("Enter Missing Item Description: ");
        String missingItemDescription = input.nextLine();
        
        System.out.println("Where did you lose your item? ");
        String missingItemLocation = input.nextLine();
        
        System.out.println("Enter Contact Information: ");
        String ContactInformation = input.nextLine();
        
        lostItem.add(new LostItem(missingItemLocation, missingItemDescription, ContactInformation));
        
        System.out.println("Your missing item was successfully added to the system.");
    }
    
    public static void addFoundItem(ArrayList<FoundItem> founditem) {
        System.out.println("Enter Found Item Description: ");
        String foundItemDescription = input.nextLine();
        
        System.out.println("In which security center you drop the item?");
        SecurityCenter foundItemDropLocation = new SecurityCenter(input.nextLine());
        
        founditem.add(new FoundItem(foundItemDropLocation, foundItemDescription));
        
        System.out.println("the found item was successfully added to the system.");
    }
    
    public static String searchByDescription() {
        System.out.println("Enter a word/description to search for item: ");
        String word = input.next();
        return word;
    }
    
    public static void searchByPhoto() {
        // No implementation
    }

    @Override
    public String toString() {
        return "Student " + name + " with ID " + ID;
    }
}
