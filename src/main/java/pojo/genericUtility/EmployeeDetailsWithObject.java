package pojo.genericUtility;

public class EmployeeDetailsWithObject {

	
	String ename;
	String empid;
	int[] phone;
	Object spouse;
	
	
	public EmployeeDetailsWithObject()
	{
		
	}
	
	public EmployeeDetailsWithObject(String ename, String empid, int[] phone, Object spouse) {
		super();
		this.ename = ename;
		this.empid = empid;
		this.phone = phone;
		this.spouse = spouse;
	}
	
	

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public int[] getPhone() {
		return phone;
	}

	public void setPhone(int[] phone) {
		this.phone = phone;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
	
	
	
	
	
	
	
	
}
