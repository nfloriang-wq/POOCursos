package cursos.MethodOverloadingandOverriding;

public class Main {

	public static void main(String[] args) {
		
		Persona per = new Persona();
		
		per.Datos("Miguel");
		per.Datos("Miguel", "1021875");
		per.Datos("Miguel", "1021875", 18);
		
	}

}
