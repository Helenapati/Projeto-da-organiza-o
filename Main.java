 System.out.println("Olá, seja bem vindo ao sitema de cadastro de voluntários\n");
 
 System.out.println("por favor, adicione seu nome completo:");
        String nome = scan.nextLine();
        
        System.out.println( "Qual é a sua idade?");
        int idade = scan.nextInt();
        
        System.out.println("Com qual gênero você se identifica? ('F' para Feminino e 'M' para  Masculino):");
        char genero =  scan.next(). charAt (0);
        scan.nextLine();
        
        System.out.println("RA: "); 
        Voluntario voluntario = new Voluntario(nome, idade, genero); 
        voluntario.setRa(scan.nextLine()); 
        
