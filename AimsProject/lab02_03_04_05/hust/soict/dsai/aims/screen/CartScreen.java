
package hust.soict.dsai.aims.screen;

import java.io.IOException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CartScreen extends Application {
    private static Cart cart;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Đường dẫn đến file FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/dsai/aims/screen/Cart.fxml"));
            // Gắn controller
            CartScreenController controller = new CartScreenController(cart);
            loader.setController(controller);
            
            // Load giao diện từ FXML
            Parent root = loader.load();
            
            // Thiết lập và hiển thị giao diện
            primaryStage.setTitle("Cart");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Khởi tạo dữ liệu giỏ hàng
        cart = new Cart();
        cart.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        cart.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f));
        cart.addMedia(new DigitalVideoDisc("Aladin", "Animation", 18.99f));
        cart.addMedia(new Book("Banh troi nuoc", "Ho Xuan Huong"));
        cart.addMedia(new Book("Doraemon", "Anime", 10.00f));
        cart.addMedia(new CompactDisc("Power"));

        // Chạy ứng dụng JavaFX
        launch(args);
    }
}

