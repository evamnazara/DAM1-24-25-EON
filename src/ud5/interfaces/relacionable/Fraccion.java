package ud5.interfaces.relacionable;

public class Fraccion implements Relacionable {
    private int num;
    private int den;
    
    //Constructores
    public Fraccion() {
        this.num = 0;
        this.den = 1;
    }
    public Fraccion(int num, int den) {                                                                     
        this.num = num;
        this.den = den;
        simplificar();
    }
    public Fraccion(int num) {
        this.num = num;
        this.den = 1;
    }
    //Setters y Getters
    public void setDen(int den) {
        this.den = den;
        this.simplificar();
    }
    public void setNum(int num) {
        this.num = num;
        this.simplificar();
    }
    public int getDen() {
        return den;
    }
    public int getNum() {
        return num;
    }
 
    //sumar fracciones
    public Fraccion sumar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den + den * f.num;
        aux.den = den * f.den;
        aux.simplificar();  
        return aux;
    }
    //restar fracciones
    public Fraccion restar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den - den * f.num;
        aux.den = den * f.den;
        aux.simplificar();  
        return aux;
    }
    //multiplicar fracciones
    public Fraccion multiplicar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.num;
        aux.den = den * f.den;
        aux.simplificar();  
        return aux;
    }
    //dividir fracciones
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.num = num * f.den;
        aux.den = den * f.num;
        aux.simplificar();  
        return aux;
    }
    //Método para simplificar una fracción
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción 
        num = num / n;
        den = den / n;
    }
    //Cálculo del máximo común divisor por el algoritmo de Euclides
    //Lo utiliza el método simplificar()
    private int mcd() {
        int u = Math.abs(num); //valor absoluto del numerador
        int v = Math.abs(den); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }
    
    //Sobreescritura del método toString heredado de Object
    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }
    //Implementación del método abstracto esMayorQue de la interface
    @Override
    public boolean esMayorQue(Relacionable a) { 
        if (a == null) {
            return false;
        }
        if (!(a instanceof Fraccion)) {
            return false;
        }
        Fraccion f = (Fraccion) a;
        this.simplificar();
        f.simplificar();
        if ((num / (double) den) <= (f.num / (double) f.den)) {
            return false;
        }
        return true;
    }
    //Implementación del método abstracto esMenorQue de la interface
    @Override
    public boolean esMenorQue(Relacionable a) {                                                             
        if (a == null) {
            return false;
        }
        if (!(a instanceof Fraccion)) {
            return false;
        }
        Fraccion f = (Fraccion) a;
        this.simplificar();
        f.simplificar();
        if ((num / (double) den) >= (f.num / (double) f.den)) {
            return false;
        }
        return true;
    }
    //Implementación del método abstracto esIgualQue de la interface      
    @Override
    public boolean esIgualQue(Relacionable a) {                                                             
        if (a == null) {
            return false;
        }
        if (!(a instanceof Fraccion)) {
            return false;
        }
        Fraccion f = (Fraccion) a;
        this.simplificar();
        f.simplificar();
        if (num != f.num) {
            return false;
        }
        if (den != f.den) {
            return false;
        }
        return true;
    }
}

