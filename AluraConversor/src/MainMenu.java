import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainMenu extends JFrame {
	

	public MainMenu() {		
		String[] options = {"Conversor de Moneda", "Conversor de Temperature"};
		String[] currency = {
				"Peso Mexicano a USD", "USD a Peso Mexicano",
				"Peso Mexicano a Euro", "Euro a Peso Mexicano",
				"Peso Mexicano a Libra Esterlina", "Libra Esterlina a Peso Mexicano",
				"Peso Mexicano a Yen Japones", "Yen Japones a Peso Mexicano",
				"Peso Mexicano a Won Sul-Coreano", "Won Sul-Coreano a Peso Mexicano"
				};
		
        ImageIcon icon = new ImageIcon("src/images/turtle32.png");
        String ConverterMenu = (String)JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", 
                "Menu", JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        System.out.println(ConverterMenu);
        
        if(ConverterMenu.equals("Conversor de Moneda")) {
        	 String Cantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir: ", 0);
        	 try {
        		 Double value = Double.parseDouble(Cantidad); 
        		 System.out.println("success");
        		 if(value > 0) {
        			 System.out.println("Cantidad: " + value);
        			 String SeleccionMoneda = (String)JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", 
        					 "Monedas", JOptionPane.QUESTION_MESSAGE, icon, currency, currency[0]);
        			 System.out.println("Tipo de Cambio: " + SeleccionMoneda);
        			 switch(SeleccionMoneda) {
        			 case "Peso Mexicano a USD":
        				 value = value * 0.058324918;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " USD");
        				 msgAction();
        				 break;
        			 case "USD a Peso Mexicano":
        				 value = value * 17.145331;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Pesos");
        				 msgAction();
        				 break;
        			 case "Peso Mexicano a Euro":
        				 value = value * 0.053154719;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Euros");
        				 msgAction();
        				 break;
        			 case "Euro a Peso Mexicano":
        				 value = value * 18.813939;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Pesos");
        				 msgAction();
        				 break;
        			 case "Peso Mexicano a Libra Esterlina":
        				 value = value * 0.045433429;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Libras Esterlinas");
        				 msgAction();
        				 break;
        			 case "Libra Esterlina a Peso Mexicano":
        				 value = value * 22.012075;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Pesos");
        				 msgAction();
        				 break;
        			 case "Peso Mexicano a Yen Japones":
        				 value = value * 8.2862746;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Yen Japones");
        				 msgAction();
        				 break;
        			 case "Yen Japones a Peso Mexicano":
        				 value = value * 0.12067772;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Pesos");
        				 msgAction();
        				 break;
           			 case "Peso Mexicano a Won Sul-Coreano":
        				 value = value * 75.748182;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Won");
        				 msgAction();
        				 break;
           			 case "Won Sul-Coreano a Peso Mexicano":
        				 value = value * 0.013203072;
        				 JOptionPane.showMessageDialog(null, "Usted tiene: $" + finalRes(value) + " Pesos");
        				 msgAction();
        				 break;
        			 }
        		 }
        	 } catch (NumberFormatException ex) {
        		System.out.println("Not a number");
        		JOptionPane.showMessageDialog(null, "Solo numeros son aceptados!");
             	JOptionPane.showMessageDialog(null, "Programa Finalizado!");
            	System.exit(0);
        	 }
        } else {
        	Temperatura temp = new Temperatura(null);
        }
		
	}
	
	public void msgAction() {
		int input = JOptionPane.showConfirmDialog(null, "Desea continuar?");
        if(input == 0) {
        	System.out.println("Back to Menu");
        	MainMenu app = new MainMenu();
        } else if(input == 1) {
        	System.out.println("We Exit App");
        	JOptionPane.showMessageDialog(null, "Programa Finalizado!");
        	System.exit(0);
        } else {
        	System.out.println("We close the current window?");
        	JOptionPane.showMessageDialog(null, "OKI DOKI");
        	this.dispose();
        }
	}
	
	public String finalRes(Double valor) {
		String x = valor.toString();
		int dot = x.indexOf(".");
		String result = x.substring(0, dot + 3);
		return result;
	}

}
