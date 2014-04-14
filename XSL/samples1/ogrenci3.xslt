<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:template match="/">
		<html>
			<body>
				<table border="1">
					<tr>
						<td>Ad</td>
						<td>Soyad</td>
						<td>No</td>
					</tr>
					<xsl:apply-templates select="ogrenci-kayit/ogrenci[ad='Mine']"/>
				</table>
			</body>
		</html>
	</xsl:template>
	<xsl:template match="ogrenci">
		<tr>
			<td>
				<xsl:value-of select="ad"/>
			</td>
			<td>
				<xsl:value-of select="soyad"/>
			</td>
			<td>
				<xsl:value-of select="@no"/>
			</td>
		</tr>
	</xsl:template>
</xsl:stylesheet>
