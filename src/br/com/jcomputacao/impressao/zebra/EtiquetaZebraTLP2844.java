/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.impressao.zebra;

/**
 * 26/08/2011 13:32:48
 * @author marcos
 */
public class EtiquetaZebraTLP2844 {

    /**
     *
     * @param posX
     * @param posY
     * @param horientacao
     *<p>          0 Sem Rotacao
     *<p>          1 90 graus
     *<p>          2 180 graus
     *<p>          3 270 graus
     * @param fonte
     *<p>  Selecao da Fonte
     *<p> Value Description
     *<p>   203 dpi.........................300 dpi
    *<p>1   20.3 cpi, 6 pts,(8 x 12 dots)   ||||    25 cpi, 4 pts,(12 x 20 dots)
    *<p>2   16.9 cpi, 7 pts,(10 x 16 dots)  ||||    18.75 cpi, 6 pts,(16 x 28 dots)
    *<p>3   14.5 cpi, 10 pts,(12 x 20 dots) ||||    15 cpi, 8 pts,(20 x 36 dots)
    *<p>4   12.7 cpi, 12 pts,(14 x 24 dots) ||||    12.5 cpi, 10 pts,(24 x 44 dots)
    *<p>5   5.6 cpi, 24 pts,(32 x 48 dots)  ||||    6.25 cpi, 21 pts,(48 x 80 dots)
  *<p>A - Z Reserved for Soft Fonts         ||||    Reserved for Soft Fonts
Fonts 1 - 5 are fixed pitch.
     * @param formato
     * @param estilo
     * @param texto
     * @return
     */
    public static String getRepresentacaoLabel(int posX, int posY, int horientacao,
            int fonte, int expansorHorizontal, int expansorVertical, String texto ){
        return "A"+posX+","+posY+","+horientacao+","+fonte+","+expansorHorizontal+","+expansorVertical+",N,\""+texto+"\"";
    }


    /**
     * @param posX
     * Horizontal start position (X) in dots
     * @param posY
     * Vertical start position (Y) in dots.
     * @param horientacao
     * 0 No rotation
1 90 degrees
2 180 degrees
3 270 degrees
     * @param tipoCodigoBarras (nome do padrão || tipoCodigoBarras || larguraCodBarras)
     *  Code 39 std. or extended 3 1-10
        Code 39 with check digit 3C 1-10
        Code 93 9 1-10
        Code 128 UCC
        Serial Shipping Container Code 0 1-10
        Code 128 auto A, B, C modes 1 1-10
        Code 128 mode A 1A 1-10
        Code 128 mode B 1B 1-10
        Code 128 mode C 1C 1-10
        Codabar K 1-10
        EAN8 E80 2-4
        EAN8 2 digit add-on E82 2-4
        EAN8 5 digit add-on E85 2-4
        EAN13 E30 2-4
        EAN13 2 digit add-on E32 2-4
        EAN13 5 digit add-on E35 2-4
        German Post Code 2G 3-4
        Interleaved 2 of 5 2 1-10
        Interleaved 2 of 5 with mod 10 check digit 2C 1-10
        Interleaved 2 of 5 with human readable
        check digit 2D 1-10
        Postnet 5, 9, 11 & 13 digit P —
        Japanese Postnet J —
        UCC/EAN 128* 1E 1-10
        UPC A UA0 2-4
        UPC A 2 digit add-on UA2 2-4
        UPC A 5 digit add-on UA5 2-4
        UPC E UE0 2-4
        UPC E 2 digit add-on UE2 2-4
        UPC E 5 digit add-on UE5 2-4
        UPC Interleaved 2 of 5 2U 1-10
        Plessey (MSI-1) with mod. 10 check digit L —
        MSI-3 with mod. 10 check digit M —
     *
     * @param larguraEmDots
     * Wide bar width in dots.
        Acceptable values are 2-30.
     * @param altura em Dots 
     * Bar code height in dots
     * @param texto
     * @return
     */
    public static String getRepresentacaoCodigoBarras(int posX, int posY, int horientacao, int tipoCodigoBarras,
            int larguraCodBarras, int larguraEmDots, int algumaCoisa, String texto ){
        return "B"+posX+","+posY+","+horientacao+","+tipoCodigoBarras+","+larguraCodBarras+","+larguraEmDots+
                ","+algumaCoisa+",B,\""+texto+"\"";
    }

    public static String getRepresentacaoLinha(int inicioX, int inicioY, int tamanhoX,
            int tamanhoY){
        return "LO"+inicioX+","+inicioY+","+tamanhoX+","+tamanhoY;
    }

    /**
     *
     * @param inicioX
     * Label length measured in dots
Default: Set by the AutoSense of media.
Maximum Value: 65535 (dots)
 Distance between edges of the label or black
line marks.
 For continuous mode, the parameter sets
the feed distance between the end of one
form and beginning of the next
     * @param inicioY
     * Gap length or thickness of black line
Range: 16-240 (dots) for 203 dpi printers
[18-240 (dots) for 300dpi printers]
Gap Mode - By default, the printer is in
Gap mode and parameters are set with
the media AutoSense.
Black Line Mode - Set p2 to B plus
black line thickness in dots. See the
Gap mode range.
Continuous Media Mode
Set p2 to 0 (zero)
The transmissive (gap) sensor will be
used to detect the end of media.
     * @param tamanhoX
     * Offset length measured in dots
 Required for black line mode operation.
 Optional for Gap detect or continuous media
modes. Use only positive offset values.
     * @return
     */
    public static String getRepresentacaoAlturaEtiqueta(int inicioX, int inicioY, int tamanhoX){
        if(tamanhoX != 0){
            return "Q"+inicioX+","+inicioY+"+"+tamanhoX+"";
        }else {
            return "Q"+inicioX+","+inicioY+"";
        }
    }

    /**
     * Use this command to set the width of the printable
area of the media.
     * @param inicioX
     * The width of the label measured in dots.
The q command will cause the image buffer to
reformat and position to match the selected label
width (p1).
     * @return
     */
    public static String getRepresentacaoLarguraEtiqueta(int inicioX){
            return "q"+inicioX;
        
    }

    /**
     * COMANDO PARA IMPRIMIR - DEVE ESTAR CONTIDO NO FINAL DO ARQUIVO
     * OU SER O ULTIMO COMANDO
     * @return
     */
    public static String getRepresentacaoImprimir(){
            return "P1";
    }


    public static String getRepresentacaoVelocidadeImpressao(int velocidade){
            return "S"+velocidade;
    }

    public static String getRepresentacaoDensidadeImpressao(int densidade){
            return "S"+densidade;
    }

    /**
     * 
     * @param bits
     * numero de bits 7 ou 8
     * @param printerCode
     * 3 para Portugues
     * @param countryCode
     * 351 Portuguese
     * @return
     */
    public static String getRepresentacaoCarachterSet(int bits, int printerCode, int countryCode){
            return "I"+bits+","+printerCode+","+countryCode;
    }

    /**
     *
     * @param horientacao
     * SE = B imprime de baixo para cima
     * SE = T imprime de cima para baixo
     * @return
     */
    public static String getRepresentacaoHorientacaoImpressao(String horientacao){
        if(null != horientacao && !horientacao.equals("B")){
            return "ZT";
        }else{
            return "ZB";
        }
    }
}
