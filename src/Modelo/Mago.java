/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Manue
 */
public final class Mago extends Aventurero
{

    private int espaciosConjuro;

    public Mago(String nombre, int nivel, int puntosVida, int espaciosConjuro) 
    {
        super(nombre, nivel, puntosVida);
        setEspaciosConjuro(espaciosConjuro);
    }

    @Override
    public String getClase() 
    {
        return "Mago";
    }

    @Override
    public String getAtributoEspecial() 
    {
        return "Espacios de conjuro: " + espaciosConjuro;
    }

    public int getEspaciosConjuro() 
    {
        return espaciosConjuro;
    }

    public void setEspaciosConjuro(int espaciosConjuro) 
    {
        if (espaciosConjuro < 0) 
        {
            throw new IllegalArgumentException("Los espacios de conjuro no pueden ser negativos.");
        }
        this.espaciosConjuro = espaciosConjuro;
    }

    @Override
    public String ejecutarCombate() 
    {
        return "El Mago " + getNombre()
                + " gasta un espacio de conjuro para lanzar una poderosa Bola de Fuego.";
    }
}
