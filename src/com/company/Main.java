package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
    Employee Patricia = new Employee("Paty","Soto" );

    Patricia.getName();

    Patricia.getApellido();

    Patricia.setEdad(35);

    Patricia.setDirección("Guadalajara");

    System.out.println(Patricia.getName()+" "+ Patricia.getApellido() + " Edad:" + Patricia.getEdad() + " "+ Patricia.getDirección());


    }
}
