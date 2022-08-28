module com.example.projectciclo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectciclo3 to javafx.fxml;
    exports com.example.projectciclo3;
}