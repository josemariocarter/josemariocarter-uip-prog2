package equipo;


public class Principal   {
	
public static void main (String[] args) {
	System.out.println("jugadores");
	
		Jugador a = new Jugador ();
		a.setNombre("mario");
		a.setApellido("Carter");
		a.setEdad(17);
		System.out.println(a.getNombre());
		System.out.println(a.getApellido());
		System.out.println(a.getEdad());
		
		System.out.println();
		
		Jugador b = new Jugador ();
		b.setNombre("jose");
		b.setApellido("Pitti");
		b.setEdad(19);
		System.out.println(b.getNombre());
		System.out.println(b.getApellido());
		System.out.println(b.getEdad());
		
		System.out.println();
		
		Jugador c = new Jugador ();
		c.setNombre("frank");
		c.setApellido("rodriguez");
		c.setEdad(18);
		System.out.println(c.getNombre());
		System.out.println(c.getApellido());
		System.out.println(c.getEdad());
		 
		System.out.println();
		
		Jugador d = new Jugador ();
		d.setNombre("mario");
		d.setApellido("osorio");
		d.setEdad(20);
		System.out.println(d.getNombre());
		System.out.println(d.getApellido());
		System.out.println(d.getEdad());
		
		System.out.println();
		
		Jugador e = new Jugador ();
		e.setNombre("manuel");
		e.setApellido("perez");
		e.setEdad(18);
		System.out.println(e.getNombre());
		System.out.println(e.getApellido());
		System.out.println(e.getEdad());
		
		System.out.println();
		
		Jugador f = new Jugador ();
		f.setNombre("hector");
		f.setApellido("sanchez");
		f.setEdad(19);
		System.out.println(f.getNombre());
		System.out.println(f.getApellido());
		System.out.println(f.getEdad());
		
		System.out.println();
		
		Jugador g = new Jugador ();
		g.setNombre("pedro");
		g.setApellido("lezcano");
		g.setEdad(24);
		System.out.println(g.getNombre());
		System.out.println(g.getApellido());
		System.out.println(g.getEdad());
		
		System.out.println();
		
		Jugador h = new Jugador ();
		h.setNombre("jaime");
		h.setApellido("salazar");
		h.setEdad(18);
		System.out.println(h.getNombre());
		System.out.println(h.getApellido());
		System.out.println(h.getEdad());
		
		System.out.println();
		
		Jugador i = new Jugador ();
		i.setNombre("ibrahim");
		i.setApellido("patel");
		i.setEdad(23);
		System.out.println(i.getNombre());
		System.out.println(i.getApellido());
		System.out.println(i.getEdad());
		
		System.out.println();
		
		Jugador j = new Jugador ();
		j.setNombre("jesus");
		j.setApellido("gonzalez");
		j.setEdad(26);
		System.out.println(j.getNombre());
		System.out.println(j.getApellido());
		System.out.println(j.getEdad());
		
		System.out.println();
		
		Jugador k = new Jugador ();
		k.setNombre("eric");
		k.setApellido("soto");
		k.setEdad(25);
		System.out.println(k.getNombre());
		System.out.println(k.getApellido());
		System.out.println(k.getEdad());
		
		System.out.println();
		
		
		Jugador l = new Jugador ();
		l.setNombre("jesus");
		l.setApellido("perez");
		l.setEdad(24);
		System.out.println(l.getNombre());
		System.out.println(l.getApellido());
		System.out.println(l.getEdad());
		
		System.out.println();
		
		
		Jugador m = new Jugador ();
		m.setNombre("alan");
		m.setApellido("salvador");
		m.setEdad(23);
		System.out.println(m.getNombre());
		System.out.println(m.getApellido());
		System.out.println(m.getEdad());
		
		System.out.println();
		
		Jugador n = new Jugador ();
		n.setNombre("jorge");
		n.setApellido("acosta");
		n.setEdad(24);
		System.out.println(n.getNombre());
		System.out.println(n.getApellido());
		System.out.println(n.getEdad());
		
		System.out.println();
		
		Jugador o = new Jugador ();
		o.setNombre("liu");
		o.setApellido("chen");
		o.setEdad(23);
		System.out.println(o.getNombre());
		System.out.println(o.getApellido());
		System.out.println(o.getEdad());
		
		System.out.println();
		
		Jugador p = new Jugador ();
		p.setNombre("jill");
		p.setApellido("gonzalez");
		p.setEdad(21);
		System.out.println(j.getNombre());
		System.out.println(j.getApellido());
		System.out.println(j.getEdad());
		System.out.println();
		System.out.println("los jugadores"); 
		p.entrenan();
		System.out.println();
		
		System.out.println("Entrenador");
		Entrenador x = new Entrenador ();
		x.setIdentifacion(1);
		x.setNombre("austin");
		x.setApellido("moreno");
		x.setEdad(37);
		System.out.println(x.getIdentifacion());
		System.out.println(x.getNombre());
		System.out.println(x.getApellido());
		System.out.println(x.getEdad());
		x.planificar();
		System.out.println();

		System.out.println("Majajistas");
		System.out.println();
		Masajista y = new Masajista ();
		y.setNombre("Smith");
		y.setApellido("cameron");
		y.setEdad(25);
		y.setAños_de_experiencia(3);
		
		System.out.println(y.getNombre());
		System.out.println(y.getApellido());
		System.out.println(y.getEdad());
		System.out.println(y.getAños_de_experiencia());
		
		System.out.println();
		Masajista op = new Masajista ();
		op.setNombre("omar");
		op.setApellido("perez");
		op.setEdad(23);
		op.setAños_de_experiencia(1);
		
		System.out.println(op.getNombre());
		System.out.println(op.getApellido());
		System.out.println(op.getEdad());
		System.out.println(op.getAños_de_experiencia());

		op.mensajes();
		
		System.out.println();
		
		
	}

}
