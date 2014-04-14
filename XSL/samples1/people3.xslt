<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:template match="people">
		<people>
			<xsl:apply-templates select="name"/>
			<!-- name'leri tarar buldukca alltaki name template'ine dallanir (bu da for-each dongusu gibidir) -->
		</people>
	</xsl:template>
	<xsl:template match="name">
		<name>
			<!-- tum alt elemanlari tarar -->
			<xsl:for-each select="*">
				<xsl:attribute name="{name()}"><xsl:value-of select="."/></xsl:attribute>
			</xsl:for-each>
			<!-- tum attributelari tarar-->
			<xsl:for-each select="@*">
				<xsl:attribute name="{name()}"><xsl:value-of select="."/></xsl:attribute>
			</xsl:for-each>
		</name>
	</xsl:template>
</xsl:stylesheet>
