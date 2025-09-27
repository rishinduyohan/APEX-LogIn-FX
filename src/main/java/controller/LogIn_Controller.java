package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogIn_Controller {
    public TextField txtUsername;
    public PasswordField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        System.out.println("Username : "+txtUsername.getText()+"\nPassword : "+txtPassword.getText());
    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }
}
