package com.winfirst.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	
	private boolean[] keys;
	public boolean w, a, s, d, space;
	
	public KeyManager(){
		keys = new boolean[256];
	}
	
	public void ticks(){
		
		w = keys[KeyEvent.VK_W];
		a = keys[KeyEvent.VK_A];
		s = keys[KeyEvent.VK_S];
		d = keys[KeyEvent.VK_D];
		space = keys[KeyEvent.VK_SPACE];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}
}
