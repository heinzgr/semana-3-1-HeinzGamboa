/**
 * 
 */
package com.ucreativa;

/**
 * @author Heinz Gamboa
 *
 */
public class Avion {
	private int nRuedas;
	public int getnRuedas() {
		return nRuedas;
	}

	public void setnRuedas(int nRuedas) {
		this.nRuedas = nRuedas;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public int getnPasajeros() {
		return nPasajeros;
	}

	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}

	public int getnMotores() {
		return nMotores;
	}

	public void setnMotores(int nMotores) {
		this.nMotores = nMotores;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	private String ambiente; //Tierra, Agua, Aire
	private int nPasajeros;
	private int nMotores;
	private String marca;
	
	
	/**
	 * 
	 */
	public Avion(int numeroRuedas, String cualAmbiente, int numeroPasajeros, int numeroMotores, String marcaTransporte) {
		// TODO Auto-generated constructor stub
		nRuedas = numeroRuedas;
		ambiente = cualAmbiente;
		nPasajeros = numeroPasajeros;
		nMotores = numeroMotores;
		marca = marcaTransporte;
	}

	public boolean subirTrenAtterizaje(boolean subirTren) {
		return subirTren;
	}
	
	public void despegar() {
		
	}
	
	public void aterrizar() {
		
	}
	
	@Override
	protected void finalize() throws Throwable{ 
		System.out.println("Garbage collector fue llamado");
		System.out.println("El objeto destruido es: " + this); 
		System.out.println();
	} 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
