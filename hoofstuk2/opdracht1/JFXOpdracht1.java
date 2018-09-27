package hoofstuk2.opdracht1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JFXOpdracht1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flowPane = new FlowPane();
        Scene scene = new Scene(flowPane, 300,250);

        new JFXOpdracht1Gui(flowPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("opdracht2.1");
        primaryStage.show();
    }
}
