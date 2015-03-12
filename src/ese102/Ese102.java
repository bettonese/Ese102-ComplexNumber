package ese102;

import java.io.*;
import complexnumber.*;
public class Ese102 {

    public static void main(String[] args) throws IOException { 
        // TODO code application logic here
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        String line;
         
        ComplexNumber sr=new ComplexNumber();
        ComplexNumber sp=new ComplexNumber();
        ComplexNumber r = new ComplexNumber();
        double re=0;
        double im=0;
        double modulus=0;
        double argument=0;
        int sw = 0;
        
        boolean valoreValido=false;
        while(sw!=1 && sw!=2){
            System.out.println("Inserire 1 per coordinate rettangolari, Inserire 2 per coordinate polari");
            line = tastiera.readLine();
            try{
                sw=Integer.valueOf(line).intValue();
            }
            catch(NumberFormatException e){
                System.out.println("Numero non valido");
            }
        }
        
        if(sw==1){
            valoreValido=false;
        while(!valoreValido){
    		System.out.println("Inserire parte reale: ");
    		line = tastiera.readLine();
    		try{
    			re = Double.valueOf(line).doubleValue();
    			valoreValido = true;
    		}
    		catch(NumberFormatException e){
    			System.out.println("Inserisci numero valido");
    		}
    	}
    	valoreValido = false;
        while(!valoreValido){
    		System.out.println("Inserire parte immaginaria: ");
    		line = tastiera.readLine();
    		try{
    			im = Double.valueOf(line).doubleValue();
    			valoreValido = true;
    		}
    		catch(NumberFormatException e){
    			System.out.println("Inserisci numero valido");
    		}
    	}
        valoreValido=false;
        sr.setRectangular(re,im);
        System.out.println("\nil modulo è "+sr.getModulus());
        System.out.println("\nl'argomento è "+sr.getArgument());
    }
        else if(sw==2){
            valoreValido=false;
        while(!valoreValido){
    		System.out.println("Inserire modulo: ");
    		line = tastiera.readLine();
    		try{
    			modulus = Double.valueOf(line).doubleValue();
    			valoreValido = true;
    		}
    		catch(NumberFormatException e){
    			System.out.println("Inserisci numero valido");
    		}
    	}
    	valoreValido = false;
        while(!valoreValido){
    		System.out.println("Inserire argomento: ");
    		line = tastiera.readLine();
    		try{
    			argument = Double.valueOf(line).doubleValue();
    			valoreValido = true;
    		}
    		catch(NumberFormatException e){
    			System.out.println("Inserisci numero valido");
    		}
    	}
        valoreValido=false;
        sr.setPolar(modulus,argument);
        System.out.println("\n Re: "+sr.getRe());
        System.out.println("\n Im: "+sr.getIm());
    }
        valoreValido=false;
        while(!valoreValido){
            System.out.println("Scegliere il numero dell'operazione: [3] Addizione [4] Sottrazione [5] Divisione [6] Moltiplicazione");
            line=tastiera.readLine();
            try{
                    sw=Integer.valueOf(line).intValue();
                    valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
        }
        if(sw==3){
            valoreValido=false;
            
                while(!valoreValido){
                    System.out.println("Inserisci la parte reale da sommare a quella inserita all'inizio");
                    line=tastiera.readLine();
                    try{
                    re=Double.valueOf(line).doubleValue();
                    valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
            }
            valoreValido=false;
            while(!valoreValido){
                System.out.println("Inserisci la parte immaginaria da sommare a quella inserita all'inizio");
                line=tastiera.readLine();
                try{
                    im=Double.valueOf(line).doubleValue();
                    valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
            }
            sp.setRectangular(re, im);
            r=sr.add(sp);
            System.out.println(sr.toString()+" + "+sp.toString()+" = "+r.toString());
            }
        else if(sw==4){
            valoreValido=false;
            while(!valoreValido){
                System.out.println("Inserisci parte reale da sottrarre a quella iniziale");
                line=tastiera.readLine();
                try{
                    re=Double.valueOf(line).doubleValue();
                    valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
            }
            valoreValido=false;
            while(!valoreValido){
                System.out.println("Inserisci parte immaginaria da sottrarre a quella iniziale");
                line=tastiera.readLine();
                try{
                    im=Double.valueOf(line).doubleValue();
                            valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
            }
            sp.setRectangular(re, im);
            r=sr.sub(sp);
            System.out.println(sr.toString()+"-"+sp.toString()+"="+r.toString());
        }
        else if(sw==5){
            valoreValido=false;
            while(!valoreValido){
                System.out.println("Inserisci il modulo");
                line=tastiera.readLine();
                try{
                    modulus=Double.valueOf(line).doubleValue();
                    valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
            }
            valoreValido=false;
            while(!valoreValido){
                System.out.println("Inserisci l'argomento");
                line=tastiera.readLine();
                try{
                    argument=Double.valueOf(line).doubleValue();
                    valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
            }
            sp.setPolar(modulus,argument);
            r=sr.divide(sp);
            System.out.println(sr.toString()+" / "+sp.toString()+" = "+r.toString());
        }
        else if(sw==6){
            valoreValido=false;
            while(!valoreValido){
                System.out.println("Inserisci il modulo");
                line=tastiera.readLine();
                try{
                    modulus=Double.valueOf(line).doubleValue();
                    valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
            }
            valoreValido=false;
            while(!valoreValido){
                System.out.println("Inserisci l'argomento");
                line=tastiera.readLine();
                try{
                    argument=Double.valueOf(line).doubleValue();
                    valoreValido=true;
                }
                catch(NumberFormatException e){
                    System.out.println("Valore non corretto");
                }
            }
            sp.setPolar(modulus,argument);
            r=sr.multiply(sp);
            System.out.println(sr.toString()+" * "+sp.toString()+" = "+r.toString());
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		}
    
	}

    