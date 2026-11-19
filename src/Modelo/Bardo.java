/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author Manue
 */
public final class Bardo extends Aventurero 
{

    private String instrumentoMusical;

    public Bardo(String nombre, int nivel, int puntosVida, String instrumentoMusical)
    {
        super(nombre, nivel, puntosVida);
        setInstrumentoMusical(instrumentoMusical);
    }

    @Override
    public String getClase() 
    {
        return "Bardo";
    }

    @Override
    public String getAtributoEspecial() 
    {
        return "Instrumento musical: " + instrumentoMusical;
    }

    public String getInstrumentoMusical() 
    {
        return instrumentoMusical;
    }

    public void setInstrumentoMusical(String instrumentoMusical) 
    {
        if (instrumentoMusical == null || instrumentoMusical.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("El instrumento musical no puede estar vacío.");
        }
        this.instrumentoMusical = instrumentoMusical.trim();
    }

    @Override
    public String ejecutarCombate() 
    {
        return "El Bardo " + getNombre()
                + " toca su instrumento para otorgar Inspiración Bárdica a un aliado.";
    }
}
