import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener, ChangeListener {
	
	private JLabel ind,ind2;
	private JRadioButton r1,r2,r3,r4,r5,r6;
	private ButtonGroup bg1, bg2;
	private JTextField dias,total;
	private JButton b1,b2;
	private float preciototal,precio;
	private int d;
	private String viv;
	float x;
	float z;


	
	public Formulario()
	{
		setLayout(null);
		ind = new JLabel("Seleccione el tipo de Vivienda: ",JLabel.CENTER);
		ind.setBounds(90,10,200,50);
		ind2 = new JLabel ("Cantidad de dias: ");
		ind2.setBounds(5,330,150,50);
        dias = new JTextField ();
        dias.setBounds(5,380,120,40);
        total=new JTextField("$0,00");
        total.setBounds(210,390,160,60);
        bg1 = new ButtonGroup();
        r1 = new JRadioButton("Casa");
        r1.setBounds(40,60,100,30);
        r1.addChangeListener(this);
        r2 = new JRadioButton ("Duplex");
        r2.setBounds(140,60,100,30);
        r2.addChangeListener(this);
        r3 = new JRadioButton ("Departamento");
        r3.setBounds(240,60,120,30);
        r3.addChangeListener(this);
        bg2 = new ButtonGroup();
        r4 = new JRadioButton("Un dormitorio");
        r4.setBounds(5,110,120,30);
        r4.addChangeListener(this);
        r5 = new JRadioButton("Dos dormitorios");
        r5.setBounds(5,145,120,30);
        r5.addChangeListener(this);
        r6 = new JRadioButton("Tres dormitorios");
        r6.setBounds(5,180,120,30);
        r6.addChangeListener(this);
        b1 = new JButton ("Mostrar Dialogo");
        b1.setBounds(215,270,130,50);
        b1.addActionListener(this);
        b2 = new JButton("Calcular Importe");
        b2.setBounds(215,325,130,50);
        b2.addActionListener(this);
        add(ind);
        add(ind2);
        add(dias);
        add(total);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(r5);
        add(r6);
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        bg2.add(r4);
		bg2.add(r5);
		bg2.add(r6);
		add(b1);
		add(b2);
		
		
		
	}
	public void stateChanged (ChangeEvent e)
	{


		if(r1.isSelected() ==true )
		{
			x = 50;
		viv = r1.getText();

		}
		if(r2.isSelected() ==true )
		{
			 x = 40;
			viv = r2.getText();
			
		}

		if(r3.isSelected() ==true )
		{
			 x =30;
			viv = r3.getText();

		}
	

			if(r4.isSelected()==true)
			{
				z = x +  ((x*20)/100); 
				d = 1;
			
			}
			if(r5.isSelected()==true)
			{
				z = x +  ((x*25)/100);
				d = 2;
			

			}
			if(r6.isSelected()==true)
			{
				z = x +  ((x*30)/100); 
				d = 3;
			
			}

			

	    
		precio = z;

}

		


	public void actionPerformed (ActionEvent e)
	{ 
		
		int j;
		if (e.getSource () == b2)
		{
			
			j = Integer.parseInt(dias.getText());
			preciototal = precio*j;
			total.setText(String.valueOf(preciototal));
		}
		if (e.getSource() == b1)
		{
			
			DialogoPresupuesto dp = new DialogoPresupuesto(preciototal,d,viv);
			dp.setBounds(15,20,300,400);
			dp.setVisible(true);
			
		}
		
	}

	public static void main (String []ar)
	{
		Formulario f = new Formulario();
		f.setBounds(10,10,390,500);
		f.setTitle("Alquiler Viviendas");
		f.setVisible(true);
		
	}
	

}
