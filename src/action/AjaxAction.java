package action;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport{
	private String username;
	
	private String flag;
	
	public String execute(){
		System.out.println(username);
		
		//ע�⣺�����flag ������Ϊ���ݷ��أ���xml�����ã�ǰ������Ϳ��Եõ�json��ʽ��flag����
		if("".equals(username)||username==null){
			flag="�û�������Ϊ��";
		}else{
			flag="��¼�ɹ�";
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
