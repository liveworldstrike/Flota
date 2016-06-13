
public class Vehiculo
{
    //marca del vehiculo
    private Marca marca;
    //antiguedad del vehiculo
    private int antiguedad;
    //kilometraje del vehiculo
    private int kilometraje;
    //cont id del vehiculo
    private static int contNumeroIdentificativo = 0;
    //id vehiculo
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
     * devuelve la marca 
     * 
     */
    public Marca getMarca()
    {
        return marca;
    }
    
}
