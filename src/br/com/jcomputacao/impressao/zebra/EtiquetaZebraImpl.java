/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.impressao.zebra;

/**
 * 26/08/2009 12:15:39
 * @author Kelli
 */
public class EtiquetaZebraImpl implements EtiquetaZebra {

    //DEFINICOES DA PRIMEIRA LINHA
    private int primeiraLinhaEtiquetaUmPosicaoX;
    private int primeiraLinhaEtiquetaUmPosicaoY;
    private int primeiraLinhaEtiquetaUmFonteTamanhoX;
    private int primeiraLinhaEtiquetaUmFonteTamanhoY;
    private String primeiraLinhaEtiquetaUmTexto;
    private int primeiraLinhaEtiquetaDoisPosicaoX;
    private int primeiraLinhaEtiquetaDoisPosicaoY;
    private int primeiraLinhaEtiquetaDoisFonteTamanhoX;
    private int primeiraLinhaEtiquetaDoisFonteTamanhoY;
    private String primeiraLinhaEtiquetaDoisTexto;
    private int primeiraLinhaEtiquetaTresPosicaoX;
    private int primeiraLinhaEtiquetaTresPosicaoY;
    private int primeiraLinhaEtiquetaTresFonteTamanhoX;
    private int primeiraLinhaEtiquetaTresFonteTamanhoY;
    private String primeiraLinhaEtiquetaTresTexto;
    //DEFINICOES DA SEGUNDA LINHA
    private int segundaLinhaEtiquetaUmPosicaoX;
    private int segundaLinhaEtiquetaUmPosicaoY;
    private int segundaLinhaEtiquetaUmFonteTamanhoX;
    private int segundaLinhaEtiquetaUmFonteTamanhoY;
    private String segundaLinhaEtiquetaUmTexto;
    private int segundaLinhaEtiquetaDoisPosicaoX;
    private int segundaLinhaEtiquetaDoisPosicaoY;
    private int segundaLinhaEtiquetaDoisFonteTamanhoX;
    private int segundaLinhaEtiquetaDoisFonteTamanhoY;
    private String segundaLinhaEtiquetaDoisTexto;
    private int segundaLinhaEtiquetaTresPosicaoX;
    private int segundaLinhaEtiquetaTresPosicaoY;
    private int segundaLinhaEtiquetaTresFonteTamanhoX;
    private int segundaLinhaEtiquetaTresFonteTamanhoY;
    private String segundaLinhaEtiquetaTresTexto;
    //DEFINICOES DA TERCEIRA LINHA
    private int terceiraLinhaEtiquetaUmPosicaoX;
    private int terceiraLinhaEtiquetaUmPosicaoY;
    private int terceiraLinhaEtiquetaUmFonteTamanhoX;
    private int terceiraLinhaEtiquetaUmFonteTamanhoY;
    private String terceiraLinhaEtiquetaUmTexto;
    private int terceiraLinhaEtiquetaDoisPosicaoX;
    private int terceiraLinhaEtiquetaDoisPosicaoY;
    private int terceiraLinhaEtiquetaDoisFonteTamanhoX;
    private int terceiraLinhaEtiquetaDoisFonteTamanhoY;
    private String terceiraLinhaEtiquetaDoisTexto;
    private int terceiraLinhaEtiquetaTresPosicaoX;
    private int terceiraLinhaEtiquetaTresPosicaoY;
    private int terceiraLinhaEtiquetaTresFonteTamanhoX;
    private int terceiraLinhaEtiquetaTresFonteTamanhoY;
    private String terceiraLinhaEtiquetaTresTexto;
    //DEFINICOES CODIGO DE BARRAS
    private int codigoBarrasEtiquetaUmPosicaoX;
    private int codigoBarrasEtiquetaUmPosicaoY;
    private int codigoBarrasEtiquetaUmLargura;
    private String codigoBarrasEtiquetaUmFormato;
    private int codigoBarrasEtiquetaUmAltura;
    private String codigoBarrasEtiquetaUmTexto;
    private int codigoBarrasEtiquetaDoisPosicaoX;
    private int codigoBarrasEtiquetaDoisPosicaoY;
    private int codigoBarrasEtiquetaDoisLargura;
    private String codigoBarrasEtiquetaDoisFormato;
    private int codigoBarrasEtiquetaDoisAltura;
    private String codigoBarrasEtiquetaDoisTexto;
    private int codigoBarrasEtiquetaTresPosicaoX;
    private int codigoBarrasEtiquetaTresPosicaoY;
    private int codigoBarrasEtiquetaTresLargura;
    private String codigoBarrasEtiquetaTresFormato;
    private int codigoBarrasEtiquetaTresAltura;
    private String codigoBarrasEtiquetaTresTexto;

    public int getCodigoBarrasEtiquetaDoisAltura() {
        return codigoBarrasEtiquetaDoisAltura;
    }

    public void setCodigoBarrasEtiquetaDoisAltura(int codigoBarrasEtiquetaDoisAltura) {
        this.codigoBarrasEtiquetaDoisAltura = codigoBarrasEtiquetaDoisAltura;
    }

    public String getCodigoBarrasEtiquetaDoisFormato() {
        return codigoBarrasEtiquetaDoisFormato;
    }

    public void setCodigoBarrasEtiquetaDoisFormato(String codigoBarrasEtiquetaDoisFormato) {
        this.codigoBarrasEtiquetaDoisFormato = codigoBarrasEtiquetaDoisFormato;
    }

    public int getCodigoBarrasEtiquetaDoisLargura() {
        return codigoBarrasEtiquetaDoisLargura;
    }

    public void setCodigoBarrasEtiquetaDoisLargura(int codigoBarrasEtiquetaDoisLargura) {
        this.codigoBarrasEtiquetaDoisLargura = codigoBarrasEtiquetaDoisLargura;
    }

    public int getCodigoBarrasEtiquetaDoisPosicaoX() {
        return codigoBarrasEtiquetaDoisPosicaoX;
    }

    public void setCodigoBarrasEtiquetaDoisPosicaoX(int codigoBarrasEtiquetaDoisPosicaoX) {
        this.codigoBarrasEtiquetaDoisPosicaoX = codigoBarrasEtiquetaDoisPosicaoX;
    }

    public int getCodigoBarrasEtiquetaDoisPosicaoY() {
        return codigoBarrasEtiquetaDoisPosicaoY;
    }

    public void setCodigoBarrasEtiquetaDoisPosicaoY(int codigoBarrasEtiquetaDoisPosicaoY) {
        this.codigoBarrasEtiquetaDoisPosicaoY = codigoBarrasEtiquetaDoisPosicaoY;
    }

    public String getCodigoBarrasEtiquetaDoisTexto() {
        return codigoBarrasEtiquetaDoisTexto;
    }

    public void setCodigoBarrasEtiquetaDoisTexto(String codigoBarrasEtiquetaDoisTexto) {
        this.codigoBarrasEtiquetaDoisTexto = codigoBarrasEtiquetaDoisTexto;
    }

    public int getCodigoBarrasEtiquetaTresAltura() {
        return codigoBarrasEtiquetaTresAltura;
    }

    public void setCodigoBarrasEtiquetaTresAltura(int codigoBarrasEtiquetaTresAltura) {
        this.codigoBarrasEtiquetaTresAltura = codigoBarrasEtiquetaTresAltura;
    }

    public String getCodigoBarrasEtiquetaTresFormato() {
        return codigoBarrasEtiquetaTresFormato;
    }

    public void setCodigoBarrasEtiquetaTresFormato(String codigoBarrasEtiquetaTresFormato) {
        this.codigoBarrasEtiquetaTresFormato = codigoBarrasEtiquetaTresFormato;
    }

    public int getCodigoBarrasEtiquetaTresLargura() {
        return codigoBarrasEtiquetaTresLargura;
    }

    public void setCodigoBarrasEtiquetaTresLargura(int codigoBarrasEtiquetaTresLargura) {
        this.codigoBarrasEtiquetaTresLargura = codigoBarrasEtiquetaTresLargura;
    }

    public int getCodigoBarrasEtiquetaTresPosicaoX() {
        return codigoBarrasEtiquetaTresPosicaoX;
    }

    public void setCodigoBarrasEtiquetaTresPosicaoX(int codigoBarrasEtiquetaTresPosicaoX) {
        this.codigoBarrasEtiquetaTresPosicaoX = codigoBarrasEtiquetaTresPosicaoX;
    }

    public int getCodigoBarrasEtiquetaTresPosicaoY() {
        return codigoBarrasEtiquetaTresPosicaoY;
    }

    public void setCodigoBarrasEtiquetaTresPosicaoY(int codigoBarrasEtiquetaTresPosicaoY) {
        this.codigoBarrasEtiquetaTresPosicaoY = codigoBarrasEtiquetaTresPosicaoY;
    }

    public String getCodigoBarrasEtiquetaTresTexto() {
        return codigoBarrasEtiquetaTresTexto;
    }

    public void setCodigoBarrasEtiquetaTresTexto(String codigoBarrasEtiquetaTresTexto) {
        this.codigoBarrasEtiquetaTresTexto = codigoBarrasEtiquetaTresTexto;
    }

    public int getCodigoBarrasEtiquetaUmAltura() {
        return codigoBarrasEtiquetaUmAltura;
    }

    public void setCodigoBarrasEtiquetaUmAltura(int codigoBarrasEtiquetaUmAltura) {
        this.codigoBarrasEtiquetaUmAltura = codigoBarrasEtiquetaUmAltura;
    }

    public String getCodigoBarrasEtiquetaUmFormato() {
        return codigoBarrasEtiquetaUmFormato;
    }

    public void setCodigoBarrasEtiquetaUmFormato(String codigoBarrasEtiquetaUmFormato) {
        this.codigoBarrasEtiquetaUmFormato = codigoBarrasEtiquetaUmFormato;
    }

    public int getCodigoBarrasEtiquetaUmLargura() {
        return codigoBarrasEtiquetaUmLargura;
    }

    public void setCodigoBarrasEtiquetaUmLargura(int codigoBarrasEtiquetaUmLargura) {
        this.codigoBarrasEtiquetaUmLargura = codigoBarrasEtiquetaUmLargura;
    }

    public int getCodigoBarrasEtiquetaUmPosicaoX() {
        return codigoBarrasEtiquetaUmPosicaoX;
    }

    public void setCodigoBarrasEtiquetaUmPosicaoX(int codigoBarrasEtiquetaUmPosicaoX) {
        this.codigoBarrasEtiquetaUmPosicaoX = codigoBarrasEtiquetaUmPosicaoX;
    }

    public int getCodigoBarrasEtiquetaUmPosicaoY() {
        return codigoBarrasEtiquetaUmPosicaoY;
    }

    public void setCodigoBarrasEtiquetaUmPosicaoY(int codigoBarrasEtiquetaUmPosicaoY) {
        this.codigoBarrasEtiquetaUmPosicaoY = codigoBarrasEtiquetaUmPosicaoY;
    }

    public String getCodigoBarrasEtiquetaUmTexto() {
        return codigoBarrasEtiquetaUmTexto;
    }

    public void setCodigoBarrasEtiquetaUmTexto(String codigoBarrasEtiquetaUmTexto) {
        this.codigoBarrasEtiquetaUmTexto = codigoBarrasEtiquetaUmTexto;
    }

    public int getPrimeiraLinhaEtiquetaDoisFonteTamanhoX() {
        return primeiraLinhaEtiquetaDoisFonteTamanhoX;
    }

    public void setPrimeiraLinhaEtiquetaDoisFonteTamanhoX(int primeiraLinhaEtiquetaDoisFonteTamanhoX) {
        this.primeiraLinhaEtiquetaDoisFonteTamanhoX = primeiraLinhaEtiquetaDoisFonteTamanhoX;
    }

    public int getPrimeiraLinhaEtiquetaDoisFonteTamanhoY() {
        return primeiraLinhaEtiquetaDoisFonteTamanhoY;
    }

    public void setPrimeiraLinhaEtiquetaDoisFonteTamanhoY(int primeiraLinhaEtiquetaDoisFonteTamanhoY) {
        this.primeiraLinhaEtiquetaDoisFonteTamanhoY = primeiraLinhaEtiquetaDoisFonteTamanhoY;
    }

    public int getPrimeiraLinhaEtiquetaDoisPosicaoX() {
        return primeiraLinhaEtiquetaDoisPosicaoX;
    }

    public void setPrimeiraLinhaEtiquetaDoisPosicaoX(int primeiraLinhaEtiquetaDoisPosicaoX) {
        this.primeiraLinhaEtiquetaDoisPosicaoX = primeiraLinhaEtiquetaDoisPosicaoX;
    }

    public int getPrimeiraLinhaEtiquetaDoisPosicaoY() {
        return primeiraLinhaEtiquetaDoisPosicaoY;
    }

    public void setPrimeiraLinhaEtiquetaDoisPosicaoY(int primeiraLinhaEtiquetaDoisPosicaoY) {
        this.primeiraLinhaEtiquetaDoisPosicaoY = primeiraLinhaEtiquetaDoisPosicaoY;
    }

    public String getPrimeiraLinhaEtiquetaDoisTexto() {
        return primeiraLinhaEtiquetaDoisTexto;
    }

    public void setPrimeiraLinhaEtiquetaDoisTexto(String primeiraLinhaEtiquetaDoisTexto) {
        this.primeiraLinhaEtiquetaDoisTexto = primeiraLinhaEtiquetaDoisTexto;
    }

    public int getPrimeiraLinhaEtiquetaTresFonteTamanhoX() {
        return primeiraLinhaEtiquetaTresFonteTamanhoX;
    }

    public void setPrimeiraLinhaEtiquetaTresFonteTamanhoX(int primeiraLinhaEtiquetaTresFonteTamanhoX) {
        this.primeiraLinhaEtiquetaTresFonteTamanhoX = primeiraLinhaEtiquetaTresFonteTamanhoX;
    }

    public int getPrimeiraLinhaEtiquetaTresFonteTamanhoY() {
        return primeiraLinhaEtiquetaTresFonteTamanhoY;
    }

    public void setPrimeiraLinhaEtiquetaTresFonteTamanhoY(int primeiraLinhaEtiquetaTresFonteTamanhoY) {
        this.primeiraLinhaEtiquetaTresFonteTamanhoY = primeiraLinhaEtiquetaTresFonteTamanhoY;
    }

    public int getPrimeiraLinhaEtiquetaTresPosicaoX() {
        return primeiraLinhaEtiquetaTresPosicaoX;
    }

    public void setPrimeiraLinhaEtiquetaTresPosicaoX(int primeiraLinhaEtiquetaTresPosicaoX) {
        this.primeiraLinhaEtiquetaTresPosicaoX = primeiraLinhaEtiquetaTresPosicaoX;
    }

    public int getPrimeiraLinhaEtiquetaTresPosicaoY() {
        return primeiraLinhaEtiquetaTresPosicaoY;
    }

    public void setPrimeiraLinhaEtiquetaTresPosicaoY(int primeiraLinhaEtiquetaTresPosicaoY) {
        this.primeiraLinhaEtiquetaTresPosicaoY = primeiraLinhaEtiquetaTresPosicaoY;
    }

    public String getPrimeiraLinhaEtiquetaTresTexto() {
        return primeiraLinhaEtiquetaTresTexto;
    }

    public void setPrimeiraLinhaEtiquetaTresTexto(String primeiraLinhaEtiquetaTresTexto) {
        this.primeiraLinhaEtiquetaTresTexto = primeiraLinhaEtiquetaTresTexto;
    }

    public int getPrimeiraLinhaEtiquetaUmFonteTamanhoX() {
        return primeiraLinhaEtiquetaUmFonteTamanhoX;
    }

    public void setPrimeiraLinhaEtiquetaUmFonteTamanhoX(int primeiraLinhaEtiquetaUmFonteTamanhoX) {
        this.primeiraLinhaEtiquetaUmFonteTamanhoX = primeiraLinhaEtiquetaUmFonteTamanhoX;
    }

    public int getPrimeiraLinhaEtiquetaUmFonteTamanhoY() {
        return primeiraLinhaEtiquetaUmFonteTamanhoY;
    }

    public void setPrimeiraLinhaEtiquetaUmFonteTamanhoY(int primeiraLinhaEtiquetaUmFonteTamanhoY) {
        this.primeiraLinhaEtiquetaUmFonteTamanhoY = primeiraLinhaEtiquetaUmFonteTamanhoY;
    }

    public int getPrimeiraLinhaEtiquetaUmPosicaoX() {
        return primeiraLinhaEtiquetaUmPosicaoX;
    }

    public void setPrimeiraLinhaEtiquetaUmPosicaoX(int primeiraLinhaEtiquetaUmPosicaoX) {
        this.primeiraLinhaEtiquetaUmPosicaoX = primeiraLinhaEtiquetaUmPosicaoX;
    }

    public int getPrimeiraLinhaEtiquetaUmPosicaoY() {
        return primeiraLinhaEtiquetaUmPosicaoY;
    }

    public void setPrimeiraLinhaEtiquetaUmPosicaoY(int primeiraLinhaEtiquetaUmPosicaoY) {
        this.primeiraLinhaEtiquetaUmPosicaoY = primeiraLinhaEtiquetaUmPosicaoY;
    }

    public String getPrimeiraLinhaEtiquetaUmTexto() {
        return primeiraLinhaEtiquetaUmTexto;
    }

    public void setPrimeiraLinhaEtiquetaUmTexto(String primeiraLinhaEtiquetaUmTexto) {
        this.primeiraLinhaEtiquetaUmTexto = primeiraLinhaEtiquetaUmTexto;
    }

    public int getSegundaLinhaEtiquetaDoisFonteTamanhoX() {
        return segundaLinhaEtiquetaDoisFonteTamanhoX;
    }

    public void setSegundaLinhaEtiquetaDoisFonteTamanhoX(int segundaLinhaEtiquetaDoisFonteTamanhoX) {
        this.segundaLinhaEtiquetaDoisFonteTamanhoX = segundaLinhaEtiquetaDoisFonteTamanhoX;
    }

    public int getSegundaLinhaEtiquetaDoisFonteTamanhoY() {
        return segundaLinhaEtiquetaDoisFonteTamanhoY;
    }

    public void setSegundaLinhaEtiquetaDoisFonteTamanhoY(int segundaLinhaEtiquetaDoisFonteTamanhoY) {
        this.segundaLinhaEtiquetaDoisFonteTamanhoY = segundaLinhaEtiquetaDoisFonteTamanhoY;
    }

    public int getSegundaLinhaEtiquetaDoisPosicaoX() {
        return segundaLinhaEtiquetaDoisPosicaoX;
    }

    public void setSegundaLinhaEtiquetaDoisPosicaoX(int segundaLinhaEtiquetaDoisPosicaoX) {
        this.segundaLinhaEtiquetaDoisPosicaoX = segundaLinhaEtiquetaDoisPosicaoX;
    }

    public int getSegundaLinhaEtiquetaDoisPosicaoY() {
        return segundaLinhaEtiquetaDoisPosicaoY;
    }

    public void setSegundaLinhaEtiquetaDoisPosicaoY(int segundaLinhaEtiquetaDoisPosicaoY) {
        this.segundaLinhaEtiquetaDoisPosicaoY = segundaLinhaEtiquetaDoisPosicaoY;
    }

    public String getSegundaLinhaEtiquetaDoisTexto() {
        return segundaLinhaEtiquetaDoisTexto;
    }

    public void setSegundaLinhaEtiquetaDoisTexto(String segundaLinhaEtiquetaDoisTexto) {
        this.segundaLinhaEtiquetaDoisTexto = segundaLinhaEtiquetaDoisTexto;
    }

    public int getSegundaLinhaEtiquetaTresFonteTamanhoX() {
        return segundaLinhaEtiquetaTresFonteTamanhoX;
    }

    public void setSegundaLinhaEtiquetaTresFonteTamanhoX(int segundaLinhaEtiquetaTresFonteTamanhoX) {
        this.segundaLinhaEtiquetaTresFonteTamanhoX = segundaLinhaEtiquetaTresFonteTamanhoX;
    }

    public int getSegundaLinhaEtiquetaTresFonteTamanhoY() {
        return segundaLinhaEtiquetaTresFonteTamanhoY;
    }

    public void setSegundaLinhaEtiquetaTresFonteTamanhoY(int segundaLinhaEtiquetaTresFonteTamanhoY) {
        this.segundaLinhaEtiquetaTresFonteTamanhoY = segundaLinhaEtiquetaTresFonteTamanhoY;
    }

    public int getSegundaLinhaEtiquetaTresPosicaoX() {
        return segundaLinhaEtiquetaTresPosicaoX;
    }

    public void setSegundaLinhaEtiquetaTresPosicaoX(int segundaLinhaEtiquetaTresPosicaoX) {
        this.segundaLinhaEtiquetaTresPosicaoX = segundaLinhaEtiquetaTresPosicaoX;
    }

    public int getSegundaLinhaEtiquetaTresPosicaoY() {
        return segundaLinhaEtiquetaTresPosicaoY;
    }

    public void setSegundaLinhaEtiquetaTresPosicaoY(int segundaLinhaEtiquetaTresPosicaoY) {
        this.segundaLinhaEtiquetaTresPosicaoY = segundaLinhaEtiquetaTresPosicaoY;
    }

    public String getSegundaLinhaEtiquetaTresTexto() {
        return segundaLinhaEtiquetaTresTexto;
    }

    public void setSegundaLinhaEtiquetaTresTexto(String segundaLinhaEtiquetaTresTexto) {
        this.segundaLinhaEtiquetaTresTexto = segundaLinhaEtiquetaTresTexto;
    }

    public int getSegundaLinhaEtiquetaUmFonteTamanhoX() {
        return segundaLinhaEtiquetaUmFonteTamanhoX;
    }

    public void setSegundaLinhaEtiquetaUmFonteTamanhoX(int segundaLinhaEtiquetaUmFonteTamanhoX) {
        this.segundaLinhaEtiquetaUmFonteTamanhoX = segundaLinhaEtiquetaUmFonteTamanhoX;
    }

    public int getSegundaLinhaEtiquetaUmFonteTamanhoY() {
        return segundaLinhaEtiquetaUmFonteTamanhoY;
    }

    public void setSegundaLinhaEtiquetaUmFonteTamanhoY(int segundaLinhaEtiquetaUmFonteTamanhoY) {
        this.segundaLinhaEtiquetaUmFonteTamanhoY = segundaLinhaEtiquetaUmFonteTamanhoY;
    }

    public int getSegundaLinhaEtiquetaUmPosicaoX() {
        return segundaLinhaEtiquetaUmPosicaoX;
    }

    public void setSegundaLinhaEtiquetaUmPosicaoX(int segundaLinhaEtiquetaUmPosicaoX) {
        this.segundaLinhaEtiquetaUmPosicaoX = segundaLinhaEtiquetaUmPosicaoX;
    }

    public int getSegundaLinhaEtiquetaUmPosicaoY() {
        return segundaLinhaEtiquetaUmPosicaoY;
    }

    public void setSegundaLinhaEtiquetaUmPosicaoY(int segundaLinhaEtiquetaUmPosicaoY) {
        this.segundaLinhaEtiquetaUmPosicaoY = segundaLinhaEtiquetaUmPosicaoY;
    }

    public String getSegundaLinhaEtiquetaUmTexto() {
        return segundaLinhaEtiquetaUmTexto;
    }

    public void setSegundaLinhaEtiquetaUmTexto(String segundaLinhaEtiquetaUmTexto) {
        this.segundaLinhaEtiquetaUmTexto = segundaLinhaEtiquetaUmTexto;
    }

    public int getTerceiraLinhaEtiquetaDoisFonteTamanhoX() {
        return terceiraLinhaEtiquetaDoisFonteTamanhoX;
    }

    public void setTerceiraLinhaEtiquetaDoisFonteTamanhoX(int terceiraLinhaEtiquetaDoisFonteTamanhoX) {
        this.terceiraLinhaEtiquetaDoisFonteTamanhoX = terceiraLinhaEtiquetaDoisFonteTamanhoX;
    }

    public int getTerceiraLinhaEtiquetaDoisFonteTamanhoY() {
        return terceiraLinhaEtiquetaDoisFonteTamanhoY;
    }

    public void setTerceiraLinhaEtiquetaDoisFonteTamanhoY(int terceiraLinhaEtiquetaDoisFonteTamanhoY) {
        this.terceiraLinhaEtiquetaDoisFonteTamanhoY = terceiraLinhaEtiquetaDoisFonteTamanhoY;
    }

    public int getTerceiraLinhaEtiquetaDoisPosicaoX() {
        return terceiraLinhaEtiquetaDoisPosicaoX;
    }

    public void setTerceiraLinhaEtiquetaDoisPosicaoX(int terceiraLinhaEtiquetaDoisPosicaoX) {
        this.terceiraLinhaEtiquetaDoisPosicaoX = terceiraLinhaEtiquetaDoisPosicaoX;
    }

    public int getTerceiraLinhaEtiquetaDoisPosicaoY() {
        return terceiraLinhaEtiquetaDoisPosicaoY;
    }

    public void setTerceiraLinhaEtiquetaDoisPosicaoY(int terceiraLinhaEtiquetaDoisPosicaoY) {
        this.terceiraLinhaEtiquetaDoisPosicaoY = terceiraLinhaEtiquetaDoisPosicaoY;
    }

    public String getTerceiraLinhaEtiquetaDoisTexto() {
        return terceiraLinhaEtiquetaDoisTexto;
    }

    public void setTerceiraLinhaEtiquetaDoisTexto(String terceiraLinhaEtiquetaDoisTexto) {
        this.terceiraLinhaEtiquetaDoisTexto = terceiraLinhaEtiquetaDoisTexto;
    }

    public int getTerceiraLinhaEtiquetaTresFonteTamanhoX() {
        return terceiraLinhaEtiquetaTresFonteTamanhoX;
    }

    public void setTerceiraLinhaEtiquetaTresFonteTamanhoX(int terceiraLinhaEtiquetaTresFonteTamanhoX) {
        this.terceiraLinhaEtiquetaTresFonteTamanhoX = terceiraLinhaEtiquetaTresFonteTamanhoX;
    }

    public int getTerceiraLinhaEtiquetaTresFonteTamanhoY() {
        return terceiraLinhaEtiquetaTresFonteTamanhoY;
    }

    public void setTerceiraLinhaEtiquetaTresFonteTamanhoY(int terceiraLinhaEtiquetaTresFonteTamanhoY) {
        this.terceiraLinhaEtiquetaTresFonteTamanhoY = terceiraLinhaEtiquetaTresFonteTamanhoY;
    }

    public int getTerceiraLinhaEtiquetaTresPosicaoX() {
        return terceiraLinhaEtiquetaTresPosicaoX;
    }

    public void setTerceiraLinhaEtiquetaTresPosicaoX(int terceiraLinhaEtiquetaTresPosicaoX) {
        this.terceiraLinhaEtiquetaTresPosicaoX = terceiraLinhaEtiquetaTresPosicaoX;
    }

    public int getTerceiraLinhaEtiquetaTresPosicaoY() {
        return terceiraLinhaEtiquetaTresPosicaoY;
    }

    public void setTerceiraLinhaEtiquetaTresPosicaoY(int terceiraLinhaEtiquetaTresPosicaoY) {
        this.terceiraLinhaEtiquetaTresPosicaoY = terceiraLinhaEtiquetaTresPosicaoY;
    }

    public String getTerceiraLinhaEtiquetaTresTexto() {
        return terceiraLinhaEtiquetaTresTexto;
    }

    public void setTerceiraLinhaEtiquetaTresTexto(String terceiraLinhaEtiquetaTresTexto) {
        this.terceiraLinhaEtiquetaTresTexto = terceiraLinhaEtiquetaTresTexto;
    }

    public int getTerceiraLinhaEtiquetaUmFonteTamanhoX() {
        return terceiraLinhaEtiquetaUmFonteTamanhoX;
    }

    public void setTerceiraLinhaEtiquetaUmFonteTamanhoX(int terceiraLinhaEtiquetaUmFonteTamanhoX) {
        this.terceiraLinhaEtiquetaUmFonteTamanhoX = terceiraLinhaEtiquetaUmFonteTamanhoX;
    }

    public int getTerceiraLinhaEtiquetaUmFonteTamanhoY() {
        return terceiraLinhaEtiquetaUmFonteTamanhoY;
    }

    public void setTerceiraLinhaEtiquetaUmFonteTamanhoY(int terceiraLinhaEtiquetaUmFonteTamanhoY) {
        this.terceiraLinhaEtiquetaUmFonteTamanhoY = terceiraLinhaEtiquetaUmFonteTamanhoY;
    }

    public int getTerceiraLinhaEtiquetaUmPosicaoX() {
        return terceiraLinhaEtiquetaUmPosicaoX;
    }

    public void setTerceiraLinhaEtiquetaUmPosicaoX(int terceiraLinhaEtiquetaUmPosicaoX) {
        this.terceiraLinhaEtiquetaUmPosicaoX = terceiraLinhaEtiquetaUmPosicaoX;
    }

    public int getTerceiraLinhaEtiquetaUmPosicaoY() {
        return terceiraLinhaEtiquetaUmPosicaoY;
    }

    public void setTerceiraLinhaEtiquetaUmPosicaoY(int terceiraLinhaEtiquetaUmPosicaoY) {
        this.terceiraLinhaEtiquetaUmPosicaoY = terceiraLinhaEtiquetaUmPosicaoY;
    }

    public String getTerceiraLinhaEtiquetaUmTexto() {
        return terceiraLinhaEtiquetaUmTexto;
    }

    public void setTerceiraLinhaEtiquetaUmTexto(String terceiraLinhaEtiquetaUmTexto) {
        this.terceiraLinhaEtiquetaUmTexto = terceiraLinhaEtiquetaUmTexto;
    }
}
