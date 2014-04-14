<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body bgcolor="white">
<div align="center">
  <hr />
  <h3>Color Bar Chart (horizontal)</h3>
  <jsp:useBean id="weeklyWeather" 
            class="com.yourcompany.struts.WeeklyWeather"/>
  <table border="0" width="60%">
  <logic:iterate id="dayEntry" name="weeklyWeather" property="weekForecast">
    <tr>
      <td align="right" width="20%">
        <bean:write name="dayEntry" property="day"/></td>
      <td align="left" width="80%">
        <table width='<bean:write name="dayEntry" 
                              property="chancePrecip"/>%' 
             bgcolor="red">
          <tr>
            <td align="right">
              <font color="white">
                <bean:write name="dayEntry" 
                        property="chancePrecip"/>%
            </font>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </logic:iterate>
  </table>
</div>
</body>
</html>
