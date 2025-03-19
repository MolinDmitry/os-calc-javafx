module oscalcpack.oscalcv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens oscalcpack.oscalcv2 to javafx.fxml;
    exports oscalcpack.oscalcv2;
}