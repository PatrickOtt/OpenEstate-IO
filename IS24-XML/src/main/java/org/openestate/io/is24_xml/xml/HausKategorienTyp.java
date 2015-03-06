
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HausKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HausKategorienTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Bungalow"/>
 *     &lt;enumeration value="Doppelhaushaelfte"/>
 *     &lt;enumeration value="Einfamilienhaus"/>
 *     &lt;enumeration value="Mehrfamilienhaus"/>
 *     &lt;enumeration value="Villa"/>
 *     &lt;enumeration value="Reihenhaus"/>
 *     &lt;enumeration value="Reihenmittelhaus"/>
 *     &lt;enumeration value="Reiheneckhaus"/>
 *     &lt;enumeration value="Zweifamilienhaus"/>
 *     &lt;enumeration value="Bauernhaus"/>
 *     &lt;enumeration value="Sonstiges"/>
 *     &lt;enumeration value="BesondereImmobilie"/>
 *     &lt;enumeration value="BurgSchloss"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HausKategorienTyp")
@XmlEnum
public enum HausKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("Doppelhaushaelfte")
    DOPPELHAUSHAELFTE("Doppelhaushaelfte"),
    @XmlEnumValue("Einfamilienhaus")
    EINFAMILIENHAUS("Einfamilienhaus"),
    @XmlEnumValue("Mehrfamilienhaus")
    MEHRFAMILIENHAUS("Mehrfamilienhaus"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),

    /**
     * aus Kompatibilitaetsgruenden weiter vorhanden: Benutze stattdessen 'Reihenmittelhaus' oder 'Reiheneckhaus'
     *             (wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     * 
     */
    @XmlEnumValue("Reihenhaus")
    REIHENHAUS("Reihenhaus"),
    @XmlEnumValue("Reihenmittelhaus")
    REIHENMITTELHAUS("Reihenmittelhaus"),
    @XmlEnumValue("Reiheneckhaus")
    REIHENECKHAUS("Reiheneckhaus"),

    /**
     * aus Kompatibilitaetsgruenden weiter vorhanden: Benutze stattdessen 'Mehrfamilienhaus'
     *             (wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     * 
     */
    @XmlEnumValue("Zweifamilienhaus")
    ZWEIFAMILIENHAUS("Zweifamilienhaus"),
    @XmlEnumValue("Bauernhaus")
    BAUERNHAUS("Bauernhaus"),

    /**
     * Umfasst: Wohnimmobilie (sonstige)
     * 
     */
    @XmlEnumValue("Sonstiges")
    SONSTIGES("Sonstiges"),
    @XmlEnumValue("BesondereImmobilie")
    BESONDERE_IMMOBILIE("BesondereImmobilie"),
    @XmlEnumValue("BurgSchloss")
    BURG_SCHLOSS("BurgSchloss");
    private final String value;

    HausKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HausKategorienTyp fromValue(String v) {
        for (HausKategorienTyp c: HausKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
