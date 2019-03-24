
public class Futbolista extends Persona {
	private Posicion posicion;
	private double valor;
	private int numCamiseta;
	private boolean titular= false;
	
	public Futbolista(String nombre, String apellido, String DNI, int edad) {
		super(nombre,apellido,DNI,edad);
	}
	
	public Futbolista(String nombre, String apellido, String DNI, int edad, Posicion pos, double valor) {
		//super(nombre,apellido,DNI, edad); llamada al otro constructor
		this(nombre,apellido,DNI, edad);
		this.posicion = pos;
		this.valor = valor;
		
	}
	
	

	public int getNumCamiseta() {
		return numCamiseta;
	}

	

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		
		return super.toString()+"\nFutbolista [posicion=" + posicion + "num Camiseta="+ numCamiseta+ " valor=$ " + valor + "]";
	}
	
	public void numeroCamiseta(int numero) {
		this.numCamiseta= numero;
	}
	
	
	
	
	


}
