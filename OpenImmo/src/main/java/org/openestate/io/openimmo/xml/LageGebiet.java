
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Java class for &lt;lage_gebiet&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "lage_gebiet")
public class LageGebiet
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "gebiete")
    protected LageGebiet.Gebiete gebiete;

    /**
     * Gets the value of the gebiete property.
     *
     * @return
     *     possible object is
     *     {@link LageGebiet.Gebiete }
     *
     */
    public LageGebiet.Gebiete getGebiete() {
        return gebiete;
    }

    /**
     * Sets the value of the gebiete property.
     *
     * @param value
     *     allowed object is
     *     {@link LageGebiet.Gebiete }
     *
     */
    public void setGebiete(LageGebiet.Gebiete value) {
        this.gebiete = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            LageGebiet.Gebiete theGebiete;
            theGebiete = this.getGebiete();
            strategy.appendField(locator, this, "gebiete", buffer, theGebiete);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof LageGebiet) {
            final LageGebiet copy = ((LageGebiet) draftCopy);
            if (this.gebiete!= null) {
                LageGebiet.Gebiete sourceGebiete;
                sourceGebiete = this.getGebiete();
                LageGebiet.Gebiete copyGebiete = ((LageGebiet.Gebiete) strategy.copy(LocatorUtils.property(locator, "gebiete", sourceGebiete), sourceGebiete));
                copy.setGebiete(copyGebiete);
            } else {
                copy.gebiete = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LageGebiet();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LageGebiet that = ((LageGebiet) object);
        {
            LageGebiet.Gebiete lhsGebiete;
            lhsGebiete = this.getGebiete();
            LageGebiet.Gebiete rhsGebiete;
            rhsGebiete = that.getGebiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebiete", lhsGebiete), LocatorUtils.property(thatLocator, "gebiete", rhsGebiete), lhsGebiete, rhsGebiete)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>gebiete</em> attribute in &lt;lage_gebiet&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Gebiete {

        WOHN("WOHN"),
        GEWERBE("GEWERBE"),
        INDUSTRIE("INDUSTRIE"),
        MISCH("MISCH"),
        NEUBAU("NEUBAU"),
        ORTSLAGE("ORTSLAGE"),
        SIEDLUNG("SIEDLUNG"),
        STADTRAND("STADTRAND"),
        STADTTEIL("STADTTEIL"),
        STADTZENTRUM("STADTZENTRUM"),
        NEBENZENTRUM("NEBENZENTRUM"),
        @XmlEnumValue("1A")
        A_LAGE("1A"),
        @XmlEnumValue("1B")
        B_LAGE("1B");
        private final String value;

        Gebiete(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static LageGebiet.Gebiete fromValue(String v) {
            for (LageGebiet.Gebiete c: LageGebiet.Gebiete.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}