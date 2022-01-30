/*
* Name: Colby Cabrera
* Overview: Creates a GUI that the user clicks to get the bill for their order
* Input: User uses the mouse the click the buttons in the GUI
* Output: GUI with 7 buttons and label with the total cost
* Variables: price, totalPrice, smallDrink, largeDrink, smallFry, largeFry, vegBurger, bisonBurger, total
*/
 
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import java.text.NumberFormat;

public class BobBurgerPanel extends FlowPane {

	double price = 0;
	private Label totalPrice = new Label("Total Cost: " + price);
	private Button smallDrink = new Button("Small Drink: $1.00");
	private Button largeDrink = new Button("Large Drink: $2.00");
	private Button smallFry = new Button("Small Fry: $1.50");
	private Button largeFry = new Button("Large Fry: $2.75");
	private Button vegBurger = new Button ("Veggie Burger: $2.10");
	private Button bisonBurger = new Button("Bison Burger: $2.60");
	private Button total = new Button ("Total");
	
	//constructor for the GUI panel
	public BobBurgerPanel()
	{
		FlowPane pane = new FlowPane();
		
		smallDrink.setOnAction(this::processButtonAction);
		largeDrink.setOnAction(this::processButtonAction);
		smallFry.setOnAction(this::processButtonAction);
		largeFry.setOnAction(this::processButtonAction);
		vegBurger.setOnAction(this::processButtonAction);
		bisonBurger.setOnAction(this::processButtonAction);
		total.setOnAction(this::processButtonAction);
		
		pane.setHgap(20);
		pane.setVgap(20);
		
		pane.getChildren().addAll(smallDrink, largeDrink, smallFry, largeFry, vegBurger, bisonBurger, total);
		getChildren().addAll(pane);
	}	
	
	//executed whenever a button is pressed
	public void processButtonAction(ActionEvent event)
	{
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		//determines which button was pressed
		if (event.getSource() == smallDrink) 
			price += 1.00;
		else if (event.getSource() == largeDrink)
			price += 2.00;
		else if (event.getSource() == smallFry)
			price += 1.50;
		else if (event.getSource() == largeFry)
			price += 2.75;
		else if (event.getSource() == vegBurger)
			price += 2.10;
		else if (event.getSource() == bisonBurger)
			price += 2.60;
		else 
		{
			//updates and shows the formatted price
			totalPrice.setText("Price: " + fmt.format(price));
			getChildren().add(totalPrice);
		}
	}
}


