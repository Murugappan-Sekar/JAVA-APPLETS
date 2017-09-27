import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class slider extends JApplet{

	JPanel panel;
	JSlider r,g,b;
	class SliderControl implements ChangeListener {
	    public void stateChanged(ChangeEvent e) {
	       panel.setBackground(new Color(r.getValue(),g.getValue(),b.getValue()));
	    }
	}
	SliderControl sc;
	public void init(){
		r=new JSlider(0,255,0);
		g=new JSlider(0,255,0);
		b=new JSlider(0,255,0);
		r.setMinorTickSpacing(3);  
		r.setMajorTickSpacing(15);  
		r.setPaintTicks(true);  
		r.setPaintLabels(true);
		r.setForeground(Color.red);
		r.setBackground(Color.white);
		g.setMinorTickSpacing(3);  
		g.setMajorTickSpacing(15);  
		g.setPaintTicks(true);  
		g.setPaintLabels(true);
		g.setForeground(Color.green);
		g.setBackground(Color.white);
		b.setMinorTickSpacing(3);  
		b.setMajorTickSpacing(15);  
		b.setPaintTicks(true);  
		b.setPaintLabels(true);
		b.setForeground(Color.blue);
		b.setBackground(Color.white);
		sc=new SliderControl();
		add(r);
		add(g);
		add(b);
		r.addChangeListener(sc);
		g.addChangeListener(sc);
		b.addChangeListener(sc);
		panel=new JPanel();     
        panel.setBackground(Color.white);
        add(panel);
		setLayout(new GridLayout(4,1));
	}
}