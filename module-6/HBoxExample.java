import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create an HBox layout
        HBox hBox = new HBox(); 
        
        // Set spacing between child nodes
        hBox.setSpacing(10); // Adds 10px spacing between buttons
        
        // Set alignment of the children within the HBox
        hBox.setAlignment(Pos.CENTER); // Aligns all children in the center of the HBox

        // Set padding around the HBox
        hBox.setPadding(new Insets(15)); // Adds 15px padding around the HBox

        // Add border and background (optional, for visualization)
        hBox.setStyle("-fx-border-color: black; -fx-border-width: 2px;");

        // Add some children to the HBox
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        hBox.getChildren().addAll(btn1, btn2, btn3); // Add buttons to the HBox

        // Set up the scene and stage
        Scene scene = new Scene(hBox, 300, 100); // Create a scene with a fixed size
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox Example");
        primaryStage.show();
    }
}
