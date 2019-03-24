import java.util.ArrayList;
import java.util.Iterator;


public class Entrenador extends Persona{
	private ArrayList<String> trofeos;
	private Iterator<String> it ;//= trofeos.iterator();
	private boolean pedirVacaciones = false;
	private int valoracion;
	private final int MAXVALORACION=10;
	
	
	public Entrenador(String nombre, String apellido, String DNI, int edad) {
		super(nombre,apellido,DNI,edad);
		
	}
	
	
	

	public boolean isPedirVacaciones() {
		return pedirVacaciones;
	}
	public void setPedirVacaciones(boolean pedirVacaciones) {
		this.pedirVacaciones = pedirVacaciones;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public int getMAXVALORACION() {
		return MAXVALORACION;
	}
	
	
	
	

}
