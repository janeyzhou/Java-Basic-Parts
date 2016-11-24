package TestContainer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestComparable {
	//Comparable接口只有一个方法comparaTo（Object obj）
	//对于基础类型都实现了java.lang.comparable接口，比如string，int等等
	//对于一般的对象，我们可以通过实现comparable接口，来重写comaparaTo方法，是现实具体的排序策略
	//还是以name为例，在class Name中实现接口comparaable
	
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(new Name("janey", "zhou"));
		l.add(new Name("janey", "wang"));
		l.add(new Name("david", "blay"));
		l.add(new Name("lily", "gan"));
		l.add(new Name("david", "feng"));
		l.add(new Name("lily", "gan"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

	}

}
