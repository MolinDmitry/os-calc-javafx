package oscalcpack.oscalcv2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class WavelengthEditorWindowController {

    private final MainWindowController mainWinCont;
    private Stage wavelengthEditorControllerStage;
    @FXML
    private TextArea wavelengthEditorWinArea;
    @FXML
    private Label wavelengthEditorLabel1;
    @FXML
    private TextField wavelengthEditorTextField1;
    @FXML
    private Button wavelengthEditorButton1;

    public WavelengthEditorWindowController(MainWindowController MainWinCont) throws IOException {
        this.mainWinCont = MainWinCont;
        this.wavelengthEditorControllerStage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WavelengthEditorWindow.fxml"));
        fxmlLoader.setController(this);
        Scene scene = new Scene(fxmlLoader.load());
        wavelengthEditorControllerStage.setScene(scene);
        wavelengthEditorControllerStage.setTitle("Редактор длин волн");
        this.wavelengthEditorControllerStage.sizeToScene();
    }

    public void showStage() {
        wavelengthEditorControllerStage.show();

    }

    @FXML
    private void initialize() throws IOException {

        // Set the label to whatever the text entered on Layout1 is
        //label2.setText("");

        // Set the action for the button
        //button2.setOnAction(event -> onButton2Click());
        //this.controller1.setlabelText("Form2 is running");
        wavelengthEditorButton1.setOnAction(event -> {
            onwavelengthEditorButton1Click();
        });

    }

    public void setTextAreaText() {
        this.wavelengthEditorWinArea.appendText(mainWinCont.textForResultWin + "\n");
        this.wavelengthEditorWinArea.appendText(mainWinCont.A + "\n");
        this.wavelengthEditorWinArea.appendText(mainWinCont.B + "\n");

    }

    protected void onwavelengthEditorButton1Click() {
        double val = Double.parseDouble(wavelengthEditorTextField1.getText());
        this.wavelengthEditorWinArea.appendText(Double.toString(val));
        this.mainWinCont.B = val;
        this.mainWinCont.textForResultWin = "Текст из редактора длин волн";
        this.mainWinCont.setTextArea1Text();

    }
}
