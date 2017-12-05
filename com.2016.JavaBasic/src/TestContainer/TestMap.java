package TestContainer;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
	//定义存储key（name）--value映射对的方法--一对对存储
	//Map接口实现的类有HashMap， TreeMap
	//Map通过键来标识，键值不能重复
	
	public static void main(String[] args) {
		Map m1 = new HashMap();
		Map m2 = new TreeMap();
		m1.put("one", new Integer(1));
		m1.put("two", new Integer(2));
		m1.put("three", new Integer(3));
		m1.put("four", 4);//自动将基础类型转换为对象
		m2.put("A", new Integer(1));
		m2.put("B", new Integer(2));
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.containsKey("one"));
		System.out.println(m1.containsValue(2));//自动将基础类型转换为对象
		System.out.println(m1.containsValue(new Integer(2)));
		System.out.println(m1.size());
		int value = ((Integer)m1.get("one")).intValue();
		int value1 = (Integer)m1.get("one");//自动将integer的内容取值
		System.out.println(value);
		Map m3 = new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
		m3.remove("A");
		System.out.println(m3);
		
		
		String[] s = {"aaa", "bbb", "aaa", "ccc", "ccc", "ccc"};
		Map m = new HashMap();
		for (int i=0; i<s.length; i++) {
			Integer number = (Integer)m.get(s[i]);
			m.put(s[i], number == null ? 1 : number+1);
		}
		System.out.println(m);

		
		
	}
	
	
}
