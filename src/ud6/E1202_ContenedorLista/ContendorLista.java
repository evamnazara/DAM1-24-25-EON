package ud6.E1202_ContenedorLista;

import java.util.Arrays;

public class ContendorLista<T> {
    public T[] objetos;

    public ContendorLista(T[] t) {
        objetos = t;
    }


    public void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos,objetos.length +1);
        System.arraycopy(objetos, 0, objetos, 1, objetos.length);
        objetos[0] = nuevo;
    }
    public void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos,objetos.length +1);
        objetos[objetos.length - 1] = nuevo;
    }
    public T extraerDelPrincipio() {
        return null;
    }
    public T extraerDelFinal() {
        return null;
    }
    public void ordenar() {}


    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }

    public static void main(String[] args) {
        ContendorLista<Integer> lista = new ContendorLista<>(new Integer[0]);
        lista.insertarAlFinal(1);
        System.out.println(lista);
    }
}
