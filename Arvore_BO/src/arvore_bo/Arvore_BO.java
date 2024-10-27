/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvore_bo;

/**
 *
 * @author Lenovo
 */
public class Arvore_BO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Arvore<Integer> arvore = new Arvore<Integer>();
      arvore.adicionar(10);
      arvore.adicionar(8);
      arvore.adicionar(5);
      arvore.adicionar(9);
      arvore.adicionar(7);
      arvore.adicionar(18);
      arvore.adicionar(13);
      arvore.adicionar(20);
        System.out.println("Ordem");
      arvore.emOrdem(arvore.getRaiz());
      
      arvore.remover(20);
          System.out.println("Ordem");
      arvore.emOrdem(arvore.getRaiz());
      
      arvore.remover(5);
         System.out.println("Ordem");
      arvore.emOrdem(arvore.getRaiz());
      
      
            arvore.remover(8);
         System.out.println("Ordem");
      arvore.emOrdem(arvore.getRaiz());
      
                  arvore.remover(9);
         System.out.println("Ordem");
      arvore.emOrdem(arvore.getRaiz());
      // System.out.println("\n\npre-ordem");
      //arvore.emOrdem(arvore.getRaiz());
      
        //System.out.println("\n\npos-ordem");
        //arvore.emOrdem(arvore.getRaiz());
      
        
      
    }
    
}
