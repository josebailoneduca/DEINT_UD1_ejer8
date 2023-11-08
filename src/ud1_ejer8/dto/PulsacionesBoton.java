/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package ud1_ejer8.dto;

/**
 * DTO para almacenar las pulsaciones recibidas por un boton
 * @author Jose Javier BO
 */
public class PulsacionesBoton {
    /**
     * Id del boton (1,2,3 o 4)
     */
    int id; 
    
    /**
     * Pulsaciones recibidas por el boton
     */
    int pulsaciones;

    /**
     * Constructor
     * 
     * @param id Id que adjudicar al boton
     */
    public PulsacionesBoton(int id) {
        this.id = id;
        this.pulsaciones = 0;
    }

    /**
     * Devuelve la id del botn
     * @return La id
     */
    public int getId() {
        return id;
    }

    

    /**
     * Devuelve las pulsaciones recibidas por el boton
     * @return El numero de pulsaciones
     */
    public int getPulsaciones() {
        return pulsaciones;
    }

    
    
    /**
     * Agrega 1 pulsacion al boton
     */
    public void agregarPulsacion(){
        this.pulsaciones++;
    }
    
    
    /**
     * Convierte los datos del boton en una Array de strings con el formato
     * {"id","nºpulsaciones"}
     * @return el array de strings
     */
    public String[] toArrayString(){
        return new String[]{""+this.id,""+this.pulsaciones};
    }
}
