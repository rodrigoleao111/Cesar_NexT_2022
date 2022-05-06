import java.util.Scanner;

public class Exercicios {
    //Resolução dos exercícios da aula 3
    public static void main(String[] args) throws Exception{
        //Questão 1
        System.out.println("Mensagem na tela");

        //Questão 2
        int x = 4, y = 5, z = 6, maior = x, menor = x;
        //verificação de quem é o maior
        maior = x > maior ? x:maior;
        maior = y > maior ? y:maior;
        maior = z > maior ? z:maior;

        //verificação de quem é o menor
        menor = x < menor ? x:menor;
        menor = y < menor ? y:menor;
        menor = z < menor ? z:menor;

        //resultado
        System.out.println("Maior: " + maior + "\nMenor: " + menor);

        //Questão 3
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        //System.out.println(num);
        int num = 3;
        //fatoração
        int resultado = 1;
        for(int i = num; i > 0 ; i--) {
            resultado = resultado*i;
        } 
        System.out.println("Resultado: " + resultado);

        //Questão 4
        
    }
}
