package action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DateAction extends ActionSupport{
	private Date date;

	public String execute(){
		System.out.println(date);
		
		return SUCCESS;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
