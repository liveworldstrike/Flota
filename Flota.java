
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    // Arraylist que guarda los vehiculos
    private Vehiculo[] vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        vehiculos = new Vehiculo[0];
    }

    /**
     * metodo para añadir un vehiculo a la flota 
     */
    public void addVehiculo(Vehiculo vehiculo){
        Vehiculo [] num;
        num = vehiculos;
        vehiculos = new Vehiculo [num.length +1];
        for (int cont = 0; cont < num.length; cont++)
        {
            vehiculos[cont] = num[cont];
        }
        vehiculos[num.length] = vehiculo;
    }

    /**
     * metodo para eliminar un vehiculo de  la flota 
     */
    public void removeVehiculo(int id )

    {
        boolean vehiculoEncontrado = false;
        for (int cont = 0; cont < vehiculos.length; cont++){
            if (vehiculos[cont].getNumIdent() == id){
                vehiculos[cont] = null;
                vehiculoEncontrado = true;
            }
        }
        Vehiculo[] vehiTempo = vehiculos;
        vehiculos = new Vehiculo[vehiTempo.length - 1];
        int contador1 = 0;
        if (vehiculoEncontrado){
            for (int cont = 0; cont < vehiTempo.length; cont++)
            {
                if (vehiTempo[cont] != null){
                    vehiculos[contador1] = vehiTempo[cont];
                    contador1++;
                }
            }
        }
    }

    /**
     * marca mayoritaria 
     */
    public Enum marcaMayoritaria()
    {
        int ford = 0;
        int opel = 0;
        int citroen = 0;
        int fiat = 0;
        Enum result = null;
        for (Vehiculo vehiculoMarca: vehiculos){
            Marca marca = vehiculoMarca.getMarca();
            switch (marca){ 
                case FORD:
                ford++;
                break;

                case OPEL:
                opel++;
                break;

                case CITROEN:
                citroen++;
                break;

                case FIAT:
                fiat++;
                break;
            }
        }
        if(ford>opel && ford>citroen && ford>fiat)
            result = Marca.FORD;
        else if(opel>ford && opel>citroen && opel>fiat)
            result = Marca.OPEL;
        else if(citroen>ford && citroen>opel && citroen>fiat)
            result = Marca.CITROEN;
        else if(fiat>ford && fiat>opel && fiat>citroen)
            result = Marca.FIAT;

        return result;
    }
    
    
}
