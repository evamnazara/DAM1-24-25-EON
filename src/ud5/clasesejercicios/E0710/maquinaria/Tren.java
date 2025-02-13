package ud5.clasesejercicios.E0710.maquinaria;

import ud5.clasesejercicios.E0710.personal.Maquinista;

public class Tren {

    static final byte MAX_VAGONES = 5; 

    Locomotora locomotora;
    Vagon[] vagones;
    Maquinista maquinista;


    public Tren(Locomotora locomotora, Vagon[] vagones, Maquinista maquinista) {
       this(locomotora, maquinista, 0);
    }

    public Tren(Locomotora locomotora, Maquinista maquinista, int numVagones) {
        if (numVagones > MAX_VAGONES) {
            throw new ArrayIndexOutOfBoundsException("Demasiados vagones. El máximo es " + MAX_VAGONES);
        }
        
        this.locomotora = locomotora;
        this.maquinista = maquinista;

        //this.vagones = vagones;
        //al ser un array se inicializa en 0, pasando el numero de vagones 
        vagones = new Vagon[numVagones];
        for(int i; i < numVagones; i++) {
            vagones[i] = new Vagon (i);
        }
    }

}
