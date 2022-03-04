package ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaViagens {
    public static void main(String[] args) {
        ArrayList<Lugar> destinos = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Map <String, Lugar> mapaViagem = new HashMap();
        Set <String> CPFClientes = new HashSet();

        //Adicionar Clientes
        Pessoa p1 = new Pessoa("123.767.132-40", "Jinx");
        Pessoa p2 = new Pessoa("333.289.984-55", "romulo");
        Pessoa p3 = new Pessoa("167.906.789-77", "joão");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        Lugar d1 = new Lugar("Bosque das princesas", "Pindamonhangaba", "Parque");
        Lugar d2 = new Lugar("Shopping Pátio Pinda", "Pindamonhangaba", "shopping");
        Lugar d3 = new Lugar("Fatec", "Pindamonhangaba/Moreira César", "Faculdade ");

        destinos.add(d1);
        destinos.add(d2);
        destinos.add(d3);

        for (Pessoa pessoa : pessoas) {
            CPFClientes.add(pessoa.getCpf());
        }
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            Lugar lugar  = destinos.get(i);
            mapaViagem.put(pessoa.getCpf(), lugar);

        }

        System.out.println(CPFClientes);

        //Retorna os dados do Cliente através do CPF
        String cpf = "333.289.984-55";
        Lugar lugar =(Lugar)mapaViagem.get(cpf);
        System.out.println("CPF: " + cpf + " | " + lugar.toString());

    }
}
