package org.csystem.ejb;

import javax.ejb.Remote;

@Remote
public interface Hello3SesRemote {
	double topla(double sayi1, double sayi2);
}
