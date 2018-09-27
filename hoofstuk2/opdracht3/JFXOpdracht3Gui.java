package hoofstuk2.opdracht3;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;


public class JFXOpdracht3Gui {
    private final TextField tekstVak;
    private final Button knop1, knop2, knop3;

    public JFXOpdracht3Gui(FlowPane flowPane){
        tekstVak = new TextField();
        knop1 = new Button("    1    ");
        knop2 = new Button("    2    ");
        knop3 = new Button("    3    ");

        knop1.setOnAction(e->{
            tekstVak.setText("antwoord1");
        });
        knop2.setOnAction(e->{
            tekstVak.setText("antwoord2");
        });
        knop3.setOnAction(e->{
            tekstVak.setText("antwoord3");
        });

        flowPane.getChildren().addAll(tekstVak, knop1, knop2, knop3);
    }

}
