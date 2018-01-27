package converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class MyDateConverter extends DefaultTypeConverter{
	/**
	 * Object value 要格式化的参数
	 * Class toType 要转化成的目标类型
	 * 注意：这里的value是个数组，因为传入可能有多个日期
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
		//这里的mydate，就是已经将前端传过来的参数变成了一个日期类型了，再返回就是接着传递到DateAction
		return mydate;
	}
	
	
	
}
