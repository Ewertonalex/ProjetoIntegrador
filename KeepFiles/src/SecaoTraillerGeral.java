import java.util.ArrayList;

public class SecaoTraillerGeral {
    private String TipReg;
    private String QtdCartArq;

    public SecaoTraillerGeral(String linhaArquivo) {
        this.TipReg = linhaArquivo.substring(0, 1);
        this.QtdCartArq = linhaArquivo.substring(1, 8);
    }

    public String getTipReg() {
        return TipReg;
    }

    public void setTipReg(String tipReg) {
        TipReg = tipReg;
    }

    public String getQtdCartArq() {
        return QtdCartArq;
    }

    public void setQtdCartArq(String qtdCartArq) {
        QtdCartArq = qtdCartArq;
    }

    public void validarLinha(SecaoTraillerGeral secaoTraillerGeral, ArrayList<String> listaErros){

    }

    private static boolean isInteger(String str) {

        return str != null && str.matches("[0-9]*");
    }
}
