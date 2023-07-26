package pojo.genericUtility;

public class EmployeeDetails {
	
	//declare the required variable as global
	
	String ename;
	String eId;
	String ephone;
	String email;
	
	//initialize with constructor
	public EmployeeDetails()
	{
		
	}
	
	//for deseralization we have to create empty constructor 
	public EmployeeDetails(String ename, String eId, String ephone, String email) {
		super();
		this.ename = ename;
		this.eId = eId;
		this.ephone = ephone;
		this.email = email;
	}

	
	//use getter and setter method
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String getEphone() {
		return ephone;
	}

	public void setEphone(String ephone) {
		this.ephone = ephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	

}
