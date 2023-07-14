package day03.practice;

public class Employee {
	
	private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  Employee(Employee obj) {
     this.id = obj.id;
     this.name = obj.name;
    }
    public class TestEmployee {
    	
        public static void main(String[] args) {
            Employee e1 = new Employee(1, "naresh");
            Employee e2 = new Employee(2, "suresh");
            Employee e3 = new Employee(e1);
            Employee e4 = new Employee(e2);
            System.out.println("id="+e3.id+" "+"name="+e3.name);
            System.out.print("id="+e4.id+" "+"name="+e4.name);
        }

}
