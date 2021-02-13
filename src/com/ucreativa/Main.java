/**
 * 
 */
package com.ucreativa;

/**
 * @author hp corei5
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicicleta myBike01 = new Bicicleta(2,"Calle",1,0,"Armstrong");
		Bicicleta myBike02 = new Bicicleta(2,"Montaña",1,0,"Mountain");
		myBike01 = null;
		System.gc();
		myBike02 = null;
		Runtime.getRuntime().gc();
		
		Barco myShip = new Barco("Oceano",1500,2,"Royal Caribean");
		myShip = null;
		System.gc();
		
		Avion myAirPlane = new Avion(6,"Aire",350,4,"Boeing");
		myAirPlane = null;
		Runtime.getRuntime().gc();
	}
}

