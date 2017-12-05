package TestContainer;

import java.util.*;

public class TestListandCollections {
    //有序可以重复
	//Collections类提供list容器的常用算法
	//list是collection接口的子接口
	public static void main(String[] args) {
		List l1 = new LinkedList();
		for(int i=0; i<10; i++){
			l1.add("a" + i);
		}
		
		System.out.println(l1);
		l1.add(1, "a100");
		System.out.println(l1);
		l1.set(2, "a200");
		System.out.println(l1);
		String s = (String) l1.get(3);
		System.out.println(l1.get(3));
		System.out.println(s);
		int location = l1.indexOf("a4");
		System.out.println(location);
		l1.remove("a5");
		System.out.println(l1);
		l1.remove(6);
		System.out.println(l1);
		
		//调用collections类中的方法对list进行操作
		System.out.println();
		List l2 = new LinkedList();
		List l3 = new LinkedList();
		for(int i=0; i<10; i++){
			l2.add("a" + i);
		}
		System.out.println(l2);
		Collections.shuffle(l2);
		System.out.println(l2);
		Collections.reverse(l2);
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		int l2locaiton = Collections.binarySearch(l2, "a3");
		System.out.println(l2locaiton);//二分法查找
		
		//collections的排序的原则，一般的基础类型按照大小排序
		//对一般的对象需要规定特定的排序原则---利用comparable接口---间TestComparable

	}
}
