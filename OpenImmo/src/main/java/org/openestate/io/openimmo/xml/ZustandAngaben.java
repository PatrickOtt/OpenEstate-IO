
package org.openestate.io.openimmo.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Java class for &lt;zustand_angaben&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baujahr",
    "letztemodernisierung",
    "zustand",
    "alter",
    "bebaubarNach",
    "erschliessung",
    "erschliessungUmfang",
    "bauzone",
    "altlasten",
    "energiepass",
    "verkaufstatus",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "zustand_angaben")
public class ZustandAngaben
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String baujahr;
    protected String letztemodernisierung;
    protected Zustand zustand;
    protected Alter alter;
    @XmlElement(name = "bebaubar_nach")
    protected BebaubarNach bebaubarNach;
    protected Erschliessung erschliessung;
    @XmlElement(name = "erschliessung_umfang")
    protected ErschliessungUmfang erschliessungUmfang;
    protected String bauzone;
    protected String altlasten;
    protected List<Energiepass> energiepass;
    protected Verkaufstatus verkaufstatus;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaujahr() {
        return baujahr;
    }

    /**
     * Sets the value of the baujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaujahr(String value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the letztemodernisierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetztemodernisierung() {
        return letztemodernisierung;
    }

    /**
     * Sets the value of the letztemodernisierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetztemodernisierung(String value) {
        this.letztemodernisierung = value;
    }

    /**
     * Gets the value of the zustand property.
     * 
     * @return
     *     possible object is
     *     {@link Zustand }
     *     
     */
    public Zustand getZustand() {
        return zustand;
    }

    /**
     * Sets the value of the zustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zustand }
     *     
     */
    public void setZustand(Zustand value) {
        this.zustand = value;
    }

    /**
     * Gets the value of the alter property.
     * 
     * @return
     *     possible object is
     *     {@link Alter }
     *     
     */
    public Alter getAlter() {
        return alter;
    }

    /**
     * Sets the value of the alter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alter }
     *     
     */
    public void setAlter(Alter value) {
        this.alter = value;
    }

    /**
     * Gets the value of the bebaubarNach property.
     * 
     * @return
     *     possible object is
     *     {@link BebaubarNach }
     *     
     */
    public BebaubarNach getBebaubarNach() {
        return bebaubarNach;
    }

    /**
     * Sets the value of the bebaubarNach property.
     * 
     * @param value
     *     allowed object is
     *     {@link BebaubarNach }
     *     
     */
    public void setBebaubarNach(BebaubarNach value) {
        this.bebaubarNach = value;
    }

    /**
     * Gets the value of the erschliessung property.
     * 
     * @return
     *     possible object is
     *     {@link Erschliessung }
     *     
     */
    public Erschliessung getErschliessung() {
        return erschliessung;
    }

    /**
     * Sets the value of the erschliessung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Erschliessung }
     *     
     */
    public void setErschliessung(Erschliessung value) {
        this.erschliessung = value;
    }

    /**
     * Gets the value of the erschliessungUmfang property.
     * 
     * @return
     *     possible object is
     *     {@link ErschliessungUmfang }
     *     
     */
    public ErschliessungUmfang getErschliessungUmfang() {
        return erschliessungUmfang;
    }

    /**
     * Sets the value of the erschliessungUmfang property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErschliessungUmfang }
     *     
     */
    public void setErschliessungUmfang(ErschliessungUmfang value) {
        this.erschliessungUmfang = value;
    }

    /**
     * Gets the value of the bauzone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBauzone() {
        return bauzone;
    }

    /**
     * Sets the value of the bauzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBauzone(String value) {
        this.bauzone = value;
    }

    /**
     * Gets the value of the altlasten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltlasten() {
        return altlasten;
    }

    /**
     * Sets the value of the altlasten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltlasten(String value) {
        this.altlasten = value;
    }

    /**
     * Gets the value of the energiepass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energiepass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergiepass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Energiepass }
     * 
     * 
     */
    public List<Energiepass> getEnergiepass() {
        if (energiepass == null) {
            energiepass = new ArrayList<Energiepass>();
        }
        return this.energiepass;
    }

    /**
     * Gets the value of the verkaufstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Verkaufstatus }
     *     
     */
    public Verkaufstatus getVerkaufstatus() {
        return verkaufstatus;
    }

    /**
     * Sets the value of the verkaufstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verkaufstatus }
     *     
     */
    public void setVerkaufstatus(Verkaufstatus value) {
        this.verkaufstatus = value;
    }

    /**
     * Gets the value of the userDefinedSimplefield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedSimplefield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedSimplefield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedSimplefield }
     * 
     * 
     */
    public List<UserDefinedSimplefield> getUserDefinedSimplefield() {
        if (userDefinedSimplefield == null) {
            userDefinedSimplefield = new ArrayList<UserDefinedSimplefield>();
        }
        return this.userDefinedSimplefield;
    }

    /**
     * Gets the value of the userDefinedAnyfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedAnyfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedAnyfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedAnyfield }
     * 
     * 
     */
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
    }

    /**
     * Gets the value of the userDefinedExtend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedExtend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedExtend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedExtend }
     * 
     * 
     */
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
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
            String theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr);
        }
        {
            String theLetztemodernisierung;
            theLetztemodernisierung = this.getLetztemodernisierung();
            strategy.appendField(locator, this, "letztemodernisierung", buffer, theLetztemodernisierung);
        }
        {
            Zustand theZustand;
            theZustand = this.getZustand();
            strategy.appendField(locator, this, "zustand", buffer, theZustand);
        }
        {
            Alter theAlter;
            theAlter = this.getAlter();
            strategy.appendField(locator, this, "alter", buffer, theAlter);
        }
        {
            BebaubarNach theBebaubarNach;
            theBebaubarNach = this.getBebaubarNach();
            strategy.appendField(locator, this, "bebaubarNach", buffer, theBebaubarNach);
        }
        {
            Erschliessung theErschliessung;
            theErschliessung = this.getErschliessung();
            strategy.appendField(locator, this, "erschliessung", buffer, theErschliessung);
        }
        {
            ErschliessungUmfang theErschliessungUmfang;
            theErschliessungUmfang = this.getErschliessungUmfang();
            strategy.appendField(locator, this, "erschliessungUmfang", buffer, theErschliessungUmfang);
        }
        {
            String theBauzone;
            theBauzone = this.getBauzone();
            strategy.appendField(locator, this, "bauzone", buffer, theBauzone);
        }
        {
            String theAltlasten;
            theAltlasten = this.getAltlasten();
            strategy.appendField(locator, this, "altlasten", buffer, theAltlasten);
        }
        {
            List<Energiepass> theEnergiepass;
            theEnergiepass = (((this.energiepass!= null)&&(!this.energiepass.isEmpty()))?this.getEnergiepass():null);
            strategy.appendField(locator, this, "energiepass", buffer, theEnergiepass);
        }
        {
            Verkaufstatus theVerkaufstatus;
            theVerkaufstatus = this.getVerkaufstatus();
            strategy.appendField(locator, this, "verkaufstatus", buffer, theVerkaufstatus);
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield);
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield);
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend);
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
        if (draftCopy instanceof ZustandAngaben) {
            final ZustandAngaben copy = ((ZustandAngaben) draftCopy);
            if (this.baujahr!= null) {
                String sourceBaujahr;
                sourceBaujahr = this.getBaujahr();
                String copyBaujahr = ((String) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr));
                copy.setBaujahr(copyBaujahr);
            } else {
                copy.baujahr = null;
            }
            if (this.letztemodernisierung!= null) {
                String sourceLetztemodernisierung;
                sourceLetztemodernisierung = this.getLetztemodernisierung();
                String copyLetztemodernisierung = ((String) strategy.copy(LocatorUtils.property(locator, "letztemodernisierung", sourceLetztemodernisierung), sourceLetztemodernisierung));
                copy.setLetztemodernisierung(copyLetztemodernisierung);
            } else {
                copy.letztemodernisierung = null;
            }
            if (this.zustand!= null) {
                Zustand sourceZustand;
                sourceZustand = this.getZustand();
                Zustand copyZustand = ((Zustand) strategy.copy(LocatorUtils.property(locator, "zustand", sourceZustand), sourceZustand));
                copy.setZustand(copyZustand);
            } else {
                copy.zustand = null;
            }
            if (this.alter!= null) {
                Alter sourceAlter;
                sourceAlter = this.getAlter();
                Alter copyAlter = ((Alter) strategy.copy(LocatorUtils.property(locator, "alter", sourceAlter), sourceAlter));
                copy.setAlter(copyAlter);
            } else {
                copy.alter = null;
            }
            if (this.bebaubarNach!= null) {
                BebaubarNach sourceBebaubarNach;
                sourceBebaubarNach = this.getBebaubarNach();
                BebaubarNach copyBebaubarNach = ((BebaubarNach) strategy.copy(LocatorUtils.property(locator, "bebaubarNach", sourceBebaubarNach), sourceBebaubarNach));
                copy.setBebaubarNach(copyBebaubarNach);
            } else {
                copy.bebaubarNach = null;
            }
            if (this.erschliessung!= null) {
                Erschliessung sourceErschliessung;
                sourceErschliessung = this.getErschliessung();
                Erschliessung copyErschliessung = ((Erschliessung) strategy.copy(LocatorUtils.property(locator, "erschliessung", sourceErschliessung), sourceErschliessung));
                copy.setErschliessung(copyErschliessung);
            } else {
                copy.erschliessung = null;
            }
            if (this.erschliessungUmfang!= null) {
                ErschliessungUmfang sourceErschliessungUmfang;
                sourceErschliessungUmfang = this.getErschliessungUmfang();
                ErschliessungUmfang copyErschliessungUmfang = ((ErschliessungUmfang) strategy.copy(LocatorUtils.property(locator, "erschliessungUmfang", sourceErschliessungUmfang), sourceErschliessungUmfang));
                copy.setErschliessungUmfang(copyErschliessungUmfang);
            } else {
                copy.erschliessungUmfang = null;
            }
            if (this.bauzone!= null) {
                String sourceBauzone;
                sourceBauzone = this.getBauzone();
                String copyBauzone = ((String) strategy.copy(LocatorUtils.property(locator, "bauzone", sourceBauzone), sourceBauzone));
                copy.setBauzone(copyBauzone);
            } else {
                copy.bauzone = null;
            }
            if (this.altlasten!= null) {
                String sourceAltlasten;
                sourceAltlasten = this.getAltlasten();
                String copyAltlasten = ((String) strategy.copy(LocatorUtils.property(locator, "altlasten", sourceAltlasten), sourceAltlasten));
                copy.setAltlasten(copyAltlasten);
            } else {
                copy.altlasten = null;
            }
            if ((this.energiepass!= null)&&(!this.energiepass.isEmpty())) {
                List<Energiepass> sourceEnergiepass;
                sourceEnergiepass = (((this.energiepass!= null)&&(!this.energiepass.isEmpty()))?this.getEnergiepass():null);
                @SuppressWarnings("unchecked")
                List<Energiepass> copyEnergiepass = ((List<Energiepass> ) strategy.copy(LocatorUtils.property(locator, "energiepass", sourceEnergiepass), sourceEnergiepass));
                copy.energiepass = null;
                if (copyEnergiepass!= null) {
                    List<Energiepass> uniqueEnergiepassl = copy.getEnergiepass();
                    uniqueEnergiepassl.addAll(copyEnergiepass);
                }
            } else {
                copy.energiepass = null;
            }
            if (this.verkaufstatus!= null) {
                Verkaufstatus sourceVerkaufstatus;
                sourceVerkaufstatus = this.getVerkaufstatus();
                Verkaufstatus copyVerkaufstatus = ((Verkaufstatus) strategy.copy(LocatorUtils.property(locator, "verkaufstatus", sourceVerkaufstatus), sourceVerkaufstatus));
                copy.setVerkaufstatus(copyVerkaufstatus);
            } else {
                copy.verkaufstatus = null;
            }
            if ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())) {
                List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield));
                copy.userDefinedSimplefield = null;
                if (copyUserDefinedSimplefield!= null) {
                    List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                    uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                }
            } else {
                copy.userDefinedSimplefield = null;
            }
            if ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())) {
                List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield));
                copy.userDefinedAnyfield = null;
                if (copyUserDefinedAnyfield!= null) {
                    List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                    uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                }
            } else {
                copy.userDefinedAnyfield = null;
            }
            if ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())) {
                List<UserDefinedExtend> sourceUserDefinedExtend;
                sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend));
                copy.userDefinedExtend = null;
                if (copyUserDefinedExtend!= null) {
                    List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                    uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                }
            } else {
                copy.userDefinedExtend = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ZustandAngaben();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZustandAngaben that = ((ZustandAngaben) object);
        {
            String lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            String rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr)) {
                return false;
            }
        }
        {
            String lhsLetztemodernisierung;
            lhsLetztemodernisierung = this.getLetztemodernisierung();
            String rhsLetztemodernisierung;
            rhsLetztemodernisierung = that.getLetztemodernisierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "letztemodernisierung", lhsLetztemodernisierung), LocatorUtils.property(thatLocator, "letztemodernisierung", rhsLetztemodernisierung), lhsLetztemodernisierung, rhsLetztemodernisierung)) {
                return false;
            }
        }
        {
            Zustand lhsZustand;
            lhsZustand = this.getZustand();
            Zustand rhsZustand;
            rhsZustand = that.getZustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustand", lhsZustand), LocatorUtils.property(thatLocator, "zustand", rhsZustand), lhsZustand, rhsZustand)) {
                return false;
            }
        }
        {
            Alter lhsAlter;
            lhsAlter = this.getAlter();
            Alter rhsAlter;
            rhsAlter = that.getAlter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alter", lhsAlter), LocatorUtils.property(thatLocator, "alter", rhsAlter), lhsAlter, rhsAlter)) {
                return false;
            }
        }
        {
            BebaubarNach lhsBebaubarNach;
            lhsBebaubarNach = this.getBebaubarNach();
            BebaubarNach rhsBebaubarNach;
            rhsBebaubarNach = that.getBebaubarNach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarNach", lhsBebaubarNach), LocatorUtils.property(thatLocator, "bebaubarNach", rhsBebaubarNach), lhsBebaubarNach, rhsBebaubarNach)) {
                return false;
            }
        }
        {
            Erschliessung lhsErschliessung;
            lhsErschliessung = this.getErschliessung();
            Erschliessung rhsErschliessung;
            rhsErschliessung = that.getErschliessung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessung", lhsErschliessung), LocatorUtils.property(thatLocator, "erschliessung", rhsErschliessung), lhsErschliessung, rhsErschliessung)) {
                return false;
            }
        }
        {
            ErschliessungUmfang lhsErschliessungUmfang;
            lhsErschliessungUmfang = this.getErschliessungUmfang();
            ErschliessungUmfang rhsErschliessungUmfang;
            rhsErschliessungUmfang = that.getErschliessungUmfang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessungUmfang", lhsErschliessungUmfang), LocatorUtils.property(thatLocator, "erschliessungUmfang", rhsErschliessungUmfang), lhsErschliessungUmfang, rhsErschliessungUmfang)) {
                return false;
            }
        }
        {
            String lhsBauzone;
            lhsBauzone = this.getBauzone();
            String rhsBauzone;
            rhsBauzone = that.getBauzone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bauzone", lhsBauzone), LocatorUtils.property(thatLocator, "bauzone", rhsBauzone), lhsBauzone, rhsBauzone)) {
                return false;
            }
        }
        {
            String lhsAltlasten;
            lhsAltlasten = this.getAltlasten();
            String rhsAltlasten;
            rhsAltlasten = that.getAltlasten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altlasten", lhsAltlasten), LocatorUtils.property(thatLocator, "altlasten", rhsAltlasten), lhsAltlasten, rhsAltlasten)) {
                return false;
            }
        }
        {
            List<Energiepass> lhsEnergiepass;
            lhsEnergiepass = (((this.energiepass!= null)&&(!this.energiepass.isEmpty()))?this.getEnergiepass():null);
            List<Energiepass> rhsEnergiepass;
            rhsEnergiepass = (((that.energiepass!= null)&&(!that.energiepass.isEmpty()))?that.getEnergiepass():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energiepass", lhsEnergiepass), LocatorUtils.property(thatLocator, "energiepass", rhsEnergiepass), lhsEnergiepass, rhsEnergiepass)) {
                return false;
            }
        }
        {
            Verkaufstatus lhsVerkaufstatus;
            lhsVerkaufstatus = this.getVerkaufstatus();
            Verkaufstatus rhsVerkaufstatus;
            rhsVerkaufstatus = that.getVerkaufstatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkaufstatus", lhsVerkaufstatus), LocatorUtils.property(thatLocator, "verkaufstatus", rhsVerkaufstatus), lhsVerkaufstatus, rhsVerkaufstatus)) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield)) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield)) {
                return false;
            }
        }
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend)) {
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
