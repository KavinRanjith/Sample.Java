//Inheritance (parent class)
import java.util.Date;

public class AuditClass {

    protected String createdBy;
    protected Date createdDate;

    //method
    public String getData(){
        return "This is parent Class";
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
