
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for transactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="auction"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="yes|no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ownership" type="{http://feed.immobiliare.it}ownershipType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionType", propOrder = {
    "value"
})
public class TransactionType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "auction")
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected Boolean auction;
    @XmlAttribute(name = "ownership")
    protected OwnershipType ownership;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the auction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isAuction() {
        return auction;
    }

    /**
     * Sets the value of the auction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuction(Boolean value) {
        this.auction = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType }
     *     
     */
    public OwnershipType getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType }
     *     
     */
    public void setOwnership(OwnershipType value) {
        this.ownership = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            Boolean theAuction;
            theAuction = this.isAuction();
            strategy.appendField(locator, this, "auction", buffer, theAuction, (this.auction!= null));
        }
        {
            OwnershipType theOwnership;
            theOwnership = this.getOwnership();
            strategy.appendField(locator, this, "ownership", buffer, theOwnership, (this.ownership!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof TransactionType) {
            final TransactionType copy = ((TransactionType) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceValue;
                    sourceValue = this.getValue();
                    String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean auctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auction!= null));
                if (auctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAuction;
                    sourceAuction = this.isAuction();
                    Boolean copyAuction = ((Boolean) strategy.copy(LocatorUtils.property(locator, "auction", sourceAuction), sourceAuction, (this.auction!= null)));
                    copy.setAuction(copyAuction);
                } else {
                    if (auctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auction = null;
                    }
                }
            }
            {
                Boolean ownershipShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ownership!= null));
                if (ownershipShouldBeCopiedAndSet == Boolean.TRUE) {
                    OwnershipType sourceOwnership;
                    sourceOwnership = this.getOwnership();
                    OwnershipType copyOwnership = ((OwnershipType) strategy.copy(LocatorUtils.property(locator, "ownership", sourceOwnership), sourceOwnership, (this.ownership!= null)));
                    copy.setOwnership(copyOwnership);
                } else {
                    if (ownershipShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ownership = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TransactionType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransactionType that = ((TransactionType) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAuction;
            lhsAuction = this.isAuction();
            Boolean rhsAuction;
            rhsAuction = that.isAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auction", lhsAuction), LocatorUtils.property(thatLocator, "auction", rhsAuction), lhsAuction, rhsAuction, (this.auction!= null), (that.auction!= null))) {
                return false;
            }
        }
        {
            OwnershipType lhsOwnership;
            lhsOwnership = this.getOwnership();
            OwnershipType rhsOwnership;
            rhsOwnership = that.getOwnership();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownership", lhsOwnership), LocatorUtils.property(thatLocator, "ownership", rhsOwnership), lhsOwnership, rhsOwnership, (this.ownership!= null), (that.ownership!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
