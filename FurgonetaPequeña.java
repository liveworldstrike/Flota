
/**
 * Write a description of class FurgonetaPequeña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequeña extends VehiculoPeque
{
    /**
     * Constructor for objects of class FurgonetaPequeña
     */
    public FurgonetaPequeña(Marca marca,int antiguedad,int kilometraje,int plazas)
    {
        super(marca,antiguedad,kilometraje,plazas);
       
    }

    /**
     * devuelve el numero de plazas
     */
    public int getPlazas()
    {
       return super.getPlazas();
    }
}
