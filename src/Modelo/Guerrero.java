/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Manue
 */
public class Guerrero extends Aventurero 
{

    private boolean armaduraPesada;

    public Guerrero(String nombre, int nivel, int puntosVida, boolean armaduraPesada) 
    {
        super(nombre, nivel, puntosVida);
        this.armaduraPesada = armaduraPesada;
    }

    /**
     * @param nombre
     * @param nivel
     * @param puntosVida
     */
    public Guerrero(String nombre, int nivel, int puntosVida) 
    {
        this(nombre, nivel, puntosVida, false);
    }

    @Override
    public String getClase() 
    {
        return "Guerrero";
    }

    @Override
    public String getAtributoEspecial() 
    {
        return "Armadura pesada: " + (armaduraPesada ? "Sí" : "No");
    }

    public boolean isArmaduraPesada() 
    {
        return armaduraPesada;
    }

    public void setArmaduraPesada(boolean armaduraPesada) 
    {
        this.armaduraPesada = armaduraPesada;
    }

    @Override
    public String ejecutarCombate() 
    {
        return "El Guerrero " + getNombre()
                + " usa Oleada de Acción para realizar múltiples ataques físicos continuos.";
    }
}
