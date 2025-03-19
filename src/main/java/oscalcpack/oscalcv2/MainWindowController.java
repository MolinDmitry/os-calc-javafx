package oscalcpack.oscalcv2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
    private final Stage MainWindowStage;

    @FXML
    private TextArea textArea1;
    @FXML
    private TextArea textArea2;
    @FXML
    private Label StatusLabel1;
    @FXML
    private MenuItem MenuItemShowParam;
    @FXML
    private Label StatusLabel2;
    @FXML
    private MenuItem MenuItemCardinalPoints;
    @FXML
    private MenuItem MenuItemRayFanAbberations;

    @FXML
    private MenuItem MenuItemGeneralParameters;
    @FXML
    private MenuItem MenuItemFields;
    @FXML
    private MenuItem MenuItemWavelengths;
    @FXML
    private MenuItem MenuItemSurfaces;

    public String textForResultWin;
    public int A;
    public double B;

    public MainWindowController() throws IOException {
        this.MainWindowStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(OSCalcApplication.class.getResource("MainWindow.fxml"));
        fxmlLoader.setController(this);
        Scene scene = new Scene(fxmlLoader.load());
        this.MainWindowStage.setTitle("OSCalc ver. 0.2");
        this.MainWindowStage.setScene(scene);
        this.MainWindowStage.sizeToScene();
    }

    @FXML
    private void initialize() throws IOException {
        MenuItemShowParam.setOnAction(event-> {
            try {
                onMenuItemShowParamClick();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        MenuItemGeneralParameters.setOnAction(event-> {
            try {
                onMenuItemGeneralParametersClick();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        MenuItemFields.setOnAction(event-> {
            try {
                onMenuItemFieldsClick();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        MenuItemWavelengths.setOnAction(event-> {
            try {
                onMenuItemWavelengthsClick();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }

    public void showStage() {
        this.MainWindowStage.show();
    }

    @FXML
    protected void onMenuItemShowParamClick() throws IOException {
        //textArea1.setText("Парметры ОС");
        // Создаем контроллер окна отображения результатов
        TextResultWindowController txtResWinCont = new TextResultWindowController(this, "Параметры ОС");
        txtResWinCont.showStage();
        textForResultWin = "Параметры ОС";
        A = 1;
        B = 0.12345;
        txtResWinCont.setTextAreaText();
    }

    @FXML
    protected void onMenuItemGeneralParametersClick() throws IOException {
        //textArea1.setText("Парметры ОС");
        // Создаем контроллер окна отображения результатов
        GeneralEditorWindowController genEditorWinCont = new GeneralEditorWindowController(this);
        genEditorWinCont.showStage();
        textForResultWin = "Окно редактора основных параметров";
        A = 2;
        B = 0.2568;
        genEditorWinCont.setTextAreaText();
    }

    @FXML
    protected void onMenuItemFieldsClick() throws IOException {
        //textArea1.setText("Парметры ОС");
        // Создаем контроллер окна отображения результатов
        FieldsEditorWindowController fieldsEditorWinCont = new FieldsEditorWindowController(this);
        fieldsEditorWinCont.showStage();
        textForResultWin = "Окно редактора полей зрения ОС";
        A = 2;
        B = 0.3568;
        fieldsEditorWinCont.setTextAreaText();
    }

    @FXML
    protected void onMenuItemWavelengthsClick() throws IOException {
        //textArea1.setText("Парметры ОС");
        // Создаем контроллер окна отображения результатов
        WavelengthEditorWindowController waveEditorWinCont  = new WavelengthEditorWindowController(this);
        waveEditorWinCont.showStage();
        textForResultWin = "Окно редактора полей зрения ОС";
        A = 2;
        B = 0.3568;
        waveEditorWinCont.setTextAreaText();
    }

    @FXML
    protected void onMenuItemSurfacesClick() throws IOException {

    }

    public void setTextArea1Text(){
        this.textArea1.appendText("text for result win: " + this.textForResultWin + "\n");
        this.textArea1.appendText("A: " + this.A + "\n");
        this.textArea1.appendText("B: " + this.B + "\n");
    }
}