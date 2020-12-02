
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class date extends javax.swing.JFrame {


	 public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
	    { 
	  
	        // Create a new ArrayList 
	        ArrayList<T> newList = new ArrayList<T>(); 
	  
	        // Traverse through the first list 
	        for (T element : list) { 
	  
	            // If this element is not present in newList 
	            // then add it 
	            if (!newList.contains(element)) { 
	  
	                newList.add(element); 
	            } 
	        } 
	  
	        // return the new list 
	        return newList; 
	    } 
	
	
    public date() {
    	
        initComponents();       
    }
    public static <T> List<T> convert(List<T> newList) 
    { 
  
        List<T> ASURITE = new LinkedList<>(); 
        for (T t : newList) { 

            ASURITE.add(t); 
        } 

        return ASURITE; 
    }
    public static <T> List<T> converttimes(List<T> newTime) 
    { 
  
        List<T> ATIME = new LinkedList<>(); 
        for (T t : newTime) { 

            ATIME.add(t); 
        } 

        return ATIME; 
    }
  

    @SuppressWarnings("unchecked")                        
    private void initComponents() {
        
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        
     
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Please select date.");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Day");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Month");

        jButton1.setText("Done");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)))
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        pack();
    }                

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String month =(String)jComboBox1.getSelectedItem();
        String day =(String)jComboBox2.getSelectedItem();
       
       
        String date = (month+ " "+day);
        System.out.println(date);
      
        
        
   	 ArrayList<Double> TIME = new ArrayList<>();
		
		//Hashtable<String, String> attend = new Hashtable<>(); 
		ArrayList<String> ASUR = new ArrayList<>();
		

		
		JButton open = new JButton();
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("Desktop"));
		fc.setDialogTitle("Select CSV FILE");
	//	fc.setFileSelectionMode("JFileChooser.") possibly make only csv files selectable
		if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION)
		{
			//stuff if approved file
		}
		else if (fc.showOpenDialog(open) == JFileChooser.CANCEL_OPTION)
		{
			//stuff if approved file
		}
		//System.out.println(fc.getSelectedFile().getAbsolutePath());
		
		String path = fc.getSelectedFile().getAbsolutePath();
		 String line = "";
		 try {
		 BufferedReader reader = new BufferedReader(new FileReader(path));
		 
		 while((line = reader.readLine()) != null) {
			 String[] stuff = line.split(",");
			ASUR.add(stuff[0]);
		
			double dnum = Double.parseDouble(stuff[1]);
			TIME.add(dnum);
			
		
		 }
		 
		 ArrayList<String> newList = removeDuplicates(ASUR);
		 ArrayList<Double> newTIME = new ArrayList<>();
		 int size =  newList.size();
		 int size2 =  ASUR.size();
		 int k = 0;
		 double g = 0;
		 int i = 0;
		 int q= 0;
		 
		while(i < size)
		{
			
			
			q=0;
			 k = 0;
			 g = 0; 
		 while ( k < size2)
		 {
			 boolean isEqual = ASUR.get(k).equals(newList.get(i)); 
			 
			 if( q == 0)
			 {
				g = g + TIME.get(k);
				
				 newTIME.add(g);
			//	 System.out.println(k);
				 k++;
			//	 System.out.println(g);
				 q++;
				 if(i >0)
				 {
					 g = g - TIME.get(0);
					 newTIME.set(i, g);
				 }
				 
			 }
			 
			 else if(isEqual)
			 {
				 g = g + TIME.get(k);
				 newTIME.set(i, g);
				 k++;
				 
			 }
			
			 else 
			 {
				 k++;
			 }
			
		 }
		 i++;
		}
		
		List<String> ASURITE = convert(newList); 
		List<Double> ATIME = converttimes(newTIME); 
		System.out.println(ASURITE);
		System.out.println(ATIME);
		 
		 }catch(FileNotFoundException a) {
			 System.out.println("AAAAAAA");
		 }catch(IOException a) {
			 System.out.println("AAAAAAAX2");
		 }
       System.exit(0);
    }                                        

   
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new date().setVisible(true);
            }
        });
    }
    
                  
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
                   
}

