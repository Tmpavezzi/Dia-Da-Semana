Scanner entrada = new Scanner (System.in);
    System.out.print("Pergunta ?");
botão
    char responda = entrada.next().charAt(0);

    switch(responda){
      case 'a' :
        System.out.print("errado" );
        break;
      case 'b' :
        System.out.print("errado" );
        break;
      case 'c' :
        System.out.print("certo" );
        break;
      case 'd':
        System.out.print("errado" );
        break;
      case 'e' :
        System.out.print("errado");
        break;
      default:
        System.out.print("Não tem esta alternativa");
        break;
