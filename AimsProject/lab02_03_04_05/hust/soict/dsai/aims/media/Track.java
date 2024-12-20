package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	//các hàm khởi tạo
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public Track(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}

// play()
	@Override
	public void play() {
		System.out.println("Phát DVD: " + this.getTitle());
		System.out.println("Độ dài DVD: " + this.getLength());
		}

}
