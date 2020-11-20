


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.time.LocalDate;

public class date extends Application {
    @Override public void start(Stage stage) {
        final DatePicker datePicker = new DatePicker(LocalDate.now());
        datePicker.setOnAction(event -> {
            LocalDate date = datePicker.getValue();
          System.out.println("Selected date: " + date);
        });

        stage.setScene(
            new Scene(datePicker)
        );
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
