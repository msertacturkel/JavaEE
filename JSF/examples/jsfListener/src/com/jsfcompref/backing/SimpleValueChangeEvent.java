package com.jsfcompref.backing;

import javax.faces.event.ValueChangeEvent;

public class SimpleValueChangeEvent {
    public SimpleValueChangeEvent() {
    }

    public void simpleValueChangedListener(ValueChangeEvent valueChangeEvent) {
       System.out.println("In value change listener method.");
    }
}
