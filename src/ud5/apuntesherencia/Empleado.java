package ud5.apuntesherencia;

public class Empleado extends Persona {

    double salario; 
    String estatura;
    //ojo si se sobreescriben datos 

    //constructor especifico
    //mientras, se puede declarar 
    Empleado() {};

    //CONSTRUCTOR
     /*para esto hay que cambiar la privacidad o 
            poner un setter y un getter */
        //setNombre(nombre);

    Empleado(String nombre, int edad, double salario) {
        //super tiene que ser el primero que se invoca 
        super(nombre,edad);
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, String estatura, double salario) {
        this.nombre = nombre; // asigna el parámetro al atributo
        this.edad = edad;
        this.estatura = estatura;
        this.salario = salario;
    }

    /*public void mostrarDatos() {

        System.out.println(salario + " euros mensuales.");
    }*/

//SOBRECARGAS 

        /* si el parametro es diferente, el override no funciona pq no esta sobrecargando ninguno
         * va por separado 
         * 
         * no puede tener otra salida ni otra visibilidad
         *           excepto protected y publid en algun momento
         */

    
    @Override 
    void mostrarDatos() {
        super.mostrarDatos();

        System.out.println("Sueldo: " + salario + " euros mensuales.");
    }

    public static void main(String[] args) {
        Empleado maria = new Empleado("María",34, 3000);
        Empleado pepe = new Empleado("Pepe", 25, "1.65",1500 );
        
        maria.cumplirAnhos();
        pepe.saludar();
        pepe.mostrarDatos();

    }
}
