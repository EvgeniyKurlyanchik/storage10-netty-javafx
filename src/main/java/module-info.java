module ru.gb {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.netty.buffer;
    requires io.netty.transport;

    opens ru.gb.clientStorage to javafx.fxml;
    exports ru.gb.clientStorage to javafx.fxml;
}
