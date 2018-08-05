package com.zetcode;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel{
	
	private Image bardejov;
	
	public Board() {
		initBoard();
	}
	
	private void initBoard() {
		loadImage();
		
		int w = bardejov.getWidth(this);
		int h = bardejov.getHeight(this);
		setPreferredSize(new Dimension(w, h));
	}

	private void loadImage() {
		
		ImageIcon ii = new ImageIcon("src/resouces/eiffel-tower-priority.png");
		bardejov = ii.getImage();
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(bardejov, 0, 0, null);
	}
}