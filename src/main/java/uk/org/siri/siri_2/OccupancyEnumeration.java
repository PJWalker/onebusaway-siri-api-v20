//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package uk.org.siri.siri_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OccupancyEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OccupancyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="seatsAvailable"/>
 *     &lt;enumeration value="standingAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OccupancyEnumeration")
@XmlEnum
public enum OccupancyEnumeration {

    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("seatsAvailable")
    SEATS_AVAILABLE("seatsAvailable"),
    @XmlEnumValue("standingAvailable")
    STANDING_AVAILABLE("standingAvailable");
    private final String value;

    OccupancyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OccupancyEnumeration fromValue(String v) {
        for (OccupancyEnumeration c: OccupancyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
