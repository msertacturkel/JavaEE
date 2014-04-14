package com.jsfcompref;

import javax.faces.event.ValueChangeListener;
import javax.faces.event.ValueChangeEvent;

public class MyValueChangeListener implements ValueChangeListener {
    public MyValueChangeListener() {
    }

    public void processValueChange(ValueChangeEvent vce) {
        System.out.println("MyValueChangeListener is processing a value change event!");
    }
}
