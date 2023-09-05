package ch09.part01.main9;

import javax.swing.JFrame;

public class MainView extends JFrame {
	public MainView(String title, int width, int height, int x, int y){
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocation(x, y);
    }
}
