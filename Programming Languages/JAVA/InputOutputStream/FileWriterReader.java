import java.io.*;

class FileWriterReader
{ 
	public static void main(String[] args) throws IOException 
	{ 
	 	String str = "Shreyans Jain"; 

        FileWriter fw=new FileWriter("output.txt"); 
  		for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
        System.out.println("Writing successful"); 
        fw.close();

		int ch; 
		FileReader fr=null; 
		try
		{ 
			fr = new FileReader("output.txt"); 
		} 
		catch (FileNotFoundException fe) 
		{ 
			System.out.println("File not found"); 
		}
		while ((ch=fr.read())!=-1) 
			System.out.print((char)ch); 
		fr.close(); 
	} 
} 