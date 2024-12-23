package hust.soict.dsai.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
	private boolean isEraser = false;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }
    @FXML
    void penSelected(ActionEvent event) {
        isEraser = false; // Switch to Pen mode
    }

    @FXML
    void eraserSelected(ActionEvent event) {
        isEraser = true; // Switch to Eraser mode
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	 Color color = isEraser ? Color.WHITE : Color.BLACK;

    	Circle newCircle = new Circle(event.getX(),event.getY(), 4, color);
    			drawingAreaPane.getChildren().add(newCircle);
    }
}
