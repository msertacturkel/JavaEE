package com.jsfcompref.backing;

import java.util.Map;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

public class DependentList {
  HtmlSelectOneMenu inputCountry, inputCity;

// Method which returns the correct cities Map based on the value of inputCountry

public Map getCities() {
  String cityMap = "";

  if (inputCountry.getValue() != null) {
      String countryKey = inputCountry.getValue().toString();
 
    if (countryKey.equals("fr"))
      cityMap = "FrCitiesMap";
    else if (countryKey.equals("us"))
     cityMap = "UsCitiesMap";
    else if (countryKey.equals("in"))
       cityMap = "InCitiesMap";
    else
       cityMap = "EmptyCitiesMap";
  }
  else {
    cityMap = "EmptyCitiesMap";
  }

  cityMap = "#{" + cityMap + "}";

  FacesContext context = FacesContext.getCurrentInstance( );
  ValueBinding binding;
  binding = context.getApplication().createValueBinding(cityMap);
  return (Map) binding.getValue(context);
}

  public void setInputCountry(HtmlSelectOneMenu inputCountry) {
    this.inputCountry = inputCountry;
  }

  public HtmlSelectOneMenu getInputCountry() {
    return inputCountry;
  }

  public void setInputCity(HtmlSelectOneMenu inputCity) {
    this.inputCity = inputCity;
  }

  public HtmlSelectOneMenu getInputCity() {
    return inputCity;
  }

}
