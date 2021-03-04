package com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPaint {
	
	JButton clearBtn, redBtn, blueBtn, blackBtn, greenBtn, magentaBtn,erase;
    Paint paint;
    ActionListener actionListener= new ActionListener(){
    	
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==clearBtn){
				paint.clear();
			}
			else if(e.getSource()==blueBtn){
				paint.blue();
			}
			else if(e.getSource()==blackBtn){
				paint.black();
			}
			else if(e.getSource()==magentaBtn){
				paint.magenta();
				}
			else if(e.getSource()==redBtn){
				paint.red();
				}
			else if(e.getSource()==greenBtn){
				paint.green();	
				}
			else if(e.getSource()==erase){
				paint.erase();
			}
		}
    	
    };
    
	public static void main(String[] args){
		new DrawPaint().show();
	}
	
	public void show(){
		JFrame frame=new JFrame("Paint");
		
		Container content=frame.getContentPane();
		content.setLayout(new BorderLayout());
		 paint= new Paint();
		content.add(paint, BorderLayout.CENTER);
		
		JPanel controls= new JPanel();
		
		clearBtn = new JButton("clear");
		clearBtn.addActionListener(actionListener);
		redBtn = new JButton("Red");
		redBtn.addActionListener(actionListener);
		blueBtn = new JButton("Blue");
		blueBtn.addActionListener(actionListener);
		blackBtn = new JButton("Black");
		blackBtn.addActionListener(actionListener);
		greenBtn = new JButton("Green");
		greenBtn.addActionListener(actionListener);
		magentaBtn = new JButton("Magenta");
		magentaBtn.addActionListener(actionListener);
		erase = new JButton("Erase");
		erase.addActionListener(actionListener);
		
		
		controls.add(blueBtn);
		controls.add(blackBtn);
		controls.add(greenBtn);
		controls.add(redBtn);
		controls.add(magentaBtn);
		controls.add(clearBtn);
		controls.add(erase);
		
		
		content.add(controls, BorderLayout.NORTH);
		frame.setSize(800,600);
		//Dimension dim =Toolkit.getDefaultToolkit().getScreenSize();
		//frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
