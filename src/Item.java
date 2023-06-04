
import java.util.ArrayList;


public class Item {

    private String Description;

    // Constructor
    public Item(String Description) {
        this.Description = Description;
    }

    // Getters and setters
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public static void compareDescription(ArrayList<FoundItem> founditem) {
        FoundItem foundItem = MatchingFoundItemInfo(Student.searchByDescription(), founditem);
        if (foundItem != null){
            displayMatchingFoundItemInfo(foundItem);
        } else {
            System.out.println("No matching found item found.");
        }
    }
    
   public static FoundItem MatchingFoundItemInfo(String word, ArrayList<FoundItem>founditem) {
       for (int i = 0; i < founditem.size(); i++) {
           FoundItem foundItem = founditem.get(i);
        if (word.toLowerCase().contains(foundItem.getDescription().toLowerCase()) && foundItem.isReceived() == false) {
            return foundItem;
        }
    }
    return null;
   }
    
   static void displayMatchingFoundItemInfo(FoundItem foundItem){
       System.out.println("\tMatching Found Item!");
       System.out.println("_______________________________________________\n");
       System.out.println("Description: " + foundItem.getDescription());
       System.out.println("Drop Security Security Center: " + foundItem.getDropSecuritySecurityCenter().toString());
   }
   
    public void comparePhoto() {
        // No implementation
    }
}