
package vendas;


import java.util.Locale;
import javax.swing.JOptionPane;


public  class Produto{

    
    String cor,modelo;
    float valor;
    int qtd;
    
   
    

       
    //MOUSE
    public static void Mouse(String modelo, String cor, String mse, float valor, float a){
    
       int v;
       modelo = "Dell";
       cor = "preto";
       valor = 250;
       
        /*format separado do joption pane
        mse = String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f ",modelo,cor, valor);
        v = Integer.parseInt(JOptionPane.showInputDialog(null,mse));*/
      
       //Joption pane com format incluso  
       v = Integer.parseInt(JOptionPane.showInputDialog(null,
       String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f ",
       modelo,cor, valor)));
   
       int d;
       modelo = "Rezer";
       cor = "verde";
       valor = 450;
      
       /*Format fora do joption pane
       mse = String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f", modelo,cor,valor);
       d = Integer.parseInt(JOptionPane.showInputDialog(null,mse));*/
     
       d = Integer.parseInt(JOptionPane.showInputDialog(null,
       String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f", 
       modelo,cor,valor)));
        
       int b;
       modelo = "Lenovo";
       cor = "verde";
       valor = 150;
       
       /*Usando o Locale Junto com o formart e JOPTION PANE porém fora do joption pane
       mse = String.format(Locale.US,"Modelo: %s \nCor: %s \nValor: R$ %.2f",modelo, cor, valor);
       b = Integer.parseInt(JOptionPane.showInputDialog(null,mse));*/
        
       
       b = Integer.parseInt(JOptionPane.showInputDialog(null, 
       String.format(Locale.US,"Modelo: %s \nCor: %s \nValor: R$ %.2f",
       modelo, cor, valor)));
       
       a = ((v * 250) + (d * 450) + (b * 150));
      
       /*mse = String.format("Total: R$ %.2f",a);
       JOptionPane.showMessageDialog(null,mse);*/
       
       JOptionPane.showMessageDialog(null,
        String.format("Total: R$ %.2f",a));
    }
    
    //TECLADO
    public static void Teclado(String Modelo, String cor, String tld, float valor, float l){
       
        int c;
        Modelo = "Dell";
        cor = "preto";
        valor = 170;
        
        /*tld = String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f",Modelo,cor,valor);
        c = Integer.parseInt(JOptionPane.showInputDialog(null, tld));*/
        
        c = Integer.parseInt(JOptionPane.showInputDialog(null, 
        String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f",
        Modelo,cor,valor)));
        
        int f;
        Modelo = "Rezer";
        cor = "Verde";
        valor = 470;
        /*tld = String.format(Locale.US,"Modelo: %s \nCor: %s \nValor: R$ %.2f", Modelo, cor, valor);
        f = Integer.parseInt(JOptionPane.showInputDialog(null, tld));*/
        
        f = Integer.parseInt(JOptionPane.showInputDialog(null, 
        String.format(Locale.US,"Modelo: %s \nCor: %s \nValor: R$ %.2f", 
        Modelo, cor, valor)));
        
        int g;
        Modelo = "Logtech";
        cor = "Azul";
        valor = 350;
        /*tld = String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f",Modelo, cor, valor);
        g = Integer.parseInt(JOptionPane.showInputDialog(null, tld));*/
        
        
        g = Integer.parseInt(JOptionPane.showInputDialog(null, 
        String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f",
        Modelo, cor, valor)));
        
        l = ((c * 170)+(f * 470)+(g * 350));
        
        
        JOptionPane.showMessageDialog(null,
        String.format("Total: R$ %.2f",l));
    }
    
    //MONITOR
    public static void Monitor(String Modelo, String cor, String mtr, float Valor, float p){
       
       int j;
       Modelo = "Acer";
       cor = "Preto / Vermelho";
       Valor = 650;
       
       /*mtr = String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f",Modelo, cor, Valor);
       j = Integer.parseInt(JOptionPane.showInputDialog(null,mtr));*/
       
       j = Integer.parseInt(JOptionPane.showInputDialog(null,
       String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f",
       Modelo, cor, Valor)));
       
       int k;
       Modelo = "Dell";
       cor = "branco";
       Valor = 350;
       
       /*mtr = String.format(Locale.US,"Modelo: %s \nCor: %s \nValor: R$ %.2f", Modelo, cor, Valor);
       k = Integer.parseInt(JOptionPane.showInputDialog(null, mtr));*/
       
       
        k = Integer.parseInt(JOptionPane.showInputDialog(null, 
        String.format(Locale.US,"Modelo: %s \nCor: %s \nValor: R$ %.2f", 
        Modelo, cor, Valor)));
       
       int l;
       Modelo = "Samsung";
       cor = "Azul";
       Valor = 550;
       
       /*mtr = String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f",Modelo, cor, Valor);
       l = Integer.parseInt(JOptionPane.showInputDialog(null, mtr));*/
       
        l = Integer.parseInt(JOptionPane.showInputDialog(null, 
        String.format("Modelo: %s \nCor: %s \nValor: R$ %.2f",
        Modelo, cor, Valor)));
       
       
        p = ((j * 650)+(k * 350)+(l * 550));
        //mtr = String.format("Total: R$ %.2f",p);
       
       JOptionPane.showMessageDialog(null,
       String.format("Total: R$ %.2f",p));
    }
    

  
   /*
  
    public void informacao(){
        
        int op;
        
        String menu = "ESCOLHA SEU MOUSE \n"+
                "1 - Logitech \n"+
                "2 - Dell \n"+
                "3 - Rezer \n"+
                "4 - Voltar";
        do{
            
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(op){
                
                case 1:
                    //MOUSE
                    Produto("rezer", "verde",10);
                break;
                
                case 2:
                    //TECLADO
                    Produto();
                break;
                
                case 3:
                    
                break;
                
                case 4:
                   
                break;
                
                case 5:
                    JOptionPane.showMessageDialog(null,"Fique a vontade para conferir outros produtos");
                break;    
                
                default:
                    JOptionPane.showMessageDialog(null,"Opção invalida");
                break;
            } 
        }
        while( op != 5);
    }
    

    
    
    public void Detalhe(){
        
        int ops;
        
        String Menu = "ESCOLHA SEU TECLADO \n"+
                "1 - DELL \n"+
                "2 - REZER \n"+
                "3 - ACER \n"+
                "4 - Voltar";
        
        
        do {            
            ops = Integer.parseInt(JOptionPane.showInputDialog(Menu));
            
            switch(ops){
                case 1:
                   // Teclado1();
                break;
                
                case 2:
                //    Teclado2();
                break;
                
                case 3:
                //    Teclado3();
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null,"Fique a vontade para conferir outros produtos");
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Opçao Invalida");
                break;
            }
        }
        while (ops != 4);
    } 
    
    
    public void Status(){
        int ops;
        
        String Menu = "ESCOLHA O SEU MONITOR \n"+
                "1 - Acer \n"+
                "2 - Dell \n"+
                "3 - Samsung \n"+
                "4 - Voltar";
        
        do{
            ops = Integer.parseInt(JOptionPane.showInputDialog(Menu));
            
            switch(ops){
                case 1:
                    Monitor1();
                break;
                
                case 2:
                    Monitor2();
                break;
                
                case 3:
                    Monitor3();
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null,"Fique a vontade para conferir outros produtos");
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Opção invalida");
                break;
            }             
        }
        while (ops != 4); 
    }*/
}
