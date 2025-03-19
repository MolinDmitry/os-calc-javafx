package oscalcpack.oscalcv2;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

/*
* Описание структуры приложения.
*
* Приложение имеет одно главное окно MainWindow
* Из главного окна запускаются:
*   - окно редактора общих параметров GeneralEditorWindow
*   - окно редактора полей зрения FieldsEditorWindow
*   - окно редактора длин волн WavelengthEditorWindow
*   - окно редактора поверхностей SurfacesEditorWindow
*   - окно текстовых результатов TextResultWindow
*   - окно отображения оптической схемы LayoutWindow
*   - окно отображения графиков GraphWindow
*
* Каждое из окон имеет свой собственный контроллер
*
* */



public class OSCalcApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MainWindowController MainWinCont1 = new MainWindowController();
        MainWinCont1.showStage();
    }



    public static void main(String[] args) {
        launch();
    }
}