package TestContainer;

import java.util.ArrayList;
import java.util.Collection;

public class TestFor {
	
	public static void main(String[] args) {
		
		//for的增强循环，只适合简单遍历并读出值， 无法访问下标，不方便删除操作
		int[] array = {1,2,3,4,5,6,7,8,9};
		for (int i : array) {
			System.out.println(i);
		}
		
		Collection c = new ArrayList();
		c.add(new String("aaa"));
		c.add(new String("bbb"));
		c.add(new String("ccc"));
		for (Object o : c) {
			System.out.println(c);
		}
		
	}
	

}
