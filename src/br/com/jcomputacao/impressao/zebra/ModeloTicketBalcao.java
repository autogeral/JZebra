/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.impressao.zebra;

import java.io.PrintWriter;

/**
 * 29/08/2011 11:48:25
 * @author marcos
 */
public class ModeloTicketBalcao {

    public static void imprimeTicket(PrintWriter pw, String[] array){
//        pw.println("N");
//        pw.println("FS\"TICKET\"");
        pw.println("N");
        pw.println("Q600,0");
        pw.println("q680");
        pw.println("S5");
        pw.println("D10");
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoCarachterSet(8, 3, 860));
        pw.println("ZT");
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLinha(20, 5, 600, 1));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(30, 8, 0, 1, 1, 2, "Cooperativa Mista de Trabalho dos Motoristas Autônomos"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(90, 25, 0, 1, 1, 2, "de Taxi Especial de São Paulo - Radio Táxi"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 42, 0, 1, 1, 2, "Central de solicitações: (11)3146-4000 Faz:(11)3289-9512"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLinha(20, 65, 600, 1));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(80, 90, 0, 2, 0, 2, "Tarifa válida para um único destino."));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(80, 120, 0, 2, 0, 2, "Percursos complementares ou desvios"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(45, 150, 0, 2, 0, 2, "solicitados pelo usuário serão cobrados"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(200, 180, 0, 2, 0, 2, "pelo taxímetro"));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(90, 220, 0, 1, 0, 2, "valido somente para a data de emissão"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(60, 250, 0, 4, 0, 1, "OBRIGATÓRIO APRESENTAR AO MOTORISTA"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(160, 280, 0, 4, 0, 1, "NO MOMENTO DO EMBARQUE"));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(140, 305, 0, 3, 0, 2, "Informativo de embarque"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(90, 345, 0, 1, 0, 2, "Portaria 054/055/2004-SMT.GAB(18/05/2004)"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(135, 370, 0, 1, 0, 2, "Vigência a partir de 18/05/2004"));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 420, 0, 2, 1, 1, "Atendente"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(450, 420, 0, 2, 1, 1, "Diário"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 445, 0, 2, 1, 1, array[0]));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(450, 445, 0, 2, 1, 1, array[1]));


        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 480, 0, 2, 1, 1, "NºInformativo"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(300, 480, 0, 2, 1, 1, "Data Emissão"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 505, 0, 2, 1, 1, array[2]));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(300, 505, 0, 2, 1, 1, array[3]));


        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 540, 0, 2, 1, 1, "Ponto de Partida"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 565, 0, 2, 1, 1, array[4]));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 600, 0, 2, 1, 1, "Destino"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 625, 0, 2, 1, 1, array[5]));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 660, 0, 2, 1, 1, "Forma de Pagamento"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 685, 0, 2, 1, 1, array[6]));


        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 720, 0, 2, 1, 1, "Faixa"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(200, 720, 0, 2, 1, 1, "Bandeira"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(400, 720, 0, 2, 1, 1, "Valor"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 745, 0, 2, 1, 2, array[7]));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(200, 745, 0, 2, 1, 2, array[8]));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(400, 745, 0, 2, 2, 2, array[9]));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoCodigoBarras(250, 780, 0, "1C", 2, 400, 100, false ,array[2]));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(230, 890, 0, 1, 1, 2, "Reclamações 156"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(20, 920, 0, 1, 1, 2, "Exija sempre ao motorista o recibo da Vermelho e Branco"));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(90, 950, 0, 3, 1, 2, "PAGAMENTO DIRETO AO MOTORISTA"));

        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLinha(5, 1005, 600, 1));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLabel(170, 1025, 0, 1, 2, 2, "VIA "+array[10]));
        pw.println(EtiquetaZebraTLP2844.getRepresentacaoLinha(5, 1045, 600, 1));

//        pw.println("FE");

//        pw.println("FR\"TICKET\"");
//        pw.println("OC");
//        pw.println("d5,0");


        pw.println("P1");







    }

}
