
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for GewerbeImmoBaseTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GewerbeImmoBaseTyp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp">
 *       &lt;sequence>
 *         &lt;element name="BefeuerungsArt" type="{http://www.immobilienscout24.de/immobilientransfer}BefeuerungsArtTyp" minOccurs="0"/>
 *         &lt;element name="Energieausweis" type="{http://www.immobilienscout24.de/immobilientransfer}EnergieausweisTyp" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Gesamtflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="Nebenflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="TeilbarAb" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="Etagen" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
 *       &lt;attribute name="FreiAb" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
 *       &lt;attribute name="Baujahr" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" />
 *       &lt;attribute name="Objektzustand" type="{http://www.immobilienscout24.de/immobilientransfer}ObjektZustandTyp" default="keineAngabe" />
 *       &lt;attribute name="Personenaufzug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AnzahlParkflaechen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" />
 *       &lt;attribute name="FusswegOeNV" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" />
 *       &lt;attribute name="FahrzeitBHf" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" />
 *       &lt;attribute name="FahrzeitBAB" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" />
 *       &lt;attribute name="FahrzeitFlughafen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" />
 *       &lt;attribute name="Heizungsart" type="{http://www.immobilienscout24.de/immobilientransfer}HeizungsartTyp" />
 *       &lt;attribute name="JahrLetzteModernisierung" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" />
 *       &lt;attribute name="Ausstattungsqualitaet" type="{http://www.immobilienscout24.de/immobilientransfer}AusstattungsqualitaetsTyp" default="KeineAngabe" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GewerbeImmoBaseTyp", propOrder = {
    "befeuerungsArt",
    "energieausweis"
})
@XmlSeeAlso({
    GastronomieTyp.class,
    EinzelhandelTyp.class,
    BueroPraxisTyp.class,
    HalleProduktionTyp.class,
    AnlageObjektTyp.class,
    SonstigeGewerbeTyp.class
})
public abstract class GewerbeImmoBaseTyp
    extends ImmobilieBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "BefeuerungsArt")
    protected BefeuerungsArtTyp befeuerungsArt;
    @XmlElement(name = "Energieausweis")
    protected EnergieausweisTyp energieausweis;
    @XmlAttribute(name = "Gesamtflaeche")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double gesamtflaeche;
    @XmlAttribute(name = "Nebenflaeche")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double nebenflaeche;
    @XmlAttribute(name = "TeilbarAb")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double teilbarAb;
    @XmlAttribute(name = "Etagen")
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected String etagen;
    @XmlAttribute(name = "FreiAb")
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected String freiAb;
    @XmlAttribute(name = "Baujahr")
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected Long baujahr;
    @XmlAttribute(name = "Objektzustand")
    protected ObjektZustandTyp objektzustand;
    @XmlAttribute(name = "Personenaufzug")
    protected Boolean personenaufzug;
    @XmlAttribute(name = "AnzahlParkflaechen")
    @XmlJavaTypeAdapter(Adapter33 .class)
    protected Long anzahlParkflaechen;
    @XmlAttribute(name = "FusswegOeNV")
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected Long fusswegOeNV;
    @XmlAttribute(name = "FahrzeitBHf")
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected Long fahrzeitBHf;
    @XmlAttribute(name = "FahrzeitBAB")
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Long fahrzeitBAB;
    @XmlAttribute(name = "FahrzeitFlughafen")
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Long fahrzeitFlughafen;
    @XmlAttribute(name = "Heizungsart")
    protected HeizungsartTyp heizungsart;
    @XmlAttribute(name = "JahrLetzteModernisierung")
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected Long jahrLetzteModernisierung;
    @XmlAttribute(name = "Ausstattungsqualitaet")
    protected AusstattungsqualitaetsTyp ausstattungsqualitaet;

    /**
     * Gets the value of the befeuerungsArt property.
     * 
     * @return
     *     possible object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    public BefeuerungsArtTyp getBefeuerungsArt() {
        return befeuerungsArt;
    }

    /**
     * Sets the value of the befeuerungsArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    public void setBefeuerungsArt(BefeuerungsArtTyp value) {
        this.befeuerungsArt = value;
    }

    /**
     * Gets the value of the energieausweis property.
     * 
     * @return
     *     possible object is
     *     {@link EnergieausweisTyp }
     *     
     */
    public EnergieausweisTyp getEnergieausweis() {
        return energieausweis;
    }

    /**
     * Sets the value of the energieausweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergieausweisTyp }
     *     
     */
    public void setEnergieausweis(EnergieausweisTyp value) {
        this.energieausweis = value;
    }

    /**
     * Gets the value of the gesamtflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGesamtflaeche() {
        return gesamtflaeche;
    }

    /**
     * Sets the value of the gesamtflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesamtflaeche(Double value) {
        this.gesamtflaeche = value;
    }

    /**
     * Gets the value of the nebenflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNebenflaeche() {
        return nebenflaeche;
    }

    /**
     * Sets the value of the nebenflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNebenflaeche(Double value) {
        this.nebenflaeche = value;
    }

    /**
     * Gets the value of the teilbarAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getTeilbarAb() {
        return teilbarAb;
    }

    /**
     * Sets the value of the teilbarAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeilbarAb(Double value) {
        this.teilbarAb = value;
    }

    /**
     * Gets the value of the etagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtagen() {
        return etagen;
    }

    /**
     * Sets the value of the etagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtagen(String value) {
        this.etagen = value;
    }

    /**
     * Gets the value of the freiAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreiAb() {
        return freiAb;
    }

    /**
     * Sets the value of the freiAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreiAb(String value) {
        this.freiAb = value;
    }

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBaujahr() {
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
    public void setBaujahr(Long value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the objektzustand property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektZustandTyp }
     *     
     */
    public ObjektZustandTyp getObjektzustand() {
        if (objektzustand == null) {
            return ObjektZustandTyp.KEINE_ANGABE;
        } else {
            return objektzustand;
        }
    }

    /**
     * Sets the value of the objektzustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektZustandTyp }
     *     
     */
    public void setObjektzustand(ObjektZustandTyp value) {
        this.objektzustand = value;
    }

    /**
     * Gets the value of the personenaufzug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonenaufzug() {
        return personenaufzug;
    }

    /**
     * Sets the value of the personenaufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonenaufzug(Boolean value) {
        this.personenaufzug = value;
    }

    /**
     * Gets the value of the anzahlParkflaechen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnzahlParkflaechen() {
        return anzahlParkflaechen;
    }

    /**
     * Sets the value of the anzahlParkflaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlParkflaechen(Long value) {
        this.anzahlParkflaechen = value;
    }

    /**
     * Gets the value of the fusswegOeNV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFusswegOeNV() {
        return fusswegOeNV;
    }

    /**
     * Sets the value of the fusswegOeNV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFusswegOeNV(Long value) {
        this.fusswegOeNV = value;
    }

    /**
     * Gets the value of the fahrzeitBHf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFahrzeitBHf() {
        return fahrzeitBHf;
    }

    /**
     * Sets the value of the fahrzeitBHf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFahrzeitBHf(Long value) {
        this.fahrzeitBHf = value;
    }

    /**
     * Gets the value of the fahrzeitBAB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFahrzeitBAB() {
        return fahrzeitBAB;
    }

    /**
     * Sets the value of the fahrzeitBAB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFahrzeitBAB(Long value) {
        this.fahrzeitBAB = value;
    }

    /**
     * Gets the value of the fahrzeitFlughafen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFahrzeitFlughafen() {
        return fahrzeitFlughafen;
    }

    /**
     * Sets the value of the fahrzeitFlughafen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFahrzeitFlughafen(Long value) {
        this.fahrzeitFlughafen = value;
    }

    /**
     * Gets the value of the heizungsart property.
     * 
     * @return
     *     possible object is
     *     {@link HeizungsartTyp }
     *     
     */
    public HeizungsartTyp getHeizungsart() {
        return heizungsart;
    }

    /**
     * Sets the value of the heizungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeizungsartTyp }
     *     
     */
    public void setHeizungsart(HeizungsartTyp value) {
        this.heizungsart = value;
    }

    /**
     * Gets the value of the jahrLetzteModernisierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getJahrLetzteModernisierung() {
        return jahrLetzteModernisierung;
    }

    /**
     * Sets the value of the jahrLetzteModernisierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJahrLetzteModernisierung(Long value) {
        this.jahrLetzteModernisierung = value;
    }

    /**
     * Gets the value of the ausstattungsqualitaet property.
     * 
     * @return
     *     possible object is
     *     {@link AusstattungsqualitaetsTyp }
     *     
     */
    public AusstattungsqualitaetsTyp getAusstattungsqualitaet() {
        if (ausstattungsqualitaet == null) {
            return AusstattungsqualitaetsTyp.KEINE_ANGABE;
        } else {
            return ausstattungsqualitaet;
        }
    }

    /**
     * Sets the value of the ausstattungsqualitaet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AusstattungsqualitaetsTyp }
     *     
     */
    public void setAusstattungsqualitaet(AusstattungsqualitaetsTyp value) {
        this.ausstattungsqualitaet = value;
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
            BefeuerungsArtTyp theBefeuerungsArt;
            theBefeuerungsArt = this.getBefeuerungsArt();
            strategy.appendField(locator, this, "befeuerungsArt", buffer, theBefeuerungsArt);
        }
        {
            EnergieausweisTyp theEnergieausweis;
            theEnergieausweis = this.getEnergieausweis();
            strategy.appendField(locator, this, "energieausweis", buffer, theEnergieausweis);
        }
        {
            Double theGesamtflaeche;
            theGesamtflaeche = this.getGesamtflaeche();
            strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche);
        }
        {
            Double theNebenflaeche;
            theNebenflaeche = this.getNebenflaeche();
            strategy.appendField(locator, this, "nebenflaeche", buffer, theNebenflaeche);
        }
        {
            Double theTeilbarAb;
            theTeilbarAb = this.getTeilbarAb();
            strategy.appendField(locator, this, "teilbarAb", buffer, theTeilbarAb);
        }
        {
            String theEtagen;
            theEtagen = this.getEtagen();
            strategy.appendField(locator, this, "etagen", buffer, theEtagen);
        }
        {
            String theFreiAb;
            theFreiAb = this.getFreiAb();
            strategy.appendField(locator, this, "freiAb", buffer, theFreiAb);
        }
        {
            Long theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr);
        }
        {
            ObjektZustandTyp theObjektzustand;
            theObjektzustand = this.getObjektzustand();
            strategy.appendField(locator, this, "objektzustand", buffer, theObjektzustand);
        }
        {
            Boolean thePersonenaufzug;
            thePersonenaufzug = this.isPersonenaufzug();
            strategy.appendField(locator, this, "personenaufzug", buffer, thePersonenaufzug);
        }
        {
            Long theAnzahlParkflaechen;
            theAnzahlParkflaechen = this.getAnzahlParkflaechen();
            strategy.appendField(locator, this, "anzahlParkflaechen", buffer, theAnzahlParkflaechen);
        }
        {
            Long theFusswegOeNV;
            theFusswegOeNV = this.getFusswegOeNV();
            strategy.appendField(locator, this, "fusswegOeNV", buffer, theFusswegOeNV);
        }
        {
            Long theFahrzeitBHf;
            theFahrzeitBHf = this.getFahrzeitBHf();
            strategy.appendField(locator, this, "fahrzeitBHf", buffer, theFahrzeitBHf);
        }
        {
            Long theFahrzeitBAB;
            theFahrzeitBAB = this.getFahrzeitBAB();
            strategy.appendField(locator, this, "fahrzeitBAB", buffer, theFahrzeitBAB);
        }
        {
            Long theFahrzeitFlughafen;
            theFahrzeitFlughafen = this.getFahrzeitFlughafen();
            strategy.appendField(locator, this, "fahrzeitFlughafen", buffer, theFahrzeitFlughafen);
        }
        {
            HeizungsartTyp theHeizungsart;
            theHeizungsart = this.getHeizungsart();
            strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart);
        }
        {
            Long theJahrLetzteModernisierung;
            theJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            strategy.appendField(locator, this, "jahrLetzteModernisierung", buffer, theJahrLetzteModernisierung);
        }
        {
            AusstattungsqualitaetsTyp theAusstattungsqualitaet;
            theAusstattungsqualitaet = this.getAusstattungsqualitaet();
            strategy.appendField(locator, this, "ausstattungsqualitaet", buffer, theAusstattungsqualitaet);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof GewerbeImmoBaseTyp) {
            final GewerbeImmoBaseTyp copy = ((GewerbeImmoBaseTyp) target);
            if (this.befeuerungsArt!= null) {
                BefeuerungsArtTyp sourceBefeuerungsArt;
                sourceBefeuerungsArt = this.getBefeuerungsArt();
                BefeuerungsArtTyp copyBefeuerungsArt = ((BefeuerungsArtTyp) strategy.copy(LocatorUtils.property(locator, "befeuerungsArt", sourceBefeuerungsArt), sourceBefeuerungsArt));
                copy.setBefeuerungsArt(copyBefeuerungsArt);
            } else {
                copy.befeuerungsArt = null;
            }
            if (this.energieausweis!= null) {
                EnergieausweisTyp sourceEnergieausweis;
                sourceEnergieausweis = this.getEnergieausweis();
                EnergieausweisTyp copyEnergieausweis = ((EnergieausweisTyp) strategy.copy(LocatorUtils.property(locator, "energieausweis", sourceEnergieausweis), sourceEnergieausweis));
                copy.setEnergieausweis(copyEnergieausweis);
            } else {
                copy.energieausweis = null;
            }
            if (this.gesamtflaeche!= null) {
                Double sourceGesamtflaeche;
                sourceGesamtflaeche = this.getGesamtflaeche();
                Double copyGesamtflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche));
                copy.setGesamtflaeche(copyGesamtflaeche);
            } else {
                copy.gesamtflaeche = null;
            }
            if (this.nebenflaeche!= null) {
                Double sourceNebenflaeche;
                sourceNebenflaeche = this.getNebenflaeche();
                Double copyNebenflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "nebenflaeche", sourceNebenflaeche), sourceNebenflaeche));
                copy.setNebenflaeche(copyNebenflaeche);
            } else {
                copy.nebenflaeche = null;
            }
            if (this.teilbarAb!= null) {
                Double sourceTeilbarAb;
                sourceTeilbarAb = this.getTeilbarAb();
                Double copyTeilbarAb = ((Double) strategy.copy(LocatorUtils.property(locator, "teilbarAb", sourceTeilbarAb), sourceTeilbarAb));
                copy.setTeilbarAb(copyTeilbarAb);
            } else {
                copy.teilbarAb = null;
            }
            if (this.etagen!= null) {
                String sourceEtagen;
                sourceEtagen = this.getEtagen();
                String copyEtagen = ((String) strategy.copy(LocatorUtils.property(locator, "etagen", sourceEtagen), sourceEtagen));
                copy.setEtagen(copyEtagen);
            } else {
                copy.etagen = null;
            }
            if (this.freiAb!= null) {
                String sourceFreiAb;
                sourceFreiAb = this.getFreiAb();
                String copyFreiAb = ((String) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb));
                copy.setFreiAb(copyFreiAb);
            } else {
                copy.freiAb = null;
            }
            if (this.baujahr!= null) {
                Long sourceBaujahr;
                sourceBaujahr = this.getBaujahr();
                Long copyBaujahr = ((Long) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr));
                copy.setBaujahr(copyBaujahr);
            } else {
                copy.baujahr = null;
            }
            if (this.objektzustand!= null) {
                ObjektZustandTyp sourceObjektzustand;
                sourceObjektzustand = this.getObjektzustand();
                ObjektZustandTyp copyObjektzustand = ((ObjektZustandTyp) strategy.copy(LocatorUtils.property(locator, "objektzustand", sourceObjektzustand), sourceObjektzustand));
                copy.setObjektzustand(copyObjektzustand);
            } else {
                copy.objektzustand = null;
            }
            if (this.personenaufzug!= null) {
                Boolean sourcePersonenaufzug;
                sourcePersonenaufzug = this.isPersonenaufzug();
                Boolean copyPersonenaufzug = ((Boolean) strategy.copy(LocatorUtils.property(locator, "personenaufzug", sourcePersonenaufzug), sourcePersonenaufzug));
                copy.setPersonenaufzug(copyPersonenaufzug);
            } else {
                copy.personenaufzug = null;
            }
            if (this.anzahlParkflaechen!= null) {
                Long sourceAnzahlParkflaechen;
                sourceAnzahlParkflaechen = this.getAnzahlParkflaechen();
                Long copyAnzahlParkflaechen = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlParkflaechen", sourceAnzahlParkflaechen), sourceAnzahlParkflaechen));
                copy.setAnzahlParkflaechen(copyAnzahlParkflaechen);
            } else {
                copy.anzahlParkflaechen = null;
            }
            if (this.fusswegOeNV!= null) {
                Long sourceFusswegOeNV;
                sourceFusswegOeNV = this.getFusswegOeNV();
                Long copyFusswegOeNV = ((Long) strategy.copy(LocatorUtils.property(locator, "fusswegOeNV", sourceFusswegOeNV), sourceFusswegOeNV));
                copy.setFusswegOeNV(copyFusswegOeNV);
            } else {
                copy.fusswegOeNV = null;
            }
            if (this.fahrzeitBHf!= null) {
                Long sourceFahrzeitBHf;
                sourceFahrzeitBHf = this.getFahrzeitBHf();
                Long copyFahrzeitBHf = ((Long) strategy.copy(LocatorUtils.property(locator, "fahrzeitBHf", sourceFahrzeitBHf), sourceFahrzeitBHf));
                copy.setFahrzeitBHf(copyFahrzeitBHf);
            } else {
                copy.fahrzeitBHf = null;
            }
            if (this.fahrzeitBAB!= null) {
                Long sourceFahrzeitBAB;
                sourceFahrzeitBAB = this.getFahrzeitBAB();
                Long copyFahrzeitBAB = ((Long) strategy.copy(LocatorUtils.property(locator, "fahrzeitBAB", sourceFahrzeitBAB), sourceFahrzeitBAB));
                copy.setFahrzeitBAB(copyFahrzeitBAB);
            } else {
                copy.fahrzeitBAB = null;
            }
            if (this.fahrzeitFlughafen!= null) {
                Long sourceFahrzeitFlughafen;
                sourceFahrzeitFlughafen = this.getFahrzeitFlughafen();
                Long copyFahrzeitFlughafen = ((Long) strategy.copy(LocatorUtils.property(locator, "fahrzeitFlughafen", sourceFahrzeitFlughafen), sourceFahrzeitFlughafen));
                copy.setFahrzeitFlughafen(copyFahrzeitFlughafen);
            } else {
                copy.fahrzeitFlughafen = null;
            }
            if (this.heizungsart!= null) {
                HeizungsartTyp sourceHeizungsart;
                sourceHeizungsart = this.getHeizungsart();
                HeizungsartTyp copyHeizungsart = ((HeizungsartTyp) strategy.copy(LocatorUtils.property(locator, "heizungsart", sourceHeizungsart), sourceHeizungsart));
                copy.setHeizungsart(copyHeizungsart);
            } else {
                copy.heizungsart = null;
            }
            if (this.jahrLetzteModernisierung!= null) {
                Long sourceJahrLetzteModernisierung;
                sourceJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
                Long copyJahrLetzteModernisierung = ((Long) strategy.copy(LocatorUtils.property(locator, "jahrLetzteModernisierung", sourceJahrLetzteModernisierung), sourceJahrLetzteModernisierung));
                copy.setJahrLetzteModernisierung(copyJahrLetzteModernisierung);
            } else {
                copy.jahrLetzteModernisierung = null;
            }
            if (this.ausstattungsqualitaet!= null) {
                AusstattungsqualitaetsTyp sourceAusstattungsqualitaet;
                sourceAusstattungsqualitaet = this.getAusstattungsqualitaet();
                AusstattungsqualitaetsTyp copyAusstattungsqualitaet = ((AusstattungsqualitaetsTyp) strategy.copy(LocatorUtils.property(locator, "ausstattungsqualitaet", sourceAusstattungsqualitaet), sourceAusstattungsqualitaet));
                copy.setAusstattungsqualitaet(copyAusstattungsqualitaet);
            } else {
                copy.ausstattungsqualitaet = null;
            }
        }
        return target;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GewerbeImmoBaseTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GewerbeImmoBaseTyp that = ((GewerbeImmoBaseTyp) object);
        {
            BefeuerungsArtTyp lhsBefeuerungsArt;
            lhsBefeuerungsArt = this.getBefeuerungsArt();
            BefeuerungsArtTyp rhsBefeuerungsArt;
            rhsBefeuerungsArt = that.getBefeuerungsArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befeuerungsArt", lhsBefeuerungsArt), LocatorUtils.property(thatLocator, "befeuerungsArt", rhsBefeuerungsArt), lhsBefeuerungsArt, rhsBefeuerungsArt)) {
                return false;
            }
        }
        {
            EnergieausweisTyp lhsEnergieausweis;
            lhsEnergieausweis = this.getEnergieausweis();
            EnergieausweisTyp rhsEnergieausweis;
            rhsEnergieausweis = that.getEnergieausweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweis", lhsEnergieausweis), LocatorUtils.property(thatLocator, "energieausweis", rhsEnergieausweis), lhsEnergieausweis, rhsEnergieausweis)) {
                return false;
            }
        }
        {
            Double lhsGesamtflaeche;
            lhsGesamtflaeche = this.getGesamtflaeche();
            Double rhsGesamtflaeche;
            rhsGesamtflaeche = that.getGesamtflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche)) {
                return false;
            }
        }
        {
            Double lhsNebenflaeche;
            lhsNebenflaeche = this.getNebenflaeche();
            Double rhsNebenflaeche;
            rhsNebenflaeche = that.getNebenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenflaeche", lhsNebenflaeche), LocatorUtils.property(thatLocator, "nebenflaeche", rhsNebenflaeche), lhsNebenflaeche, rhsNebenflaeche)) {
                return false;
            }
        }
        {
            Double lhsTeilbarAb;
            lhsTeilbarAb = this.getTeilbarAb();
            Double rhsTeilbarAb;
            rhsTeilbarAb = that.getTeilbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilbarAb", lhsTeilbarAb), LocatorUtils.property(thatLocator, "teilbarAb", rhsTeilbarAb), lhsTeilbarAb, rhsTeilbarAb)) {
                return false;
            }
        }
        {
            String lhsEtagen;
            lhsEtagen = this.getEtagen();
            String rhsEtagen;
            rhsEtagen = that.getEtagen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etagen", lhsEtagen), LocatorUtils.property(thatLocator, "etagen", rhsEtagen), lhsEtagen, rhsEtagen)) {
                return false;
            }
        }
        {
            String lhsFreiAb;
            lhsFreiAb = this.getFreiAb();
            String rhsFreiAb;
            rhsFreiAb = that.getFreiAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb)) {
                return false;
            }
        }
        {
            Long lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            Long rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr)) {
                return false;
            }
        }
        {
            ObjektZustandTyp lhsObjektzustand;
            lhsObjektzustand = this.getObjektzustand();
            ObjektZustandTyp rhsObjektzustand;
            rhsObjektzustand = that.getObjektzustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektzustand", lhsObjektzustand), LocatorUtils.property(thatLocator, "objektzustand", rhsObjektzustand), lhsObjektzustand, rhsObjektzustand)) {
                return false;
            }
        }
        {
            Boolean lhsPersonenaufzug;
            lhsPersonenaufzug = this.isPersonenaufzug();
            Boolean rhsPersonenaufzug;
            rhsPersonenaufzug = that.isPersonenaufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personenaufzug", lhsPersonenaufzug), LocatorUtils.property(thatLocator, "personenaufzug", rhsPersonenaufzug), lhsPersonenaufzug, rhsPersonenaufzug)) {
                return false;
            }
        }
        {
            Long lhsAnzahlParkflaechen;
            lhsAnzahlParkflaechen = this.getAnzahlParkflaechen();
            Long rhsAnzahlParkflaechen;
            rhsAnzahlParkflaechen = that.getAnzahlParkflaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlParkflaechen", lhsAnzahlParkflaechen), LocatorUtils.property(thatLocator, "anzahlParkflaechen", rhsAnzahlParkflaechen), lhsAnzahlParkflaechen, rhsAnzahlParkflaechen)) {
                return false;
            }
        }
        {
            Long lhsFusswegOeNV;
            lhsFusswegOeNV = this.getFusswegOeNV();
            Long rhsFusswegOeNV;
            rhsFusswegOeNV = that.getFusswegOeNV();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fusswegOeNV", lhsFusswegOeNV), LocatorUtils.property(thatLocator, "fusswegOeNV", rhsFusswegOeNV), lhsFusswegOeNV, rhsFusswegOeNV)) {
                return false;
            }
        }
        {
            Long lhsFahrzeitBHf;
            lhsFahrzeitBHf = this.getFahrzeitBHf();
            Long rhsFahrzeitBHf;
            rhsFahrzeitBHf = that.getFahrzeitBHf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrzeitBHf", lhsFahrzeitBHf), LocatorUtils.property(thatLocator, "fahrzeitBHf", rhsFahrzeitBHf), lhsFahrzeitBHf, rhsFahrzeitBHf)) {
                return false;
            }
        }
        {
            Long lhsFahrzeitBAB;
            lhsFahrzeitBAB = this.getFahrzeitBAB();
            Long rhsFahrzeitBAB;
            rhsFahrzeitBAB = that.getFahrzeitBAB();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrzeitBAB", lhsFahrzeitBAB), LocatorUtils.property(thatLocator, "fahrzeitBAB", rhsFahrzeitBAB), lhsFahrzeitBAB, rhsFahrzeitBAB)) {
                return false;
            }
        }
        {
            Long lhsFahrzeitFlughafen;
            lhsFahrzeitFlughafen = this.getFahrzeitFlughafen();
            Long rhsFahrzeitFlughafen;
            rhsFahrzeitFlughafen = that.getFahrzeitFlughafen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrzeitFlughafen", lhsFahrzeitFlughafen), LocatorUtils.property(thatLocator, "fahrzeitFlughafen", rhsFahrzeitFlughafen), lhsFahrzeitFlughafen, rhsFahrzeitFlughafen)) {
                return false;
            }
        }
        {
            HeizungsartTyp lhsHeizungsart;
            lhsHeizungsart = this.getHeizungsart();
            HeizungsartTyp rhsHeizungsart;
            rhsHeizungsart = that.getHeizungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizungsart", lhsHeizungsart), LocatorUtils.property(thatLocator, "heizungsart", rhsHeizungsart), lhsHeizungsart, rhsHeizungsart)) {
                return false;
            }
        }
        {
            Long lhsJahrLetzteModernisierung;
            lhsJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            Long rhsJahrLetzteModernisierung;
            rhsJahrLetzteModernisierung = that.getJahrLetzteModernisierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jahrLetzteModernisierung", lhsJahrLetzteModernisierung), LocatorUtils.property(thatLocator, "jahrLetzteModernisierung", rhsJahrLetzteModernisierung), lhsJahrLetzteModernisierung, rhsJahrLetzteModernisierung)) {
                return false;
            }
        }
        {
            AusstattungsqualitaetsTyp lhsAusstattungsqualitaet;
            lhsAusstattungsqualitaet = this.getAusstattungsqualitaet();
            AusstattungsqualitaetsTyp rhsAusstattungsqualitaet;
            rhsAusstattungsqualitaet = that.getAusstattungsqualitaet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattungsqualitaet", lhsAusstattungsqualitaet), LocatorUtils.property(thatLocator, "ausstattungsqualitaet", rhsAusstattungsqualitaet), lhsAusstattungsqualitaet, rhsAusstattungsqualitaet)) {
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
