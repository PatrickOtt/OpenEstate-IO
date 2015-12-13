
package org.openestate.io.is24_xml.xml;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for KontaktAdresseTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KontaktAdresseTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}AdresseBaseTyp"&gt;
 *       &lt;attribute name="Anrede" type="{http://www.immobilienscout24.de/immobilientransfer}Text20Typ" /&gt;
 *       &lt;attribute name="Vorname" type="{http://www.immobilienscout24.de/immobilientransfer}Text30Typ" /&gt;
 *       &lt;attribute name="Nachname" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="Telefon" type="{http://www.immobilienscout24.de/immobilientransfer}Text40Typ" /&gt;
 *       &lt;attribute name="Mobiltelefon" type="{http://www.immobilienscout24.de/immobilientransfer}Text40Typ" /&gt;
 *       &lt;attribute name="Telefax" type="{http://www.immobilienscout24.de/immobilientransfer}Text40Typ" /&gt;
 *       &lt;attribute name="EMail" type="{http://www.immobilienscout24.de/immobilientransfer}EmailTyp" /&gt;
 *       &lt;attribute name="Homepage" type="{http://www.immobilienscout24.de/immobilientransfer}WebUrlTyp" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontaktAdresseTyp")
public class KontaktAdresseTyp
    extends AdresseBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Anrede")
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected String anrede;
    @XmlAttribute(name = "Vorname")
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String vorname;
    @XmlAttribute(name = "Nachname")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String nachname;
    @XmlAttribute(name = "Telefon")
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected String telefon;
    @XmlAttribute(name = "Mobiltelefon")
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected String mobiltelefon;
    @XmlAttribute(name = "Telefax")
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected String telefax;
    @XmlAttribute(name = "EMail")
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected String eMail;
    @XmlAttribute(name = "Homepage")
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected URL homepage;

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the vorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Gets the value of the nachname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Sets the value of the nachname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachname(String value) {
        this.nachname = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the mobiltelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobiltelefon() {
        return mobiltelefon;
    }

    /**
     * Sets the value of the mobiltelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobiltelefon(String value) {
        this.mobiltelefon = value;
    }

    /**
     * Gets the value of the telefax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefax() {
        return telefax;
    }

    /**
     * Sets the value of the telefax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefax(String value) {
        this.telefax = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the homepage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getHomepage() {
        return homepage;
    }

    /**
     * Sets the value of the homepage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepage(URL value) {
        this.homepage = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theAnrede;
            theAnrede = this.getAnrede();
            strategy.appendField(locator, this, "anrede", buffer, theAnrede);
        }
        {
            String theVorname;
            theVorname = this.getVorname();
            strategy.appendField(locator, this, "vorname", buffer, theVorname);
        }
        {
            String theNachname;
            theNachname = this.getNachname();
            strategy.appendField(locator, this, "nachname", buffer, theNachname);
        }
        {
            String theTelefon;
            theTelefon = this.getTelefon();
            strategy.appendField(locator, this, "telefon", buffer, theTelefon);
        }
        {
            String theMobiltelefon;
            theMobiltelefon = this.getMobiltelefon();
            strategy.appendField(locator, this, "mobiltelefon", buffer, theMobiltelefon);
        }
        {
            String theTelefax;
            theTelefax = this.getTelefax();
            strategy.appendField(locator, this, "telefax", buffer, theTelefax);
        }
        {
            String theEMail;
            theEMail = this.getEMail();
            strategy.appendField(locator, this, "eMail", buffer, theEMail);
        }
        {
            URL theHomepage;
            theHomepage = this.getHomepage();
            strategy.appendField(locator, this, "homepage", buffer, theHomepage);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof KontaktAdresseTyp) {
            final KontaktAdresseTyp copy = ((KontaktAdresseTyp) draftCopy);
            if (this.anrede!= null) {
                String sourceAnrede;
                sourceAnrede = this.getAnrede();
                String copyAnrede = ((String) strategy.copy(LocatorUtils.property(locator, "anrede", sourceAnrede), sourceAnrede));
                copy.setAnrede(copyAnrede);
            } else {
                copy.anrede = null;
            }
            if (this.vorname!= null) {
                String sourceVorname;
                sourceVorname = this.getVorname();
                String copyVorname = ((String) strategy.copy(LocatorUtils.property(locator, "vorname", sourceVorname), sourceVorname));
                copy.setVorname(copyVorname);
            } else {
                copy.vorname = null;
            }
            if (this.nachname!= null) {
                String sourceNachname;
                sourceNachname = this.getNachname();
                String copyNachname = ((String) strategy.copy(LocatorUtils.property(locator, "nachname", sourceNachname), sourceNachname));
                copy.setNachname(copyNachname);
            } else {
                copy.nachname = null;
            }
            if (this.telefon!= null) {
                String sourceTelefon;
                sourceTelefon = this.getTelefon();
                String copyTelefon = ((String) strategy.copy(LocatorUtils.property(locator, "telefon", sourceTelefon), sourceTelefon));
                copy.setTelefon(copyTelefon);
            } else {
                copy.telefon = null;
            }
            if (this.mobiltelefon!= null) {
                String sourceMobiltelefon;
                sourceMobiltelefon = this.getMobiltelefon();
                String copyMobiltelefon = ((String) strategy.copy(LocatorUtils.property(locator, "mobiltelefon", sourceMobiltelefon), sourceMobiltelefon));
                copy.setMobiltelefon(copyMobiltelefon);
            } else {
                copy.mobiltelefon = null;
            }
            if (this.telefax!= null) {
                String sourceTelefax;
                sourceTelefax = this.getTelefax();
                String copyTelefax = ((String) strategy.copy(LocatorUtils.property(locator, "telefax", sourceTelefax), sourceTelefax));
                copy.setTelefax(copyTelefax);
            } else {
                copy.telefax = null;
            }
            if (this.eMail!= null) {
                String sourceEMail;
                sourceEMail = this.getEMail();
                String copyEMail = ((String) strategy.copy(LocatorUtils.property(locator, "eMail", sourceEMail), sourceEMail));
                copy.setEMail(copyEMail);
            } else {
                copy.eMail = null;
            }
            if (this.homepage!= null) {
                URL sourceHomepage;
                sourceHomepage = this.getHomepage();
                URL copyHomepage = ((URL) strategy.copy(LocatorUtils.property(locator, "homepage", sourceHomepage), sourceHomepage));
                copy.setHomepage(copyHomepage);
            } else {
                copy.homepage = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new KontaktAdresseTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final KontaktAdresseTyp that = ((KontaktAdresseTyp) object);
        {
            String lhsAnrede;
            lhsAnrede = this.getAnrede();
            String rhsAnrede;
            rhsAnrede = that.getAnrede();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anrede", lhsAnrede), LocatorUtils.property(thatLocator, "anrede", rhsAnrede), lhsAnrede, rhsAnrede)) {
                return false;
            }
        }
        {
            String lhsVorname;
            lhsVorname = this.getVorname();
            String rhsVorname;
            rhsVorname = that.getVorname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorname", lhsVorname), LocatorUtils.property(thatLocator, "vorname", rhsVorname), lhsVorname, rhsVorname)) {
                return false;
            }
        }
        {
            String lhsNachname;
            lhsNachname = this.getNachname();
            String rhsNachname;
            rhsNachname = that.getNachname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nachname", lhsNachname), LocatorUtils.property(thatLocator, "nachname", rhsNachname), lhsNachname, rhsNachname)) {
                return false;
            }
        }
        {
            String lhsTelefon;
            lhsTelefon = this.getTelefon();
            String rhsTelefon;
            rhsTelefon = that.getTelefon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefon", lhsTelefon), LocatorUtils.property(thatLocator, "telefon", rhsTelefon), lhsTelefon, rhsTelefon)) {
                return false;
            }
        }
        {
            String lhsMobiltelefon;
            lhsMobiltelefon = this.getMobiltelefon();
            String rhsMobiltelefon;
            rhsMobiltelefon = that.getMobiltelefon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobiltelefon", lhsMobiltelefon), LocatorUtils.property(thatLocator, "mobiltelefon", rhsMobiltelefon), lhsMobiltelefon, rhsMobiltelefon)) {
                return false;
            }
        }
        {
            String lhsTelefax;
            lhsTelefax = this.getTelefax();
            String rhsTelefax;
            rhsTelefax = that.getTelefax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefax", lhsTelefax), LocatorUtils.property(thatLocator, "telefax", rhsTelefax), lhsTelefax, rhsTelefax)) {
                return false;
            }
        }
        {
            String lhsEMail;
            lhsEMail = this.getEMail();
            String rhsEMail;
            rhsEMail = that.getEMail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eMail", lhsEMail), LocatorUtils.property(thatLocator, "eMail", rhsEMail), lhsEMail, rhsEMail)) {
                return false;
            }
        }
        {
            URL lhsHomepage;
            lhsHomepage = this.getHomepage();
            URL rhsHomepage;
            rhsHomepage = that.getHomepage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homepage", lhsHomepage), LocatorUtils.property(thatLocator, "homepage", rhsHomepage), lhsHomepage, rhsHomepage)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
