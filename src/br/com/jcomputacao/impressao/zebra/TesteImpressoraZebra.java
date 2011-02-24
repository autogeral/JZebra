/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.impressao.zebra;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 26/08/2009 14:32:32
 * @author Kelli
 */
public class TesteImpressoraZebra {

    public static void main(String[] args) {

        List<EtiquetaZebra> etiquetas = new ArrayList<EtiquetaZebra>();
        EtiquetaZebraImpl etiqueta = new EtiquetaZebraImpl();

        //etiqueta.setEtiquetaQuantidade(1);
        //primeira linha
        etiqueta.setPrimeiraLinhaEtiquetaUmPosicaoX(10);
        etiqueta.setPrimeiraLinhaEtiquetaUmPosicaoY(12);
        etiqueta.setPrimeiraLinhaEtiquetaUmFonteTamanhoX(35);
        etiqueta.setPrimeiraLinhaEtiquetaUmFonteTamanhoY(22);
        etiqueta.setPrimeiraLinhaEtiquetaUmTexto("X-18249/B");
        etiqueta.setPrimeiraLinhaEtiquetaDoisPosicaoX(275);
        etiqueta.setPrimeiraLinhaEtiquetaDoisPosicaoY(12);
        etiqueta.setPrimeiraLinhaEtiquetaDoisFonteTamanhoX(35);
        etiqueta.setPrimeiraLinhaEtiquetaDoisFonteTamanhoY(22);
        etiqueta.setPrimeiraLinhaEtiquetaDoisTexto("X-18249/B");
        etiqueta.setPrimeiraLinhaEtiquetaTresPosicaoX(550);
        etiqueta.setPrimeiraLinhaEtiquetaTresPosicaoY(12);
        etiqueta.setPrimeiraLinhaEtiquetaTresFonteTamanhoX(35);
        etiqueta.setPrimeiraLinhaEtiquetaTresFonteTamanhoY(22);
        etiqueta.setPrimeiraLinhaEtiquetaTresTexto("X-18249/B");
        //segundalinha
        etiqueta.setSegundaLinhaEtiquetaUmPosicaoX(10);
        etiqueta.setSegundaLinhaEtiquetaUmPosicaoY(45);
        etiqueta.setSegundaLinhaEtiquetaUmFonteTamanhoX(20);
        etiqueta.setSegundaLinhaEtiquetaUmFonteTamanhoY(10);
        etiqueta.setSegundaLinhaEtiquetaUmTexto("VDO");
        etiqueta.setSegundaLinhaEtiquetaDoisPosicaoX(275);
        etiqueta.setSegundaLinhaEtiquetaDoisPosicaoY(45);
        etiqueta.setSegundaLinhaEtiquetaDoisFonteTamanhoX(20);
        etiqueta.setSegundaLinhaEtiquetaDoisFonteTamanhoY(10);
        etiqueta.setSegundaLinhaEtiquetaDoisTexto("VDO");
        etiqueta.setSegundaLinhaEtiquetaTresPosicaoX(550);
        etiqueta.setSegundaLinhaEtiquetaTresPosicaoY(45);
        etiqueta.setSegundaLinhaEtiquetaTresFonteTamanhoX(20);
        etiqueta.setSegundaLinhaEtiquetaTresFonteTamanhoY(10);
        etiqueta.setSegundaLinhaEtiquetaTresTexto("VDO");
        //terceira linha
        etiqueta.setTerceiraLinhaEtiquetaUmPosicaoX(10);
        etiqueta.setTerceiraLinhaEtiquetaUmPosicaoY(65);
        etiqueta.setTerceiraLinhaEtiquetaUmFonteTamanhoX(15);
        etiqueta.setTerceiraLinhaEtiquetaUmFonteTamanhoY(7);
        etiqueta.setTerceiraLinhaEtiquetaUmTexto("BOMBA COMB. CORSA/KDT/FIESTA/KA");
        etiqueta.setTerceiraLinhaEtiquetaDoisPosicaoX(275);
        etiqueta.setTerceiraLinhaEtiquetaDoisPosicaoY(65);
        etiqueta.setTerceiraLinhaEtiquetaDoisFonteTamanhoX(15);
        etiqueta.setTerceiraLinhaEtiquetaDoisFonteTamanhoY(7);
        etiqueta.setTerceiraLinhaEtiquetaDoisTexto("BOMBA COMB. CORSA/KDT/FIESTA/KA");
        etiqueta.setTerceiraLinhaEtiquetaTresPosicaoX(550);
        etiqueta.setTerceiraLinhaEtiquetaTresPosicaoY(65);
        etiqueta.setTerceiraLinhaEtiquetaTresFonteTamanhoX(15);
        etiqueta.setTerceiraLinhaEtiquetaTresFonteTamanhoY(7);
        etiqueta.setTerceiraLinhaEtiquetaTresTexto("BOMBA COMB. CORSA/KDT/FIESTA/KA");
        //quarta linha
        etiqueta.setCodigoBarrasEtiquetaUmPosicaoX(12);
        etiqueta.setCodigoBarrasEtiquetaUmPosicaoY(85);
        etiqueta.setCodigoBarrasEtiquetaUmAltura(65);
        etiqueta.setCodigoBarrasEtiquetaUmFormato("BC");
        etiqueta.setCodigoBarrasEtiquetaUmLargura(1);
        etiqueta.setCodigoBarrasEtiquetaUmTexto("18249B05426201001010");
        etiqueta.setCodigoBarrasEtiquetaDoisPosicaoX(280);
        etiqueta.setCodigoBarrasEtiquetaDoisPosicaoY(85);
        etiqueta.setCodigoBarrasEtiquetaDoisAltura(65);
        etiqueta.setCodigoBarrasEtiquetaDoisFormato("BC");
        etiqueta.setCodigoBarrasEtiquetaDoisLargura(1);
        etiqueta.setCodigoBarrasEtiquetaDoisTexto("18249B05426201001010");
        etiqueta.setCodigoBarrasEtiquetaTresPosicaoX(555);
        etiqueta.setCodigoBarrasEtiquetaTresPosicaoY(85);
        etiqueta.setCodigoBarrasEtiquetaTresAltura(65);
        etiqueta.setCodigoBarrasEtiquetaTresFormato("BC");
        etiqueta.setCodigoBarrasEtiquetaTresLargura(1);
//        etiqueta.setCodigoBarrasEtiquetaTresCabecalho(false);
//        etiqueta.setCodigoBarrasEtiquetaTresRodape(false);
        etiqueta.setCodigoBarrasEtiquetaTresTexto("18249B05426201001010");

        etiquetas.add(etiqueta);

        ImpressoraZebra impressora = new ImpressoraZebra();
        try {
            impressora.imprimir(etiqueta);
        } catch (Exception ex) {
            Logger.getLogger(TesteImpressoraZebra.class.getName()).log(Level.SEVERE, null, ex);
        }
        impressora.close();
    }
}
