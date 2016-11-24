package TestData;

public class TestPackBasicDataType {
	public static void main(String[] args){
		//以integer基础数据类型为例进行转换
		//----max_value----min_value----longvalue(将integer转换为long，并返回long 的值)
		//intvalue----parseInt(String s)将字符串转换为int-----valueof(String s)
		
		Integer i = new Integer(100);
		System.out.println(Integer.MAX_VALUE + "; " + Integer.MIN_VALUE);
		Double d = new Double("3.14");
		int j = i.intValue() + d.intValue();
		float f = i.floatValue() + d.floatValue();
		System.out.println(j + "; " + f);
		double dd = Double.parseDouble("3.1415926");
		double r = Double.valueOf("3.0").doubleValue();
		
		System.out.println(dd);
		System.out.println(r);
		System.out.println(Integer.toBinaryString(123));
		System.out.println(Integer.toHexString(123));
		System.out.println(Integer.toOctalString(123));
		
	}

}
