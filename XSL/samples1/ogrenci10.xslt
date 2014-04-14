<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:template match="/">
		<html>
			<body>
				<table border="1">
					<xsl:for-each select="ogrenci-kayit/ogrenci">
						<tr>
							<xsl:for-each select="*">
								<td>
									<xsl:value-of select="."/>
								</td>
							</xsl:for-each>
							<td>
								<xsl:value-of select="@no"/>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
