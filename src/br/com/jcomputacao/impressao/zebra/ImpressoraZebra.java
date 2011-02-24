/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.impressao.zebra;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.ParallelPort;
import gnu.io.PortInUseException;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 26/08/2009 12:27:54
 * @author Kelli
 */
public class ImpressoraZebra {

    private OutputStream outputStream;
    private ParallelPort parallelPort;
    private CommPortIdentifier port;
    // CONSTANTS
    public static final String PARALLEL_PORT = "LPT1";
    public static final String[] PORT_TYPE = {"Serial Port", "Parallel Port"};
    //these commands are specific for my printer around the text

    /**
     * Abrea a porta de comunicacao com a impressora
     * @param porta
     */
    public ImpressoraZebra() {
    }

    public void imprimir(EtiquetaZebra etiqueta) throws Exception {
        StringBuffer sb = new StringBuffer();
//        for (EtiquetaZebra etiqueta : etiquetas) {
//        ou imprime direto
        sb.append(geraLinhaDeComando(etiqueta));

        StringBuffer printerCodes = sb;

        System.out.println(sb);

        System.out.println("Started test....");

        try {
            // get the parallel port connected to the printer
            port = CommPortIdentifier.getPortIdentifier(PARALLEL_PORT);

            System.out.println("\nport.portType = " + port.getPortType());
            System.out.println("port type = " + PORT_TYPE[port.getPortType() - 1]);
            System.out.println("port.name = " + port.getName());

            // open the parallel port -- open(App name, timeout)
            parallelPort = (ParallelPort) port.open("CommTest", 50);
            outputStream = parallelPort.getOutputStream();

            byte[] byteArray = printerCodes.toString().getBytes("UTF8");
//            char[] charArray = printerCodes.toString().toCharArray();
//            byte[] byteArray = CharToByteConverter.getConverter("UTF8").convertAll(charArray);

            System.out.println("Write...");
            outputStream.write(byteArray);
            System.out.println("Flush...");
            outputStream.flush();
            System.out.println("Close...");
            outputStream.close();

        } catch (NoSuchPortException nspe) {
            System.out.println("\nPrinter Port LPT1 not found : " + "NoSuchPortException.\nException:\n" + nspe + "\n");
        } catch (PortInUseException piue) {
            System.out.println("\nPrinter Port LPT1 is in use : " + "PortInUseException.\nException:\n" + piue + "\n");
        } /*
         * catch (UnsupportedCommOperationException usce) {
         * System.out.println("\nPrinter Port LPT1 fail to write :
         * UnsupportedCommException.\nException:\n" + usce + "\n"); }
         */ catch (IOException ioe) {
            System.out.println("\nPrinter Port LPT1 failed to write : " + "IOException.\nException:\n" + ioe + "\n");
        } catch (Exception e) {
            System.out.println("\nFailed to open Printer Port LPT1 with exeception : " + e + "\n");
        }
    }

    private String geraLinhaDeComando(EtiquetaZebra etiqueta) {
        return "^XA" +
                //primeira linha de etiquetas
                addPrimeiraLinha(etiqueta) +
                //segunda linha de etiquetas
                addSegundaLinha(etiqueta) +
                //terceira linha de etiquetas
                addTerceiraLinha(etiqueta) +
                //quarta linha de etiquetas
                addQuartaLinha(etiqueta) +
                "^XZ";
    }

    /**
     * Encerra a comunicacao com a impressora
     */
    public void close() {
        if (port != null && port.isCurrentlyOwned()) {
            parallelPort.close();
        }
        System.out.println("Closed all resources.\n");
    }

    private String addPrimeiraLinha(EtiquetaZebra etiqueta) {
        return "^FO" + etiqueta.getPrimeiraLinhaEtiquetaUmPosicaoX() + "," + etiqueta.getPrimeiraLinhaEtiquetaUmPosicaoY() +
                "^AO," + etiqueta.getPrimeiraLinhaEtiquetaUmFonteTamanhoX() + "," + etiqueta.getPrimeiraLinhaEtiquetaUmFonteTamanhoY() +
                "^FD" + etiqueta.getPrimeiraLinhaEtiquetaUmTexto() + "^FS" +
                "^FO" + etiqueta.getPrimeiraLinhaEtiquetaDoisPosicaoX() + "," + etiqueta.getPrimeiraLinhaEtiquetaDoisPosicaoY() +
                "^AO," + etiqueta.getPrimeiraLinhaEtiquetaDoisFonteTamanhoX() + "," + etiqueta.getPrimeiraLinhaEtiquetaDoisFonteTamanhoY() +
                "^FD" + etiqueta.getPrimeiraLinhaEtiquetaDoisTexto() + "^FS" +
                "^FO" + etiqueta.getPrimeiraLinhaEtiquetaTresPosicaoX() + "," + etiqueta.getPrimeiraLinhaEtiquetaTresPosicaoY() +
                "^AO," + etiqueta.getPrimeiraLinhaEtiquetaTresFonteTamanhoX() + "," + etiqueta.getPrimeiraLinhaEtiquetaTresFonteTamanhoY() +
                "^FD" + etiqueta.getPrimeiraLinhaEtiquetaTresTexto() + "^FS";
    }

    private String addSegundaLinha(EtiquetaZebra etiqueta) {
        return "^FO" + etiqueta.getSegundaLinhaEtiquetaUmPosicaoX() + "," + etiqueta.getSegundaLinhaEtiquetaUmPosicaoY() +
                "^AO," + etiqueta.getSegundaLinhaEtiquetaUmFonteTamanhoX() + "," + etiqueta.getSegundaLinhaEtiquetaUmFonteTamanhoY() +
                "^FD" + etiqueta.getSegundaLinhaEtiquetaUmTexto() + "^FS" +
                "^FO" + etiqueta.getSegundaLinhaEtiquetaDoisPosicaoX() + "," + etiqueta.getSegundaLinhaEtiquetaDoisPosicaoY() +
                "^AO," + etiqueta.getSegundaLinhaEtiquetaDoisFonteTamanhoX() + "," + etiqueta.getSegundaLinhaEtiquetaDoisFonteTamanhoY() +
                "^FD" + etiqueta.getSegundaLinhaEtiquetaDoisTexto() + "^FS" +
                "^FO" + etiqueta.getSegundaLinhaEtiquetaTresPosicaoX() + "," + etiqueta.getSegundaLinhaEtiquetaTresPosicaoY() +
                "^AO," + etiqueta.getSegundaLinhaEtiquetaTresFonteTamanhoX() + "," + etiqueta.getSegundaLinhaEtiquetaTresFonteTamanhoY() +
                "^FD" + etiqueta.getSegundaLinhaEtiquetaTresTexto() + "^FS";
    }

    private String addTerceiraLinha(EtiquetaZebra etiqueta) {
        return "^FO" + etiqueta.getTerceiraLinhaEtiquetaUmPosicaoX() + "," + etiqueta.getTerceiraLinhaEtiquetaUmPosicaoY() +
                "^AO," + etiqueta.getTerceiraLinhaEtiquetaUmFonteTamanhoX() + "," + etiqueta.getTerceiraLinhaEtiquetaUmFonteTamanhoY() +
                "^FD" + etiqueta.getTerceiraLinhaEtiquetaUmTexto() + "^FS" +
                "^FO" + etiqueta.getTerceiraLinhaEtiquetaDoisPosicaoX() + "," + etiqueta.getTerceiraLinhaEtiquetaDoisPosicaoY() +
                "^AO," + etiqueta.getTerceiraLinhaEtiquetaDoisFonteTamanhoX() + "," + etiqueta.getTerceiraLinhaEtiquetaDoisFonteTamanhoY() +
                "^FD" + etiqueta.getTerceiraLinhaEtiquetaDoisTexto() + "^FS" +
                "^FO" + etiqueta.getTerceiraLinhaEtiquetaTresPosicaoX() + "," + etiqueta.getTerceiraLinhaEtiquetaTresPosicaoY() +
                "^AO," + etiqueta.getTerceiraLinhaEtiquetaTresFonteTamanhoX() + "," + etiqueta.getTerceiraLinhaEtiquetaTresFonteTamanhoY() +
                "^FD" + etiqueta.getTerceiraLinhaEtiquetaTresTexto() + "^FS";
    }

    private String addQuartaLinha(EtiquetaZebra etiqueta) {
        return "^FO" + etiqueta.getCodigoBarrasEtiquetaUmPosicaoX() + "," + etiqueta.getCodigoBarrasEtiquetaUmPosicaoY() +
                "^BY" + etiqueta.getCodigoBarrasEtiquetaUmLargura() +
                "^" + etiqueta.getCodigoBarrasEtiquetaUmFormato() + "N," + etiqueta.getCodigoBarrasEtiquetaUmAltura() + ",N,N,N" +
                "^FD" + etiqueta.getCodigoBarrasEtiquetaUmTexto() + "^FS" +
                "^FO" + etiqueta.getCodigoBarrasEtiquetaDoisPosicaoX() + "," + etiqueta.getCodigoBarrasEtiquetaDoisPosicaoY() +
                "^BY" + etiqueta.getCodigoBarrasEtiquetaDoisLargura() +
                "^" + etiqueta.getCodigoBarrasEtiquetaDoisFormato() + "N," + etiqueta.getCodigoBarrasEtiquetaDoisAltura() + ",N,N,N" +
                "^FD" + etiqueta.getCodigoBarrasEtiquetaDoisTexto() + "^FS" +
                "^FO" + etiqueta.getCodigoBarrasEtiquetaTresPosicaoX() + "," + etiqueta.getCodigoBarrasEtiquetaTresPosicaoY() +
                "^BY" + etiqueta.getCodigoBarrasEtiquetaTresLargura() +
                "^" + etiqueta.getCodigoBarrasEtiquetaTresFormato() + "N," + etiqueta.getCodigoBarrasEtiquetaTresAltura() + ",N,N,N" +
                "^FD" + etiqueta.getCodigoBarrasEtiquetaTresTexto() + "^FS";
    }
}
