
public class LostItem extends Item {
    
    private String LostLocation;
    private String ContactInformation;

    public LostItem(String LostLocation, String ContactInformation, String Description) {
        super(Description);
        this.LostLocation = LostLocation;
        this.ContactInformation = ContactInformation;
    }

    public String getLostLocation() {
        return LostLocation;
    }

    public void setLostLocation(String LostLocation) {
        this.LostLocation = LostLocation;
    }

    public String getContactInformation() {
        return ContactInformation;
    }

    public void setContactInformation(String ContactInformation) {
        this.ContactInformation = ContactInformation;
    }
    
}
