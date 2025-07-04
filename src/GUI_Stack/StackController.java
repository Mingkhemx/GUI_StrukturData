package GUI_Stack;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StackController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tfPush, tfPop, tfStack;
    
    Stack<String> tumpukan = new Stack<>();
    
    @FXML
    private void handlePush(ActionEvent event) {
        tumpukan.push(tfPush.getText());
        tfPush.setText("");
        tfStack.setText(tumpukan.toString());
    }
    
    @FXML
    private void handlePop(ActionEvent event) {
        tfPop.setText(tumpukan.pop());
        tfStack.setText(tumpukan.toString());
    }
    
    @FXML
    private void clearAll(ActionEvent event) {
        tumpukan.clear();
        tfStack.setText(tumpukan.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}