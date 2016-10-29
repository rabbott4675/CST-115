import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Dispenser extends Application{
	@Override
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		
		double count = 0.00;
		
		Rectangle r1 = new Rectangle(0, 0, 400, 400);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.ORANGE);
		
		Rectangle r2 = new Rectangle(10, 10, 250, 350);
		r2.setLayoutX(65);
		r2.setLayoutY(10);
		r2.setStroke(Color.BLACK);
		r2.setFill(Color.WHITE);
		
		Rectangle myItems = new Rectangle(0, 0, 400, 200);
		myItems.setLayoutX(400);
		myItems.setLayoutY(200);
		myItems.setStroke(Color.BLACK);
		myItems.setFill(Color.POWDERBLUE);
		
		Label dL = new Label("Drinks");
		dL.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
		dL.setLayoutX(0);
		dL.setLayoutY(0);
		
		Label selectedItems = new Label("Selected Items");
		selectedItems.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
		selectedItems.setLayoutX(550);
		selectedItems.setLayoutY(200);
		
		Label sL = new Label("Snacks");
		sL.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20));
		sL.setLayoutX(0);
		sL.setLayoutY(0);
		
		Rectangle drink1 = new Rectangle(10, 10, 25, 50);
		drink1.setLayoutX(105);
		drink1.setLayoutY(40);
		drink1.setStroke(Color.BLACK);
		drink1.setFill(Color.YELLOW);
		
		Rectangle drink1C = new Rectangle(10, 10, 25, 50);
		drink1C.setLayoutX(410);
		drink1C.setLayoutY(225);
		drink1C.setStroke(Color.BLACK);
		drink1C.setFill(Color.YELLOW);
		count += 1.25;
		
		Label gatoradeL = new Label("Gatorade");
		gatoradeL.setRotate(90);
		gatoradeL.setLayoutX(105);
		gatoradeL.setLayoutY(65);
		
		Label gatoradeLC = new Label("Gatorade");
		gatoradeLC.setRotate(90);
		gatoradeLC.setLayoutX(410);
		gatoradeLC.setLayoutY(250);
		
		Rectangle drink2 = new Rectangle(10, 10, 25, 50);
		drink2.setLayoutX(180);
		drink2.setLayoutY(40);
		drink2.setStroke(Color.BLACK);
		drink2.setFill(Color.RED);
		
		Rectangle drink2C = new Rectangle(10, 10, 25, 50);
		drink2C.setLayoutX(450);
		drink2C.setLayoutY(225);
		drink2C.setStroke(Color.BLACK);
		drink2C.setFill(Color.RED);
		count += 1.25;
		
		Label sodaL = new Label("Soda");
		sodaL.setRotate(90);
		sodaL.setLayoutX(185);
		sodaL.setLayoutY(65);
		
		Label sodaLC = new Label("Soda");
		sodaLC.setRotate(90);
		sodaLC.setLayoutX(455);
		sodaLC.setLayoutY(250);
		
		Rectangle drink3 = new Rectangle(10, 10, 25, 50);
		drink3.setLayoutX(255);
		drink3.setLayoutY(40);
		drink3.setStroke(Color.BLACK);
		drink3.setFill(Color.LIGHTBLUE);
		
		Rectangle drink3C = new Rectangle(10, 10, 25, 50);
		drink3C.setLayoutX(490);
		drink3C.setLayoutY(225);
		drink3C.setStroke(Color.BLACK);
		drink3C.setFill(Color.LIGHTBLUE);
		count += 1.25;
		
		Label waterL = new Label("Water");
		waterL.setRotate(90);
		waterL.setLayoutX(260);
		waterL.setLayoutY(65);
		
		Label waterLC = new Label("Water");
		waterLC.setRotate(90);
		waterLC.setLayoutX(495);
		waterLC.setLayoutY(250);
		
		Rectangle snack1 = new Rectangle(10, 10, 25, 50);
		snack1.setLayoutX(105);
		snack1.setLayoutY(40);
		snack1.setStroke(Color.BLACK);
		snack1.setFill(Color.PINK);
		
		Rectangle snack1C = new Rectangle(10, 10, 25, 50);
		snack1C.setLayoutX(410);
		snack1C.setLayoutY(300);
		snack1C.setStroke(Color.BLACK);
		snack1C.setFill(Color.PINK);
		count += 1.25;
		
		Label bubbleYumL = new Label("B. Yum");
		bubbleYumL.setRotate(90);
		bubbleYumL.setLayoutX(105);
		bubbleYumL.setLayoutY(65);
		
		Label bubbleYumLC = new Label("B. Yum");
		bubbleYumLC.setRotate(90);
		bubbleYumLC.setLayoutX(415);
		bubbleYumLC.setLayoutY(325);
		
		
		Rectangle snack2 = new Rectangle(10, 10, 25, 50);
		snack2.setLayoutX(180);
		snack2.setLayoutY(40);
		snack2.setStroke(Color.BLACK);
		snack2.setFill(Color.YELLOW);
		
		Rectangle snack2C = new Rectangle(10, 10, 25, 50);
		snack2C.setLayoutX(450);
		snack2C.setLayoutY(300);
		snack2C.setStroke(Color.BLACK);
		snack2C.setFill(Color.YELLOW);
		count += 1.25;
		
		Label candyBarL = new Label("CandyBar");
		candyBarL.setRotate(90);
		candyBarL.setLayoutX(180);
		candyBarL.setLayoutY(66);
		
		Label candyBarLC = new Label("CandyBar");
		candyBarLC.setRotate(90);
		candyBarLC.setLayoutX(453);
		candyBarLC.setLayoutY(326);
		
		Rectangle snack3 = new Rectangle(10, 10, 25, 50);
		snack3.setLayoutX(255);
		snack3.setLayoutY(40);
		snack3.setStroke(Color.BLACK);
		snack3.setFill(Color.LIGHTBLUE);
		
		Rectangle snack3C = new Rectangle(10, 10, 25, 50);
		snack3C.setLayoutX(490);
		snack3C.setLayoutY(300);
		snack3C.setStroke(Color.BLACK);
		snack3C.setFill(Color.LIGHTBLUE);
		count += 1.25;
		
		Label dentyneL = new Label("Dentyne");
		dentyneL.setRotate(90);
		dentyneL.setLayoutX(260);
		dentyneL.setLayoutY(65);
		
		Label dentyneLC = new Label("Dentyne");
		dentyneLC.setRotate(90);
		dentyneLC.setLayoutX(495);
		dentyneLC.setLayoutY(325);
		
		Rectangle snack4 = new Rectangle(10, 10, 25, 50);
		snack4.setLayoutX(105);
		snack4.setLayoutY(140);
		snack4.setStroke(Color.BLACK);
		snack4.setFill(Color.ORANGE);
		
		Rectangle snack4C = new Rectangle(10, 10, 25, 50);
		snack4C.setLayoutX(530);
		snack4C.setLayoutY(300);
		snack4C.setStroke(Color.BLACK);
		snack4C.setFill(Color.ORANGE);
		count += 1.25;
		
		Label doritosL = new Label("Doritos");
		doritosL.setRotate(90);
		doritosL.setLayoutX(105);
		doritosL.setLayoutY(165);
		
		Label doritosLC = new Label("Doritos");
		doritosLC.setRotate(90);
		doritosLC.setLayoutX(535);
		doritosLC.setLayoutY(325);
		
		Rectangle snack5 = new Rectangle(10, 10, 25, 50);
		snack5.setLayoutX(180);
		snack5.setLayoutY(140);
		snack5.setStroke(Color.BLACK);
		snack5.setFill(Color.YELLOW);
		
		Rectangle snack5C = new Rectangle(10, 10, 25, 50);
		snack5C.setLayoutX(570);
		snack5C.setLayoutY(300);
		snack5C.setStroke(Color.BLACK);
		snack5C.setFill(Color.YELLOW);
		count += 1.25;
		
		Label laysL = new Label("Lays");
		laysL.setRotate(90);
		laysL.setLayoutX(190);
		laysL.setLayoutY(165);
		
		Label laysLC = new Label("Lays");
		laysLC.setRotate(90);
		laysLC.setLayoutX(585);
		laysLC.setLayoutY(325);
		count += 1.25;
		
		Rectangle snack6 = new Rectangle(10, 10, 25, 50);
		snack6.setLayoutX(255);
		snack6.setLayoutY(140);
		snack6.setStroke(Color.BLACK);
		snack6.setFill(Color.LIGHTBLUE);
		
		Rectangle snack6C = new Rectangle(10, 10, 25, 50);
		snack6C.setLayoutX(610);
		snack6C.setLayoutY(300);
		snack6C.setStroke(Color.BLACK);
		snack6C.setFill(Color.LIGHTBLUE);
		count += 1.25;
		
		Label lifesaversL = new Label("Lifesavers");
		lifesaversL.setRotate(90);
		lifesaversL.setLayoutX(255);
		lifesaversL.setLayoutY(168);
		
		Label lifesaversLC = new Label("Lifesavers");
		lifesaversLC.setRotate(90);
		lifesaversLC.setLayoutX(610);
		lifesaversLC.setLayoutY(328);

		Rectangle firstLevel = new Rectangle(10, 10, 250, 10);
		firstLevel.setLayoutX(64);
		firstLevel.setLayoutY(100);
		firstLevel.setStroke(Color.BLACK);
		firstLevel.setFill(Color.BLACK);
		
		Rectangle secondLevel = new Rectangle(10, 10, 250, 10);
		secondLevel.setLayoutX(64);
		secondLevel.setLayoutY(200);
		secondLevel.setStroke(Color.BLACK);
		secondLevel.setFill(Color.BLACK);
		
		Rectangle s1 = new Rectangle(10, 10, 20, 20);
		s1.setLayoutX(105);
		s1.setLayoutY(95);
		s1.setStroke(Color.BLACK);
		s1.setFill(Color.WHITE);
		
		Rectangle s2 = new Rectangle(10, 10, 20, 20);
		s2.setLayoutX(180);
		s2.setLayoutY(95);
		s2.setStroke(Color.BLACK);
		s2.setFill(Color.WHITE);
		
		Rectangle s3 = new Rectangle(10, 10, 20, 20);
		s3.setLayoutX(255);
		s3.setLayoutY(95);
		s3.setStroke(Color.BLACK);
		s3.setFill(Color.WHITE);
		
		Rectangle s4 = new Rectangle(10, 10, 20, 20);
		s4.setLayoutX(105);
		s4.setLayoutY(195);
		s4.setStroke(Color.BLACK);
		s4.setFill(Color.WHITE);
		
		Rectangle s5 = new Rectangle(10, 10, 20, 20);
		s5.setLayoutX(180);
		s5.setLayoutY(195);
		s5.setStroke(Color.BLACK);
		s5.setFill(Color.WHITE);
		
		Rectangle s6 = new Rectangle(10, 10, 20, 20);
		s6.setLayoutX(255);
		s6.setLayoutY(195);
		s6.setStroke(Color.BLACK);
		s6.setFill(Color.WHITE);
		
		Label number1 = new Label("1");
		number1.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 12));
		number1.setLayoutX(122);
		number1.setLayoutY(110);
		
		Label number2 = new Label("2");
		number2.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 12));
		number2.setLayoutX(197);
		number2.setLayoutY(110);
		
		Label number3 = new Label("3");
		number3.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 12));
		number3.setLayoutX(272);
		number3.setLayoutY(110);
		
		Label number4 = new Label("4");
		number4.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 12));
		number4.setLayoutX(122);
		number4.setLayoutY(210);
		
		Label number5 = new Label("5");
		number5.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 12));
		number5.setLayoutX(197);
		number5.setLayoutY(210);
		
		Label number6 = new Label("6");
		number6.setFont(Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 12));
		number6.setLayoutX(272);
		number6.setLayoutY(210);
		
		Rectangle aTT = new Rectangle(10, 10, 200, 50);
		aTT.setLayoutX(410);
		aTT.setLayoutY(10);
		aTT.setStroke(Color.GREY);
		aTT.setFill(Color.ANTIQUEWHITE);
		
		Rectangle useTT = new Rectangle(10, 10, 200, 50);
		useTT.setLayoutX(410);
		useTT.setLayoutY(100);
		useTT.setStroke(Color.GREY);
		useTT.setFill(Color.ANTIQUEWHITE);
		
		Label dTT = new Label("Display Drinks");
		dTT.setLayoutX(425);
		dTT.setLayoutY(25);
		
		Label sTT = new Label("Display Snacks");
		sTT.setLayoutX(425);
		sTT.setLayoutY(25);
		
		Label finishTT = new Label("Finish and Checkout");
		finishTT.setLayoutX(425);
		finishTT.setLayoutY(25);
		
		Label dOneTT = new Label("1 - Gatorade, $1.25");
		dOneTT.setLayoutX(425);
		dOneTT.setLayoutY(125);
		
		Label dTwoTT = new Label("2 - Soda, $1.25");
		dTwoTT.setLayoutX(425);
		dTwoTT.setLayoutY(125);
		
		Label dThreeTT = new Label("3 - Water, $1.25");
		dThreeTT.setLayoutX(425);
		dThreeTT.setLayoutY(125);
		
		Label sOneTT = new Label("1 - Bubble Yum, $0.75");
		sOneTT.setLayoutX(425);
		sOneTT.setLayoutY(125);
		
		Label sTwoTT = new Label("2 - CandyBar, $0.75");
		sTwoTT.setLayoutX(425);
		sTwoTT.setLayoutY(125);
		
		Label sThreeTT = new Label("3 - Dentyne, $0.75");
		sThreeTT.setLayoutX(425);
		sThreeTT.setLayoutY(125);
		
		Label sFourTT = new Label("4 - Doritos, $1.50");
		sFourTT.setLayoutX(425);
		sFourTT.setLayoutY(125);
		
		Label sFiveTT = new Label("5 - Lays, $1.50");
		sFiveTT.setLayoutX(425);
		sFiveTT.setLayoutY(125);
		
		Label sSixTT = new Label("6 - Lifesavers, $0.75");
		sSixTT.setLayoutX(425);
		sSixTT.setLayoutY(125);
		
		Button selectD1 = new Button("1");
		selectD1.setLayoutX(350);
		selectD1.setLayoutY(100);
		selectD1.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(dOneTT);
		          }
		        });

		    selectD1.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(dOneTT);
		          }
		        });
		    
		selectD1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            
            public void handle(ActionEvent event) {
            	pane.getChildren().add(drink1C);
            	pane.getChildren().add(gatoradeLC);
            }
        });

		Button selectD2 = new Button("2");
		selectD2.setLayoutX(350);
		selectD2.setLayoutY(125);
		selectD2.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(dTwoTT);
		          }
		        });

		    selectD2.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(dTwoTT);
		          }
		        });
		    
		selectD2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
        		pane.getChildren().add(drink2C);
        		pane.getChildren().add(sodaLC);
            
            }
        });

		Button selectD3 = new Button("3");
		selectD3.setLayoutX(350);
		selectD3.setLayoutY(150);
		selectD3.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(dThreeTT);
		          }
		        });

		    selectD3.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(dThreeTT);
		          }
		        });
		    
		selectD3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	pane.getChildren().add(drink3C);
            	pane.getChildren().add(waterLC);
            }
        });
		
		Button select1 = new Button("1");
		select1.setLayoutX(350);
		select1.setLayoutY(100);
		select1.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(sOneTT);
		          }
		        });

		    select1.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(sOneTT);
		          }
		        });
		    
		select1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	pane.getChildren().add(snack1C);
            	pane.getChildren().add(bubbleYumLC);
            }
        });
		
		Button select2 = new Button("2");
		select2.setLayoutX(350);
		select2.setLayoutY(125);
		select2.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(sTwoTT);
		          }
		        });

		    select2.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(sTwoTT);
		          }
		        });
		    
		select2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	pane.getChildren().add(snack2C);
            	pane.getChildren().add(candyBarLC);
            }
        });
		
		Button select3 = new Button("3");
		select3.setLayoutX(350);
		select3.setLayoutY(150);
		select3.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(sThreeTT);
		          }
		        });

		    select3.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(sThreeTT);
		          }
		        });
		    
		select3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	pane.getChildren().add(snack3C);
            	pane.getChildren().add(dentyneLC);
            }
        });
		
		Button select4 = new Button("4");
		select4.setLayoutX(350);
		select4.setLayoutY(175);
		select4.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(sFourTT);
		          }
		        });

		    select4.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(sFourTT);
		          }
		        });
		    
		select4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	pane.getChildren().add(snack4C);
            	pane.getChildren().add(doritosLC);
            }
        });
		
		Button select5 = new Button("5");
		select5.setLayoutX(350);
		select5.setLayoutY(200);
		select5.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(sFiveTT);
		          }
		        });

		    select5.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(sFiveTT);
		          }
		        });
		    
		select5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	pane.getChildren().add(snack5C);
            	pane.getChildren().add(laysLC);
            }
        });
		
		Button select6 = new Button("6");
		select6.setLayoutX(350);
		select6.setLayoutY(225);
		select6.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(useTT);
		        	  pane.getChildren().add(sSixTT);
		          }
		        });

		    select6.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(useTT);
		        	  pane.getChildren().remove(sSixTT);
		          }
		        });
		    
		select6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	pane.getChildren().add(snack6C);
            	pane.getChildren().add(lifesaversLC);
            }
        });
		
		Button drinkSelect = new Button("Drinks");
		drinkSelect.setLayoutX(335);
		drinkSelect.setLayoutY(25);
		drinkSelect.addEventHandler(MouseEvent.MOUSE_ENTERED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(aTT);
		        	  pane.getChildren().add(dTT);
		          }
		        });

		    drinkSelect.addEventHandler(MouseEvent.MOUSE_EXITED,
		        new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(aTT);
		        	  pane.getChildren().remove(dTT);
		          }
		        });
		    
		drinkSelect.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	pane.getChildren().remove(select1);
        		pane.getChildren().remove(select2);
        		pane.getChildren().remove(select3);
        		pane.getChildren().remove(select4);
        		pane.getChildren().remove(select5);
        		pane.getChildren().remove(select6);
            	pane.getChildren().add(selectD1);
        		pane.getChildren().add(selectD2);
        		pane.getChildren().add(selectD3);
            	pane.getChildren().remove(sL);
            	pane.getChildren().add(dL);
            	pane.getChildren().remove(snack1);
                pane.getChildren().remove(bubbleYumL);
                pane.getChildren().remove(snack2);
                pane.getChildren().remove(candyBarL);
                pane.getChildren().remove(snack3);
                pane.getChildren().remove(dentyneL);
                pane.getChildren().remove(snack4);
                pane.getChildren().remove(doritosL);
                pane.getChildren().remove(snack5);
                pane.getChildren().remove(laysL);
                pane.getChildren().remove(snack6);
                pane.getChildren().remove(lifesaversL);
                pane.getChildren().add(drink1);
                pane.getChildren().add(gatoradeL);
                pane.getChildren().add(drink2);
                pane.getChildren().add(sodaL);
                pane.getChildren().add(drink3);
                pane.getChildren().add(waterL);
            }
        });

		
		Button snackSelect = new Button("Snacks");
		snackSelect.setLayoutX(334);
		snackSelect.setLayoutY(50);
		snackSelect.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(aTT);
		        	  pane.getChildren().add(sTT);
		          }
		        });

		    snackSelect.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    		new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(aTT);
		        	  pane.getChildren().remove(sTT);
		          }
		        });

		snackSelect.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	pane.getChildren().remove(selectD1);
        		pane.getChildren().remove(selectD2);
        		pane.getChildren().remove(selectD3);
            	pane.getChildren().add(select1);
        		pane.getChildren().add(select2);
        		pane.getChildren().add(select3);
        		pane.getChildren().add(select4);
        		pane.getChildren().add(select5);
        		pane.getChildren().add(select6);
            	pane.getChildren().remove(dL);
            	pane.getChildren().add(sL);
                pane.getChildren().remove(drink1);
                pane.getChildren().remove(gatoradeL);
                pane.getChildren().remove(drink2);
                pane.getChildren().remove(sodaL);
                pane.getChildren().remove(drink3);
                pane.getChildren().remove(waterL);
                pane.getChildren().add(snack1);
                pane.getChildren().add(bubbleYumL);
                pane.getChildren().add(snack2);
                pane.getChildren().add(candyBarL);
                pane.getChildren().add(snack3);
                pane.getChildren().add(dentyneL);
                pane.getChildren().add(snack4);
                pane.getChildren().add(doritosL);
                pane.getChildren().add(snack5);
                pane.getChildren().add(laysL);
                pane.getChildren().add(snack6);
                pane.getChildren().add(lifesaversL);
                
            }
        });
		Button done = new Button("Done");
		done.setLayoutX(335);
		done.setLayoutY(300);
		done.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent s) {
		        	  pane.getChildren().add(aTT);
		        	  pane.getChildren().add(finishTT);
		          }
		        });

		    done.addEventHandler(MouseEvent.MOUSE_EXITED, 
		    		new EventHandler<MouseEvent>() {
		          @Override
		          public void handle(MouseEvent e) {
		        	  pane.getChildren().remove(aTT);
		        	  pane.getChildren().remove(finishTT);
		          }
		        });

		pane.getChildren().add(r1);
		pane.getChildren().add(r2);
		pane.getChildren().add(firstLevel);
		pane.getChildren().add(s1);
		pane.getChildren().add(s2);
		pane.getChildren().add(s3);
		pane.getChildren().add(secondLevel);
		pane.getChildren().add(s4);
		pane.getChildren().add(s5);
		pane.getChildren().add(s6);
		pane.getChildren().add(drinkSelect);
		pane.getChildren().add(snackSelect);
		pane.getChildren().add(myItems);
		pane.getChildren().add(number1);
		pane.getChildren().add(number2);
		pane.getChildren().add(number3);
		pane.getChildren().add(number4);
		pane.getChildren().add(number5);
		pane.getChildren().add(number6);
		pane.getChildren().add(selectedItems);
		pane.getChildren().add(done);
		
		done.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				Label yourCost = new Label("Total Cost:");
        		yourCost.setLayoutX(700);
        		yourCost.setLayoutY(275);
        		
        		Label cost = new Label("Count");
        		cost.setLayoutX(700);
        		cost.setLayoutY(300);
        		
        		cost.setText("Count");
        		pane.getChildren().add(cost);
        		pane.getChildren().add(yourCost);
			}
		});
		
		Scene scene = new Scene(pane, 800, 400);
		primaryStage.setTitle("Vending machine GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args){
		Application.launch(args);
		
	
}
}