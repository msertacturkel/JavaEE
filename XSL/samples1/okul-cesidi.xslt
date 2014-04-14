<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:template match="/">
		<html>
			<body>
				<xsl:for-each select="okul-cesidi/okul">
					<p>
					<font face="Arial" color="red">
						<xsl:value-of select="."/>
						<!--  okul dugumunun uzerindeyiz -->
						</font>
					</p>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
