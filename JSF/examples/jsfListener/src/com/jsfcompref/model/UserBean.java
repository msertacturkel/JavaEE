package com.jsfcompref.model;

public class UserBean 
{
String name;
String city;
String state;
String zip="";

  public UserBean()
  {
  }


  public void setName(String name)
  {
    this.name = name;
  }


  public String getName()
  {
    return name;
  }


  public void setCity(String city)
  {
    this.city = city;
  }


  public String getCity()
  {
    return city;
  }


  public void setState(String state)
  {
    this.state = state;
  }


  public String getState()
  {
    return state;
  }


  public void setZip(String zip)
  {
    this.zip = zip;
  }


  public String getZip()
  {
    return zip;
  }
}