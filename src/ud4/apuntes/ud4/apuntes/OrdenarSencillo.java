package ud4.apuntes;

import java.util.Arrays;
//import java.util.Collections;

import ud4.utiles.ArraysUtil;


public class OrdenarSencillo {
    public static void main(String[] args) {
        Integer [] t = ArraysUtil.arrayAleatorio(24, 1, 25);
        System.out.println(Arrays.toString(t)); // impresion del string a pelo 
                    //(array, primer indice a ordenar, ultimo indice a ordenar)
        Arrays.sort(t,0,24);
        System.out.println(Arrays.toString(t));

        //Arrays.sort(t, Collections.reverseOrder(0,24)); 
        //Hay que cambiar el tipo de dato a una envolvente objeto

    }
     
}
