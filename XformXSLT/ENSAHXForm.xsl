<?xml version="1.0"?>

<xsl:stylesheet version="1.0" 
		xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
		xmlns="http://www.w3.org/2000/svg"
		>
  <xsl:output
      method="xml"
      indent="yes"
      standalone="no"
      doctype-public="-//W3C//DTD SVG 1.1//EN"
      doctype-system="http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"
      media-type="image/svg" />
  
  <xsl:template match="rectangle">
    <svg xmlns="http://www.w3.org/2000/svg" width="200" height="200" >
      <rect x="{positionY}" y="{positionX}" width="{width}" height="{height}" fill="{color}" stroke="{border}"/>  
    </svg>
  </xsl:template>
 <xsl:template match="line">
  <svg xmlns="http://www.w3.org/2000/svg" height="210" width="500">
	<line x1="{positionX}" y1="{positionY}" x2="{positionX2}" y2="{positionY2}" stroke="{color}" />
	</svg>
</xsl:template>

  <xsl:template match="circle">
    <svg xmlns="http://www.w3.org/2000/svg" width="200" height="300" >
		<circle cx="{centreX}" cy="{centreY}" r="{rayon}" stroke="{border}" fill="{color}" />
    </svg>
  </xsl:template>
  
    <xsl:template match="polygon">
  <svg xmlns="http://www.w3.org/2000/svg"  height="210" width="500">
  <polygon points="{X},{X1} {Y},{X2} {Y2},{w1}" stroke="{border}" fill="{color}" />
</svg>
    </xsl:template>

</xsl:stylesheet>