package pojo.genericUtility;

public class EmployeeDetailsWithArrays {
	
	//create global variable
	String name;
	String empId;
	int[] phno;
	String[] email;
	
	//create the constructor
	
	public EmployeeDetailsWithArrays()
	{
		
	}
	
	public EmployeeDetailsWithArrays(String name, String empId, int[] phno, String[] email) {
		super();
		this.name = name;
		this.empId = empId;
		this.phno = phno;
		this.email = email;
	}
	
	//getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	

}
