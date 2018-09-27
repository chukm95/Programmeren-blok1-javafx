package hoofstuk2.opdracht1;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class JFXOpdracht1Gui {

    private final Button knop1, knop2;
    private final TextField tekstvak;

    public JFXOpdracht1Gui(FlowPane flowPane){
        knop1 = new Button("Klik");
        knop2 = new Button("Veeg uit");

        tekstvak = new TextField();

        knop1.setOnAction(e->{
            tekstvak.setText("Je hebt geklikt!");
        });
        knop2.setOnAction(e->{
            tekstvak.setText("");
        });

        flowPane.getChildren().addAll(knop1, tekstvak, knop2);
    }
}
