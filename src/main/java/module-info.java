module com.alilopez.demo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alilopez.demo01 to javafx.fxml;
    exports com.alilopez.demo01;
}