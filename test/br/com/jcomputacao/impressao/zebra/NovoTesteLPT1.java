/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.impressao.zebra;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 * 25/08/2011 16:49:42
 * @author marcos
 */
public class NovoTesteLPT1 {

    public static void main(String argv[]) throws Exception {
        Process child;
        String comandos;
        int i = 0;
        boolean bStatus = false;

        try {
            //Cria arquivo com conteudo a ser impresso e da ordem de impressão.
            File file = new File("etiqueta.txt");
            FileWriter writer = new FileWriter(new File("etiqueta.txt"));
//            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter saida = new PrintWriter(writer, true);
//            saida.println("\u0002m\r");
//            saida.println("\u0002c0600\r");
//            saida.println("\u0002L\r");
//            saida.println("H12");
//            saida.println("D11\r");
//            saida.println("121200005000320Etiqueta\r");
//            saida.println("121200005000470para\r");
//            saida.println("121200005000560exemplo!\r");
//            saida.println("121200000800430EAN13\r");
//            saida.println("131100000200300Serial no.: \r");
//            saida.println("13110000020053051100\r");
//            saida.println("+10\r");
//            saida.println("1F0000001500280789012345678\r");
//            saida.println("+10\r");
//            saida.println("Q0003\r");
//            saida.println("\u0002J\r");
//            saida.println("E\r");
//            saida.close();
//            writer.close();
            ////////////////////////

//            int posicaoX = 10;
//            int posicaoY = 12;
//            int tonteTamanhoX = 35;
//            int tonteTamanhoY = 22;
//            String texto = "Funciona";
//            String comandoImpressora = "^XA^FO" + posicaoX + "," + posicaoY
//                    + "^AO," + tonteTamanhoX + "," + tonteTamanhoY
//                    + "^FD" + texto + "^FS^XZ";
//            saida.println("N");
//            saida.println(comandoImpressora);

            ///////////////////////
            saida.println("N");
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoAlturaEtiqueta(500, 30, 15));
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoLarguraEtiqueta(400));
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoVelocidadeImpressao(5));
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoDensidadeImpressao(10));
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoHorientacaoImpressao("T"));
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoCarachterSet(8, 3, 351));
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(50, 10, 0, 1, 1, 1, "ESTA EH UMA IMPRESSAO TESTE"));
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoCodigoBarras(50, 25, 0, 2, 2, 6, 70,  "256452"));
            saida.println("d5,1");
            saida.println(EtiquetaZebraTLP2844.getRepresentacaoImprimir());

//            imprimeSaida(saida);

            saida.close();
            writer.close();

            if (bStatus == false) {
                comandos = "print etiqueta.txt";
//                comandos = "run copy /b etiqueta.txt prn";

                child = Runtime.getRuntime().exec(comandos);
                bStatus = true;
            }

            if (bStatus == true) {
                Thread.sleep(500);
                file.delete();
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível enviar requisição para a impressora." + "/n"
                    + "Código: " + ioe.toString(),
                    "Aviso!",
                    JOptionPane.ERROR_MESSAGE);
        } catch (InterruptedException ie) {
            JOptionPane.showMessageDialog(null,
                    "Erro na Thread MAIN. Contate a área de TI." + "/n"
                    + "Código: " + ie.toString(),
                    "Aviso!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void imprimeSaida(PrintWriter saida) {
        saida.println("FS\"TICKET\"");
        saida.println("N");
        saida.println("Q200,0");
        saida.println("q500");
        saida.println("S5");
        saida.println("D10");
        saida.println("ZT");
        saida.println("LO5,8,485,0");
        saida.println("GG80,10, LOGORT1");
        saida.println("I8,3,351");
        saida.println("A5,10,0,1,1,1,N,\"Cooperativa   Mista   de   Trabalho  dos\"");
        saida.println("A5,23,0,1,1,1,N,\"Motoristas  Autonomos  de  Taxi Especial\"");
        saida.println("A5,36,0,1,1,1,N,\"de Sao Paulo - Radio-Taxi\"");
        saida.println("A5,49,0,1,1,1,N,\"CNPJ:46.553.947/0001-20  CCM:8.179.517-3\"");
        saida.println("A5,70,0,2,1,1,N,\"          VIA CONTABILIDADE        .\"");
        saida.println("LO5,95,575,0");
        saida.println("A5,110,0,2,1,2,N,\"4378315\"");
        saida.println("B110,110,0,2,2,6,70,B,\"4378315\"");

        saida.println("A10,230,0,1,1,1,N,\"Recepcionista\"");
        saida.println("A200,230,0,1,1,1,N,\"Ponto de partida\"");
        saida.println("LO10,255,130,0");
        saida.println("LO200,255,160,0");
        saida.println("A10,265,0,1,1,1,N,\"TATI\"");
        saida.println("A200,265,0,1,1,1,N,\"Aeroporto de Congonhas\"");

        saida.println("A10,295,0,1,1,1,N,\"Destino\"");
        saida.println("LO10,310,80,0");
        saida.println("A10,320,0,1,1,1,N,\"AV. JUSCELINO KUBTSCHEK\"");

        saida.println("A10,365,0,1,1,1,N,\"Complemento\"");
        saida.println("LO10,380,80,0");
        saida.println("A10,390,0,1,1,1,N,\"ATE 951 LADO IMPAR\"");

        saida.println("A290,365,0,1,1,1,N,\"Cep\"");
        saida.println("LO290,380,80,0");
        saida.println("A290,390,0,1,1,1,N,\"04543-000\"");

        saida.println("A500,365,0,1,1,1,N,\"Coordenadas\"");
        saida.println("LO500,380,80,0");
        saida.println("A500,390,0,3,1,1,N,\"Pag:177 F25\"");

        saida.println("FE");
        
        saida.println("FR\"TICKET\"");


        saida.println("P1");
        saida.println("d5,1");
    }
}
