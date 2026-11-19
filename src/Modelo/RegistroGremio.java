/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Manue
 */
public class RegistroGremio 
{

    public static final String ARCHIVO_POR_DEFECTO = "registro_gremio.txt";

    private static final DateTimeFormatter FORMATO_FECHA =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private final Path archivo;

    public RegistroGremio() 
    {
        this(ARCHIVO_POR_DEFECTO);
    }

    /* @param rutaArchivo */
    public RegistroGremio(String rutaArchivo) 
    {
        this.archivo = Paths.get(rutaArchivo);
    }

    /**
     * @param tipo
     * @param mensaje
     * @throws java.io.IOException
     */
    public void anexar(String tipo, String mensaje) throws IOException 
    {
        String linea = "[" + LocalDateTime.now().format(FORMATO_FECHA) + "] "
                + tipo + ": " + mensaje;
        try (BufferedWriter escritor = Files.newBufferedWriter(archivo, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND))
        {
            escritor.write(linea);
            escritor.newLine();
        }
    }

    public void registrarAventurero(Aventurero aventurero) throws IOException 
    {
        anexar("REGISTRO", aventurero.toString());
    }

    public void registrarCombate(Aventurero aventurero) throws IOException 
    {
        anexar("COMBATE", aventurero.ejecutarCombate());
    }

    /**
     * @return 
     * @throws java.io.IOException */
    public List<String> leerHistorial() throws IOException 
    {
        if (!Files.exists(archivo)) 
        {
            return List.of();
        }
        return Files.readAllLines(archivo, StandardCharsets.UTF_8);
    }

    public Path getArchivo() 
    {
        return archivo;
    }
}
