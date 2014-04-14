<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="weeklyWeather" 
            class="com.yourcompany.struts.WeeklyWeather"/>
<html>

<body bgcolor="white">
<div align="center">
  <hr />
  <h3>Color Bar Chart (vertical)</h3>
  <table height="500" width="60%">
    <tr>
      <logic:iterate id="dayEntry" 
                   name="weeklyWeather" 
               property="weekForecast">
        <td valign="bottom">
          <table height='<bean:write name="dayEntry" 
                                 property="chancePrecip"/>%' 
                  width="100%" bgcolor="#003366">
            <tr>
              <td align="center" valign="top">
                <font color="white">
                  <bean:write name="dayEntry" 
                          property="chancePrecip"/>%
                </font>
              </td>
            </tr>
          </table>
        </td>
      </logic:iterate>
    </tr>
    <tr align="center" height="10%">
      <logic:iterate id="dayEntry" 
                   name="weeklyWeather" 
               property="weekForecast">
        <td align="center" width="50">
          <bean:write name="dayEntry" property="day"/>
        </td>
      </logic:iterate>
    </tr>
  </table>
</div>
</body>
</html>
