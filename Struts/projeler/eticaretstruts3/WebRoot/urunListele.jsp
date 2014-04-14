<%@ page language="java" pageEncoding="ISO-8859-1"%>




<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

	<body>
		urun listele
		<%-- 
<ul>
    <c:forEach var="urun" items="${sepet.urunler}">
        <li>
            <c:out value="${urun.ad}"/>
        </li>
    </c:forEach>
</ul>
--%>
		<hr />
		<table border="1">
			<tr>
				<th>
					Urun Ad
				</th>
				<th>
					Fiyat
				</th>
			</tr>
			<logic:iterate id="urun" name="sepet" property="urunler">
				<tr>
					<td>
						<bean:write name="urun" property="urunAd" />
					</td>
					<td>
						<bean:write name="urun" property="fiyat" />
					</td>

				</tr>
			</logic:iterate>

		</table>
	</body>
</html>