/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import Modelo.Aventurero;
import Modelo.Bardo;
import Modelo.Clerigo;
import Modelo.Explorador;
import Modelo.Guerrero;
import Modelo.Mago;
import Modelo.Monje;
import Modelo.Paladin;
import Modelo.Picaro;
import Modelo.RegistroGremio;
import Vista.VistaGremio;
/**
 *
 * @author Manue
 */
public class ControladorGremio
{

    public static final String[] CLASES =
    {
        "Guerrero", "Mago", "Clérigo", "Monje", "Paladín", "Explorador", "Pícaro", "Bardo"
    };

    private final List<Aventurero> gremio = new ArrayList<>();
    private final RegistroGremio registro;
    private VistaGremio vista;

    public ControladorGremio(VistaGremio vista, RegistroGremio registro)
    {
        
        this.vista = vista;
        this.registro = registro;
        enlazarEventos();
        actualizarEtiquetaAtributo();
        mostrarGremio();
        
    }

    /*
     * @param registro */
    public ControladorGremio(RegistroGremio registro)
    {
        this.registro = registro;
    }
    
    private void enlazarEventos()
    {
        vista.getCmbClase().addActionListener(e -> actualizarEtiquetaAtributo());
        vista.getBtnRegistrar().addActionListener(e -> accionRegistrar());
        vista.getBtnListar().addActionListener(e -> mostrarGremio());
        vista.getBtnSimular().addActionListener(e -> accionSimularCombate());
    }

    private void actualizarEtiquetaAtributo()
    {
        String clase = (String) vista.getCmbClase().getSelectedItem();
        vista.getLblAtributo().setText(etiquetaAtributo(clase) + ":");
    }

    private void accionRegistrar()
    {
        try
        {
            String clase = (String) vista.getCmbClase().getSelectedItem();
            int nivel = leerEntero(vista.getTxtNivel().getText(), "El nivel");
            int vida = leerEntero(vista.getTxtVida().getText(), "Los puntos de vida");
            Aventurero nuevo = crearAventurero(clase, vista.getTxtNombre().getText(),
                    nivel, vida, vista.getTxtAtributo().getText());
            registrarAventurero(nuevo);
            vista.limpiarFormulario();
            mostrarGremio();
            vista.mostrarMensaje("Aventurero registrado: " + nuevo.getNombre());
        } 
        catch (IllegalArgumentException ex)
        {
            vista.mostrarError(ex.getMessage());
        } 
        catch (IOException ex)
        {
            vista.mostrarError("No se pudo escribir en el archivo: " + ex.getMessage());
        }
    }

    private void accionSimularCombate()
    {
        if (gremio.isEmpty())
        {
            vista.mostrarError("No hay aventureros registrados para simular el combate.");
            return;
        }
        try
        {
            vista.setTextoGremio(String.join("\n\n", simularCombate()));
        }
        catch (IOException ex)
        {
            vista.mostrarError("No se pudo escribir en el archivo: " + ex.getMessage());
        }
    }

    private void mostrarGremio()
    {
        if (vista == null)
        {
            return;
        }
        vista.setTextoGremio(gremio.isEmpty()
            ? "El gremio aún no tiene aventureros."
            : String.join("\n", listarGremio()));
    }
    
    public void iniciar()
    {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    /** @param aventurero
     * @throws java.io.IOException */
    public void registrarAventurero(Aventurero aventurero) throws IOException 
    {
        gremio.add(aventurero);
        registro.registrarAventurero(aventurero);
    }

    /* @return  */
    public List<String> listarGremio()
    {
        List<String> lineas = new ArrayList<>();
        for (Aventurero a : gremio)
        {
            lineas.add(a.toString());
        }
        return lineas;
    }

    /**
     * @return 
     * @throws java.io.IOException
     */
    public List<String> simularCombate() throws IOException
    {
        List<String> mensajes = new ArrayList<>();
        for (Aventurero a : gremio)
        {
            mensajes.add(a.ejecutarCombate());
            registro.registrarCombate(a);
        }
        return mensajes;
    }

    public List<Aventurero> getGremio()
    {
        return gremio;
    }

    /**
     * @param clase
     * @param nombre
     * @param atributo valor del atributo especial en formato texto
     * @param vida
     * @param nivel
     * @return 
     * @throws
     */
    public Aventurero crearAventurero(String clase, String nombre, int nivel, int vida,String atributo)
    {
        switch (normalizar(clase))
        {
            case "guerrero" ->
            {
                return new Guerrero(nombre, nivel, vida, leerSiNo(atributo, "Armadura pesada"));
            }
            case "mago" -> 
            {
                return new Mago(nombre, nivel, vida, leerEntero(atributo, "Los espacios de conjuro"));
            }
            case "clerigo" -> 
            {
                return new Clerigo(nombre, nivel, vida, atributo);
            }
            case "monje" -> 
            {
                return new Monje(nombre, nivel, vida, leerEntero(atributo, "Los puntos de Ki"));
            }
            case "paladin" -> 
            {
                return new Paladin(nombre, nivel, vida, leerEntero(atributo, "Los puntos de fuerza"));
            }
            case "explorador" -> 
            {
                return new Explorador(nombre, nivel, vida, atributo);
            }
            case "picaro" -> 
            {
                return new Picaro(nombre, nivel, vida, leerSiNo(atributo, "Herramientas de ladrón"));
            }
            case "bardo" -> 
            {
                return new Bardo(nombre, nivel, vida, atributo);
            }
            default -> throw new IllegalArgumentException("Clase de personaje desconocida: " + clase);
        }
    }

    public static String etiquetaAtributo(String clase) 
    {
        return switch (normalizar(clase)) 
        {
            case "guerrero" -> "Armadura pesada (sí/no)";
            case "mago" -> "Espacios de conjuro";
            case "clerigo" -> "Dios venerado";
            case "monje" -> "Puntos de Ki";
            case "paladin" -> "Puntos de fuerza";
            case "explorador" -> "Terreno favorecido";
            case "picaro" -> "Herramientas de ladrón (sí/no)";
            case "bardo" -> "Instrumento musical";
            default -> "Atributo especial";
        };
    }

    static int leerEntero(String texto, String campo) 
    {
        try 
        {
            return Integer.parseInt(texto.trim());
        } 
        catch (NumberFormatException | NullPointerException ex) 
        {
            throw new IllegalArgumentException(campo + " debe ser un número entero.");
        }
    }

    static boolean leerSiNo(String texto, String campo) 
    {
        String valor = normalizar(texto);
        if (valor.equals("si") || valor.equals("s")) 
        {
            return true;
        }
        if (valor.equals("no") || valor.equals("n")) 
        {
            return false;
        }
        throw new IllegalArgumentException(campo + " debe responderse con sí o no.");
    }

    private static String normalizar(String texto) 
    {
        if (texto == null) 
        {
            return "";
        }
        return Normalizer.normalize(texto.trim().toLowerCase(), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }
}
