package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.solidshop.Main;
import com.example.solidshop.IScene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartWindowController implements IScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button orderButton;

    @FXML
    void initialize() {
        orderButton.setOnAction(actionEvent -> {
            newOpenScene(orderButton, "WindowShop.fxml");
        });
    }

    @Override
    public void newOpenScene(Button button, String fxml) {
        button.getScene().getWindow().hide();

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load(), 1400, 900);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setTitle("ShopFAST");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}

