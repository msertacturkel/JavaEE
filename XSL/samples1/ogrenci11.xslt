<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<ogrenci-secilmis>
			<xsl:apply-templates select="ogrenci-kayit/ogrenci"/>
		</ogrenci-secilmis>
	</xsl:template>
	<xsl:template match="ogrenci">
		<!-- ad Mine'ye esitse aliyoruz -->
		<xsl:choose>
			<xsl:when test="ad='Mine'">
				<ogrenci>
				<!-- alt elemanlari tariyoruz -->
					<xsl:for-each select="*">
						<xsl:element name="{name()}">
							<xsl:value-of select="."/>
						</xsl:element>
					</xsl:for-each>
				</ogrenci>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
</xsl:stylesheet>
