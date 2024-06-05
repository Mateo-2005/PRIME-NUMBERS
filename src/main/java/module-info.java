module com.example.primenumbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primenumbers to javafx.fxml;
    exports com.example.primenumbers;
    exports com.example.primenumbers_n;
    opens com.example.primenumbers_n to javafx.fxml;
}