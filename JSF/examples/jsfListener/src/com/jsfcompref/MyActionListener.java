package com.jsfcompref;

import javax.faces.event.ActionListener;
import javax.faces.event.ActionEvent;

public class MyActionListener implements ActionListener {


    public MyActionListener() {
    }

    public void processAction(ActionEvent ae)  {
        System.out.println("MyActionListener processing an action event!");
    }


}
