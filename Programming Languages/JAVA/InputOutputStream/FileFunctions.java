import java.util.*;
import java.io.*;
class FileFunctions{
	public static void main(String[] args)throws IOException {
		Scanner in=new Scanner(System.in);

		
		File f=new File("Functions.txt");
		f.createNewFile();
		System.out.println(f.exists()?"File exists":"File does not exists");
		System.out.println("Name : "+f.getName());
		System.out.println("Path : "+f.getPath());
		System.out.println("Absolute Path : "+f.getAbsolutePath());
		System.out.println("Parent : "+f.getParent());
		System.out.println("Last Modified : "+f.lastModified());
		System.out.println("File Length : "+f.length());
		System.out.println(f.canRead()?"Readable":"Not Readable");
		System.out.println(f.canWrite()?"Writeable":"Not Writeable");
		f.close();
	}
}