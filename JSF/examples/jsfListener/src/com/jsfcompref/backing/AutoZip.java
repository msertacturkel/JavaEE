package com.jsfcompref.backing;

import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

public class AutoZip {

    // Declare HtmlInputText components to bind with page components
    
    private HtmlInputText inputName, inputZip, inputCity, inputState;
    private HtmlInputTextarea moreInfo;
    private HtmlSelectBooleanCheckbox renderInfoBox;
    boolean infoRendered = false;


    public void autoZipListener(ValueChangeEvent vce) {
        // TODO: implement city/state lookup logic
        
        // For this example, just hard code to San Jose, California
        inputCity.setValue("San Jose");
        inputState.setValue("California");
        System.out.println("Setting city and state...");
        
         // Jump directly to the Render Response phase to avoid validation
        System.out.println("Jumping to render response phase..");
        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
    }


    public void toggleMoreInfo(ValueChangeEvent vce) {
        System.out.println("toggling...");
        infoRendered = !infoRendered;
        FacesContext.getCurrentInstance().renderResponse();
    }

    // Property setters and getters
     public void setInputName(HtmlInputText inputName) {
         this.inputName = inputName;
     }


     public HtmlInputText getInputName() {
         return inputName;
     }
    
    public void setInputZip(HtmlInputText inputZip) {
        this.inputZip = inputZip;
    }


    public HtmlInputText getInputZip() {
        return inputZip;
    }


    public void setInputCity(HtmlInputText inputCity) {
        this.inputCity = inputCity;
    }


    public HtmlInputText getInputCity() {
        return inputCity;
    }


    public void setInputState(HtmlInputText inputState) {
        this.inputState = inputState;
    }


    public HtmlInputText getInputState() {
        return inputState;
    }




    public void setMoreInfo(HtmlInputTextarea moreInfo) {
        this.moreInfo = moreInfo;
    }


    public HtmlInputTextarea getMoreInfo() {
        return moreInfo;
    }


    public void setInfoRendered(boolean infoRendered) {
        this.infoRendered = infoRendered;
    }


    public boolean isInfoRendered() {
        return infoRendered;
    }


    public void setRenderInfoBox(HtmlSelectBooleanCheckbox renderInfoBox) {
        this.renderInfoBox = renderInfoBox;
    }


    public HtmlSelectBooleanCheckbox getRenderInfoBox() {
        return renderInfoBox;
    }

}
