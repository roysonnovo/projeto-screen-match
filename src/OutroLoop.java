import java.util.Scanner;

public class OutroLoop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNota = 0;

        while (nota != -1) {
            System.out.println("Qual sua avaliação para o filme? Ou digite -1 para encerrar");
            nota = leitura.nextDouble();
            if(nota != -1) {
                mediaAvaliacao += nota;
                totalNota++;
            }

        }

        System.out.println("Média de avaliações " + mediaAvaliacao/totalNota);
    }
}
