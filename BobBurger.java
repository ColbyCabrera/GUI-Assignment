/*
* Name: Colby Cabrera
* Overview: Creates a GUI that the user clicks to get the bill for their order
* Input: User uses the mouse the click the buttons in the GUI
* Output: GUI with 7 buttons and label with the total cost
* Variables: panel, scene
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class BobBurger extends Application {

	//creates a GUI for a burger cash register
	public void start(Stage primaryStage)
	{
		BobBurgerPanel panel = new BobBurgerPanel();
		Scene scene = new Scene(panel, 700, 500);
		
		panel.setAlignment(Pos.CENTER);
		panel.setStyle("-fx-background-color: lightcyan");
		primaryStage.setTitle("Burger Register");
		primaryStage.setScene(scene);
		primaryStage.show();
    }
	
	//launches the GUI
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}
