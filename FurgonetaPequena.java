
/**
 * Write a description of class FurgonetaPequeña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends VehiculoPeque
{
    /**
     * Constructor for objects of class FurgonetaPequeña
     */
    public FurgonetaPequena(Marca marca,int antiguedad,int kilometraje,int plazas)
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
