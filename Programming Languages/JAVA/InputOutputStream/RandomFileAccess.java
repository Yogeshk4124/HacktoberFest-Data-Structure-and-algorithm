import java.io.*;
import java.util.*;


class RandomFileAccess{
	public static void main(String[] args) throws Exception {
	try{
		System.out.println("Writing inside file");
		RandomAccessFile file=new RandomAccessFile("rand.txt","rw");
		file.writeChar('X');
		file.writeInt(555);
		file.writeDouble(13.17);
		file.writeBoolean(false);
		file.seek(0);
		System.out.println("Reading file");
		System.out.println(file.readChar());
		System.out.println(file.readInt());
		System.out.println(file.readDouble());
		System.out.println(file.readBoolean());
		System.out.println("file length="+file.length());
		long l=file.length();
		file.seek(file.length());
		file.writeBytes("Shreyans Jain\n");
		System.out.println("file length="+file.length());
		file.seek(l);
		System.out.println(file.readLine());
		file.close();
	}
	catch(Exception e){
		System.out.println("Exception occured = "+e);
	}
}
}