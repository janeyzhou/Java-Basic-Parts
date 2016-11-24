package TestContainer;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
//无序不可以重复---set接口没有提供额外的方法--是collection的子接口----有hashset和treeset两种类
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("hello");
		s.add("world");
		s.add(new Name("f1", "l1"));
		s.add(new Integer(100));
		s.add(new Name("f1", "l1"));//无法加入相同的元素
		s.add("world");//无法加入相同的元素
		s.add(new String("world"));//无法加入相同的元素
		System.out.println(s);
		
		Set s1 = new HashSet();
		s1.add("a"); s1.add("b"); s1.add("c");
		Set s2 = new HashSet();
		s2.add("d"); s2.add("a"); s2.add("e");
		Set ss1 = new HashSet(s1);
		ss1.retainAll(s2);
		Set ss2 = new HashSet(s1);
		ss2.addAll(s2);
		System.out.println(ss1);
		System.out.println(ss2);
		
	}
	
	
}
