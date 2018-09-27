package hoofstuk2.opdracht3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JFXOpdracht3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flowPane = new FlowPane();
        Scene scene = new Scene(flowPane, 150, 100);

        new JFXOpdracht3Gui(flowPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("opdracht2.3");
        primaryStage.show();
    }
}
