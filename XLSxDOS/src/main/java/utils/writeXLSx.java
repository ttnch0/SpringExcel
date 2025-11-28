package utils;

import java.util.ArrayList;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import models.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeXLSx {
		public void escrituraFichero(ArrayList<data> miArray, String ficheroSalida){
		    try {
		        FileWriter file = new FileWriter(ficheroSalida);
		        BufferedWriter salida = new BufferedWriter(file);
		        for(data x: miArray) {
		            salida.write(x.toString());
		        }
		        salida.close();
		        System.out.println("Se ha escrito el documento");
		    }catch (IOException e) {
		        System.out.println("Se ha producido un error");
		        e.printStackTrace();
		    }
		}
    }
