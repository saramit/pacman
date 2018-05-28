import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Driver {
	Pacman p;
	ActorWorld w;
	Grid g;
	Timer timer;


	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Driver d = new Driver();
		
		d.start();
		g = w.setGrid(new BoundedGrid());

	}

	public void start () {
		p = new Pacman();	
		w = new ActorWorld();
		p = new Pacman();
		JPanel panel = new JPanel();

		Ghost bg = new BlueGhost();
		Ghost rg = new RedGhost();
		Ghost pg = new PinkGhost();
		Ghost yg = new YellowGhost();

		w.add(p.getLoc, p);
		w.add(rg.getLocation, rg);
		w.add(pg.getLocation, pg);
		w.add(yg.getLocation, yg);
		w.add(bg.getLocation, bg);
		
		w.add(new SpecialFood());

		addSmallFood();
		int i = 0;
		while (i < 4) {
			w.add(new LargeFood());
			i++;
		}


		// swing timer tutorial:	
		// https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// do stuff
			}

		};

		timer = new Timer(100, listener);
		timer.start();

		// key binding tutorial:	+	}
		// https://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html	+	
		panel.getInputMap().put(KeyStroke.getKeyStroke("up"));
			panel.getInputMap().put(KeyStroke.getKeyStroke("down"));	
		}
		panel.getInputMap().put(KeyStroke.getKeyStroke("left"));	
		panel.getInputMap().put(KeyStroke.getKeyStroke("right"));	

		panel.getActionMap().put("up", new AbstractAction() {
			p.changeDirection(w,Direction.NORTH);
		});	
		panel.getActionMap().put("down", new AbstractAction() {	
			p.changeDirection(w,Direction.SOUTH);	
		});	
		panel.getActionMap().put("left", new AbstractAction() {	
			p.changeDirection(w,Direction.WEST);	
		});	
		panel.getActionMap().put("right", new AbstractAction() {	
			p.changeDirection(w, Direction.EAST);	
		});	

		
		
		public void addSmallFood() {

			for (Location i : getRandomEmptyLocation()) {
				w.add(new SmallFood());
			}

		}	



		public Pacman getPacman() {	
			return p;
		}

		public ActorWorld getWorld() {
			// TODO Auto-generated method stub
			return w;
		}
