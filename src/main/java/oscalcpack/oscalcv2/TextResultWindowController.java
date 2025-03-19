package oscalcpack.oscalcv2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class TextResultWindowController {

    private final MainWindowController mainWinCont;
    private Stage TxtResultControllerStage;
    @FXML
    private TextArea txtResultsWinArea;

    public TextResultWindowController(MainWindowController MainWinCont, String stageTitle) throws IOException {
        this.mainWinCont = MainWinCont;
        this.TxtResultControllerStage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TextResultWindow.fxml"));
        fxmlLoader.setController(this);
        Scene scene = new Scene(fxmlLoader.load());
        TxtResultControllerStage.setScene(scene);
        TxtResultControllerStage.setTitle(stageTitle);
        this.TxtResultControllerStage.sizeToScene();

    }

    public void showStage() {
        TxtResultControllerStage.show();

    }

    @FXML
    private void initialize() {

        // Set the label to whatever the text entered on Layout1 is
        //label2.setText("");

        // Set the action for the button
        //button2.setOnAction(event -> onButton2Click());
        //this.controller1.setlabelText("Form2 is running");
    }

    public void setTextAreaText(){
        this.txtResultsWinArea.appendText(mainWinCont.textForResultWin + "\n");
        this.txtResultsWinArea.appendText(mainWinCont.A + "\n");
        this.txtResultsWinArea.appendText(mainWinCont.B + "\n");

    }

}
