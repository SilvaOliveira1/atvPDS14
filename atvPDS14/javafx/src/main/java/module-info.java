module br.edu.fapce {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.fapce to javafx.fxml;
    exports br.edu.fapce;
}