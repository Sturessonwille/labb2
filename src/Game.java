import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {

	private ArrayList<ColoredBox> boxes;
	private int tickcount;
	Random random;
	
	public Game(GameBoard board) {
		
		tickcount = 0;
		random = new Random();
		boxes = new ArrayList<ColoredBox>();		
		
	}

	public void update(Keyboard keyboard) {
		
		if(tickcount % 40 == 0) {
			
			boxes.add(new RedBox(random.nextInt(500), random.nextInt(300)));
			boxes.add(new GreenBox(random.nextInt(500), random.nextInt(300)));
		}
			
		
		for(ColoredBox b : boxes) {
			b.update(keyboard);
		}
		tickcount ++;
	}

	public void draw(Graphics2D graphics) {
		
		for(ColoredBox b : boxes) {
			b.draw(graphics);
			
		}
	}
}
