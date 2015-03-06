
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodenbelagTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BodenbelagTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Beton"/>
 *     &lt;enumeration value="Epoxidharz"/>
 *     &lt;enumeration value="Fliesen"/>
 *     &lt;enumeration value="Laminat"/>
 *     &lt;enumeration value="Dielen"/>
 *     &lt;enumeration value="Parkett"/>
 *     &lt;enumeration value="PVC"/>
 *     &lt;enumeration value="Teppichboden"/>
 *     &lt;enumeration value="TeppichbodenAntistatisch"/>
 *     &lt;enumeration value="TeppichfliesenStuhlrollenfest"/>
 *     &lt;enumeration value="Stein"/>
 *     &lt;enumeration value="NachWunsch"/>
 *     &lt;enumeration value="OhneBodenbelag"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BodenbelagTyp")
@XmlEnum
public enum BodenbelagTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Beton")
    BETON("Beton"),
    @XmlEnumValue("Epoxidharz")
    EPOXIDHARZ("Epoxidharz"),
    @XmlEnumValue("Fliesen")
    FLIESEN("Fliesen"),
    @XmlEnumValue("Laminat")
    LAMINAT("Laminat"),
    @XmlEnumValue("Dielen")
    DIELEN("Dielen"),
    @XmlEnumValue("Parkett")
    PARKETT("Parkett"),
    PVC("PVC"),
    @XmlEnumValue("Teppichboden")
    TEPPICHBODEN("Teppichboden"),
    @XmlEnumValue("TeppichbodenAntistatisch")
    TEPPICHBODEN_ANTISTATISCH("TeppichbodenAntistatisch"),
    @XmlEnumValue("TeppichfliesenStuhlrollenfest")
    TEPPICHFLIESEN_STUHLROLLENFEST("TeppichfliesenStuhlrollenfest"),
    @XmlEnumValue("Stein")
    STEIN("Stein"),
    @XmlEnumValue("NachWunsch")
    NACH_WUNSCH("NachWunsch"),
    @XmlEnumValue("OhneBodenbelag")
    OHNE_BODENBELAG("OhneBodenbelag");
    private final String value;

    BodenbelagTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BodenbelagTyp fromValue(String v) {
        for (BodenbelagTyp c: BodenbelagTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
