package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {
	private Media media;

	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		if (media instanceof Playable) {
			JButton btnPlay = new JButton("Play");
			container.add(btnPlay);
			btnPlay.addActionListener(e -> {
				// Xử lý phát Media
				System.out.println("Playing: " + media.getTitle());
				showPlayDialog(media.getTitle());
			});
			container.add(btnPlay);
		}
		// Add to cart button
        JButton btnAddToCart = new JButton("Add to cart");
        btnAddToCart.addActionListener(e -> {
            // Xử lý thêm Media vào giỏ hàng
            System.out.println("Added to cart: " + media.getTitle());
            // Hiển thị hộp thoại thông báo
            showAddToCartDialog(media.getTitle());
        });
        container.add(btnAddToCart);

		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	// Hiển thị hộp thoại phát Media
	private void showPlayDialog(String mediaTitle) {
		javax.swing.JOptionPane.showMessageDialog(this, "Now playing: " + mediaTitle, "Play Media",
				javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}
	  // Hiển thị hộp thoại thông báo đã thêm vào giỏ hàng
    private void showAddToCartDialog(String mediaTitle) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "The item \"" + mediaTitle + "\" has been added to your cart!",
            "Add to Cart",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }
}
