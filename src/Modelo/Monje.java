/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Manue
 */
public final class Monje extends Aventurero {

    private int puntosKi;

    public Monje(String nombre, int nivel, int puntosVida, int puntosKi) 
    {
        super(nombre, nivel, puntosVida);
        setPuntosKi(puntosKi);
    }

    @Override
    public String getClase() 
    {
        return "Monje";
    }

    @Override
    public String getAtributoEspecial() 
    {
        return "Puntos de Ki: " + puntosKi;
    }

    public int getPuntosKi() 
    {
        return puntosKi;
    }

    public void setPuntosKi(int puntosKi) 
    {
        if (puntosKi < 0) 
        {
            throw new IllegalArgumentException("Los puntos de Ki no pueden ser negativos.");
        }
        this.puntosKi = puntosKi;
    }

    @Override
    public String ejecutarCombate() 
    {
        return "El Monje " + getNombre()
                + " gasta puntos de Ki para ejecutar una Ráfaga de Golpes y un Ataque Aturdidor.";
    }
}