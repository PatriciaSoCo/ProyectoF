package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
    Employee Patricia = new Employee("Paty","Soto" );

    Patricia.getNombre();

    Patricia.getApellido();

    Patricia.setEdad(36);

    Patricia.setDirección("Guadalajara");

    System.out.println(Patricia.getNombre()+" "+ Patricia.getApellido() + " Edad:" + Patricia.getEdad() + " "+ Patricia.getDirección());


    }
}
