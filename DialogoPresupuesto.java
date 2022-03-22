import javax.swing.*;
import java.awt.event.*;
public class DialogoPresupuesto extends JDialog implements ActionListener {
	private JLabel vivienda, dormitorios, importe;
	private JButton b1;
	
	DialogoPresupuesto(float p,int d, String v)
	{
		setLayout(null);
		setResizable(false);
		setModal(true);
		
		vivienda = new JLabel ("Vivienda Seleccionada: " + v);
		vivienda.setBounds(10,50,220,50);
		add(vivienda);
		dormitorios = new JLabel ("Dormitorios Seleccionados: " + d);
		dormitorios.setBounds(10,110,220,50);
		add(dormitorios);
		importe = new JLabel ("Total a abonar: $" + p);
		importe.setBounds(10,160,220,50);
		add(importe);
		b1 = new JButton ("Confirmar");
		b1.setBounds(150,260,100,70);
		add(b1);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource () == b1)
		{
			dispose();
		}
	}

}
