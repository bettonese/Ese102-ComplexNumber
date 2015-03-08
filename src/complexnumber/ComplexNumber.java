package complexnumber;

public class ComplexNumber {
    private double re;
    private double im;

    
    public void setRectangular(double re, double im) { 
        this.re = re;
        this.im = im;
    }

    
    public String formatComplexNumber() { 
        return this.getRe() + "+(" + this.getIm() + ")i";
    }
    
    public void setPolar(double modulus, double argument){
        this.im = Math.sin(argument*Math.PI/180)*modulus;
        this.re = Math.cos(argument*Math.PI/180)*modulus;
    }

    public double getRe() { 
        return re;
    }


    public double getIm() { 
        return im;
    }

    public double getModulus(){ 
        return Math.sqrt((this.re*this.re)+(this.im*this.im));
    }
    public double getArgument(){ 
        return ((Math.atan(this.im/this.re)*180)/Math.PI);
    }
    public ComplexNumber add(ComplexNumber addendo){
        ComplexNumber somma = new ComplexNumber();
        double re = this.re + addendo.getRe();
        double im = this.im + addendo.getIm();
        somma.setRectangular(re, im);
        return somma;
    }
    public ComplexNumber sub(ComplexNumber sottraendo){
        ComplexNumber sottrazione = new ComplexNumber();
        double re = this.re - sottraendo.getRe();
        double im = this.im - sottraendo.getIm();
        sottrazione.setRectangular(re, im);
        return sottrazione;
    }
    public ComplexNumber multiply(ComplexNumber multipl){
        ComplexNumber moltiplicazione = new ComplexNumber();
        return moltiplicazione;     
    }
    public ComplexNumber divide(ComplexNumber div){
        ComplexNumber divisione = new ComplexNumber();
        return divisione;     
    }
    
}

