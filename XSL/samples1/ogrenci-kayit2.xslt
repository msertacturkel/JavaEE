<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<html>
			<body>
				<table border="1">
					<tr>
						<th>Ad</th>
						<th>Soyad</th>
					</tr>
					<xsl:apply-templates select="ogrenci-kayit/ogrenci[ad='Mine' and @no='4']"/>
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
		</tr>
	</xsl:template>
</xsl:stylesheet>
