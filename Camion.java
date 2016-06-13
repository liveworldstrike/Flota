
/**
 * Write a description of class Camiones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoGrande
{
    /**
     * Constructor for objects of class Camiones
     */
    public Camion(Marca marca,int antiguedad,int kilometraje,int peso)
    {
       super(marca,antiguedad,kilometraje,peso);
    }

    /**
     * 
     */
    public int getPeso()
    {
       return super.getPeso();
    }
}
