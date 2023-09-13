package alura.conversor.vista;

import javax.swing.JOptionPane;

public class ConversorTipo extends Conversor_Alura {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	

		
	
	public String Convierte;
	public String TipoCambio;
	public double resconvertido = 0;
	
	
	public double conviertemoneda(String Convierte,String valoraConvertir, String TipoCambio) {
		 	
		try {
			resconvertido= Double.valueOf(valoraConvertir) * Double.valueOf(TipoCambio);
			return resconvertido;
			
			 } catch(ArithmeticException | NullPointerException ex) {
		         String msg = ex.getMessage(); 
		         System.out.println("Exception " + msg);
		         ex.printStackTrace();
		     	return resconvertido;
		     }
		
	}
	
	
	public double conviertegeneral(String valorPrincipal,String valorCambio ,String valoraConvertir) {
		try {
			//CONVIERTE TEMPERATURA
			if (valorPrincipal == "Celsius-°C")
			{
				if (valorCambio == "Fahrenheit-°F")
				{
					resconvertido = ( Double.valueOf(valoraConvertir) * 9/5) + 32;
				}
				if (valorCambio == "Kelvin-°F")
				{
					resconvertido = (Double.valueOf(valoraConvertir) + 273.15);
				}
			}
			
			if (valorPrincipal == "Fahrenheit-°F")
			{
				if (valorCambio == "Celsius-°C")
				{
					resconvertido = (Double.valueOf(valoraConvertir) - 32) * 5/9;

				}
				if (valorCambio == "Kelvin-°F")
				{
					resconvertido = (Double.valueOf(valoraConvertir) - 32) * 5/9 + 273.15;
				}
			}
			if (valorPrincipal == "Kelvin-°F")
			{
				if (valorCambio == "Fahrenheit-°F")
				{
					resconvertido = (Double.valueOf(valoraConvertir) - 273.15) * 9/5 + 32;
				}
				if (valorCambio == "Celsius-°C")
				{
					resconvertido = Double.valueOf(valoraConvertir) - 273.15;
				}
			
			}
			
			///CONVIERTE MASA
			if (valorPrincipal == "Kilogramo-Kg")
			{
				if (valorCambio == "Gramo-g")
				{
					resconvertido = ( Double.valueOf(valoraConvertir) * 1000) ;
				}
				if (valorCambio == "Miligramo-mg")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 1000000);
				}
				if (valorCambio == "Libras-lbs")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 2.205);
				}
			}
			
			if (valorPrincipal == "Gramo-g")
			{
				if (valorCambio == "Kilogramo-Kg")
				{
					resconvertido = (Double.valueOf(valoraConvertir) /1000) ;

				}
				if (valorCambio == "Miligramo-mg")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 1000) ;
				}
				if (valorCambio == "Libras-lbs")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 453.59237 ) ;
				}
			}
			if (valorPrincipal == "Miligramo-mg")
			{
				if (valorCambio == "Gramo-g")
				{
					resconvertido = (Double.valueOf(valoraConvertir) /1000) ;
				}
				if (valorCambio == "Kilogramo-Kg")
				{
					resconvertido = (Double.valueOf(valoraConvertir) /1000000);
				}
				if (valorCambio == "Libras-lbs")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 0.000002205 ) ;
				}
			
			}
		
			if (valorPrincipal == "Libras-lbs")
			{
				if (valorCambio == "Kilogramo-Kg")
				{
					resconvertido = (Double.valueOf(valoraConvertir) *	0.4536);
					System.out.println();
				}
				
				if (valorCambio == "Gramo-g")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 453592) ;
				}
				
				if (valorCambio == "Miligramo-mg")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 453.592 ) ;
				}
			}
			
			//CONVIERTE LONGITUD
			if (valorPrincipal == "Kilometro-km")
			{
				if (valorCambio == "Metro-m")
				{
					resconvertido =  (Double.valueOf(valoraConvertir) * 1000) ;
					
					
				}
				if (valorCambio == "Centimetro-cm")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 100000);
					
				}
				if (valorCambio == "Milimetro-mm")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 1000000) ;
					
				}
			}
			
			if (valorPrincipal == "Metro-m")
			{
				if (valorCambio == "Kilometro-km")
				{
					resconvertido = (Double.valueOf(valoraConvertir) /1000 ) ;
					

				}
				if (valorCambio == "Centimetro-cm")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 100 ) ;
					
				}
				if (valorCambio == "Milimetro-mm")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 1000)  ;
					
				}
			}
			if (valorPrincipal == "Centimetro-cm")
			{
				if (valorCambio == "Metro-m")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 0.01)  ;
					
				}
				if (valorCambio == "Kilometro-km")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 0.01 * 0.001);
					
				}
				if (valorCambio == "Milimetro-mm")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 10);
					
				
				}
			
			}
		
			if (valorPrincipal == "Milimetro-mm")
			{
				if (valorCambio == "Kilometro-km")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 0.000001);
					JOptionPane.showMessageDialog(null, resconvertido);
					System.out.println();
				}
				
				if (valorCambio == "Metro-m")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 0.001) ;
					JOptionPane.showMessageDialog(null, resconvertido);
				}
				
				if (valorCambio == "Centimetro-cm")
				{
					resconvertido = (Double.valueOf(valoraConvertir) * 0.1) ;
					JOptionPane.showMessageDialog(null, resconvertido);
				}
			
			}
			
			//
		
			return resconvertido;
			
			
			 } catch(ArithmeticException | NullPointerException ex) {
		         String msg = ex.getMessage(); 
		         System.out.println("Exception " + msg);
		         ex.printStackTrace();
		     	return resconvertido;
		     }
		
		
		
		
		
		
	}
	
	
	
			
			
			
		

	

}
