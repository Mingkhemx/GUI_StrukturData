package GUI_Queue;

import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class QueueController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField tfDaftarAntrian, tfAntrianMasuk, tfAntrianKeluar;
    
    Queue<String> antrian = new LinkedList<>();
    
    @FXML
    private void masukAntrian(ActionEvent event) {
        antrian.add(tfAntrianMasuk.getText());
        tfAntrianMasuk.setText("");
        tfDaftarAntrian.setText(antrian.toString());
    }
    
    @FXML
    private void keluarAntrian(ActionEvent event) {
        tfAntrianKeluar.setText(antrian.remove());
        tfDaftarAntrian.setText(antrian.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}