
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;verkaufstatus&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "verkaufstatus")
public class Verkaufstatus
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "stand")
    protected Verkaufstatus.Stand stand;

    /**
     * Gets the value of the stand property.
     *
     * @return
     *     possible object is
     *     {@link Verkaufstatus.Stand }
     *
     */
    public Verkaufstatus.Stand getStand() {
        return stand;
    }

    /**
     * Sets the value of the stand property.
     *
     * @param value
     *     allowed object is
     *     {@link Verkaufstatus.Stand }
     *
     */
    public void setStand(Verkaufstatus.Stand value) {
        this.stand = value;
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
            Verkaufstatus.Stand theStand;
            theStand = this.getStand();
            strategy.appendField(locator, this, "stand", buffer, theStand);
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
        if (draftCopy instanceof Verkaufstatus) {
            final Verkaufstatus copy = ((Verkaufstatus) draftCopy);
            if (this.stand!= null) {
                Verkaufstatus.Stand sourceStand;
                sourceStand = this.getStand();
                Verkaufstatus.Stand copyStand = ((Verkaufstatus.Stand) strategy.copy(LocatorUtils.property(locator, "stand", sourceStand), sourceStand));
                copy.setStand(copyStand);
            } else {
                copy.stand = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Verkaufstatus();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Verkaufstatus that = ((Verkaufstatus) object);
        {
            Verkaufstatus.Stand lhsStand;
            lhsStand = this.getStand();
            Verkaufstatus.Stand rhsStand;
            rhsStand = that.getStand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stand", lhsStand), LocatorUtils.property(thatLocator, "stand", rhsStand), lhsStand, rhsStand)) {
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
     * Java enum for <em>stand</em> attribute in &lt;verkaufstatus&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Stand {

        OFFEN,
        RESERVIERT,
        VERKAUFT;

        public String value() {
            return name();
        }

        public static Verkaufstatus.Stand fromValue(String v) {
            return valueOf(v);
        }

    }

}