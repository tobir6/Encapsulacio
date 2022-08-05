package com.open_bootcamp;

public class Encapsulación {
    public static void main(String[] args) {
        Persona humano = new Persona();

        humano.setEdad(19);
        humano.setNombre("tobias");
        humano.setTelefono(3534019186L);

        System.out.println(humano.getEdad());
        System.out.println(humano.getNombre());
        System.out.println(humano.getTelefono());
    }
    
    public static class Persona {
        private int edad;
        private String nombre;
        private long telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }
        public String getNombre(){
            return this.nombre;
        }
        public long getTelefono(){
            return this.telefono;
        }
        public int getEdad(){
            return this.edad;
        }
    }
}