package hoofstuk2.opdracht2;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class JFXOpdracht2Gui {
    private final Button knopVoornaam, knopAchternaam;
    private final TextField tekstVakVoornaam, tekstVakAchternaam;

    public JFXOpdracht2Gui(FlowPane flowPane){
        knopVoornaam = new Button("Voornaam");
        knopAchternaam = new Button("Achternaam");

        tekstVakVoornaam = new TextField();
        tekstVakAchternaam = new TextField();

        knopVoornaam.setOnAction(e->{
            tekstVakVoornaam.setText("Jesse");
        });
        knopAchternaam.setOnAction(e->{
            tekstVakAchternaam.setText("M******e");
        });

        flowPane.getChildren().addAll(knopVoornaam, tekstVakVoornaam, knopAchternaam, tekstVakAchternaam);
    }
}
