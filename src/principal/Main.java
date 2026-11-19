/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import Controlador.ControladorGremio;
import javax.swing.SwingUtilities;
import Modelo.RegistroGremio;
import Vista.VistaGremio;

/**
 *
 * @author Manue
 */
public class Main 
{

    public static void main(String[] args) 
    {
    SwingUtilities.invokeLater
    (() -> 
        {
            VistaGremio vista = new VistaGremio();
            ControladorGremio controlador = new ControladorGremio(vista, new RegistroGremio());
            controlador.iniciar();
        }
    );
}
}
