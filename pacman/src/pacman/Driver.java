package pacman;

public class Driver {
	Pacman p;
	World w;
	Grid g;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		
		d.start();

	}
	
	public void start () {
		p = new Pacman();
		w = new World();
		g = w.getGrid();
		JPanel panel = new JPanel();
		
		// swing timer tutorial:
		// https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// do stuff
			}
		};
		timer = new Timer(100, listener);
		timer.start();
		
		
		// key binding tutorial:
		// https://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html
		panel.getInputMap().put(KeyStroke.getKeyStroke("up"));
		panel.getInputMap().put(KeyStroke.getKeyStroke("down"));
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
			p.changeDirection(w,Direction.EAST);
		});
		
		
	}
	
	
	
	public Pacman getPacman() {
		return p;
	}
	
	public World getWorld() {
		return w;
	}

}
