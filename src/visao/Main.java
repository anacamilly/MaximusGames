package visao;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stagePrincipal) throws Exception {
        
		Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));
        Scene scene = new Scene(root);
        stagePrincipal.setScene(scene); 
        stagePrincipal.setTitle("Maximus Games");
        stagePrincipal.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
