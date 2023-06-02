
public class FoundItem extends Item {
    
    private SecurityCenter DropSecuritySecurityCenter;
    private Student student;
    private boolean isReceived;

    public FoundItem(SecurityCenter DropSecuritySecurityCenter, String Description) {
        super(Description);
        this.DropSecuritySecurityCenter = DropSecuritySecurityCenter;
    }
    
    public SecurityCenter getDropSecuritySecurityCenter() {
        return DropSecuritySecurityCenter;
    }

    public void setDropSecuritySecurityCenter(SecurityCenter DropSecuritySecurityCenter) {
        this.DropSecuritySecurityCenter = DropSecuritySecurityCenter;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean isReceived() {
        return isReceived;
    }

    public void setisReceived(boolean isReceived) {
        this.isReceived = isReceived;
    }
}
