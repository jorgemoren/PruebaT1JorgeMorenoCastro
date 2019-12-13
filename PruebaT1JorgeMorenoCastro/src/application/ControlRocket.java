package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket {
	
	@FXML
	private AnchorPane root, rootSalir;
	@FXML
	private ImageView ImgLogin;

	public void initialize() {

		transImg();

	}
	
	
	/**
	 * Este método sirve para abrir una nueva ventana
	 */
	@FXML	
	public void openStage() {
		
		Stage thisStage = (Stage) root.getScene().getWindow();
		thisStage.close();
		
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Urano.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Este método sirve para realizar la transicion de la foto del Login
	 */
	
	private void transImg() {
		
		FadeTransition ft = new FadeTransition(Duration.seconds(3), ImgLogin);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}
	/**
	 * Este método sirve para salir de la app
	 */
	@FXML
	public void closeApp() {
		Stage thisStage = (Stage) rootSalir.getScene().getWindow();
		thisStage.close();
	}

}