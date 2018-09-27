package hoofstuk2.opdracht2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JFXOpdracht2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flowPane = new FlowPane();
        Scene scene = new Scene(flowPane, 300, 250);

        new JFXOpdracht2Gui(flowPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("opdracht2.2");
        primaryStage.show();
    }
}
