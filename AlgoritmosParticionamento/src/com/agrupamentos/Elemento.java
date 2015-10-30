package com.agrupamentos;

public class Elemento {
	private double[] cordenada;
	private Centroid centro;
	private int classe;
	private Elemento proximo;
	private int numero;
	private double distanciaCentro;
	private double[] grauPertinencia;

	public Elemento(int classe, double[] cordenada, int numero) {
		this.classe = classe;
		this.proximo = null;
		this.numero = numero;

		this.cordenada = cordenada;
	}

	public double[] getCordenada() {
		return this.cordenada;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Centroid getCentro() {
		return centro;
	}

	public void setCentro(Centroid centro) {
		this.centro = centro;
	}

	public double getDistanciaCentro() {
		return distanciaCentro;
	}

	public void setDistanciaCentro(double distanciaCentro) {
		this.distanciaCentro = distanciaCentro;
	}

	public double[] getGrauPertinencia() {
		return grauPertinencia;
	}

	public void setGrauPertinencia(double[] grauPertinencia) {
		this.grauPertinencia = grauPertinencia;
	}

}
