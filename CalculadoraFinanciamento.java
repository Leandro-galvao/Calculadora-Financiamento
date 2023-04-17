public class CalculadoraFinanciamento {
    public static void main(String[] args) {
        int valorCarro = 10000;  
        int duracaoEmprestimo = 3; //3 anos
        int taxaJuros =5; //5% de juros
        int valorEntrada = 2000;

        if(duracaoEmprestimo <= 0 || taxaJuros <=0){
            System.out.println("ERRO!!! Você deve fazer um empréstimo válido");
        }
        else if(valorEntrada >= valorCarro){
            System.out.println("O carro pode ser pago integralmente");
        }
        else {
            int saldoRestante = valorCarro - valorEntrada;
            int numeroMeses = duracaoEmprestimo * 12;
            int saldoMensal = saldoRestante / numeroMeses;
            int juros = (saldoMensal * taxaJuros) / 100;
            int pagamentoMensal = saldoMensal + juros;
            System.out.println(pagamentoMensal);
    }
}
}