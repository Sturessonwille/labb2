import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

public class ColoredBox extends Sprite {
	
	Random random;
	
	private Color color;

	public ColoredBox(int x, int y, Color color) {
		super(x, y, 20, 20);
		random = new Random();
		this.color = color;
		
	}

	@Override
	public void update(Keyboard keyboard) {
		
		
	
	}

	@Override
	public void draw(Graphics2D graphics) {
		
		graphics.setColor(color);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}

}
