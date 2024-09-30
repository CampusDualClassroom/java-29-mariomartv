package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
    try{
    throw new Exception("Excepcion lanzada por Mario");
    } catch (Exception e) {
        e.getMessage();
    }
    }
}
