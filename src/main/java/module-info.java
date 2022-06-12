module br.com.game.snakegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.game.snakegame to javafx.fxml;
    exports br.com.game.snakegame;
}