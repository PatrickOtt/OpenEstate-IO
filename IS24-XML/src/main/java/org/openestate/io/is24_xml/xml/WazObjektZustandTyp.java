
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WazObjektZustandTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WazObjektZustandTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unbekannt"/>
 *     &lt;enumeration value="Erstbezug"/>
 *     &lt;enumeration value="Neuwertig"/>
 *     &lt;enumeration value="VollstaendigRenoviert"/>
 *     &lt;enumeration value="Renovierungsbeduerftig"/>
 *     &lt;enumeration value="Modernisiert"/>
 *     &lt;enumeration value="NachVereinbarung"/>
 *     &lt;enumeration value="Gepflegt"/>
 *     &lt;enumeration value="ErstbezugNachSanierung"/>
 *     &lt;enumeration value="Saniert"/>
 *     &lt;enumeration value="Unrenoviert"/>
 *     &lt;enumeration value="Abbruchreif"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WazObjektZustandTyp")
@XmlEnum
public enum WazObjektZustandTyp {

    @XmlEnumValue("Unbekannt")
    UNBEKANNT("Unbekannt"),
    @XmlEnumValue("Erstbezug")
    ERSTBEZUG("Erstbezug"),
    @XmlEnumValue("Neuwertig")
    NEUWERTIG("Neuwertig"),
    @XmlEnumValue("VollstaendigRenoviert")
    VOLLSTAENDIG_RENOVIERT("VollstaendigRenoviert"),
    @XmlEnumValue("Renovierungsbeduerftig")
    RENOVIERUNGSBEDUERFTIG("Renovierungsbeduerftig"),
    @XmlEnumValue("Modernisiert")
    MODERNISIERT("Modernisiert"),
    @XmlEnumValue("NachVereinbarung")
    NACH_VEREINBARUNG("NachVereinbarung"),
    @XmlEnumValue("Gepflegt")
    GEPFLEGT("Gepflegt"),
    @XmlEnumValue("ErstbezugNachSanierung")
    ERSTBEZUG_NACH_SANIERUNG("ErstbezugNachSanierung"),
    @XmlEnumValue("Saniert")
    SANIERT("Saniert"),

    /**
     * Nicht weiter unterstuetzt: Zu ersetzen durch Renovierungsbeduerftig
     * 
     */
    @XmlEnumValue("Unrenoviert")
    UNRENOVIERT("Unrenoviert"),
    @XmlEnumValue("Abbruchreif")
    ABBRUCHREIF("Abbruchreif");
    private final String value;

    WazObjektZustandTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WazObjektZustandTyp fromValue(String v) {
        for (WazObjektZustandTyp c: WazObjektZustandTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
