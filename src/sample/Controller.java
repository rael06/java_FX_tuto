package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField myField;

    @FXML
    private Button myButton;

    @FXML
    private void onClick() {
        myButton.setDisable(true);
        myField.setText("hello world");
    }
}
