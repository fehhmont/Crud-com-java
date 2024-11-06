
package com.mycompany.trabalhogibi2;

import java.util.ArrayList;
import java.util.Scanner;


public class Trabalhogibi2 {

    public static void main(String[] args) {
      
        
        int escolhanumero, anogibi = 0, desifilme, id = 0,alterarGibi,excluirGibi,escolhanumerorelatorio;
        String nomegibi = null, autorgibi = null, categibi = null,  categoriabusca = null, buscaautor = null;
        
        Scanner valor = new Scanner(System.in);
        ArrayList<gibi> classe = new ArrayList<gibi>();
       // classe.add(new gibi(134, "nome", "autor", "categoria", 124)); // método para adicionar elementos no ArrayList

        while (true) { // Loop para o menu
            System.out.println("""
                               Escolha o número que deseja: ex: 1 // 2 // 3
                                --------------------------- 
                               1. Cadastrar Gibi
                                --------------------------- 
                               2. Relatorios
                                --------------------------- 
                               3. Alterar Gibi cadastrado
                                --------------------------- 
                               4. excluir Gibi 
                                ---------------------------                             
                               5. Sair
                               """);
            escolhanumero = valor.nextInt();
            valor.nextLine(); 
            
            switch (escolhanumero) {
                case 1 -> {
                    while (true) { 
                        id += 1;
                        System.out.println("Digite o nome do Gibi:");
                        nomegibi = valor.nextLine(); 
                        
                        System.out.println("Qual o ano do Gibi:");
                        anogibi = valor.nextInt();
                        valor.nextLine(); 
                        
                        System.out.println("Autor:");
                        autorgibi = valor.nextLine(); 
                        
                        System.out.println("Categoria:");
                        categibi = valor.nextLine(); 
                        
                        classe.add(new gibi(anogibi, nomegibi, autorgibi, categibi, id));
                        
                        System.out.println("Deseja inserir outro gibi? Se sim, digite 1, se não, digite 2");
                        desifilme = valor.nextInt();
                        valor.nextLine(); 
                        
                        if (desifilme != 1) {
                            break; 
                        }
                    }
                }
                case 2 -> {
                    
                    while (true){
                        System.out.println("""
                               Escolha o número que deseja: ex: 1 // 2 // 3
                                --------------------------- 
                               1. Listar todos os gibis
                                --------------------------- 
                               2. Listar por Autor
                                --------------------------- 
                               3. Consultar por Categoria
                                --------------------------- 
                               4. Voltar
                               """);
            escolhanumerorelatorio = valor.nextInt();
            valor.nextLine(); 
            
            switch (escolhanumerorelatorio){
                
                case 1 ->{
                    
                    System.out.println("LISTAGEM DE TODOS OS GIBIS CADASTRADOS:");
                    for (gibi g : classe)
                    { 
                        g.imprimirGibi(); 
                    }
                    if(!classe.isEmpty())                                        
                    classe.remove(0);
                    else
                    System.out.println("sem elementos");

                        }
                case 2 -> {
                    System.out.println("Dgite o nome do autor do Gibi:");
                    buscaautor = valor.nextLine();
                    System.out.println("Listagem de Gibis encontrados do autor: " + buscaautor);
                    
                    for (gibi g : classe) {
                        if (g.autor.equalsIgnoreCase(autorgibi)) {
                            g.imprimirGibi();
                        }
                        
                    }
                }
                case 3 ->{
                    System.out.println("Digite a Categoria:");
                    categoriabusca = valor.nextLine();
                    System.out.println("Listagem de Gibis encontrados com a Categoria:"+ categoriabusca);
                    for (gibi g : classe) {
                     
                        if (g.categoria.equalsIgnoreCase(categoriabusca)) {
                            g.imprimirGibi();
                            
                        }
                        
                    }
                    
                }
                case 4 ->{
                    break;
                }
  
                                           }
                    break;
    
                                }   
                        }
                case 3 -> {
                    
                    
                       for(int i=0;i<classe.size();i++)
        {           System.out.println("Digite o id de Gibi que voce deseja alterar:");
                        alterarGibi = valor.nextInt();
                        valor.nextLine(); 
                       
                        System.out.println("Digite o nome do Gibi:");
                        nomegibi = valor.nextLine(); 
                        
                        
                        System.out.println("Qual o ano do Gibi:");
                        anogibi = valor.nextInt(); 
                        valor.nextLine(); 
                        
                        System.out.println("Autor:");
                        autorgibi = valor.nextLine(); 
                        
                        System.out.println("Categoria:");
                        categibi = valor.nextLine(); 
                
            
             if(classe.get(i).id ==alterarGibi)
                
                
            classe.set(i, new gibi(anogibi, nomegibi, autorgibi, categibi,alterarGibi));
             
             System.out.println("Alteracao feita com sucesso!");
        
             System.out.println("Deseja fazer outro alteracao? Se sim, digite 1, se não, digite 2");
                        desifilme = valor.nextInt();
                        valor.nextLine(); 
                        
                        if (desifilme != 1) {
                            break; 
                        }
        }
                       
                }
                case 4-> {
                    System.out.println("Digite o id do filme que deseja exluir:");
                    excluirGibi = valor.nextInt();
                 
                    for(int i=0;i<classe.size();i++)
                    {
                        if(classe.get(i).id == excluirGibi){
                        classe.remove(i);  
                        System.out.println("Gibi removido");
                        }
                        
                    }
                    break;
                    
                }
                case 5 -> {
                     System.out.println("programa encerrado");
                    valor.close();
                    return;
                }
                default -> System.out.println("opcao invalida");
            }
        }
        
        
    }
}