/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.ejb;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class NewsEntity implements Serializable{

    private String title, body;

    public NewsEntity(String title, String body) {
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
       return title+","+body;
    }
    
    
}
