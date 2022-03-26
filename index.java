import java.util.*;


class Main {
  public static void main(String[] args) {
 	Scanner dia = new Scanner (System.in);
    System.out.print("Um numero de 1 a 7 :");
    int semana = dia.nextInt();
    
    
  

    switch(semana){
      case 1 :
        System.out.print("Segunda mlk");
        break;
      case 2:
        System.out.print("Terça bora ");
        break;
      case 3 :
        System.out.print("Quarta ta no meio ");
        break;
      case 4:
        System.out.print("Quinta ta no fim ");
        break;
      case 5 :
        System.out.print("Sextou ");
        break;
      case 6 :
        System.out.print("Sabado");
        break;
      case 7 :
        System.out.print("Domingo");
      break;
        default:
        System.out.print("Data iválida");

        
    }
    
    
    
    
    
    

    
  }
}
