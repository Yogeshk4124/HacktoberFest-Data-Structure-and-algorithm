import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class ObjectFile{
	public static void main(String[] args)throws Exception {
		Student s=new Student("Shreyans Jain","18BCS3465");
		//File f=new File("StudentList.txt");
/*
		//FileOutputStream fos=new FileOutputStream(f);
		//ObjectOutputStream oos=new ObjectOutputStream(fos);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("StudentList.txt")));
		oos.writeObject(s);
		oos.close();
*/

		new ObjectOutputStream(new FileOutputStream(new File("StudentList.txt"))).writeObject(s);

/*		
		//FileInputStream fis=new FileInputStream(f);
		//ObjectInputStream oos=new ObjectInputStream(fis);
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("StudentList.txt")));
		Student ob=(Student)ois.readObject();
		ois.close();
*/

		Student ob=(Student)new ObjectInputStream(new FileInputStream(new File("StudentList.txt"))).readObject();
		System.out.println(ob.toString());
	}
}