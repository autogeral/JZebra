package br.com.jcomputacao.impressao.zebra;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.ParallelPort;
import gnu.io.PortInUseException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 24/08/2011 15:04:29
 * @author Murilo
 */
public class TesteImpressao {
    private OutputStream outputStream;
    private ParallelPort parallelPort;
    private CommPortIdentifier port;
    // CONSTANTS
    public static final String PARALLEL_PORT = "LPT1";
    public static final String[] PORT_TYPE = {"Serial Port", "Parallel Port"};


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        TesteImpressao t = new TesteImpressao();
        try {
            t.execute();
        } catch (NoSuchPortException ex) {
            Logger.getLogger(TesteImpressao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PortInUseException ex) {
            Logger.getLogger(TesteImpressao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TesteImpressao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void execute() throws NoSuchPortException, PortInUseException, IOException {
        Enumeration ports = CommPortIdentifier.getPortIdentifiers();
        while (ports.hasMoreElements()) {
            System.out.println("Porta : " + ((CommPortIdentifier) ports.nextElement()).getName());
            System.out.flush();
        }
        int posicaoX = 10;
        int posicaoY = 12;
        int tonteTamanhoX = 35;
        int tonteTamanhoY = 22;
        String texto = "Funciona";
        
        String comando = "^XA^FO" + posicaoX + "," + posicaoY +
                "^AO," + tonteTamanhoX + "," + tonteTamanhoY +
                "^FD" + texto + "^FS^XZ";
        
        port = CommPortIdentifier.getPortIdentifier(PARALLEL_PORT);
        
        System.out.println("\nport.portType = " + port.getPortType());
        System.out.println("port type = " + PORT_TYPE[port.getPortType() - 1]);
        System.out.println("port.name = " + port.getName());

        // open the parallel port -- open(App name, timeout)
        parallelPort = (ParallelPort) port.open("CommTest", 50);
        outputStream = parallelPort.getOutputStream();
        
        byte[] byteArray = comando.getBytes("UTF8");
        System.out.println("Write...");
        outputStream.write(byteArray);
        System.out.println("Flush...");
        outputStream.flush();
        System.out.println("Close...");
        outputStream.close();
    }
}
