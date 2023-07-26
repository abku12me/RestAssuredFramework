package pojo.genericUtility;

import org.testng.annotations.Test;

import transsoft.GenericUtility.JavaUtility;

public class AddProjectPojo {
	
	//declare the variable
	//create constructor
	//getter setter
	
	JavaUtility jutil=new JavaUtility();
	 Object createdBy;
	 Object projectName;
	 Object status;
	 Object teamSize;
	public AddProjectPojo(Object createdBy, Object projectName, Object status, Object teamSize) {
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	
	
	public Object getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Object getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
	
	
	
	
	

	
	
	
	

}
