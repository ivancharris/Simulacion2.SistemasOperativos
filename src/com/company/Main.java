package com.company;
import com.company.gestor_archivos.Archivos;
import com.company.persona.Jugador;

import java.util.ArrayList;
import java.io .*;
import java.util.Scanner;


    public class Main {
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String args[]) throws IOException, ClassNotFoundException {
            Archivos unArchivo = new Archivos();
            boolean encontrado = false;
            Integer contador = 0;
            Integer opcion = null;
            ArrayList<Jugador> personas = unArchivo.cargarDatos(new Scanner(new File("C:\\Users\\ivanc\\Desktop\\Simulacion2.SistemasOperativos\\src\\com\\company\\players_15.csv")));
            guardarDatos(personas);
            ArrayList<Jugador> personasDesdeDat = leerDatos();
            System.out.println("----Menu----");
            System.out.println("1) Filtrar por nombre");
            System.out.println("2) Filtrar por nacionalidad");
            System.out.println("3) Filtrar por numero camiseta jugador");
            System.out.println("4) Filtrar por peso");
            System.out.println("5) Filtrar por altura");
            System.out.println("6) Filtrar por edad \n");
            opcion = scanner.nextInt();

            if(opcion == 1){
                String nombre = "Nombre";
                System.out.println("Ingrese el " + nombre);
            }
            else if(opcion == 2){
                String nacionalidad = "Nacionalidad";
                System.out.println("Ingrese la " + nacionalidad);
            }
            else if(opcion == 3){
                String numCam = "Numero camiseta del jugador";
                System.out.println("Ingrese el " + numCam);
            }
            else if(opcion == 4){
                String peso = "Peso";
                System.out.println("Ingrese el " + peso);
            }
            else if(opcion == 5){
                String alt = "Altura";
                System.out.println("Ingrese la " + alt);
            }
            else{
                String edad = "Edad";
                System.out.println("Ingrese la " + edad);
            }

            switch (opcion) {
                case 1:
                    long start = System.currentTimeMillis();
                    String filtrado = scanner.next();
                    for (Jugador persona : personasDesdeDat) {
                        if (persona.getNombre().contains(filtrado.toUpperCase())) {
                            contador= 1+contador;
                            System.out.println(persona);
                            encontrado = true;
                        }
                    }System.out.println("\n En total se encontraron: " + contador +" jugadores con ese nombre");
                    if(encontrado == false){
                        System.out.println("-------------> "+ filtrado +" no encontrado <------------- \n");
                    }

                    long finish = System.currentTimeMillis();
                    long timeElapsed = finish - start;
                    System.out.println("\nSIN INDICES\n--> Tiempo de ejecucion: " + timeElapsed + " mili segundos");
                    break;
                case 2:
                    long start2 = System.currentTimeMillis();

                    String filtradoNacionalidad = scanner.next();
                    for (Jugador persona : personasDesdeDat) {
                        if (persona.getNacionalidad().contains(filtradoNacionalidad.toUpperCase())) {
                            contador= 1+contador;
                            System.out.println(persona);
                            encontrado = true;
                        }
                    }System.out.println("\n En total se encontraron: " + contador +" jugadores con esa nacionalidad");
                    if(encontrado == false){
                        System.out.println("-------------> "+ filtradoNacionalidad +" no encontrado <------------- \n");
                    }
                    long finish2 = System.currentTimeMillis();
                    long timeElapsed2 = finish2 - start2;
                    System.out.println("\nSIN INDICES\n--> Tiempo de ejecucion: " + timeElapsed2 + " mili segundos");
                    break;
                case 3:
                    long start3 = System.currentTimeMillis();

                    Integer filtradoNumCam = scanner.nextInt();
                    for (Jugador persona : personasDesdeDat) {
                        if (persona.getNumero_camiseta() == filtradoNumCam) {
                            contador= 1+contador;
                            System.out.println(persona);

                            encontrado = true;
                        }
                    }
                    System.out.println("\n En total se encontraron: " + contador +" jugadores con ese numero de camiseta");
                    if(encontrado == false){
                        System.out.println("-------------> "+ filtradoNumCam +" no encontrado <------------- \n");
                    }
                    long finish3 = System.currentTimeMillis();
                    long timeElapsed3 = finish3 - start3;
                    System.out.println("\nSIN INDICES\n--> Tiempo de ejecucion: " + timeElapsed3 + " mili segundos");
                    break;
                case 4:
                    long start4 = System.currentTimeMillis();

                    Integer filtradoPeso = scanner.nextInt();
                    for (Jugador persona : personasDesdeDat) {
                        if (persona.getPeso() == filtradoPeso) {
                            contador= 1+contador;
                            System.out.println(persona);

                            encontrado = true;
                        }
                    }
                        System.out.println("\n En total se encontraron: " + contador +" jugadores con ese peso");
                    if(encontrado == false){
                        System.out.println("-------------> "+ filtradoPeso +" no encontrado <------------- \n");
                    }
                    long finish4 = System.currentTimeMillis();
                    long timeElapsed4 = finish4 - start4;
                    System.out.println("\nSIN INDICES\n--> Tiempo de ejecucion: " + timeElapsed4 + " mili segundos");
                    break;
                case 5:
                    long start5 = System.currentTimeMillis();

                    Integer filtradoAltura = scanner.nextInt();
                    for (Jugador persona : personasDesdeDat) {
                        if (persona.getAltura() == filtradoAltura) {
                            contador= 1+contador;
                            System.out.println(persona);
                             encontrado = true;
                        }
                    }
                        System.out.println("\n En total se encontraron: " + contador +" jugadores con esa altura");
                    if(encontrado == false){
                        System.out.println("-------------> "+ filtradoAltura +" no encontrado <------------- \n");
                    }
                    long finish5 = System.currentTimeMillis();
                    long timeElapsed5 = finish5 - start5;
                    System.out.println("\nSIN INDICES\n--> Tiempo de ejecucion: " + timeElapsed5 + " mili segundos");
                    break;
                case 6:
                    long start6 = System.currentTimeMillis();

                    Integer filtradoEdad = scanner.nextInt();
                    for (Jugador persona : personasDesdeDat) {
                        if (persona.getEdad() == filtradoEdad) {
                            contador= 1+contador;
                            System.out.println(persona);
                            encontrado = true;
                        }
                    }
                        System.out.println("\n En total se encontraron: " + contador +" jugadores con esa edad");
                    if(encontrado == false){
                        System.out.println("-------------> "+ filtradoEdad +" no encontrado <------------- \n");
                    }
                    long finish6 = System.currentTimeMillis();
                    long timeElapsed6 = finish6 - start6;
                    System.out.println("\nSIN INDICES\n--> Tiempo de ejecucion: " + timeElapsed6 + " mili segundos");
                    break;
            }
        }

        public static ArrayList<Jugador> leerDatos() throws IOException, ClassNotFoundException {
            FileInputStream fi = new FileInputStream(new File("C:\\Users\\ivanc\\Desktop\\Simulacion2.SistemasOperativos\\src\\com\\company\\archivo.dat"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            ArrayList<Jugador> personas = new ArrayList<Jugador>();
            try {
                Jugador obj = null;
                while ((obj = (Jugador) oi.readObject()) != null) {
                    personas.add(obj);
                }
            } catch (Exception e) {
                oi.close();
                fi.close();
            }
            oi.close();
            fi.close();

            return personas;
        }

        public static void guardarDatos(ArrayList<Jugador> personas) throws IOException {
            FileOutputStream f = new FileOutputStream(new File("C:\\Users\\ivanc\\Desktop\\Simulacion2.SistemasOperativos\\src\\com\\company\\archivo.dat"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            personas.forEach(x -> {
                try {
                    o.writeObject(x);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            o.close();
            f.close();
        }
}

