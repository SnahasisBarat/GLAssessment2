package JPA2.com.jpa2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class EmpEntity {
	

	  @Id
	  private int empno;
	  private String ename;
	  private double salary;
	  private String designation;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public EmpEntity(int empno, String ename, double salary, String designation) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}
	public EmpEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	  


}
