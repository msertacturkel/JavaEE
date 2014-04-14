<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" indent="yes"/>
	<xsl:template match="/">
		<ogrenci-kayit>
			<xsl:apply-templates select="ogrenci-kayit/ogrenci"/>
		</ogrenci-kayit>
	</xsl:template>
	<xsl:template match="ogrenci">
		<ogrenci>
			<xsl:for-each select="*">
				<xsl:choose>
					<xsl:when test="name()='dogYer'  or name()='veliAd'"/>
					<xsl:otherwise>
						<xsl:element name="{name()}">
							<xsl:value-of select="."/>
						</xsl:element>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>
		</ogrenci>
	</xsl:template>
</xsl:stylesheet>
