import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.print.attribute.standard.DateTimeAtCompleted;
/*
* Webserver:
* http://localhost:80/dashboard/
* http://Mojaves-MacBook-Pro.local:80/dashboard/
* http://192.168.1.128:80/dashboard/
*
Xem ip máy của mình:
* 1.hostname
* 2. ping ten_may_tinh
Connect DB:
* "duong dan den file mysql" -u root -p
* VD macos:
* /Applications/XAMPP/bin/mysql -u root -p
*
*
* */

public class Main extends Application {
    public static void main(String[] args) {
        Database.getInstance().testSQL();
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Login login = new Login();
        //login.setupUI();
        login.show();
    }
}
