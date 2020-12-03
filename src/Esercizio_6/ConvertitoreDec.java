package Esercizio_6;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class ConvertitoreDec extends JFrame implements ActionListener{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton bBase2,bBase8,bBase16,bBacks,bClear,bInfo;
	JLabel lNumeroDecimale,lNumeroInBase;
	JTextField tNumeroDecimale,tNumeroInBase;
	int max = Integer.MAX_VALUE;
	//max è il massimo valore intero che si può convertire
	//(pari in binario a 2^31-1)
	String s="";
	JFrame frameInfo;
	
	public ConvertitoreDec(){
		frameInfo=new JFrame();
		Container c=this.getContentPane();
		c.setLayout(new GridLayout(6,0));
		Font fs = new Font("Arial",Font.BOLD,14);
		Font fs2 = new Font("Arial",Font.BOLD,16);
		Font fs3 = new Font("Arial",Font.ITALIC,12);
		b0 = new JButton("0"); b0.setBackground(Color.WHITE); b0.setFont(fs);
		b1 = new JButton("1"); b1.setBackground(Color.WHITE); b1.setFont(fs);
		b2 = new JButton("2"); b2.setBackground(Color.WHITE); b2.setFont(fs);
		b3 = new JButton("3"); b3.setBackground(Color.WHITE); b3.setFont(fs);
		b4 = new JButton("4"); b4.setBackground(Color.WHITE); b4.setFont(fs);
		b5 = new JButton("5"); b5.setBackground(Color.WHITE); b5.setFont(fs);
		b6 = new JButton("6"); b6.setBackground(Color.WHITE); b6.setFont(fs);
		b7 = new JButton("7"); b7.setBackground(Color.WHITE); b7.setFont(fs);
		b8 = new JButton("8"); b8.setBackground(Color.WHITE); b8.setFont(fs);
		b9 = new JButton("9"); b9.setBackground(Color.WHITE); b9.setFont(fs);
		bBase2 = new JButton("Bin"); 	bBase2.setFont(fs2);
		bBase8 = new JButton("Oct"); 	bBase8.setFont(fs2);
		bBase16 = new JButton("Hex"); 	bBase16.setFont(fs2);
		bBacks = new JButton("Del");
		bBacks.setBackground(Color.WHITE); 	bBacks.setFont(fs);
		bClear= new JButton("Clear");
		bClear.setBackground(Color.WHITE); 	bClear.setFont(fs);
		bInfo = new JButton("Info");		bInfo.setFont(fs);
		bInfo.setBackground(new Color(220,220,220));
		//
		lNumeroDecimale = new JLabel("Numero decimale [1-"+max+"]");
		lNumeroDecimale.setFont(fs3);
		lNumeroDecimale.setHorizontalAlignment(SwingConstants.CENTER);
		tNumeroDecimale = new JTextField();
		tNumeroDecimale.setEditable(false);
		tNumeroDecimale.setPreferredSize(new Dimension(290, 45));
		tNumeroDecimale.setHorizontalAlignment(SwingConstants.CENTER);
		//
		lNumeroInBase = new JLabel("");
		lNumeroInBase.setFont(fs3);
		lNumeroInBase.setHorizontalAlignment(SwingConstants.CENTER);
		tNumeroInBase = new JTextField();
		tNumeroInBase.setEditable(false);
		tNumeroInBase.setPreferredSize(new Dimension(290, 45));
		tNumeroInBase.setHorizontalAlignment(SwingConstants.CENTER);
		//
		JPanel p0=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		//
		p0.setLayout(new GridLayout(2,1));
		//riga 0 con Label e TextField del numero decimale intero da convertire
		p0.add(lNumeroDecimale);
		p0.add(tNumeroDecimale);
		//
		p1.setLayout(new GridLayout(2,1));
		//riga 1 con Label e TextField del numero convertito in base 2 (o 8 o 16)
		p1.add(lNumeroInBase);
		p1.add(tNumeroInBase);
		//
		p2.setLayout(new GridLayout(1,4));
		p2.add(bBase2);
		p2.add(b1);p2.add(b2);p2.add(b3);
		//
		p3.setLayout(new GridLayout(1,4));
		p3.add(bBase8);
		p3.add(b4);p3.add(b5);p3.add(b6);
		//
		p4.setLayout(new GridLayout(1,4));
		p4.add(bBase16);
		p4.add(b7);p4.add(b8);p4.add(b9);
		//
		p5.setLayout(new GridLayout(1,4));
		p5.add(bInfo);
		p5.add(bClear);
		p5.add(b0);
		p5.add(bBacks);
		//
		c.add(p0); c.add(p1); c.add(p2); c.add(p3); c.add(p4); c.add(p5);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bBase2.addActionListener(this);
		bBase8.addActionListener(this);
		bBase16.addActionListener(this);
		bBacks.addActionListener(this);
		bClear.addActionListener(this);
		bInfo.addActionListener(this);
		//
		this.setTitle("From Base 10 MDB2020");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();//
		this.setSize(320, 320);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ConvertitoreDec();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action=e.getActionCommand();
		char c0 = action.charAt(0);
		switch(c0) {
		case '0':
			if (!s.equals("")) s+="0";
			break;
		case '1':
			s+="1";break;
		case '2':
			s+="2";break;
		case '3':
			s+="3";break;
		case '4':
			s+="4";break;
		case '5':
			s+="5";break;
		case '6':
			s+="6";break;
		case '7':
			s+="7";break;
		case '8':
			s+="8";break;
		case '9':
			s+="9";break;
		case 'C':
			if(!s.equals("")) {
				s="";
				tNumeroDecimale.setText(""); 
				lNumeroInBase.setText("");
				tNumeroInBase.setText("");
			}
			break;
		case 'D':
			if(!tNumeroInBase.getText().contentEquals(""))return;
			// se vi è stata una conversione il tasto BackSpace non funziona
			if(!s.contentEquals(""))	
				s=s.substring(0,s.length()-1);
			break;
		case 'I':
			String testo="Conversione di un numero decimale intero\npositivo, ";
			testo+=" compreso tra 1 e 2147483647,\ndalla base 10 ";
			testo+="alle basi 2, 8 e 16.";
			JOptionPane.showMessageDialog(this, testo, "Info MDB2020", JOptionPane.PLAIN_MESSAGE);
			break;
		case 'B':
			converti(2);break;
		case 'O':
			converti(8);break;
		case 'H':
			converti(16);break;
		}
		if(!s.equals("") && Double.valueOf(s)>max) {
			s=s.substring(0,s.length()-1);
			JOptionPane.showMessageDialog(this, "Numero troppo grande", "Attenzione!", JOptionPane.PLAIN_MESSAGE);
		}
		tNumeroDecimale.setText(s);
	}
	
	void converti(int bc) {
		String snumero=tNumeroDecimale.getText();
		if(snumero.equals(""))return;
		int numero=Integer.parseInt(snumero);
		String risultato = "";
		int resto;
		while (numero > 0) {
			resto = numero % bc;
			if (bc == 16) {
				if (resto == 10)
					risultato = "A"+risultato;
				else if (resto == 11)
					risultato = "B"+risultato;
				else if (resto == 12)
					risultato = "C"+risultato;
				else if (resto == 13)
					risultato = "D"+risultato;
				else if (resto == 14)
					risultato = "E"+risultato;
				else if (resto == 15)
					risultato = "F"+risultato;
				else
					risultato = resto+risultato;
			} else
				risultato= resto+risultato;
			numero /= bc;
		}
		lNumeroInBase.setText("Numero in base "+bc);
		tNumeroInBase.setText(risultato);
	}
}
