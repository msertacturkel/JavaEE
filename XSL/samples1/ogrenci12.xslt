<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" indent="yes"/>
	<xsl:template match="/">
		<ogrenci-secilmis>
			<xsl:for-each select="ogrenci-kayit/ogrenci[ad='Mine']">
				<ogrenci>
					<xsl:for-each select="*">
					<!-- if else if yapisi gibi -->
						<xsl:choose>
						<!-- sarti sagliyorsa hic birsey yapma -->
							<xsl:when test="name()='dogYer'"/> 
							<xsl:when test="name()='veliAd'"/> 
							<xsl:otherwise>
								<xsl:element name="{name()}">
									<xsl:value-of select="."/>
								</xsl:element>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:for-each>
				</ogrenci>
			</xsl:for-each>
		</ogrenci-secilmis>
	</xsl:template>
</xsl:stylesheet>
