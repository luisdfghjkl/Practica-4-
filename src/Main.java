import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Circuito caso3 = new Circuito();
       Scanner vcc= new Scanner (System.in);
       Scanner icq = new Scanner (System.in);
       Scanner b = new Scanner (System.in);
       
       float VCC;
       float ICQ;
       float B;
       float RB = 0;
       float RE;
       float RTH;
       float VTH;
       float R1; 
       float hie;
       System.out.println ("Dame VCC");
       
       VCC= vcc.nextFloat();
       
       
      // caso3.setVcc(VCC);
       
       System.out.println ("Dame ICQ");
       
       ICQ= icq.nextFloat();
       
       System.out.println ("Dame Beta");
        
       B= b.nextFloat();
       
     
       hie= (float) (B*.025);
       float hie2;
       hie2 = hie/ICQ;
       RB= ((10*hie2));
       
     //  System.out.println("hie:"+hie2+"\nRB:"+RB);
       //////////////////////calcular RE
       
       RE= ((10*RB)/B);
       //////////////////////////////////////Calcular RC
       
      
        
        float VE= ICQ*RE;
        float RC=(VCC-(VE))/(2*ICQ);
        //////////////////////////////////// Calcular R1
       
       RTH=RB;
        float ib = ICQ/B;
       VTH=(float) ((float) ((RTH*ib)+ (RE*ICQ))+.7);
       ////////////////////////////////////////Calcular R2
       
    
       R1= (RTH/VTH)*VCC;
     //  caso3.setR2(VTH,VCC,R1);
        float R2 = (VTH*R1)/(VCC-VTH);
       // float RC = caso3.getRC();
       // String Resultado;
       // Resultado = (RB+RE+RC+R1+R2);
      // System.out.println(RB);
       //System.out.println(RE);
       //System.out.println(RC);
      // System.out.println(R1);
      // System.out.println(R2);
        System.out.println("hie:"+hie2+"\nRB:"+RB+"\nRE:"+RE+"\nRC:"+RC+"\nR1:"+R1+"\nR2:"+R2+"\nVTH:"+VTH);
        


}
