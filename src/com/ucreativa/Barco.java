/**
 * 
 */
package com.ucreativa;

/**
 * @author Heinz Gamboa
 *
 */
public class Barco {
	private String ambiente; //Tierra, Agua, Aire
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

	private int nPasajeros;
	private int nMotores;
	private String marca;
	/**
	 * 
	 */
	public Barco(String cualAmbiente, int numeroPasajeros, int numeroMotores, String marcaTransporte) {
		// TODO Auto-generated constructor stub
		ambiente = cualAmbiente;
		nPasajeros = numeroPasajeros;
		nMotores = numeroMotores;
		marca = marcaTransporte;
	}

	public void llamarAbordaje(boolean abordaje) {
	}
	
	public boolean zarpar(boolean zarparYa) {
		return zarparYa;
	}
	
	@Override
	protected void finalize() throws Throwable{ 
		System.out.println("Garbage collector fue llamado");
		System.out.println("El objeto destruido es: " + this); 
	} 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
