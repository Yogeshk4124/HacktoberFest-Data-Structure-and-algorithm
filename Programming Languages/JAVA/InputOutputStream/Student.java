import java.util.*;
import java.io.Serializable;

class Student implements Serializable{
	String name;
	String uid;
	public Student(String name,String uid){
		this.name=name;
		this.uid=uid;
	}
	public String toString(){
		return "[ name = "+name+", UID = "+uid+" ]";
	}
}