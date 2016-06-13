
/**
 * Write a description of class Coches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Coche extends VehiculoPeque
{
    /**
     * Constructor for objects of class Coche
     */
    public Coche(Marca marca, int ant, int kilometraje, int plazas)
    {
        super(marca, ant, kilometraje, plazas);
    }
    
    /**
     * numero de plazas que tiene el coche
     */
    public int getNumeroPlazas()
    {
        return super.getPlazas();
    }
    
    /**
     * para saber si cumples las medidas el coche 
     */
    public boolean cumplenMedidasCoche()
    {
        boolean cumple = false;
        if (getPlazas() <= 5 && getPlazas() > 0)
            cumple = true;
        return cumple;
    }
}

