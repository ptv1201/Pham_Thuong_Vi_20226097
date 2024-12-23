package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {

	@FXML
	private Button btnPlay;

	@FXML
	private Button btnRemove;

	@FXML
	private TableColumn<?, ?> colMediaCost;

	@FXML
	private TableColumn<?, ?> colMediaTitle;

	@FXML
	private TableColumn<?, ?> colMediacategory;

	@FXML
	private ToggleGroup filterCategory;

	@FXML
	private TableView<?> tblMedia;
	
	private Cart cart;

	public CartScreenController(Cart cart) {
		super();
		this.cart = cart;
	}

	@FXML
	private void initialize() {
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
		tblMedia.setItems(this.cart.getItemsOrdered());
		tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
			@Override
			public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
				if (newValue != null) {
					updateButtonBar(newValue);
				}
			}
		});
	
	}
	void updateButtonBar(Media media) {
		btnRemove.setVisible(true);
		if (media instanceof Playable) {
			btnPlay.setVisible(true);
		} else {
			btnPlay.setVisible(false);
		}
	}
	@FXML
	void btnRemovePressed (ActionEvent event) {
	Media media = (Media) tblMedia.getSelectionModel().getSelectedItem();
	cart.removeMedia (media);
	}
	
}
