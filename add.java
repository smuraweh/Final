
import javax.swing.JButton;
import javax.swing.JFileChooser;

import javafx.application.Application;
import javafx.scene.control.DatePicker;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;


public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList<String> ASURITE = new LinkedList<>(); 
		//LinkedList<Object> TIME = new LinkedList<>();
		//Hashtable<String, String> attend = new Hashtable<>(); 
		List<String> ASURITE = new ArrayList<>();
		
		JButton open = new JButton();
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("."));
		fc.setDialogTitle("Select CSV FILE");
	//	fc.setFileSelectionMode("JFileChooser.") possibly make only csv files selectable
		if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION)
		{
			//stuff if approved file
		}
		System.out.println(fc.getSelectedFile().getAbsolutePath());
		
		String path = fc.getSelectedFile().getAbsolutePath();
		 String line = "";
		 try {
		 BufferedReader reader = new BufferedReader(new FileReader(path));
		 
		 while((line = reader.readLine()) != null) {
			 String[] stuff = line.split(",");
			ASURITE.add(stuff[0]);
		//	TIME.add(stuff[1]);
			//attend.put(stuff[0],stuff[1]);
			// Student.addNode(stuff);
		 }
		 
		
		 }catch(FileNotFoundException a) {
			 System.out.println("AAAAAAA");
		 }catch(IOException a) {
			 System.out.println("AAAAAAAX2");
		 }
		
		 int num = 0;
	    
			  
		 }
		
