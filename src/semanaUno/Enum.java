package semanaUno;

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
enum Size{
	  SMALL, MEDIUM, LARGE, EXTRALARGE;
	  public String getSize() {

	    switch(this) {
	      case SMALL:
	        return "pequeño";

	      case MEDIUM:
	        return "mediano";

	      case LARGE:
	        return "grande";

	      case EXTRALARGE:
	        return "extra grande";

	      default:
	        return null;
	      }
	   }

	  public static void main(String[] args) {
	    System.out.println("El zapato es " + Size.SMALL.getSize());
	  }
	}
