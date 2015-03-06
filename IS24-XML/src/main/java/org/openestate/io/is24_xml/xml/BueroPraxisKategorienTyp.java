
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BueroPraxisKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BueroPraxisKategorienTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Loft"/>
 *     &lt;enumeration value="Atelier"/>
 *     &lt;enumeration value="Buero"/>
 *     &lt;enumeration value="BueroEtage"/>
 *     &lt;enumeration value="Buerohaus"/>
 *     &lt;enumeration value="Buerozentrum"/>
 *     &lt;enumeration value="BueroUndLagerGebaeude"/>
 *     &lt;enumeration value="Praxis"/>
 *     &lt;enumeration value="PraxisEtage"/>
 *     &lt;enumeration value="PraxisHaus"/>
 *     &lt;enumeration value="GewerbeZentrum"/>
 *     &lt;enumeration value="WohnUndGeschaeftsgebaeude"/>
 *     &lt;enumeration value="BueroUndGeschaeftsgebaeude"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BueroPraxisKategorienTyp")
@XmlEnum
public enum BueroPraxisKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Atelier")
    ATELIER("Atelier"),
    @XmlEnumValue("Buero")
    BUERO("Buero"),
    @XmlEnumValue("BueroEtage")
    BUERO_ETAGE("BueroEtage"),
    @XmlEnumValue("Buerohaus")
    BUEROHAUS("Buerohaus"),
    @XmlEnumValue("Buerozentrum")
    BUEROZENTRUM("Buerozentrum"),
    @XmlEnumValue("BueroUndLagerGebaeude")
    BUERO_UND_LAGER_GEBAEUDE("BueroUndLagerGebaeude"),
    @XmlEnumValue("Praxis")
    PRAXIS("Praxis"),
    @XmlEnumValue("PraxisEtage")
    PRAXIS_ETAGE("PraxisEtage"),
    @XmlEnumValue("PraxisHaus")
    PRAXIS_HAUS("PraxisHaus"),
    @XmlEnumValue("GewerbeZentrum")
    GEWERBE_ZENTRUM("GewerbeZentrum"),
    @XmlEnumValue("WohnUndGeschaeftsgebaeude")
    WOHN_UND_GESCHAEFTSGEBAEUDE("WohnUndGeschaeftsgebaeude"),
    @XmlEnumValue("BueroUndGeschaeftsgebaeude")
    BUERO_UND_GESCHAEFTSGEBAEUDE("BueroUndGeschaeftsgebaeude");
    private final String value;

    BueroPraxisKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BueroPraxisKategorienTyp fromValue(String v) {
        for (BueroPraxisKategorienTyp c: BueroPraxisKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
