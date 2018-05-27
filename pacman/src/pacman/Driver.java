package info.gridworld.actor;
public class Driver {
	Pacman p;
	ActorWorld w;
	Grid g;	


	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Driver d = new Driver();

		d.start();
		w.setGrid(new UnboundedGrid());

	}

	public void start () {
		p = new Pacman();	
		w = new World();
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

		// swing timer tutorial:	+		
		// https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html	+		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// do stuff	+		
			}

		};
		int i = 0;
		while (i < 4) {
			w.add(new LargeFood());
			i++;
		}
		timer = new Timer(100, listener);
		timer.start();
		w.add(new SpecialFood());

		addWalls();
		addSmallFood();

		// key binding tutorial:	+	}
		// https://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html	+	
		panel.getInputMap().put(KeyStroke.getKeyStroke("up"));	+	public void addWalls() {
			panel.getInputMap().put(KeyStroke.getKeyStroke("down"));	
		}
		panel.getInputMap().put(KeyStroke.getKeyStroke("left"));	
		panel.getInputMap().put(KeyStroke.getKeyStroke("right"));	

		panel.getActionMap().put("up", new AbstractAction() {	+	}
		p.changeDirection(w,Direction.NORTH);	+	
	});	
		panel.getActionMap().put("down", new AbstractAction() {	
			p.changeDirection(w,Direction.SOUTH);	
		});	
		panel.getActionMap().put("left", new AbstractAction() {	
			p.changeDirection(w,Direction.WEST);	
		});	
		panel.getActionMap().put("right", new AbstractAction() {	
			p.changeDirection(w,Direction.EAST);	
		});	

		public void addSmallFood() {

			for (Location i : getRandomEmptyLocation()) {
				w.add(new SmallFood());
			}

		}	



		public Pacman getPacman() {	
			return p;
		}
}