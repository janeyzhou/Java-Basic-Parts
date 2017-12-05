package TestContainer;

import java.util.*;

public class TestIterator {
	//Iterator可以方便的对容器内的元素进行遍历操作
	//boolean hasnext()--object next()---void remove()
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add(new Name("f1", "l1"));
		c.add(new Name("fff2", "l2"));
		c.add(new Name("ff3", "l3"));
		Iterator i = c.iterator();
		while(i.hasNext()) {
			Name n = (Name)i.next();
			System.out.println(n.getFirstName() + "; " + n.getLastName());
		}
		
		while(i.hasNext()) {
			Name n = (Name)i.next();
			if(n.getFirstName().length()<3){
				i.remove();//只能是iremove，不能用cremve
			}
		}
		
		System.out.println(c);
	}

}
