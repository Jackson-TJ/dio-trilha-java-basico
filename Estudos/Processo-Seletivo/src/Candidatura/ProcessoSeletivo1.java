import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo1 {
    public static void main(String[] args){
        System.out.println("Processo Seletivo");
        selecaoCandidatos();
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
       //analisarCandidato(2000.0);
        

    }
    /**
     * @return
     */
    static double selecaoCandidatos(){
        String[] candidatos = {"felipe","Marcia","Julia","paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        final double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800, 2200);

        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato"+candidato+" solicitou este valor de Salário "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O Candidato "+ candidato+" foi selecionado para vaga");
                candidatosSelecionados++;
            } candidatoAtual++;
        }
        
        }
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato");
        }else if (salarioBase==salarioPretendido){
            System.out.println("Ligar para o Candidato com contra proposta");
        }else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
        
    }
    
}
