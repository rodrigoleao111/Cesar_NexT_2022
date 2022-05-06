/**
 * @author <a href="mailto: rodrigoleao1995@gmail.com">Rodrigo
 * @version 1.0.0
 * @todo Ver conceitos básicos do java
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //Declaração de variáveis
        int idade = 27;
        float altura = 1.64f;
        double limite_latas = 7.3453;
        char adv = 'O';
        String nome = "Rodrigo Leão", frase;
        
        //Concatenação de variáveis em uma frase
        frase = adv + " " + nome + " tem " + idade + " de idade e " + altura + " de altura.";

        System.out.println(frase);

        //Validação de maior idade
        if(idade >= 18){
            System.out.println("De maior");
        } else {
            System.out.println("De menor");
        }

        //Verificar se esta bêbado
        int qtd_de_latas = 0;
        boolean bebeu;
        //while(qtd_de_latas <= limite_latas){

        //}

        //Laço for
        //for(int cont = 0; cont < limite_latas; cont++ ){

        //}

        //Switch case
        String gender;
        switch(adv){
            case 'O': {
                gender = "Menino";
                break;
            }
            case 'A': {
                gender = "Menina";
                break;
            }
            default: {
                gender = "Não informado";  //"caso contrário"
                break;
            }
        }
        System.out.println("O gênero de " + nome + " é " + gender);



    }
}
