package com.company.gestor_archivos;

import com.company.persona.Jugador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivos {
        private Jugador dataPersona(String currentData, int i) {
            Jugador newPersona = new Jugador();
            String[] data = currentData.split(",");
            String fullName = data[0];

            newPersona.setNombre(fullName);
            newPersona.setEdad(Integer.parseInt(data[1]));

            newPersona.setAltura(Integer.parseInt(data[3]));
            newPersona.setPeso(Integer.parseInt(data[4]));
            newPersona.setNacionalidad(data[5]);
            newPersona.setClub(data[6]);

            if (data.length > 7){
                newPersona.setNumero_camiseta(Integer.parseInt(data[7]));
            }

            return newPersona;
        }


        public ArrayList<Jugador> cargarDatos(Scanner reader) throws FileNotFoundException {

            Scanner fileReader = new Scanner(new File("C:\\Users\\ivanc\\Desktop\\Simulacion2.SistemasOperativos\\src\\com\\company\\players_15.csv"));

            ArrayList<Jugador> result = new ArrayList<Jugador>();
            boolean skip = true;
            int i = 0;
            while (reader.hasNextLine()) {
                i++;
                String persona = reader.nextLine();
                if (!skip) {
                    Jugador currentPersona = dataPersona(persona.toUpperCase(), i);
                    result.add(currentPersona);
                } else {
                    skip = false;
                }
            }

            fileReader.close();
            return result;
        }
}

