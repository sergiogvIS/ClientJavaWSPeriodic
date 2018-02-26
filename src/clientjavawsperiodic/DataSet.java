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
public class DataSet {
        @Element
    private Elemento Table;

    public Elemento getTable() {
        return Table;
    }

    public void setTable(Elemento Table) {
        this.Table = Table;
    }
    
}
