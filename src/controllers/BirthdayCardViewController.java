package controllers;

import connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class BirthdayCardViewController implements Initializable {

    @FXML
    private TextField textField;

    @FXML
    private Label textLabel;

    private ConnectionClass connectionClass;
    private Connection connection;
    private Statement statement;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        connectionClass = new ConnectionClass();
    }

    public void showData(ActionEvent actionEvent) throws SQLException {

        connection = connectionClass.getConnection();

        String sql = "INSERT INTO USER VALUES('"+textField.getText()+"')";
        statement = connection.createStatement();
        statement.executeUpdate(sql);

        sql = "SELECT * FROM USER;";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            textLabel.setText(resultSet.getString(1));
        }
    }
}
