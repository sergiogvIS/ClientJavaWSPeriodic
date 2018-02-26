/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodic;

import org.simpleframework.xml.Element;

/**
 *
 * @author sergio
 */
public class Elemento {
    @Element
    private String AtomicNumber;
    @Element
    private String Symbol;
    @Element
    private String ElementName;
    @Element
    private String AtomicWeight;
    @Element
    private String BoilingPoint;
    @Element
    private String IonisationPotential;
    @Element
    private String EletroNegativity;
    @Element
    private String AtomicRadius;
    @Element
    private String MeltingPoint;
    @Element
    private String Density;

    public String getAtomicNumber() {
        return AtomicNumber;
    }

    public void setAtomicNumber(String AtomicNumber) {
        this.AtomicNumber = AtomicNumber;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public String getElementName() {
        return ElementName;
    }

    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    public String getAtomicWeight() {
        return AtomicWeight;
    }

    public void setAtomicWeight(String AtomicWeight) {
        this.AtomicWeight = AtomicWeight;
    }

    public String getBoilingPoint() {
        return BoilingPoint;
    }

    public void setBoilingPoint(String BoilingPoint) {
        this.BoilingPoint = BoilingPoint;
    }

    public String getIonisationPotential() {
        return IonisationPotential;
    }

    public void setIonisationPotential(String IonisationPotential) {
        this.IonisationPotential = IonisationPotential;
    }

    public String getEletroNegativity() {
        return EletroNegativity;
    }

    public void setEletroNegativity(String EletroNegativity) {
        this.EletroNegativity = EletroNegativity;
    }

    public String getAtomicRadius() {
        return AtomicRadius;
    }

    public void setAtomicRadius(String AtomicRadius) {
        this.AtomicRadius = AtomicRadius;
    }

    public String getMeltingPoint() {
        return MeltingPoint;
    }

    public void setMeltingPoint(String MeltingPoint) {
        this.MeltingPoint = MeltingPoint;
    }

    public String getDensity() {
        return Density;
    }

    public void setDensity(String Density) {
        this.Density = Density;
    }    
}
