public class Pessoa {
    
    private static int counter = 1; 
    
    private String nome; 
    private String cpf; 
    private String email; 
    
    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf; 
        this.email = email; 
        counter += 1; 
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public String getcpf() {
        return cpf; 
    }

    public void setcpf(String cpf) {
        cpf = cpf; 
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        thist.email = email; 
    }

    public String toString() {
        return "\nNome: " + this.getNome() + 
               "\cpf: " + this.getcpf() +
               "\nemail: " + this.getEmail(); 
    }

    public void depositar(Double valor) {
        private Double saldo; 
        
        public Valor(Double saldo) {
            this.saldo = saldo; 
            
            public Double getsaldo() {
                return saldo;
            }
        
            public void setsaldo(Double saldo) {
                this.saldo = saldo
            }
        }
        if (valor > 0) {
            setSaldo(getsaldo() + valor); 
            System.out.println("Seu depósito foi realizado com sucesso!");
        }
        else {
            System.out.println("Não foi possvel realizar o ddepósito!");
        }
}

        
