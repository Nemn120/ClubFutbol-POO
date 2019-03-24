
public class EquipoDeFutbol {
	private String nombreClub;
	private int añoFundacion;
	private Futbolista[] futbolistas;
	private int cantFutbolistas=0;
	private final int MAXFUTBOLISTAS=28;
	private Entrenador entrenador;
	private Manager managerDelEquipo;
	
	
	public EquipoDeFutbol(String nombreClub, int añoFundacion) {
		this.nombreClub = nombreClub;
		this.añoFundacion = añoFundacion;
		futbolistas = new Futbolista[MAXFUTBOLISTAS];
		
	}
	
	
	public void realizarFichaje(Futbolista jugador) {
		futbolistas[cantFutbolistas]=jugador;
		cantFutbolistas++;
		
	}
	public Futbolista liberarJugador(String nombre) {
		int i =0;
		Futbolista aux = null;
		boolean encontrado = false;
		while(i != futbolistas.length && encontrado == false){
			if(futbolistas[i].getNombre() == nombre) {
				encontrado = true;
				aux = futbolistas[i];
				futbolistas[i] = futbolistas[i+1];
				
			}
			i++;
		}
		return  aux;

	}
	public void imprimirJugadores() {
		
		System.out.println("   ::::: LISTA DE JUGADORES ::::   ");
		for(int i=0; i<futbolistas.length; i++) {
			System.out.println(futbolistas[i].toString());
		}
	}
	public int totalJugadores() {
		return cantFutbolistas;
	}
	
	
	
	

	public Futbolista[] getFutbolistas() {
		return futbolistas;
	}


	public void setFutbolistas(Futbolista[] futbolistas) {
		this.futbolistas = futbolistas;
	}


	public Entrenador getEntrenador() {
		return entrenador;
	}



	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}



	public Manager getManagerDelEquipo() {
		return managerDelEquipo;
	}



	public void setManagerDelEquipo(Manager managerDelEquipo) {
		this.managerDelEquipo = managerDelEquipo;
	}



	public String getNombreClub() {
		return nombreClub;
	}


	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}


	public int getAñoFundacion() {
		return añoFundacion;
	}


	public void setAñoFundacion(int añoFundacion) {
		this.añoFundacion = añoFundacion;
	}
	
	

}
