package Model;

import java.awt.Color;

public class Model_Color {
//	Do là "Mã màu" nên kiểu dữ liệu của foreground, background phải là Color
	private Color foreground;
	private Color background;
	private boolean opaque;
	
	public Model_Color() {
		super();
		this.foreground = Color.BLACK;
		this.background = Color.WHITE;
		this.opaque = true;
	}

	public Color getForeground() {
		return foreground;
	}

	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}

	public boolean isOpaque() {
		return opaque;
	}

	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	

}
