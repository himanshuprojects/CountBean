/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
 import java.awt.event.*; 
 
import java.beans.*;




public class CountBean extends Panel implements ActionListener {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
   
    int i=0;
    private PropertyChangeSupport propertySupport;
    Button bt=new Button("count");
    TextField tf=new TextField(4);
    Label l=new Label("count");
    public CountBean() 
    {
       
        add(l);
        add(tf);
         add(bt);
         bt.setBackground(Color.green);
        bt.addActionListener(this);
   
        setSize(200,200);
        setLayout(new GridLayout(2,1,5,10));
        //propertySupport = new PropertyChangeSupport(this);
    }
  
  
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent     e) {
       String ac=e.getActionCommand();
       if(ac.equals("count"))
       {
           tf.setText(""+(++i));
       }
    }

   
 
    
}
