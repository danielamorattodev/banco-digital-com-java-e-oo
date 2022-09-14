package dio.com.br;

import java.util.ArrayList;

public class Cliente {
    private ArrayList<Endereco> enderecos;
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
}
