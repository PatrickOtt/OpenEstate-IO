//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.20 at 01:58:20 AM CET 
//


package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.SizeUnit;

public class Adapter18
    extends XmlAdapter<String, SizeUnit>
{


    public SizeUnit unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseSizeUnit(value));
    }

    public String marshal(SizeUnit value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printSizeUnit(value));
    }

}