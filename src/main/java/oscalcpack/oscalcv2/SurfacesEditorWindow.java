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
/*
public class SurfacesEditorWindowController {

    private final MainWindowController mainWinCont;
    private Stage surfacesEditorControllerStage;
    @FXML
    private TextArea surfacesEditorWinArea;
    @FXML
    private Label surfacesEditorLabel1;
    @FXML
    private TextField surfacesEditorTextField1;
    @FXML
    private Button surfacesEditorButton1;

    public SurfacesEditorWindowController(MainWindowController MainWinCont) throws IOException {
        this.mainWinCont = MainWinCont;
        this.surfacesEditorControllerStage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SurfacesEditorWindow.fxml"));
        fxmlLoader.setController(this);
        Scene scene = new Scene(fxmlLoader.load());
        surfacesEditorControllerStage.setScene(scene);
        surfacesEditorControllerStage.setTitle("Редактор полей зрения ОС");
        this.surfacesEditorControllerStage.sizeToScene();
    }

    public void showStage() {
        surfacesEditorControllerStage.show();

    }

    @FXML
    private void initialize() throws IOException {

        // Set the label to whatever the text entered on Layout1 is
        //label2.setText("");

        // Set the action for the button
        //button2.setOnAction(event -> onButton2Click());
        //this.controller1.setlabelText("Form2 is running");
        //fieldsEditorButton1.setOnAction(event -> {
            //onfieldsEditorButton1Click();
        //});

    }

    public void setTextAreaText() {
        //this.fieldsEditorWinArea.appendText(mainWinCont.textForResultWin + "\n");
        //this.fieldsEditorWinArea.appendText(mainWinCont.A + "\n");
        //this.fieldsEditorWinArea.appendText(mainWinCont.B + "\n");

    }

    protected void onfieldsEditorButton1Click() {
        /*
        double val = Double.parseDouble(fieldsEditorTextField1.getText());
        this.fieldsEditorWinArea.appendText(Double.toString(val));
        this.mainWinCont.B = val;
        this.mainWinCont.textForResultWin = "Текст из редактора полей зрения";
        this.mainWinCont.setTextArea1Text();



    }
}

*/