package org.zerocouplage.test.desktop.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.zerocouplage.api.controller.IZCManager;
import org.zerocouplage.impl.controller.ZCManagerFactory;

public class Redirect extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel values;
	private JFrame frame;
	private IZCManager manager;
	private JButton submit;
	public Redirect(){
		manager = ZCManagerFactory.getNewManager(this);
	}
	public void createGui() {
		frame = new JFrame();
		values=new JLabel();
		submit = new JButton("return");
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);

				try {

					try {
						manager.executeBusiness("processing3");
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (ClassNotFoundException e) {

					e.printStackTrace();

				}

			}
		});
		this.add(submit);
		frame.setContentPane(this);
		frame.setTitle("Redirection");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args){
		Redirect frame=new Redirect();
		frame.createGui();
	}

}
