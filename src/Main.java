public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de Lançamento " + ano);
        boolean incluidoPlano = true;
        double notaFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse = """
                         Filme Top Gun
                         Filme de  aventura com galã dos anos 80
                         Muito Bom
                         Ano de lançamento
                         """ + ano;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);


    }
}