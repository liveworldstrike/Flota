
/**
 * Abstract class VehiciloGrande - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class VehiculoGrande extends Vehiculo
{
    //numero de plazas
    private int peso;

    /**
     * Constructor 
     */
    public VehiculoGrande(Marca marca,int antiguedad,int kilometraje,int peso)
    {
        super(marca ,antiguedad,kilometraje);
        this.peso = peso;

    }

    public int getPeso(){
        return peso;
    }
}

