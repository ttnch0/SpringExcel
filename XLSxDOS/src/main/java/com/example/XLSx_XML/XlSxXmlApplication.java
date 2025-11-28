package com.example.XLSx_XML;

import java.io.IOException;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import models.data;
import utils.readXLSx;
import utils.writeXLSx;

@SpringBootApplication
public class XlSxXmlApplication {
	
	public static void main(String[] args) throws IOException {
	String FileInput = "src/main/resources/static/sample1.xls";	
		//SpringApplication.run(XlsCsvApplication.class, args);		
		readXLSx miReadXLSx = new readXLSx();
		ArrayList<data> dataList = miReadXLSx.readXLS(FileInput);
		for(data x: dataList) {
			x.toString();
		}
		System.out.println ("Leido con exito" + dataList );
		String ficheroSalida="src/main/resources/salida.csv";
    	writeXLSx miEscritura= new writeXLSx();
    	miEscritura.escrituraFichero(dataList, ficheroSalida);    			
	}
}
