
package br.com.fiap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.11
 * Tue Jun 12 01:46:27 CEST 2018
 * Generated source version: 2.7.11
 */

@XmlRootElement(name = "WhatIsTheAnswer", namespace = "http://fiap.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WhatIsTheAnswer", namespace = "http://fiap.com.br/")

public class WhatIsTheAnswer {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}
