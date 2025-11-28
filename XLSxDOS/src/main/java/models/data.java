package models;

public class data {
    // Atributos    
	private String tipoRespuesta;
    private String pregunta;
    private String respuesta;
    private String resultado;
    // Constructor
    public data(String tipoRespuesta,
    			String pregunta,
			    String respuesta,
			    String resultado) { 
    	this.tipoRespuesta = tipoRespuesta;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.resultado = resultado;

    }
    public String gettipoRespuesta() {
		return tipoRespuesta;
	}
    public String getpregunta() {
		return pregunta;
	}
    public String getrespuesta() {
		return respuesta;
	}
    public String getresultado() {
		return resultado;
	}
    public String toString() {
        return tipoRespuesta+", "+
               "\""+pregunta+"\","+
        	   "\""+respuesta+"\","+
        	   resultado+"\n";
    }
}



