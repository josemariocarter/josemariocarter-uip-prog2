package equipo;

public abstract class Equipo {
	private String nombre;
	private String apellido;
	private int edad;

	public void setNombre (String nombre){
		this.nombre=nombre;
	}
	public void setApellido (String apellido){
		this.apellido=apellido;
	}
	public void setEdad (int edad){
		this.edad = edad;
	}
	 public String getNombre(){
		 return this.nombre;
	 }
	public int getEdad (){
		return this.edad;
	}
	public String getApellido (){
		return this.apellido;
	}
	
	public void entrenan (){
		System.out.println("Estamos entrenando");
	}
	}


	

