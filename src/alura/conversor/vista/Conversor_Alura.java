package alura.conversor.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.awt.event.ItemEvent;


public class Conversor_Alura extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor_Alura frame = new Conversor_Alura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}
	
	
	 String[] TipoC= {"Seleccione tipo...","Moneda","Temperatura","Masa","Longitud"};
	 String[] Monedas= {"Seleccione moneda...","Peso mexicano - MXN","Dolar americano - USD", "Euro - EUR","Dolar canadiense - CAD","Dirham marroqui - MAD","Yen - JPY"};
	 String[] Temperaturas= {"Seleccione...","Fahrenheit-°F", "Celsius-°C","Kelvin-°F"};
	 String[] Masas= {"Seleccione...","Kilogramo-Kg","Gramo-g","Miligramo-mg","Libras-lbs"};
	 String[] Longitudes= {"Seleccione...","Kilometro-km","Metro-m","Centimetro-cm","Milimetro-mm"};
	 String  ValoraConvertir;
	 String  TipodeCambio;
	 Double monedacantidad;
	 Double TipoCambio;
	
	 Double input1=0.0;
	 Double input2=0.0;
	 boolean err=true;
	 
	 public  String convertirTipo;
	 public String Convierte;
	 public String Tipolbl = " ";
	 
	/**
	 * 
	 * +
	 * Create the frame.
	 */
	 
	 
	 
	public Conversor_Alura() {
		setTitle("Convertir monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccioneElTipo = new JLabel("Seleccione el tipo  que desea convertir: ");
		lblSeleccioneElTipo.setBounds(47, 31, 358, 14);
		contentPane.add(lblSeleccioneElTipo);
		
		
		JComboBox<String> cmbTipo = new JComboBox<>(TipoC);
		cmbTipo.setBounds(46, 56, 205, 22);
		contentPane.add(cmbTipo);
		
		
		JLabel lblNewLabel = new JLabel("Convertir");
		lblNewLabel.setBounds(56, 119, 70, 14);
		contentPane.add(lblNewLabel);
		
	
		JComboBox<String> cmb1 = new JComboBox<>();
		cmb1.setBounds(57, 144, 172, 22);
		contentPane.add(cmb1);
		cmb1.setEnabled(false);
		
		JLabel lblA = new JLabel("A:");
		lblA.setBounds(299, 119, 49, 14);
		contentPane.add(lblA);
		
		JComboBox<String> cmb2 = new JComboBox<String>();
		cmb2.setBounds(299, 144, 168, 22);
		contentPane.add(cmb2);
		cmb2.setEnabled(false);
		
		
		JLabel lbl1 = new JLabel();
		lbl1.setBounds(46, 107, 358, 14);
		contentPane.add(lbl1);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(218, 219, 63, 23);
		contentPane.add(btnOk);
		
	

	//EVENTOS	
		
		cmbTipo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cmbTipo.getSelectedItem() == "Moneda") {
					String Convierte = "Monedas";
					lbl1.setText("Seleccione la moneda que desea convertir");  
					llenarcmb(Convierte);
					Habilita();
					
				}else if (cmbTipo.getSelectedItem() == "Temperatura") {
					String Convierte = "Temperaturas";
					lbl1.setText("Seleccione la temperatura que desea convertir");  
					llenarcmb(Convierte);
					Habilita();
				
			}else if (cmbTipo.getSelectedItem() == "Masa") {
				String Convierte = "Masas";
				lbl1.setText("Seleccione la masa que desea convertir");  
				llenarcmb(Convierte);
				Habilita();
			}else if (cmbTipo.getSelectedItem() == "Longitud") {
				String Convierte = "Longitudes";
				lbl1.setText("Seleccione la longitud que desea convertir");  
				llenarcmb(Convierte);
				Habilita();
			}
				else {
					//String Convierte = " ";
					lbl1.setText(" ");
					Limpiar();
					Deshabilita();
					
				}
		}
			
			
			//FUNCIONES			
			private void Limpiar() {
				cmb1.removeAllItems();
				cmb2.removeAllItems();
			
			}
		
			
			private void Habilita() {
				
				cmb1.setEnabled(true);
				cmb2.setEnabled(true);
				btnOk.setEnabled(true);
			}
			private void Deshabilita() {
				
				cmb1.setEnabled(false);
				cmb2.setEnabled(false);
				btnOk.setEnabled(false);
			}
	
			
			

			public void llenarcmb(String Convierte) {
				if (Convierte == "Monedas") {
					Limpiar();
					
					 for(String x : Monedas)
					 {
						 cmb1.addItem(x);
						 cmb2.addItem(x);
					 }
					
				}else if(Convierte == "Temperaturas") {
					Limpiar();
					for(String x : Temperaturas)
					 {
						 cmb1.addItem(x);
						 cmb2.addItem(x);
					 }
				}else if(Convierte == "Masas") {
					Limpiar();
					for(String x : Masas)
					 {
						 cmb1.addItem(x);
						 cmb2.addItem(x);
					 }
				}else if(Convierte == "Longitudes") {
					Limpiar();
					for(String x : Longitudes)
					 {
						 cmb1.addItem(x);
						 cmb2.addItem(x);
					 }
				}
				else if (Convierte == "") {
					Limpiar();
				
				}
				
				
					
					
					
				}	
			
			   
			
		
			
		});
			
		
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Convierte=(String) cmbTipo.getSelectedItem();
					boolean  validaigual=false;
					if (Convierte == "Moneda") {
						if (cmb1.getSelectedItem() != cmb2.getSelectedItem() && (cmb1.getSelectedItem() != "Seleccione moneda...") &&(cmb2.getSelectedItem() != "Seleccione moneda...")) {
							
						 validaigual=false;
							IngreseDataConvertir();
							IngreseDataTipoCambio();
							//Realiza la conversion
							    ConversorTipo conversortipo = new ConversorTipo();
								double valorconversion= conversortipo.conviertemoneda(Convierte.toString(), ValoraConvertir.toString(), TipodeCambio.toString());
								JOptionPane.showMessageDialog(null,"El valor total en " + cmb2.getSelectedItem()+ " es: " + String.valueOf(valorconversion) );
								

								
								 
						//Realiza validacion de campos llenos	
						}else if ((cmb1.getSelectedItem() != cmb2.getSelectedItem()) && (cmb2.getSelectedItem() == "Seleccione moneda...")) {
							JOptionPane.showMessageDialog(null,"Debe seleccionar moneda de cambio");
							 validaigual=true;
						}else if ((cmb1.getSelectedItem()=="Seleccione moneda...") && (cmb2.getSelectedItem() == "Seleccione moneda...")) {
							JOptionPane.showMessageDialog(null,"Debe seleccionar monedas de cambio");
							 validaigual=true;
						
						}else {
							JOptionPane.showMessageDialog(null,"Debe seleccionar otra moneda de cambio");
							 validaigual=true;
							
						}
					
						
					
					
					}else if(Convierte != "Moneda") {
						
								if (cmb1.getSelectedItem() != cmb2.getSelectedItem() && (cmb1.getSelectedItem() != "Seleccione...") &&(cmb2.getSelectedItem() != "Seleccione...")) {	
									
									validaigual=false;
									IngreseDataConvertir();
									//Realiza la conversion
									ConversorTipo conversortipo = new ConversorTipo();
									double valorconversion= conversortipo.conviertegeneral(cmb1.getSelectedItem().toString(),cmb2.getSelectedItem().toString(), ValoraConvertir.toString());
									JOptionPane.showMessageDialog(null,"El valor total en " + cmb2.getSelectedItem()+ " es: " + String.valueOf(valorconversion) );
									
								
						//Realiza validacion de campos llenos	
						}else if ((cmb1.getSelectedItem() != cmb2.getSelectedItem()) && (cmb2.getSelectedItem() == "Seleccione...")) {
							JOptionPane.showMessageDialog(null,"Debe seleccionar la" + Convierte);
							 validaigual=true;
							
						}else if ((cmb1.getSelectedItem()=="Seleccione...") && (cmb2.getSelectedItem() == "Seleccione...")) {
							JOptionPane.showMessageDialog(null,"Debe seleccionar las cantidades de " + Convierte);
							 validaigual=true;
						}else {
							JOptionPane.showMessageDialog(null,"Debe seleccionar otra unidad de " + Convierte + " para convertirla" );
							 validaigual=true;
							
						}
								
				
					
					}else {
						JOptionPane.showMessageDialog(null,Convierte);
						

					}
					
					if (validaigual == false) {
						int response = JOptionPane.showConfirmDialog(null,"Desea continuar convirtiendo con Alura");

					    if (response == JOptionPane.YES_OPTION) {
					    	dispose();					    	
					    	setVisible(true);
					    	
					    
					    }
					    else if (response == JOptionPane.NO_OPTION) {
					    	JOptionPane.showMessageDialog(null,"Gracias por utilizar el conversor de Alura MCR, programa finalizado");
							dispose();
							
						}
						else if(response == JOptionPane.CLOSED_OPTION) {
							//IF CLOSE DIALOGBOX
							System.out.println("Close");
						}
					}
					   
					    
					    
					    
				}
				
			
				//FUNCIONES PARA INPUT DE DATOS VALIDACION		
				

					private void IngreseDataTipoCambio() {
					err=true;
				    do{
				        try{
				        	TipodeCambio = JOptionPane.showInputDialog("Ingrese el tipo de cambio");
				            input2 = Double.valueOf(TipodeCambio);
				            err=false;
				        }catch(NumberFormatException e2){
				            e2.printStackTrace();
				            JOptionPane.showMessageDialog(null, "Valor no válido ingrese el tipo de cambio", "alert", JOptionPane.ERROR_MESSAGE);
				        }
				    }while(err);
					
				}

				private void IngreseDataConvertir() {
					 err=true;
					 do{
					        try{
					        	ValoraConvertir = JOptionPane.showInputDialog("Ingrese valor a convertir");
					            input1 = Double.valueOf(ValoraConvertir);
					            err=false;
					        }catch(NumberFormatException e3){
					            e3.printStackTrace();
					            JOptionPane.showMessageDialog(null, "Valor no válido ingrese la cantidad a convertir", "alert", JOptionPane.ERROR_MESSAGE);
					        }
					    }while(err);
					
				}
				
		
				
			});

			
	

	}
	

	@Override
	public String toString() {
		return "Conversor_Alura [contentPane=" + contentPane + ", TipoC=" + Arrays.toString(TipoC) + ", Monedas="
				+ Arrays.toString(Monedas) + ", Temperaturas=" + Arrays.toString(Temperaturas) + ", Masas="
				+ Arrays.toString(Masas) + ", Longitudes=" + Arrays.toString(Longitudes) + ", monedacantidad="
				+ monedacantidad + ", TipoCambio=" + TipoCambio + ", convertirTipo=" + convertirTipo + ", Convierte="
				+ Convierte + ", Tipolbl=" + Tipolbl + "]";
	}
	
	
	

}


