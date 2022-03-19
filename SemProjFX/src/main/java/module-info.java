module app.semprojfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens app.semprojfx to javafx.fxml;
    exports app.semprojfx;
}