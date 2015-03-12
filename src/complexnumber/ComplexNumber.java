package complexnumber;

public class ComplexNumber {
    private double re;
    private double im;
    static private double initRe;
    static private double initIm;
    


    static public void setInitRectangular(double re, double im){
        initRe=re;
        initIm=im;
    }
    
    static public void setInitPolar(double modulus, double argument) {
        if(modulus < 0)
        {
            throw new IllegalArgumentException("Il modulo deve essere maggiore o uguale a 0");
        }
        initRe = modulus * Math.cos(argument);
        initIm = modulus * Math.sin(argument);
    }
    
    static public ComplexNumber add(ComplexNumber operand1, ComplexNumber operand2) {
        ComplexNumber somma = new ComplexNumber();
        somma.setRectangular(operand1.getRe()+operand2.getRe(), operand1.getIm() + operand2.getIm());
        return somma;
    }
    
    static public ComplexNumber sub(ComplexNumber operand1, ComplexNumber operand2) {
        ComplexNumber diff = new ComplexNumber();
        diff.setRectangular(operand1.getRe() - operand2.getRe(), operand1.getIm() - operand2.getIm());
        return diff;
    }
    
    static public ComplexNumber multiply(ComplexNumber operand1, ComplexNumber operand2) {
        ComplexNumber mult = new ComplexNumber();
        mult.setPolar(operand1.getModulus() * operand2.getModulus(), operand1.getArgument() + operand2.getArgument());
        return mult;
    }
    
    static public ComplexNumber divide(ComplexNumber operand1, ComplexNumber operand2) {
        ComplexNumber divisione = new ComplexNumber();
        divisione.setPolar(operand1.getModulus() / operand2.getModulus(), operand1.getArgument() - operand2.getArgument());
        return divisione;
    }
    
    public void setRectangular(double re, double im) { 
        this.re = re;
        this.im = im;
    }

    
    /*public String formatComplexNumber() { 
        return this.getRe() + "+(" + this.getIm() + ")i";
    } */
    
      /**
    @param modulus
    @param argument
    * 
            
    */
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
        double modulo = this.getModulus()* multipl.getModulus();
        double argomento = this.getArgument()+ multipl.getArgument();
        moltiplicazione.setPolar(modulo, argomento);
        return moltiplicazione;     
    }
    public ComplexNumber divide(ComplexNumber div){
        ComplexNumber divisione = new ComplexNumber();
        double modulo=this.getModulus()/ div.getModulus();
        double argomento=this.getArgument()- div.getArgument();
        divisione.setPolar(modulo, argomento);
        return divisione;     
    }
    
    @Override
    public String toString(){
        return this.getRe() + "+(" + this.getIm() + ")i";
    }
}

