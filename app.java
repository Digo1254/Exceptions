import javax.swing.JOptionPane;

public class app {



    public static void main(String args[]){
        String valor = JOptionPane.showInputDialog(null,"Digite o valor que deseja sacar","Sacar",JOptionPane.INFORMATION_MESSAGE);
        Double valor2 = Double.parseDouble(valor);

        exception(valor2);
        //runtimeException(); 
    }

    private static void runtimeException(){
        ExemploThrow.saqueRuntimeException(500);
    }


    private static void exception(double valor){
        try {
            ExemploThrow.saque(valor);
        }catch (LimiteSaqueException e){
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

        }

    }

}
