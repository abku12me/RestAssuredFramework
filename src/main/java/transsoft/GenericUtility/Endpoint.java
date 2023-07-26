package transsoft.GenericUtility;

public interface Endpoint {
	
	
	String addproject="http://rmgtestingserver:8084/addProject";
	String getAllProject="http://rmgtestingserver:8084/projects";
	String getSingleProject="http://rmgtestingserver:8084/projects/{projectId}";
	String updateProject="http://rmgtestingserver:8084/projects/{projectId}";
	String deleteProject="http://rmgtestingserver:8084/projects/{projectId}";

}
