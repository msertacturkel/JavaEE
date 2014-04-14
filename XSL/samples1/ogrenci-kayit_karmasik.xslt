<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:template match="/">
		<HTML>
			<BODY>
				<table border="1">
					<xsl:for-each select="/ogrenci-kayit/ogrenci">
						<!-- dis dongu -->
						<xsl:choose>
							<xsl:when test=".//sehir[.='Istanbul']">
								<tr>
									<xsl:for-each select="*">
										<!-- ic dongu (alt elamanlari tariyor)-->
										<td>
											<xsl:value-of select="."/>
										</td>
									</xsl:for-each>
								</tr>
							</xsl:when>
						</xsl:choose>
					</xsl:for-each>
				</table>
			</BODY>
		</HTML>
	</xsl:template>
</xsl:stylesheet>
