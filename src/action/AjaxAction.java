package action;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport{
	private String username;
	
	private String flag;
	
	public String execute(){
		System.out.println(username);
		
		//注意：这里的flag 可以作为数据返回，在xml中配置，前端请求就可以得到json格式的flag参数
		if("".equals(username)||username==null){
			flag="用户名不能为空";
		}else{
			flag="登录成功";
		}
		
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
}
