module MovieBookingSystemMain {
	requires java.sql;
	requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    
    opens application to javafx.graphics, javafx.fxml;
}
