package converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class MyDateConverter extends DefaultTypeConverter{
	/**
	 * Object value Ҫ��ʽ���Ĳ���
	 * Class toType Ҫת���ɵ�Ŀ������
	 * ע�⣺�����value�Ǹ����飬��Ϊ��������ж������
	 */
	@Override
	public Object convertValue(Object value, Class toType) {
		String[] obj = (String[]) value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date mydate = new Date();
		
		try {
			 mydate = sdf.parse(obj[0]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//�����mydate�������Ѿ���ǰ�˴������Ĳ��������һ�����������ˣ��ٷ��ؾ��ǽ��Ŵ��ݵ�DateAction
		return mydate;
	}
	
	
	
}
