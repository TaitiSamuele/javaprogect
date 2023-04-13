/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *La classe rappresenta e gestisce dati di tipo temporale
 * @author itismeucci
 */
public class Time {
    
    protected int secondi=0;
    protected int minuti=0;
    protected int ore=0;
/** 
 * @param secondi numero secondi 
 * @param minuti numero minuti
 * @param ore numero ore
 */
    
/**
 * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
 */    
    public Time(int secondi, int minuti, int ore) {
        this.secondi = secondi;
        this.minuti = minuti;
        this.ore = ore;
    }

    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     */
    public Time(int secondi) {
        int t;
        this.secondi = secondi % 60;
        t = (secondi - this.secondi)/60;
        this.minuti = t%60;
        this.ore = (t-this.minuti)/60;
    }
    /**
     * Restituisce il numero di minuti
     */
    public int getSecondi() {
        return secondi;
    }
    /**
     * Restituisce il numero di minuti
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }
    /**
     * Restituisce il numero di minuti
     */
    public int getMinuti() {
        return minuti;
    }
    /**
     * @deprecated 
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }
    /**
     * @deprecated 
     */
    public int getOre() {
        return ore;
    }
    /**
     * @deprecated 
     */
    public void setOre(int ore) {
        this.ore = ore;
    }
    /**
     * Vengono addizionati il numero di secondi specificati.
     * @param secondi 
     */
    public void addSecondi(int secondi){
        int t = this.secondi + secondi;
        this.secondi = t % 60;
        t = (t - this.secondi)/60;
        t += this.minuti;
        this.minuti = t%60;
        this.ore += (t-this.minuti)/60;
    }
    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi.
     * @return int secondi
     */
    public int convertiSecondi(){
        return secondi + minuti*60 + ore*3600;
    }
    /** 
     * Restituisce una stringa che rappresenta l'oggetto
     * @return string 
     */
    @Override
    public String toString() {
        return "Time{Ore " + ore +" minuti " + minuti + " secondi "+ secondi + "}";
    }
    
    
}
