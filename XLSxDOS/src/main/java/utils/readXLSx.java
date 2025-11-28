package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



import models.data;


public class readXLSx {
	  public static ArrayList<data> readXLS(String filename) {
	        ArrayList<data> dataList = new ArrayList<>();
	        try (FileInputStream fis = new FileInputStream(filename);
	                Workbook workbook = WorkbookFactory.create(fis)) {

	               for (Sheet sheet : workbook) {
	                   for (int rowIndex = 1; rowIndex <= 7 ; rowIndex++) {
	                       Row row = sheet.getRow(rowIndex);
	                       if (row != null) {
	                    	 //  System.out.println(row);
	                           String tipoRespuesta = row.getCell(0).getStringCellValue();
	                          // System.out.println(tipoRespuesta);
	                           String pregunta = row.getCell(1).getStringCellValue();
	                         //  System.out.println(pregunta);
	                           String respuesta = row.getCell(2).getStringCellValue();
	                          // System.out.println(respuesta);
	                           String resultado = row.getCell(3).getStringCellValue();   
	                          // System.out.println(resultado);
	                           
	                           /*if (row.getCell(0) !=null && row.getCell(5).getCellType() == CellType.NUMERIC) {
	                        	   date = row.getCell(7).getLocalDateTimeCellValue().toString();
	                           }*/
	                           data listado = new data (tipoRespuesta,pregunta,respuesta,resultado);
	                           dataList.add(listado);                   
                          }
	                   }
	               }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return dataList;
	  }
}

	        
        
        
        
        
