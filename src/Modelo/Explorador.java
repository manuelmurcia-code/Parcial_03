/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Manue
 */
public final class Explorador extends Aventurero 
{

    private String terrenoFavorecido;

    public Explorador(String nombre, int nivel, int puntosVida, String terrenoFavorecido) 
    {
        super(nombre, nivel, puntosVida);
        setTerrenoFavorecido(terrenoFavorecido);
    }

    @Override
    public String getClase() 
    {
        return "Explorador";
    }

    @Override
    public String getAtributoEspecial() 
    {
        return "Terreno favorecido: " + terrenoFavorecido;
    }

    public String getTerrenoFavorecido() 
    {
        return terrenoFavorecido;
    }

    public void setTerrenoFavorecido(String terrenoFavorecido) 
    {
        if (terrenoFavorecido == null || terrenoFavorecido.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("El terreno favorecido no puede estar vacío.");
        }
        this.terrenoFavorecido = terrenoFavorecido.trim();
    }

    @Override
    public String ejecutarCombate() 
    {
        return "El Explorador " + getNombre()
                + " aplica Marca del Cazador sobre el objetivo para maximizar su daño sostenido.";
    }
}

