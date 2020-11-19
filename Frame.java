import java.awt.*;
import javax.swing.*;

//implement TableModelListener
public class Frame extends JFrame {

    JFrame window;

    Frame() {
        JMenuBar menuBar;
        JMenu about;
        JMenu file;
        JMenuItem load;
        JMenuItem add_att;
        JMenuItem save;
        JMenuItem plot;

        window = new JFrame("Attendance");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Student studentArray[] = loadRoster();
        //String fileContents[studentArray.length][];

        //for(int i = 0; i < studentArray.length, i++)
        //fileContents[i] = {studentArray[i].getID(), studentArray[i].getFirst(), studentArray[i].getLast(), studentArray[i].getProg(), studentArray[i].getLevel(), studentArray[i].getASUrite};

        //sample data for testing purposes
        String fileContents[][] = {{"1214289933", "Samia", "Muraweh", "Computer Science", "Junior", "smuraweh"}, {"Test", "Test", "Test", "Test", "Test", "Test"}};
        String column[] = {"ID", "First Name", "Last Name", "Program", "Level", "ASUrite"};
        JTable table = new JTable(fileContents, column);
        table.setBounds(30, 40, 200, 300);
        //table.getModel().addTableModelListener(this);

        JScrollPane scroll = new JScrollPane(table);

        JPanel pane = new JPanel();
        pane.setLayout(new BorderLayout());
        pane.add(scroll, BorderLayout.CENTER);

        menuBar = new JMenuBar();
        about = new JMenu("About");
        file = new JMenu("File");
        menuBar.add(file);
        menuBar.add(about);

        load = new JMenuItem("Load a Roster");
        add_att = new JMenuItem("Add Attendance");
        save = new JMenuItem("Save");
        plot = new JMenuItem("Plot Data");

        file.add(load);
        file.add(add_att);
        file.add(save);
        file.add(plot);

        pane.add(menuBar, BorderLayout.NORTH);

        window.add(pane);
        window.setSize(500, 400);
        window.setVisible(true);
    }

    public static void main(String[] args){
        new Frame();
    }

    //implemented from example
    /*public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel m = (TableModel)e.getSource();
        String columnName = m.getColumnName(column); //input specific int?
        Object data = m.getValueAt(row, column); //input specific numbers
    }*/

    //public string[] loadRoster() {
        // implementation
    //}
}