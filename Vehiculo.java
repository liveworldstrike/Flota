
public class Vehiculo
{
    // instance variables - replace the example below with your own
    private Marca marca;
    private int antiguedad;
    private int kilometraje;
    private static int contNumeroIdentificativo = 0;
    private int numeroIdentificativo;

    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(Marca marca ,int antiguedad, int kilometraje)
    {
        this.antiguedad = antiguedad;
        this.kilometraje = kilometraje; 
        this.marca = marca;
        numeroIdentificativo = contNumeroIdentificativo;
        contNumeroIdentificativo++;
    }

    /**
     * devuelve el id
     * 
     */
    public int getNumIdent()
    {
        return numeroIdentificativo;
    }
    
     /**
     * devuelve el id
     * 
     */
    public Marca getMarca()
    {
        return marca;
    }
    
}
