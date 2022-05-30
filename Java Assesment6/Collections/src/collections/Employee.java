package collections;

public class Employee implements Comparable<Employee> {
int id;
String name;
String email;
double salary;
public Employee(int id,String name,String email,double salary) {
	super();
	this.id=id;
	this.name=name;
	this.email=email;
	this.salary=salary;
}
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email=email;
    
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary=salary;
}

    

public void display() {
System.out.println("id:"+getId()+"name:"+getName()+"email:"+getEmail()+"salary:"+getSalary());
}
public int compareTo(Employee name) {
	if(this.name==name.getName())
	return 0;
	else return 1;
}


}
 


