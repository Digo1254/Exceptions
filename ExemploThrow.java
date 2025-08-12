import javax.swing.JOptionPane;

public class ExemploThrow {


    public static void saque(double valor) throws LimiteSaqueException{
        if(valor > 400){
            LimiteSaqueException erro = 
                        new LimiteSaqueException("O valor do saque ultrapassa seu limite diario");
            throw erro;
        }
        else{
            JOptionPane.showMessageDialog(null, "Valor sacado com sucesso: " + valor, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void saqueRuntimeException(double valor){

        if(valor > 400){
            IllegalArgumentException erro = new IllegalArgumentException("Valor solicitado é maior que seu limite diario");
            throw erro;
        }
        else{
            System.out.println("Valor sacado com sucesso: " + valor);
        }

    }

}
