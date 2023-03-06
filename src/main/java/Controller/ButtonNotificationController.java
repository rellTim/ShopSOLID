package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.solidshop.INotification;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ButtonNotificationController implements INotification {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea basketValue;

    @FXML
    private TextArea finalCount;

    @FXML
    private Button payment;

    @FXML
    void initialize() {
        basketValue.setText(WindowShopController.list.toString());
        payment.setOnAction(actionEvent -> {
            notification("Корзина", "Спасибо за покупку");
        });
        WindowShopController.list.removeAll(WindowShopController.list);
    }

    @Override
    public void notification(String nameNotification, String name) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(nameNotification);
        alert.setHeaderText(null);
        alert.setContentText(name);
        alert.showAndWait();
    }
}
