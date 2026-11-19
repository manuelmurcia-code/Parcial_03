/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author Manue
 */
public abstract class Aventurero implements AccionCombate 
{

    public static final int NIVEL_MINIMO = 1;
    public static final int NIVEL_MAXIMO = 20;

    private String nombre;
    private int nivel;
    private int puntosVida;

    /**
     * @param nombre
     * @param nivel
     * @param puntosVida
     */
    public Aventurero(String nombre, int nivel, int puntosVida)
    {
        setNombre(nombre);
        setNivel(nivel);
        setPuntosVida(puntosVida);
    }

    /**
     * @param nombre
     */
    public Aventurero(String nombre)
    {
        this(nombre, NIVEL_MINIMO, 10);
    }

    /* @return  */
    public abstract String getClase();

    /* @return  */
    public abstract String getAtributoEspecial();

    public String getNombre() 
    {
        return nombre;
    }

    public final void setNombre(String nombre) 
    {
        if (nombre == null || nombre.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public int getNivel() 
    {
        return nivel;
    }

    public final void setNivel(int nivel) 
    {
        if (nivel < NIVEL_MINIMO || nivel > NIVEL_MAXIMO) 
        {
            throw new IllegalArgumentException(
                    "El nivel debe estar entre " + NIVEL_MINIMO + " y " + NIVEL_MAXIMO + ".");
        }
        this.nivel = nivel;
    }

    public int getPuntosVida() 
    {
        return puntosVida;
    }

    public final void setPuntosVida(int puntosVida) 
    {
        if (puntosVida <= 0) 
        {
            throw new IllegalArgumentException("Los puntos de vida deben ser mayores que cero.");
        }
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() 
    {
        return getClase() + " | Nombre: " + nombre + " | Nivel: " + nivel
                + " | Vida: " + puntosVida + " | " + getAtributoEspecial();
    }

    @Override
    public String ejecutarCombate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
