package br.com.jcomputacao.impressao.zebra;

import javax.print.DocFlavor;
import javax.print.PrintService;

/**
 *
 * @author Murilo
 */
public class TesteImpressaoPrintService {

    public static void main(String a[]) {
        PrintService printer = PrintServiceMatcher.findPrinter("2844");
        if (printer != null) {
            System.out.println(printer.getName());
            DocFlavor[] flavors = printer.getSupportedDocFlavors();

            for (DocFlavor flavor : flavors) {
                System.out.println(flavor.toString());
            }
        }
    }

}
