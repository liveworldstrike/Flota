
/**
 * Abstract class VehiculoPeque - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class VehiculoPeque extends Vehiculo
{
    //numero de plazas
    private int plazas;

    /**
     * Constructor 
     */
    public VehiculoPeque(Marca marca,int antiguedad,int kilometraje,int plazas)
    {
        super(marca ,antiguedad,kilometraje);
        this.plazas = plazas;

    }

    public int getPlazas(){
        return plazas;
    }
}
