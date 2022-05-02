module ru.gb.chatgb {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.chatgb to javafx.fxml;
    exports ru.gb.chatgb;
}