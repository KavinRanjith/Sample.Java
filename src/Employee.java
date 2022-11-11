import java.util.Date;

//Create a class with property placeholders, there is no logic we wrote here...
public class Employee extends AuditClass {

    //add Attributes with objects
    private int id;
    private String name;
    private int age;
    private String address;


    public Employee(){

    }
    //Constructors...
    public Employee(int id, String name, int age, String address, String createdBy, Date createdDate){
        setId(id);
        setName(name);
        setAge(age);
        setAddress(address);
        setCreatedBy(createdBy);
        setCreatedDate(createdDate);
    }

    //overriding....

    @Override
    public String getData() {
        return "This is Child Class";
    }

    //setter and getter methods...
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    //override toString to printing the data...
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
