package action;

import com.opensymphony.xwork2.ActionSupport;

public class TokenAction extends ActionSupport{
	private String username;
	private String password;
	
	public String execute(){
		
		System.out.println(username+password);
		System.out.println("��¼�ɹ�");
		
		
		return "success";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
