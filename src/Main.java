public class Main {
    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("     UNIFAN CENTRO UNIVERSITARIO        ");
        System.out.println("     Aluno: Luciano carvalho de almeida                  ");
        System.out.println("     Curso: engenharia de software                 ");
        System.out.println("===========================================\n");


        int totalAcertos = 0; //
        int totalQuestoes = 15;

        questões q1 = new questões();
        q1.pergunta = " 1 -Qual é o maior planeta do Sistema Solar?";
        q1.opcaoA = "A:Terra";
        q1.opcaoB = "B:jupiter";
        q1.opcaoC = "C:Saturno";
        q1.opcaoD = "D:Urano";
        q1.opcaoE = "D:Netunoa";
        q1.correta = "B";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        boolean certo = q1.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q2 = new questões();
        q2.pergunta = " 2 -Quem pintou a obra “Mona Lisar?";
        q2.opcaoA = "A:Michelangelo";
        q2.opcaoB = "B:Rafael Sanzio";
        q2.opcaoC = "C:Leonardo da Vinci";
        q2.opcaoD = "D:Van Gogh";
        q2.opcaoE = "D:Pablo Picasso";
        q2.correta = "C";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        certo = q2.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q3 = new questões();
        q3.pergunta = "3 - Qual é o país mais populoso do mundo (2025)?";
        q3.opcaoA = "A: China";
        q3.opcaoB = "B: Estados Unidos";
        q3.opcaoC = "C: Indonésia";
        q3.opcaoD = "D: Índia";
        q3.opcaoE = "E: Paquistão";
        q3.correta = "D";
        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        certo = q3.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q4 = new questões();
        q4.pergunta = "4 - Em que continente fica o Egito?";
        q4.opcaoA = "A: América do Sul";
        q4.opcaoB = "B: Europa";
        q4.opcaoC = "C: Ásia";
        q4.opcaoD = "D: África";
        q4.opcaoE = "E: Oriente Médio";
        q4.correta = "D";
        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        certo = q4.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q5 = new questões();
        q5.pergunta = "5 - Qual elemento químico tem símbolo O?";
        q5.opcaoA = "A: Oxigênio";
        q5.opcaoB = "B: Ouro";
        q5.opcaoC = "C: Ósmio";
        q5.opcaoD = "D: Prata";
        q5.opcaoE = "E: Hidrogênio";
        q5.correta = "A";
        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        certo = q5.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q6 = new questões();
        q6.pergunta = "6 - Quem escreveu 'Dom Quixote'?";
        q6.opcaoA = "A: José Saramago";
        q6.opcaoB = "B: Fernando Pessoa";
        q6.opcaoC = "C: Machado de Assis";
        q6.opcaoD = "D: Miguel de Cervantes";
        q6.opcaoE = "E: Gabriel García Márquez";
        q6.correta = "D";
        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        certo = q6.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q7 = new questões();
        q7.pergunta = "7 - Quantos estados tem o Brasil?";
        q7.opcaoA = "A: 24";
        q7.opcaoB = "B: 25";
        q7.opcaoC = "C: 26";
        q7.opcaoD = "D: 27";
        q7.opcaoE = "E: 28";
        q7.correta = "C";
        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        certo = q7.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q8 = new questões();
        q8.pergunta = "8 - Qual é a moeda oficial do Japão?";
        q8.opcaoA = "A: Yuan";
        q8.opcaoB = "B: Won";
        q8.opcaoC = "C: Dólar";
        q8.opcaoD = "D: Libra";
        q8.opcaoE = "E: Iene";
        q8.correta = "E";
        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        certo = q8.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q9 = new questões();
        q9.pergunta = "9 - Qual desses animais é um mamífero?";
        q9.opcaoA = "A: Tubarão";
        q9.opcaoB = "B: Pinguim";
        q9.opcaoC = "C: Jacaré";
        q9.opcaoD = "D: Golfinho";
        q9.opcaoE = "E: Polvo";
        q9.correta = "D";
        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        certo = q9.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q10 = new questões();
        q10.pergunta = "10 - Quem foi o primeiro homem a pisar na Lua?";
        q10.opcaoA = "A: Buzz Aldrin";
        q10.opcaoB = "B: John Glenn";
        q10.opcaoC = "C: Yuri Gagarin";
        q10.opcaoD = "D: Neil Armstrong";
        q10.opcaoE = "E: Charles Duke";
        q10.correta = "D";
        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        certo = q10.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q11 = new questões();
        q11.pergunta = "11 - Qual é o maior oceano da Terra?";
        q11.opcaoA = "A: Índico";
        q11.opcaoB = "B: Pacífico";
        q11.opcaoC = "C: Atlântico";
        q11.opcaoD = "D: Ártico";
        q11.opcaoE = "E: Antártico";
        q11.correta = "B";
        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        certo = q11.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q12 = new questões();
        q12.pergunta = "12 - Qual é o idioma oficial do Egito?";
        q12.opcaoA = "A: Árabe";
        q12.opcaoB = "B: Hebraico";
        q12.opcaoC = "C: Inglês";
        q12.opcaoD = "D: Francês";
        q12.opcaoE = "E: Turco";
        q12.correta = "A";
        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        certo = q12.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q13 = new questões();
        q13.pergunta = "13 - Quem é conhecido como 'Pai da Computação'?";
        q13.opcaoA = "A: Ada Lovelace";
        q13.opcaoB = "B: Alan Turing";
        q13.opcaoC = "C: Charles Babbage";
        q13.opcaoD = "D: Steve Jobs";
        q13.opcaoE = "E: Bill Gates";
        q13.correta = "C";
        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        certo = q13.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q14 = new questões();
        q14.pergunta = "14 - Qual país venceu a Copa do Mundo de Futebol em 2002?";
        q14.opcaoA = "A: França";
        q14.opcaoB = "B: Itália";
        q14.opcaoC = "C: Alemanha";
        q14.opcaoD = "D: Argentina";
        q14.opcaoE = "E: Brasil";
        q14.correta = "E";
        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        certo = q14.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }

        questões q15 = new questões();
        q15.pergunta = "15 - Qual é a fórmula química da água?";
        q15.opcaoA = "A: O2";
        q15.opcaoB = "B: NaCl";
        q15.opcaoC = "C: CO2";
        q15.opcaoD = "D: H2O";
        q15.opcaoE = "E: H2SO4";
        q15.correta = "D";
        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        certo = q15.isCorreta(resposta);
        if (certo) {
            totalAcertos++;
        }
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Você acertou " + totalAcertos + " de " + totalQuestoes + " questões.");
        double porcentagem = (totalAcertos * 100.0) / totalQuestoes;
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
    }
}