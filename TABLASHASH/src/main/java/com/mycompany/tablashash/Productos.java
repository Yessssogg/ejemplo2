
package com.mycompany.tablashash;

import java.util.Arrays;


public class Productos {
    private String nombre;
    private String codigo;

    public Productos(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
  public String toString(){
    Object[] Fila = {nombre,codigo};
    return Arrays.toString(Fila);
  }
}
