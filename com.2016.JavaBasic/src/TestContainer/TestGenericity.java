package TestContainer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestGenericity {
	//在collection，iterator， class中指定对应的类型，就不需要强制转换了
	
	public static void main (String[] args){
		List<String> l = new LinkedList<String>();
		l.add("aaa");
		l.add("bb");
		l.add("cccc");
		String s = l.get(1);
		System.out.println(s);
		
		for(int i=0; i<l.size(); i++){
			String s1 = l.get(i);
			System.out.println("get:" + s1);
		}
		
		Iterator<String> ite = l.iterator();
		while(ite.hasNext()) {
			String s1 = ite.next();
			System.out.println(s1);
		}
		
		List<MyName> my = new LinkedList<MyName>();
		my.add(new MyName("Janey", "zhou"));
		my.add(new MyName("lily", "Wu"));
		my.add(new MyName("alice", "zhang"));
		System.out.println(my);
		Collections.sort(my);
		System.out.println(my);
		MyName myname = my.get(1);
		System.out.println(myname);		
		
	}
	

}

//由于comparable带有泛型标识<>,所以可以使用
class MyName implements Comparable<MyName> {
	String myfirst;
	String mylast;
	public MyName(String myfirst, String mylast){
		this.myfirst = myfirst;
		this.mylast = mylast;
	}

	//tostring, equals, hashcode这三种方法一般都要重写
	public String toString(){
		return myfirst + " " + mylast;
	}
		
	public boolean equals(Object obj){//重写equals方法的时候，要重写hashcode方法
		if(obj instanceof MyName){
			MyName name = (MyName)obj;
			if(this.myfirst.equals(name.myfirst) && this.mylast.equals(name.mylast)){
				return true;
			}else{
				return false;
			}
		}else{
			return super.equals(obj);
		}
		
	}
	
	public int hashCode(){
		return this.myfirst.hashCode();
		
	}


	@Override
	public int compareTo(MyName o) {
		// TODO Auto-generated method stub
		int mark = this.myfirst.compareTo(o.myfirst);
		return mark != 0 ? mark : this.mylast.compareTo(o.mylast);
	}


	
}
