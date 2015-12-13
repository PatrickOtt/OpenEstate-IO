
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;bebaubar_nach&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bebaubar_nach")
public class BebaubarNach
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "bebaubar_attr")
    protected BebaubarNach.BebaubarAttr bebaubarAttr;

    /**
     * Gets the value of the bebaubarAttr property.
     *
     * @return
     *     possible object is
     *     {@link BebaubarNach.BebaubarAttr }
     *
     */
    public BebaubarNach.BebaubarAttr getBebaubarAttr() {
        return bebaubarAttr;
    }

    /**
     * Sets the value of the bebaubarAttr property.
     *
     * @param value
     *     allowed object is
     *     {@link BebaubarNach.BebaubarAttr }
     *
     */
    public void setBebaubarAttr(BebaubarNach.BebaubarAttr value) {
        this.bebaubarAttr = value;
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
            BebaubarNach.BebaubarAttr theBebaubarAttr;
            theBebaubarAttr = this.getBebaubarAttr();
            strategy.appendField(locator, this, "bebaubarAttr", buffer, theBebaubarAttr);
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
        if (draftCopy instanceof BebaubarNach) {
            final BebaubarNach copy = ((BebaubarNach) draftCopy);
            if (this.bebaubarAttr!= null) {
                BebaubarNach.BebaubarAttr sourceBebaubarAttr;
                sourceBebaubarAttr = this.getBebaubarAttr();
                BebaubarNach.BebaubarAttr copyBebaubarAttr = ((BebaubarNach.BebaubarAttr) strategy.copy(LocatorUtils.property(locator, "bebaubarAttr", sourceBebaubarAttr), sourceBebaubarAttr));
                copy.setBebaubarAttr(copyBebaubarAttr);
            } else {
                copy.bebaubarAttr = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BebaubarNach();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BebaubarNach that = ((BebaubarNach) object);
        {
            BebaubarNach.BebaubarAttr lhsBebaubarAttr;
            lhsBebaubarAttr = this.getBebaubarAttr();
            BebaubarNach.BebaubarAttr rhsBebaubarAttr;
            rhsBebaubarAttr = that.getBebaubarAttr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarAttr", lhsBebaubarAttr), LocatorUtils.property(thatLocator, "bebaubarAttr", rhsBebaubarAttr), lhsBebaubarAttr, rhsBebaubarAttr)) {
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
     * Java enum for <em>bebaubar_attr</em> attribute in &lt;bebaubar_nach&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum BebaubarAttr {

        @XmlEnumValue("34_NACHBARSCHAFT")
        NACHBARSCHAFT("34_NACHBARSCHAFT"),
        @XmlEnumValue("35_AUSSENGEBIET")
        AUSSENGEBIET("35_AUSSENGEBIET"),
        B_PLAN("B_PLAN"),
        @XmlEnumValue("KEIN BAULAND")
        KEIN_BAULAND("KEIN BAULAND"),
        BAUERWARTUNGSLAND("BAUERWARTUNGSLAND");
        private final String value;

        BebaubarAttr(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static BebaubarNach.BebaubarAttr fromValue(String v) {
            for (BebaubarNach.BebaubarAttr c: BebaubarNach.BebaubarAttr.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}