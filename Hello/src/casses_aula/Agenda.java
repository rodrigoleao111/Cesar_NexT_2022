package casses_aula;

import javax.swing.event.InternalFrameAdapter;

public class Agenda{            //1ª letra maiúscula para nome de classe
    int foneNumber;       //variáveis com letra minúscula | Usar camelCase em Java
    String name;                //esses são os atributos de uma classe
    String email;
    
    //modificadores de acesso
    private int age;        //para acessar uma variável privada eu preciso de um método intermediário que retorne ela
    public String occupation;

    
    //métodos
    public void setNome(String novoNome) {      //método set: altera uma variável
        this.name = novoNome;
    }

    public void getEmail(){                     //método get: visualiza uma variável
        System.out.println(this.email);
    }


    
}