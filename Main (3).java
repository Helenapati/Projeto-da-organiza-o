Private class Pessoa {

public String nome; 

public int idade;

 Pessoa[  ] lista; 

Scanner in = new Scanner(System.in);
Pessoa[  ] cadastrar(Pessoa ) { 
    	System.out.println("digite o número de pessoas para o cadastro: ");
 	int numero = in.nextInt();
 	 Pessoa[  ] lista = new Pessoa[numero];

 	 	for (int i = 0; i<lista.length; i++) {
       		System.out.println("digite o nome da pessoa: ");
 		pessoa.nome = in.next();
      		System.out.println("digite a idade: ");
       		pessoa.idade = in.nextInt();

 		 		if(lista[ i ] == null) {
              			lista[ i ] = pessoa;
	 		}

 		 		else {
           			System.out.println("não foi possível cadastrar. ");
         		}
  	}
 
		 		return lista;
 	 } 

}
