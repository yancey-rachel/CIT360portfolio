package view;

import control.cokeController;
import model.Coke;

public class Cokemvc {

	public static void main(String[] args) {
		
		Coke model = retrieveinfo();
		
		Cokeview view = new Cokeview();
		
		cokeController controller = new cokeController(model,view);
		
		controller.uview();
		
		controller.setcokeFlavor("Raspberry Coke");
		
		controller.setcokeSize(8);
		
		controller.uview();

	}
	
	private static Coke retrieveinfo(){
		Coke coke = new Coke();
		coke.Setflavor("Cherry Coke");
		coke.Setsize(16);
		return coke;
	}

}
