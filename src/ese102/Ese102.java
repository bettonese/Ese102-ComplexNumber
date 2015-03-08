package ese102;

import java.io.*;
import complexnumber.*;
public class Ese102 {

    public static void main(String[] args) throws IOException { 
        // TODO code application logic here
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String line;
        double n1=0;
        double n2=0;
        
        ComplexNumber sr=new ComplexNumber();
        ComplexNumber sp=new ComplexNumber();
        
        boolean valoreValido=false;
        while(!valoreValido){
    		System.out.println("Coordinata X: ");
    		line = tastiera.readLine();
    		try{
    			n1 = Double.valueOf(line).doubleValue();
    			valoreValido = true;
    		}
    		catch(NumberFormatException e){
    			System.out.println("Inserisci numero valido");
    		}
    	}
    	valoreValido = false;
        while(!valoreValido){
    		System.out.println("Coordinata Y: ");
    		line = tastiera.readLine();
    		try{
    			n2 = Double.valueOf(line).doubleValue();
    			valoreValido = true;
    		}
    		catch(NumberFormatException e){
    			System.out.println("Inserisci numero valido");
    		}
    	}
        valoreValido=false;
        sr.setRectangular(n1,n2);
        System.out.println("\nil modulo è "+sr.getModulus());
        System.out.println("\nl'argomento è "+sr.getArgument());
        while(!valoreValido){
    		System.out.println("Modulo: ");
    		line = tastiera.readLine();
    		try{
    			n1 = Double.valueOf(line).doubleValue();
    			valoreValido = true;
    		}
    		catch(NumberFormatException e){
    			System.out.println("Inserisci numero valido");
    		}
    	}
    	valoreValido = false;
        while(!valoreValido){
    		System.out.println("Argomento: ");
    		line = tastiera.readLine();
    		try{
    			n2 = Double.valueOf(line).doubleValue();
    			valoreValido = true;
    		}
    		catch(NumberFormatException e){
    			System.out.println("Inserisci numero valido");
    		}
    	}
        sp.setPolar(n1,n2);
        System.out.println("\n Re: "+sp.getRe());
        System.out.println("\n Im: "+sp.getIm());
		}
	}
    