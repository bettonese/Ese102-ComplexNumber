package complexnumber;

/**
 * @author Luca Giovannetti
*/

public class ComplexNumber {
    private double re;
    private double im;
    static private double initRe;
    static private double initIm;
    
     /**
     * @param re
     * @param im
     * Inizializza i campi di classe initRe e initIm
     */

    
    static public void setInitRectangular(double re, double im){
        initRe=re;
        initIm=im;
    }
    
     /**
     * @param modulus
     * @param argument
     * Inizializza i campi di classe initRe e initIm, il modulo non può essere minore di 0
     */
    
    static public void setInitPolar(double modulus, double argument) {
        if(modulus < 0)
        {
            throw new IllegalArgumentException("Il modulo deve essere maggiore o uguale a 0");
        }
        initRe = modulus * Math.cos(argument);
        initIm = modulus * Math.sin(argument);
    }
    
    /**
     * somma i due oggetti
     * usato con coordinate rettangolari
     * @param operand1
     * @param operand2
     * @return 
     */
    
    static public ComplexNumber add(ComplexNumber operand1, ComplexNumber operand2) {
        ComplexNumber somma = new ComplexNumber();
        somma.setRectangular(operand1.getRe()+operand2.getRe(), operand1.getIm() + operand2.getIm());
        return somma;
    }
    
    /**
     * sottrae il secondo oggetto al primo
     * usato con coordinate rettangolari
     * @param operand1
     * @param operand2
     * @return 
     */
    
    static public ComplexNumber sub(ComplexNumber operand1, ComplexNumber operand2) {
        ComplexNumber diff = new ComplexNumber();
        diff.setRectangular(operand1.getRe() - operand2.getRe(), operand1.getIm() - operand2.getIm());
        return diff;
    }
    
    /**
     * moltiplica i due oggetti
     * usato con coordinate polari
     * @param operand1
     * @param operand2
     * @return 
     */
    
    static public ComplexNumber multiply(ComplexNumber operand1, ComplexNumber operand2) {
        ComplexNumber mult = new ComplexNumber();
        mult.setPolar(operand1.getModulus() * operand2.getModulus(), operand1.getArgument() + operand2.getArgument());
        return mult;
    }
    
    /**
     * divide i due oggetti
     * usato con coordinate polari
     * @param operand1
     * @param operand2
     * @return 
     */
    
    static public ComplexNumber divide(ComplexNumber operand1, ComplexNumber operand2) {
        ComplexNumber divisione = new ComplexNumber();
        divisione.setPolar(operand1.getModulus() / operand2.getModulus(), operand1.getArgument() - operand2.getArgument());
        return divisione;
    }
    
    /**
     * Inizializza re e im (coordinate x e y)
     * @param re
     * @param im 
     */
    
    public void setRectangular(double re, double im) { 
        this.re = re;
        this.im = im;
    }

    
    /*public String formatComplexNumber() { 
        return this.getRe() + "+(" + this.getIm() + ")i";
    } */
    
    /**
     * Inizializza modulo e argomento
     * @param modulus
     * @param argument 
     */ 
    
    public void setPolar(double modulus, double argument){
        this.im = Math.sin(argument*Math.PI/180)*modulus;
        this.re = Math.cos(argument*Math.PI/180)*modulus;
    }
    
    /**
     * 
     * @return valore della parte reale del numero complesso
     */

    public double getRe() { 
        return re;
    }
    
    /**
     * 
     * @return valore della parte immaginaria del numero complesso
     */

    public double getIm() { 
        return im;
    }
    
    /**
     * 
     * @return valore del modulo del numero complesso
     */

    public double getModulus(){ 
        return Math.sqrt((this.re*this.re)+(this.im*this.im));
    }
    
    /**
     * 
     * @return valore del modulo del numero complesso
     */
    
    public double getArgument(){ 
        return ((Math.atan(this.im/this.re)*180)/Math.PI);
    }
    
    /**
     * Usata per coordinate rettangolari
     * @param addendo
     * @return somma della parte reale e immaginaria dei due numeri complessi
     */
    
    public ComplexNumber add(ComplexNumber addendo){
        ComplexNumber somma = new ComplexNumber();
        double re = this.re + addendo.getRe();
        double im = this.im + addendo.getIm();
        somma.setRectangular(re, im);
        return somma;
    }
    
    /**
     * Usata per coordinate rettangolari
     * @param sottraendo
     * @return differenza della parte reale e immaginaria dei due numeri complessi
     */
    
    public ComplexNumber sub(ComplexNumber sottraendo){
        ComplexNumber sottrazione = new ComplexNumber();
        double re = this.re - sottraendo.getRe();
        double im = this.im - sottraendo.getIm();
        sottrazione.setRectangular(re, im);
        return sottrazione;
    }
    
    /**
     * Usata per coordinate polari
     * @param multipl
     * @return un ComplexNumber contenente il risultato del prodotto dei due numeri complessi
     */
    
    public ComplexNumber multiply(ComplexNumber multipl){
        ComplexNumber moltiplicazione = new ComplexNumber();
        double modulo = this.getModulus()* multipl.getModulus();
        double argomento = this.getArgument()+ multipl.getArgument();
        moltiplicazione.setPolar(modulo, argomento);
        return moltiplicazione;     
    }
    
    /**
     * Usata per coordinate rettangolari
     * @param div
     * @return un ComplexNumber contenente il risultato della divisione dei due numeri complessi
     */
   
    public ComplexNumber divide(ComplexNumber div){
        ComplexNumber divisione = new ComplexNumber();
        double modulo=this.getModulus()/ div.getModulus();
        double argomento=this.getArgument()- div.getArgument();
        divisione.setPolar(modulo, argomento);
        return divisione;     
    }
    /**
     * 
     * @return formattazione della stringa di rappresentazione del numero complesso
     */
    @Override
    public String toString(){
        return this.getRe() + "+(" + this.getIm() + ")i";
    }
    
    /**
     * Verifica se due oggetti sono uguali confrontando la loro parte immaginaria e reale, se uguali ritorna true
     * @param ob
     * @return 
     */
    @Override
    public boolean equals(Object ob){
        boolean e = false;
        if(ob instanceof ComplexNumber){
            ComplexNumber i = (ComplexNumber)ob;
            if(this.re == i.getRe() && this.im == i.getIm()){
                e = true;
            }
        }
        return e;
    }
    
}

