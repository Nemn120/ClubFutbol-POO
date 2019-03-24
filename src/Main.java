
public class Main {
	
	public static void main(String args[]) {
		
		// enum para las posiciones de los jugadores
		Posicion delantero = Posicion.DELANTEROCENTRO;
		//System.out.println(delantero.name());
		EquipoDeFutbol eq1 = new EquipoDeFutbol("Deportivo la Wacha",1938);
		
		Manager mang = new Manager("Usim", "Salahh","188140", 41);
		// busqueda de auspiciadores
		mang.añadirAuspiciador("Backus");
		mang.añadirAuspiciador("Movistar");
		mang.añadirAuspiciador("Anipsa");
		// contratacion del manager 
		eq1.setManagerDelEquipo(mang);
		// mostrar auspiciadores del equipo
		
		eq1.getManagerDelEquipo().mostrarAuspiciadores();
		
		// contratacion del tecnico
		eq1.setEntrenador(new Entrenador("Jose", "Uribe", "101010", 58));
		// valoracion del tecnico en el mercado
		eq1.getEntrenador().setValoracion(6);
		
		// futbolistas libres
		Futbolista f1 = new Futbolista("Affonso", "Ugarte", "1020", 24);
		Futbolista f2 = new Futbolista("Juan", "Millar", "10650", 28);
		Futbolista f3 = new Futbolista("Kevin", "Baldosa", "10100", 31);
		Futbolista f4 = new Futbolista("Marco", "Uribe", "1370", 18);
		
		// valor de los jugadores en el mercado y sus posiciones
		f1.setValor(18000); f1.setPosicion(Posicion.CENTRAL);
		f2.setValor(38000); f2.setPosicion(Posicion.VOLANTE);
		f3.setValor(52500); f3.setPosicion(Posicion.DELANTEROCENTRO);
		f4.setValor(9000);  f4.setPosicion(Posicion.LATERAL);
		
		// realizacion de fichajes 
		eq1.realizarFichaje(f1);	
		eq1.realizarFichaje(f2);
		eq1.realizarFichaje(f3);
		eq1.realizarFichaje(f4);
		
		// asignacion de camisetas
		Futbolista[] futb1;
		// getFutbolistas devuelve un arreglo de String 
		futb1=eq1.getFutbolistas();
		for(int i=0;i<eq1.totalJugadores(); i++) {
	
			futb1[i].numeroCamiseta(i+(int)(Math.random()*25)+1);
		}
		System.out.println();
		System.out.println("\t\t::::: MOSTRAR JUGADORES :::::");
		
		for(int i=0;i<eq1.totalJugadores(); i++) {
	
			System.out.println(futb1[i].toString());
			System.out.println();
		}
		System.out.println();
		System.out.println("COMPROBAR SI SE REALIZO CORRECTAMENTE EL CAMBIO DE NUM DE CAMISETA");
		
		System.out.println("Jugar 0 Camiseta: "+eq1.getFutbolistas()[0].getNumCamiseta());
		System.out.println();
		System.out.println();
		
		// liberar futbolista Kevin
		System.out.println("Jugador: "+eq1.getFutbolistas()[2].getNombre());
		Futbolista flibre = eq1.liberarJugador("Kevin");
		// comprobacion ahora Marco pasa a ser el jugador numero 2
		System.out.println("Jugador Libre" +flibre.getNombre());
		System.out.println("Jugador: "+eq1.getFutbolistas()[2].getNombre());
		
		// fichaje del jugador kevin al Club RemorasBoys
		EquipoDeFutbol eq2 = new EquipoDeFutbol("Club RemorasBoys", 2008);
		
		eq2.realizarFichaje(flibre);
		System.out.println("Nuevo jugador del equipo: "+eq2.getNombreClub());
		System.out.println(eq2.getFutbolistas()[0]);
		// aumentar el valor de la nueva contratacion en 8000
		flibre.setValor(flibre.getValor()+8000);
		// comprobacion
		System.out.println(eq2.getFutbolistas()[0]);
		
		/* USO DE CASTING / UP / DOWN
		// upcasting, convierte al futbolista en persona
		Persona p1 = new Futbolista("Juan", "Jose", "15454", 28);
		// ya no se puede acceder a los metodos de futbolista
		
		// downcasting, convierte a la persona en futbolista
		Futbolista f3 = (Futbolista)p1;
		// para acceder a los metodos de futbolista
		f3.setValor(15000);
		---------------------------------------------------------------
		Futbolista f1 = new Futbolista("Juan", "Jose", "15454", 28);
		Futbolista f2;
		// no utilizar la descendente
		if(p1 instanceof Futbolista) {
			f2 = (Futbolista)p1;
			System.out.println(f2.toString());
		}
		*/
	}
	

}
