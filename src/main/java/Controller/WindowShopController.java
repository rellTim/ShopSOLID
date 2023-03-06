package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.example.solidshop.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WindowShopController implements IScene, INotification {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox boxBread;

    @FXML
    private CheckBox boxMeat;

    @FXML
    private CheckBox boxMilk;

    @FXML
    private Button buttonAddToCart;

    @FXML
    private Button buttonCart;

    @FXML
    private TextField quantityOfBread;

    @FXML
    private TextField quantityOfMeat;

    @FXML
    private TextField quantityOfMilk;

    static List<Meal> list = new ArrayList<>();

    @FXML
    void initialize() {
        buttonAddToCart.setOnAction(actionEvent -> {
            try {
                if (boxMeat.isSelected() && quantityOfMeat.getText() != null)
                    list.add(new Meat(Integer.parseInt(quantityOfMeat.getText())));
                if (boxMilk.isSelected() && quantityOfMilk.getText() != null)
                    list.add(new Milk(Integer.parseInt(quantityOfMilk.getText())));
                if (boxBread.isSelected()&& quantityOfBread.getText() != null)
                    list.add(new Bread(Integer.parseInt(quantityOfBread.getText())));
            } catch (IllegalArgumentException e) {
                notification("Ошибка", "Вы не верно ввели количество продуктов");
                list.removeAll(list);
            }
            if (!list.isEmpty()) {
                notification("Корзина", "Успешно: продукты отправлены в корзину");
            }
        });
        buttonCart.setOnAction(actionEvent -> {
            newOpenScene(buttonCart, "ButtonNotification.fxml");
        });
    }


    @Override
    public void newOpenScene(Button button, String fxml) {
        button.getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load(), 600, 400);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setTitle("ShopFAST");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
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
