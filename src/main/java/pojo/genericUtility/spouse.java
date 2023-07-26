package pojo.genericUtility;

public class spouse {
	
	//create the global variable
	
	String name;
	String company;
	int phno;
	
	//create the constructor
	public spouse(String name, String company, int phno) {
		super();
		this.name = name;
		this.company = company;
		this.phno = phno;
	}

	
	//create getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}
	
	
	
	
	
	
	
	
	

}
