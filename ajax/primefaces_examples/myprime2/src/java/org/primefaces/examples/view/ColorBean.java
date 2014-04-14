/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.examples.view;

import java.awt.Color;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ITU
 */
@ManagedBean
@RequestScoped
public class ColorBean {
		
			private Color color;
			
			private String rgbColor;
		
			public String getRgbColor() {
				return rgbColor;
			}
		
			public void setRgbColor(String rgbColor) {
				this.rgbColor = rgbColor;
			}
		
			public Color getColor() {
				return color;
			}
		
			public void setColor(Color color) {
				this.color = color;
			}
		}
