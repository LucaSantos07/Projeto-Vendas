
package vendas;

import javax.swing.JOptionPane;


public class Pedido extends Produto {
   
   
    
    
        public void Catalogo(){
    
        
            int opcao;
        
            String menu = "SEJA BEM - VINDO \n"+
                "1 - MOUSE \n" +
                "2 - TECLADO \n"+
                "3 - MONITOR \n"+
                "4 - TOTAL \n"+
                "5 - SAIR";
        
        
            do{
            
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            
           
                switch(opcao){
                
                    case 1:
                        Mouse(modelo, cor, cor, valor, valor);
                    break;
                
               
                    case 2:
                        Teclado(modelo, cor, cor, valor, valor);
                    break;
                
                
                    case 3:
                        Monitor(modelo, cor, cor, valor, valor);
                    break;
                
                
                    case 4:
                       
                       
                        
                        
                    break;
                    
                    case 5:
                        
                         JOptionPane.showMessageDialog(null,"Obrigado pela preferencia");
                    break;
       
                    default:    
                        JOptionPane.showMessageDialog(null,"Opção invalida");
                    break;
                }
            }  
            while(opcao != 5);   
        }
}
