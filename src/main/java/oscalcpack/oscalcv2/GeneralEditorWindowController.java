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

public class GeneralEditorWindowController {

    private final MainWindowController mainWinCont;
    private Stage generalEditorControllerStage;
    @FXML
    private TextArea generalEditorWinArea;
    @FXML
    private Label generalEditorLabel1;
    @FXML
    private TextField generalEditorTextField1;
    @FXML
    private Button generalEditorButton1;

    public GeneralEditorWindowController(MainWindowController MainWinCont) throws IOException {
        this.mainWinCont = MainWinCont;
        this.generalEditorControllerStage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GeneralEditorWindow.fxml"));
        fxmlLoader.setController(this);
        Scene scene = new Scene(fxmlLoader.load());
        generalEditorControllerStage.setScene(scene);
        generalEditorControllerStage.setTitle("Редактор основных параметров ОС");
        this.generalEditorControllerStage.sizeToScene();

    }

    public void showStage() {
        generalEditorControllerStage.show();

    }

    @FXML
    private void initialize() throws IOException {

        // Set the label to whatever the text entered on Layout1 is
        //label2.setText("");

        // Set the action for the button
        //button2.setOnAction(event -> onButton2Click());
        //this.controller1.setlabelText("Form2 is running");
        generalEditorButton1.setOnAction(event-> {
            ongeneralEditorButton1Click();
        });

    }

    public void setTextAreaText(){
        this.generalEditorWinArea.appendText(mainWinCont.textForResultWin + "\n");
        this.generalEditorWinArea.appendText(mainWinCont.A + "\n");
        this.generalEditorWinArea.appendText(mainWinCont.B + "\n");

    }

    protected void ongeneralEditorButton1Click(){
        double val = Double.parseDouble(generalEditorTextField1.getText());
        this.generalEditorWinArea.appendText(Double.toString(val));
        this.mainWinCont.B = val;
        this.mainWinCont.textForResultWin = "Текст из редактора общих параметров";
        this.mainWinCont.setTextArea1Text();

    }




}
