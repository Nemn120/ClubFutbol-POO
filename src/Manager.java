import java.util.ArrayList;
import java.util.Iterator;

public class Manager extends Persona{
	
	private ArrayList<String> auspiciadores;
	Iterator<String> it;
	public Manager(String nombre, String apellido,String DNI, int edad) {
		super(nombre,apellido,DNI,edad);
		auspiciadores = new ArrayList();
	}
	
	public void añadirAuspiciador(String auspiciador) {
		auspiciadores.add(auspiciador);
	}
	public void mostrarAuspiciadores() {
		it = auspiciadores.iterator();
		System.out.println(":::: Auspiciadores conseguidos::::");
		while(it.hasNext()) {
			System.out.print(it.next()+ " || ");
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager" +super.toString();
	}
	

}
