package GUI_LinkedList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class LinkedListController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tfLinkedList, tfAdd;
    
    @FXML
    private Button addFirstButton, addLastButton, removeFirstButton, 
                   removeLastButton, clearAllButton;
    
    // LinkedList to store data
    private LinkedList<String> dataLL = new LinkedList<>();
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize the display
        updateDisplay();
    }
    
    @FXML
    private void AddFirst(ActionEvent event) {
        String value = tfAdd.getText().trim();
        if (!value.isEmpty()) {
            dataLL.addFirst(value);
            updateDisplay();
            tfAdd.setText("");
        } else {
            showAlert("Error", "Please enter a value to add!");
        }
    }
    
    @FXML
    private void AddLast(ActionEvent event) {
        String value = tfAdd.getText().trim();
        if (!value.isEmpty()) {
            dataLL.addLast(value);
            updateDisplay();
            tfAdd.setText("");
        } else {
            showAlert("Error", "Please enter a value to add!");
        }
    }
    
    @FXML
    private void RemoveFirst(ActionEvent event) {
        if (!dataLL.isEmpty()) {
            String removedValue = dataLL.removeFirst();
            updateDisplay();
            showAlert("Success", "Removed: " + removedValue);
        } else {
            showAlert("Error", "LinkedList is empty!");
        }
    }
    
    @FXML
    private void RemoveLast(ActionEvent event) {
        if (!dataLL.isEmpty()) {
            String removedValue = dataLL.removeLast();
            updateDisplay();
            showAlert("Success", "Removed: " + removedValue);
        } else {
            showAlert("Error", "LinkedList is empty!");
        }
    }
    
    @FXML
    private void ClearAll(ActionEvent event) {
        if (!dataLL.isEmpty()) {
            dataLL.clear();
            updateDisplay();
            showAlert("Success", "All data cleared!");
        } else {
            showAlert("Info", "LinkedList is already empty!");
        }
    }
    
    private void updateDisplay() {
        if (dataLL.isEmpty()) {
            tfLinkedList.setText("LinkedList is empty");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < dataLL.size(); i++) {
                sb.append(dataLL.get(i));
                if (i < dataLL.size() - 1) {
                    sb.append(",");
                }
            }
            tfLinkedList.setText(sb.toString());
        }
    }
    
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}