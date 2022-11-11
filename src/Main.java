import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //preparing object for Inserting the record to DB
        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Mariam");
        employee.setAge(22);
        employee.setAddress("heart");
        employee.setCreatedBy("Admin");
        employee.setCreatedDate(new Date());

        System.out.println(employee.getData());
        //print output
        System.out.println(employee); //setter...
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());

        System.out.println(employee.getData());

        System.out.println(employee);

        //Updating the Address Data...
        employee.setAddress("powerfulplace");
        System.out.println(employee);

        //using constructor...
        //Shorted way of inserting datas to DB...
        Employee employee2 = new Employee(102,"Amul",100,"USA","admin", new Date());
        System.out.println(employee2);
        employee2.setAddress("ASU");
        System.out.println(employee2);
    }
}