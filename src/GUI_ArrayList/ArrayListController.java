package GUI_ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ArrayListController implements Initializable {
    
    @FXML
    private TextField tfHasil;
    
    @FXML
    private TextField tfIndex;
    
    @FXML
    private TextField tfValue;
    
    ArrayList<String> daftarData = new ArrayList<>();
    
    @FXML
    private void tambahData (ActionEvent event) {
        if (tfIndex.getText().equals("")) daftarData.add(tfValue.getText());
        else daftarData.add(Integer.valueOf(tfIndex.getText()), tfValue.getText());
        tfValue.setText("");
        tfHasil.setText(daftarData.toString());
    }
    
    @FXML
    private void editData (ActionEvent event) {
        daftarData.set(Integer.valueOf(tfIndex.getText()), tfValue.getText());
        tfIndex.setText("");
        tfValue.setText("");
        tfHasil.setText(daftarData.toString());
    }
    
    @FXML
    private void hapusData (ActionEvent event) {
        if(!tfIndex.getText().equals("")) daftarData.remove(Integer.valueOf(tfValue.getText()));
        else daftarData.remove(Integer.parseInt(tfValue.getText()));
        tfIndex.setText("");
        tfValue.setText("");
        tfHasil.setText(daftarData.toString());
    }
    
    @FXML
    private void clearAllData (ActionEvent event) {
        daftarData.clear();
        tfHasil.setText(daftarData.toString());
    }
    
    @FXML
    private void saveAsXML (ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}