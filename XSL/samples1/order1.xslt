<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" indent="yes"/>
	<xsl:template match="/">
		<istek>
			<tarih>
				<xsl:value-of select="order/date/day"/>-<xsl:value-of select="order/date/month"/>-<xsl:value-of select="order/date/year"/>
			</tarih>
			<xsl:element name="musteri">
				<xsl:value-of select="order/customer"/>
			</xsl:element>
			<eleman>
				<parca-no>
					<xsl:value-of select="order/item/part-number"/>
				</parca-no>
				<aded>
					<xsl:value-of select="order/item/quantity"/>
				</aded>
			</eleman>
		</istek>
	</xsl:template>
</xsl:stylesheet>
