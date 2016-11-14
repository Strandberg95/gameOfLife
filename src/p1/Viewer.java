package p1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Viewer extends JPanel implements IconListener {
	private JLabel lblIcon = new JLabel();
	
	public Viewer(int width, int height) {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		lblIcon.setOpaque(true);
		add(lblIcon);
		setPreferredSize(new Dimension(width,height));
		
	}
	
	public Viewer(IconManager iconManager, int width, int height) {
		this(width,height);
		iconManager.addIconListener(this);
	}

	public void setIcon(Icon icon) {
		lblIcon.setIcon(icon);
	}

	public void newIcon(Icon icon) {
		setIcon(icon);
		
	}
}
