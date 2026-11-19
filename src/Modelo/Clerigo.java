/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Manue
 */
public final class Clerigo extends Aventurero 
{

    private String diosVenerado;

    public Clerigo(String nombre, int nivel, int puntosVida, String diosVenerado) 
    {
        super(nombre, nivel, puntosVida);
        setDiosVenerado(diosVenerado);
    }

    @Override
    public String getClase() 
    {
        return "Clérigo";
    }

    @Override
    public String getAtributoEspecial() 
    {
        return "Dios venerado: " + diosVenerado;
    }

    public String getDiosVenerado() 
    {
        return diosVenerado;
    }

    public void setDiosVenerado(String diosVenerado) 
    {
        if (diosVenerado == null || diosVenerado.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("El dios venerado no puede estar vacío.");
        }
        this.diosVenerado = diosVenerado.trim();
    }

    @Override
    public String ejecutarCombate() 
    {
        return "El Clérigo " + getNombre()
                + " usa Canalizar Divinidad para curar a sus aliados y expulsar muertos vivientes.";
    }
}
