public class Main {
    public static void main(String[] args) {

    //preparing object for Inserting the record to DB
    Employee employee = new Employee();
    employee.setId(101);
    employee.setName("Mariam");
    employee.setAge(22);
    employee.setAddress("heart");
        //print output
        System.out.println(employee);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());

        //Updating the Address Data...
        employee.setAddress("powerfulplace");
        System.out.println(employee);
    }
}