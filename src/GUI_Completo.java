import javax.swing.*;
import java.awt.*;


class GuiCompleto extends JFrame{
	
	JMenuBar menuBar; 
	JTextField caja1,caja2,caja3,caja4,caja5,caja6,caja7,caja8,caja9,caja10,caja11,caja12,caja13,caja14,caja15; 
	JComboBox<String> opc1,opc2, opc3, opc4,opc5,opc6; 
	JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17; 
	JMenu menuInicio, menuBooking, menuTest, menuPrinting, 
	menuTransaction, menuLab, menuSettings, menuUtilies, menuWindow,
	menuHelp;
	
	public GuiCompleto() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Lab Master - Test Booking"); //VENTANAN internas que funcionan dentro de otro
		setSize(800,800);
		setLocationRelativeTo(null);
		setVisible(true);
		//menuItemCalcSencilla.setIcon(new Image());
		menuBar = new JMenuBar(); 
			menuInicio = new JMenu("Masters");
			menuInicio.setIcon(new ImageIcon("D:\\marin\\Downloads"));
			menuBooking = new JMenu("Booking"); 
			menuTest = new JMenu("Test Perfonm");
			menuPrinting = new JMenu("Printing");
			menuTransaction = new JMenu("Transaction");
			menuLab = new JMenu("Lab Reports"); 
			menuSettings = new JMenu("Settings");
			menuUtilies = new JMenu("Utilies");
			menuWindow = new JMenu("Window");
			menuHelp = new JMenu("Help");
		menuBar.add(menuInicio); 
		menuBar.add(menuBooking);
		menuBar.add(menuTest);
		menuBar.add(menuPrinting);
		menuBar.add(menuTransaction);
		menuBar.add(menuLab);
		menuBar.add(menuSettings);
		menuBar.add(menuUtilies);
		menuBar.add(menuWindow);
		menuBar.add(menuHelp);
	setJMenuBar(menuBar);
	
	b1 = new JButton("Add"); 
	b1.setBackground(Color.WHITE);
	b1.setBounds(5, 2, 56, 40);
	add(b1); 
	
	b2 = new JButton("Edit"); 
	b2.setBackground(Color.WHITE);
	b2.setBounds(60, 2, 56, 40);
	add(b2); 
	
	b3 = new JButton("Back"); 
	b3.setBackground(Color.WHITE);
	b3.setBounds(115, 2, 56, 40);
	add(b3); 
	
	b4 = new JButton("Next"); 
	b4.setBackground(Color.WHITE);
	b4.setBounds(160, 2, 56, 40);
	add(b4); 
	
	b5 = new JButton("List"); 
	b5.setBackground(Color.WHITE);
	b5.setBounds(215, 2, 56, 40);
	add(b5); 
	
	b6 = new JButton("Save"); 
	b6.setBackground(Color.WHITE);
	b6.setBounds(270, 2, 56, 40);
	add(b6); 
	
	b7 = new JButton("Print"); 
	b7.setBackground(Color.WHITE);
	b7.setBounds(325, 2, 56, 40);
	add(b7); 
	
	b8 = new JButton("Test"); 
	b8.setBackground(Color.WHITE);
	b8.setBounds(380, 2, 56, 40);
	add(b8); 
	
	b9 = new JButton("Cancel"); 
	b9.setBackground(Color.WHITE);
	b9.setBounds(435, 2, 56, 40);
	add(b9); 
	
	b10 = new JButton("Settings"); 
	b10.setBackground(Color.WHITE);
	b10.setBounds(490, 2, 56, 40);
	add(b10); 
	
	b11 = new JButton("Delete"); 
	b11.setBackground(Color.WHITE);
	b11.setBounds(545, 2, 56, 40);
	add(b11); 
	
	b12 = new JButton("Slip"); 
	b12.setBackground(Color.WHITE);
	b12.setBounds(600, 2, 56, 40);
	add(b12); 
	
	b13 = new JButton("Exit"); 
	b13.setBackground(Color.WHITE);
	b13.setBounds(655, 2, 56, 40);
	add(b13); 
	
	
	JPanel panel1= new JPanel();
	panel1.setLayout(null);
	panel1.setBackground(Color.LIGHT_GRAY);
	panel1.setBounds(6,55, 750, 225);
	
	JLabel caja11 = new JLabel("Patent ID");
	caja11.setBounds(6, 10, 60, 30);
	panel1.add(caja11);
	caja1 = new JTextField(10);
	caja1.setBounds(70, 10, 80, 30);
	panel1.add(caja1);
	
	JLabel opc11 = new JLabel("Date");
	opc11.setBounds(200, 10, 60, 30);
	panel1.add(opc11);
	String [] items = {"21/01/2000", "21/01/2010", "21/01/2020"};
	opc1 = new JComboBox<String>(items);
	opc1.setBounds(250, 10, 100, 30);
	panel1.add(opc1); 
	
	JLabel opc22 = new JLabel("* Time(hh/mm)");
	opc22.setBounds(355,10, 100, 30);
	panel1.add(opc22);
	caja2 = new JTextField("0",10);
	caja2.setBounds(438, 10, 22, 30);
	panel1.add(caja2);
	caja3 = new JTextField(" 0",10);
	caja3.setBounds(462, 10, 22, 30);
	panel1.add(caja3);
	
	JLabel opc33 = new JLabel("Lab No");
	opc33.setBounds(500,10, 100, 30);
	panel1.add(opc33);
	caja4 = new JTextField(10);
	caja4.setBounds(550, 10, 70, 30);
	panel1.add(caja4);
	
	JLabel opc55 = new JLabel("Name");
	opc55.setBounds(6,50, 100, 30);
	panel1.add(opc55);
	String [] items2 = {"MR", "MRS", "SÑR"};
	opc3 = new JComboBox<String>(items2);
	opc3.setBounds(70, 50, 60, 30);
	panel1.add(opc3);
	caja5 = new JTextField(10);
	caja5.setBounds(155, 50, 194, 30);
	panel1.add(caja5);
	
	JLabel opc66 = new JLabel("Sex"); 
	opc66.setBounds(6,90, 100, 30);
	panel1.add(opc66);
	
	JLabel bl12 = new JLabel("Referred By: ");
	bl12.setBounds(6,130,100,20);
	panel1.add(bl12);
	JTextField caja55 = new JTextField(10);
	caja55.setBounds(90, 130, 100, 30);
	panel1.add(caja55);
	
	String [] items3 = {"MALE", "FEMALE", "UNDEFINID"};
	opc4 = new JComboBox<String>(items3);
	opc4.setBounds(70, 90, 60, 30);
	panel1.add(opc4);
	
	JLabel opc77 = new JLabel("Age");
	opc77.setBounds(140,90, 100, 30);
	panel1.add(opc77);
	caja6 = new JTextField("0",10);
	caja6.setBounds(164, 90, 35, 30);
	panel1.add(caja6);
	
	JLabel opc88 = new JLabel("Mons");
	opc88.setBounds(204,90, 100, 30);
	panel1.add(opc88);
	caja7 = new JTextField("0",10);
	caja7.setBounds(240, 90, 35, 30);
	panel1.add(caja7);
	
	JLabel opc99 = new JLabel("Days");
	opc99.setBounds(280,90, 100, 30);
	panel1.add(opc99);
	caja8 = new JTextField("0",10);
	caja8.setBounds(314, 90, 35, 30);
	panel1.add(caja8);
	
	JLabel b14 = new JLabel("Sample By");
	b14.setBounds(380, 90, 80, 20);
	panel1.add(b14);
	caja12 = new JTextField(10);
	caja12.setBounds(450, 90, 80, 20);
	panel1.add(caja12);
	JLabel b15 = new JLabel("Panel Code ");
	b15.setBounds(380, 120, 80, 20);
	panel1.add(b15);
	caja13 = new JTextField(10);
	caja13.setBounds(450, 120, 80, 20);
	panel1.add(caja13);
	JLabel b16 = new JLabel("Panel ID");
	b16.setBounds(380, 150, 60, 20);
	panel1.add(b16);
	caja14 = new JTextField(10);
	caja14.setBounds(450, 150, 80, 20);
	panel1.add(caja14);
	JLabel b17 = new JLabel("e-mail");
	b17.setBounds(380, 180, 60, 20);
	panel1.add(b17);
	caja15 = new JTextField(10);
	caja15.setBounds(450, 180, 80, 20);
	panel1.add(caja15);
	add(panel1);		
	//fIN PANEL 1
	
	//Panel 2
	JPanel panel2= new JPanel();
	panel2.setLayout(null);
	panel2.setBackground(Color.LIGHT_GRAY);
	panel2.setBounds(6, 300, 750, 300);
	
	add(panel2);
	
	//Panel 3
	
	JPanel panel3= new JPanel();
	panel3.setLayout(null);
	panel3.setBackground(Color.LIGHT_GRAY);
	panel3.setBounds(6, 620, 750, 80);
	
	
	JLabel b11 = new JLabel("Home Collection ");
	b11.setBounds(6, 10, 100, 20);
	panel3.add(b11);
	JTextField caja51 = new JTextField(10);
	caja51.setBounds(100, 10, 100, 20);
	panel3.add(caja51);
	
	

	JLabel b12 = new JLabel("Paid");
	b12.setBounds(230, 10, 50, 20);
	panel3.add(b12);
	JTextField caja53 = new JTextField(10);
	caja53.setBounds(280, 10, 100, 20);
	panel3.add(caja53);
	
	JLabel b13 = new JLabel("Pay Type");
	b13.setBounds(400, 10, 80, 20);
	panel3.add(b13);
	String [] items4 = {"Cash", "Card", "Bank Cheque"};
	JComboBox<String>opc31 = new JComboBox<String>(items4);
	opc31.setBounds(460, 10, 80, 20);
	panel3.add(opc31);
	
	JLabel b141 = new JLabel("Receipt No.");
	b141.setBounds(550, 10, 100, 20);
	panel3.add(b141);
	JTextField caja54 = new JTextField(10);
	caja54.setBounds(620, 10, 100, 20);
	panel3.add(caja54);
	
	add(panel3);
	
	
	
	
	
	
	
	}
}
public class GUI_Completo {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GuiCompleto();
			}
		});

	}

}
