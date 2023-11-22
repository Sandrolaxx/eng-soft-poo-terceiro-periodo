package aula07_trabalho_bimestral.utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Util {
    static NumberFormat formata = new DecimalFormat("R$ #,##0.00");
    public static String doubleToString(Double valor){
        return formata.format(valor);
    }
    
}
