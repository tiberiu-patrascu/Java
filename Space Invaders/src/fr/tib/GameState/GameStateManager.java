package fr.tib.GameState;

import java.awt.Graphics;
import java.util.Stack;

public class GameStateManager {

	public static Stack<GameState> states;

	public GameStateManager() {
		states= new Stack<GameState>();
		states.push(new MenuStart(this));
	}
	public void tick() {
		states.peek().tick();
	}
	public void draw(Graphics g) {
		states.peek().draw(g);
	}
	public void keyPressed(int k) {
		states.peek().keyPressed(k);
	}
	public void keyReleased(int k) {
		states.peek().keyReleased(k);
	}
}
