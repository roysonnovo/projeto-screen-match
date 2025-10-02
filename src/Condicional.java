public class Condicional {
    static void main() {
        int ano = 1990;
        boolean incluidoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar locação");
        }
    }
}
