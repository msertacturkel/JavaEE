<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<people>
			<xsl:apply-templates select="people/name"/>
			<!-- name'leri tarar buldukca alltaki name template'ine dallanir (bu da for-each dongusu gibidir) -->
		</people>
	</xsl:template>
	<xsl:template match="name">
		<name>
			<xsl:for-each select="@*">
				<!-- tum attributelari tarar-->
				<xsl:element name="{name()}">
					<xsl:value-of select="."/>
				</xsl:element>				
			</xsl:for-each>
		</name>
	</xsl:template>
</xsl:stylesheet>
