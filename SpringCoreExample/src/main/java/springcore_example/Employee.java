package springcore_example;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ImportResource;

public class Employee {
	private String id;
	private String name;
	@ImportResource(name="mycompany")
	@Inject
	private Company company;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}@Required
	public void setName(String name) {
		this.name=name;
	}
	public Company getCompany() {
		return company;
	}@SuppressWarnings("deprecation")
	@Required
	public void setCompany(Company company) {
		this.company=company;
	}
	@Override
	public String toString() {
		return "Employee [id="+id+",name="+name+",company="+company.toString() +"]";
	}

}
