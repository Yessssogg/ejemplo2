package com.mycompany.tablashash;

import java.util.HashMap;

public class AppPruebaProduct {

    public static void main(String[] args) {
        HashMap<String, Productos> Tabla = new HashMap<>();
        InsertarElemento("1", new Productos("Lejia", "0112"), Tabla);
        InsertarElemento("2", new Productos("Detergente", "0113"), Tabla);
        InsertarElemento("3", new Productos("Limpiavidrios", "0114"), Tabla);
        InsertarElemento("4", new Productos("Desinfectante Multiusos", "0115"), Tabla);
        InsertarElemento("5", new Productos("Blanqueador", "0116"), Tabla);
        ImprimirTabla(Tabla);
    }

    public static void InsertarElemento(String K, Productos V, HashMap<String, Productos> Tabla) {
        if (Tabla.containsKey(K)) {

        } else {
            Tabla.put(K, V);
            System.out.println("Registro Exitoso. CR:" + Tabla.size());
        }
    }

    public static void ImprimirTabla(HashMap<String, Productos> Tabla) {
        for (String K : Tabla.keySet()) {
            System.out.println(K + "<--->" + Tabla.get(K));
        }

    }
}
