package org.cdernek.iceface;

import com.icesoft.faces.component.dragdrop.DragEvent;

public class DragDropBean {
	private String dragMessage = "";
	
	public void dragListener(DragEvent dragEvent){
	        dragMessage += DragEvent.getEventName(dragEvent.getEventType()) + ", ";
	}

	public String getDragMessage () {
	        return dragMessage;
	}
}
