
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WohnungKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WohnungKategorienTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dachgeschoss"/>
 *     &lt;enumeration value="Maisonette"/>
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Penthouse"/>
 *     &lt;enumeration value="Terrassenwohnung"/>
 *     &lt;enumeration value="Sonstige"/>
 *     &lt;enumeration value="Erdgeschoss"/>
 *     &lt;enumeration value="Etagenwohnung"/>
 *     &lt;enumeration value="Loft"/>
 *     &lt;enumeration value="Hochparterre"/>
 *     &lt;enumeration value="Souterrain"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WohnungKategorienTyp")
@XmlEnum
public enum WohnungKategorienTyp {

    @XmlEnumValue("Dachgeschoss")
    DACHGESCHOSS("Dachgeschoss"),
    @XmlEnumValue("Maisonette")
    MAISONETTE("Maisonette"),
    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Penthouse")
    PENTHOUSE("Penthouse"),
    @XmlEnumValue("Terrassenwohnung")
    TERRASSENWOHNUNG("Terrassenwohnung"),
    @XmlEnumValue("Sonstige")
    SONSTIGE("Sonstige"),
    @XmlEnumValue("Erdgeschoss")
    ERDGESCHOSS("Erdgeschoss"),
    @XmlEnumValue("Etagenwohnung")
    ETAGENWOHNUNG("Etagenwohnung"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Hochparterre")
    HOCHPARTERRE("Hochparterre"),
    @XmlEnumValue("Souterrain")
    SOUTERRAIN("Souterrain");
    private final String value;

    WohnungKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WohnungKategorienTyp fromValue(String v) {
        for (WohnungKategorienTyp c: WohnungKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
