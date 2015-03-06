
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrundstueckWohnenKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrundstueckWohnenKategorienTyp">
 *   &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckKategorienTyp">
 *     &lt;enumeration value="Wohnen"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrundstueckWohnenKategorienTyp")
@XmlEnum(GrundstueckKategorienTyp.class)
public enum GrundstueckWohnenKategorienTyp {

    @XmlEnumValue("Wohnen")
    WOHNEN(GrundstueckKategorienTyp.WOHNEN);
    private final GrundstueckKategorienTyp value;

    GrundstueckWohnenKategorienTyp(GrundstueckKategorienTyp v) {
        value = v;
    }

    public GrundstueckKategorienTyp value() {
        return value;
    }

    public static GrundstueckWohnenKategorienTyp fromValue(GrundstueckKategorienTyp v) {
        for (GrundstueckWohnenKategorienTyp c: GrundstueckWohnenKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
