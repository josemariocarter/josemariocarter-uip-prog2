package equipo;

public class Entrenador extends Equipo{
private int identifacion ;

public int getIdentifacion() {
	return identifacion;
}

public void setIdentifacion(int identifacion) {
	this.identifacion = identifacion;
}

public void planificar (){
	System.out.println("Estoy planicando jugadas para entrenar");
}
}
