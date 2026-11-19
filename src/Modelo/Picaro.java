/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Manue
 */
public class Picaro extends Aventurero 
{

    private boolean herramientasLadron;

    public Picaro(String nombre, int nivel, int puntosVida, boolean herramientasLadron) 
    {
        super(nombre, nivel, puntosVida);
        this.herramientasLadron = herramientasLadron;
    }

    @Override
    public String getClase() 
    {
        return "Pícaro";
    }

    @Override
    public String getAtributoEspecial() 
    {
        return "Herramientas de ladrón: " + (herramientasLadron ? "Sí" : "No");
    }

    public boolean isHerramientasLadron() 
    {
        return herramientasLadron;
    }

    public void setHerramientasLadron(boolean herramientasLadron) 
    {
        this.herramientasLadron = herramientasLadron;
    }

    @Override
    public String ejecutarCombate() 
    {
        return "El Pícaro " + getNombre()
                + " aprovecha la ventaja táctica para asestar un Ataque Furtivo masivo y se reposiciona.";
    }
}
