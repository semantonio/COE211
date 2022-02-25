package staffManagement;

public class Employee {
	private String Firstname;
    private String Lastname;
    private int Age;
    private double Salary;
    public Employee() {}
    public Employee(String Firstname, String Lastname, int Age, double Salary) {
this.Firstname=Firstname;
this.Lastname=Lastname;
this.Age=Age;
this.Salary=Salary;

    }
    public String getFirstname() {
         return Firstname;
    }
    public void setTitle(String fn) {
    	Firstname=fn;
    }
    public String getLastname() {
    	return Lastname;
    }
    public void setCode(String ln) {
    	Lastname=ln;
    }
    public int getAge() {
    	return Age;
    }
    public void setCredits(int ag) {
    	Age=ag;
    }
    public Double getSalary() {
    	return Salary;
    }
    public void setName(Double sa) {
    	Salary=sa;
    }
    public String toString() {
    	return "Employee Information: "+Firstname+", "+Lastname+", "+Age+", "+Salary;
    }
}