/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testVente;

import Comptabilité.Facture;
import Comptabilité.Paiement;
import java.net.URL;
import java.time.Instant;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class FXMLFactureController implements Initializable {
      Paiement P1;
    
    @FXML
    private TextField txtNumFact;
    @FXML
   

    
    private void afficher(ActionEvent event) {
       String text = txtNumFact.getText();
        int numero = Integer.parseInt(text);
        Facture r = P1.chercher(numero);
        Alert dia = new Alert(Alert.AlertType.INFORMATION, r.toString(), ButtonType.OK);
        dia.setHeaderText("Message");
        dia.setTitle("facture");
        dia.setContentText("Message");
        dia.show();
        //lbl.setText("salut");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        P1 = new Paiement(new Date(2023, 4, 3));
        Facture F1 = new Facture(100, 250.8F, 17.F);
        Facture F2 = new Facture(204, 314.7F, 15.F);
        P1.ajouterFacture(F1);
        P1.ajouterFacture(F2);
    }

}
