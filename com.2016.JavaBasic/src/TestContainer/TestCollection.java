package TestContainer;

import java.util.*;

public class TestCollection {
//定义存取一组对象的方法--子接口： set  list(LinkedList and ArrayList继承list)
//set无序不可以重复	； list有序可以重复
	public static void main(String[] args) {
		Collection c = new ArrayList();//父类引用指向子类对象
		c.add("hello");
		c.add(new Integer(100));//必须添加的是对象
		c.add(new Name("janey", "zhou"));
		System.out.println(c.hashCode());
		System.out.println(c);
		
		Collection c1 = new HashSet();
		c1.add("hello");
		c1.add(new Integer(100));
		c1.add(new Name("janey", "zhou"));
		System.out.println(c1.hashCode());
		System.out.println(c1);
		c1.remove("hello");
		c1.remove(new Integer(100));
		//remove, contains 的比较是equals 和hashcode（通常用在map的键值比较重---效率更高，适合做索引）方法  
		//相等的对象应该有相等的hash code--如果只想比较成员变量的value，需要重写equals和hash code方法
		System.out.println(c1.remove(new Name("janey", "zhou")));//如果无法去掉，就返回false
		System.out.println(new Name("janey", "zhou").hashCode());
		System.out.println(c1);
		
	}
}

class Name implements Comparable {
	String firstName;
	String lastName;
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "firstName=" + firstName + " lastName=" + lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public boolean equals(Object obj){//重写equals方法的时候，要重写hashcode方法
		if(obj instanceof Name){
			Name name = (Name)obj;
			if (this.firstName.equals(name.firstName) && this.lastName.equals(name.lastName)){
				return true;
			}else{
				return false;
			}
		}
		return super.equals(obj);
		
	}
	
	public int hashCode(){
		return firstName.hashCode();
		
	}
	
	//重写comparaTo方法
	public int compareTo(Object obj) {
		Name n = (Name)obj;
		int first = this.lastName.compareTo(n.lastName);
		return first != 0 ? first : this.lastName.compareTo(n.lastName);
		
	}
	
}
