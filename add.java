
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class add {

	public static void main(String[] args) {
		 LinkedList<Student> students = new LinkedList<>(); 

		 String path = "something.cvs";
		 String line = "";
		 try {
		 BufferedReader reader = new BufferedReader(new FileReader(path));
		 
		 while((line = reader.readLine()) != null) {
			 String[] stuff = line.split(",");
			 stuff[0]; //the given student infomraiton 
			// Student.addNode(stuff);
		 }
		 
		 
		 }catch(FileNotFoundException a) {
			 System.out.println("AAAAAAA");
		 }

	//	 Student student = new Student(first_name,Last_name, age, course,studentID);
	//	 students.add(student);

	}

}
