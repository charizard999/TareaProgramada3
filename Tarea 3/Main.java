
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
     
    /**
     * Constructor for objects of class Main
     */
    public static void main(String args[])
    {
        Controlador controlador  = new Controlador();
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        controlador.setVentanaPrincipal(ventanaPrincipal);
        ventanaPrincipal.setControlador(controlador);
        ventanaPrincipal.setVisible(true);
    }
}
