<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" indent="yes"/>
	<xsl:template match="/">
		<ogrenci-secilmis>
			<xsl:apply-templates select="ogrenci-kayit/ogrenci[sinif='4-C']"/>
			<xsl:apply-templates select="ogrenci-kayit/ogretmen[@sinif='4-C']"/>
		</ogrenci-secilmis>
	</xsl:template>
	<xsl:template match="ogrenci">
		<ogrenci>
			<xsl:for-each select="*">
				<!-- ogrenci elemanin alt elemanlari-->
				<xsl:element name="{name()}">
					<!-- mevcut dugumun adiyla bir eleman olusturur-->
					<xsl:value-of select="."/>
				</xsl:element>
			</xsl:for-each>
		</ogrenci>
	</xsl:template>
	<xsl:template match="ogretmen">
		<ogretmen>
			<xsl:for-each select="*">
				<!-- ogretmen elemanin alt elemanlari-->
				<xsl:element name="{name()}">
					<!-- mevcut dugumun adiyla bir eleman olusturur-->
					<xsl:value-of select="."/>
				</xsl:element>
			</xsl:for-each>
		</ogretmen>
	</xsl:template>
</xsl:stylesheet>
