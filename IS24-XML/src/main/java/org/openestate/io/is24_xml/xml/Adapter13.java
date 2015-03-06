
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseZahl52(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printZahl52(value));
    }

}
