package usandohashmap;

import java.util.HashMap;
import java.util.Scanner;

public class UsandoHashMap {

    public static void main(String[] args) {
        HashMap<Integer, Turma> hm = new HashMap<>();
        hm.put(1, new Turma(1234, "Raphael", 8));
        hm.put(2, new Turma(6543, "Gilson", 6));
        hm.put(3, new Turma(9876, "Vinicius", 7));
        hm.put(4, new Turma(8526, "Caroline", 6.5));
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int chave = 5;
        long matricula;
        String nome;
        float nota;

        do {
            System.out.println("---GERENCIA DE TURMAS---");
            System.out.println("________________________");
            System.out.println("1. CADASTRO_____________");
            System.out.println("2. EXIBE DADOS__________");
            System.out.println("3. ALTERAR NOTA_________");
            System.out.println("4. DELETAR ESTUDANTE____");
            System.out.println("5. SAIR_________________");
            System.out.println("________________________");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("---CADATRO DE ESTUDANTE---");
                    System.out.print("Digite a matricula: ");
                    matricula = sc.nextLong();
                    System.out.print("Digite o nome: ");
                    nome = sc.next();
                    System.out.print("Digite a nota: ");
                    nota = sc.nextFloat();
                    hm.put(chave, new Turma(matricula, nome, nota));
                    chave++;
                    break;
                case 2:
                    if (!hm.isEmpty()) {
                        hm.entrySet().stream().map(entry -> {
                            return entry;
                        }).forEachOrdered(entry -> {
                            System.out.println(entry.getValue().toString());
                        });
                    } else {
                        System.out.println("SEM CADASTROS!");
                    }
                    break;
                case 3:
                    System.out.println("_____________________________");
                    System.out.println("---MENU ALTERAÇÃO DE NOTAS---");
                    System.out.print("Digite o nome do Estudante que deseja alterar a nota: ");
                    String nomePesquisa = sc.next();
                    hm.forEach((k, p) -> {
                        boolean existeNome = p.getNome().contains(nomePesquisa);
                        if (existeNome == true){
                            System.out.println("Encontrado aluno "+p.getNome()+" com a nota "+p.getNota());
                            System.out.print("Digite a nova nota: ");
                            float novaNota = sc.nextFloat();
                            p.setNota(novaNota);
                        }
                    });
                    break;
                case 4:
                    if (!hm.isEmpty()) {
                        hm.entrySet().stream().map(entry -> {
                            return entry;
                        }).forEachOrdered(entry -> {
                            System.out.println("****EXCLUIR ESTUDANTE****");
                            System.out.println("ID: "+entry.getKey());
                            System.out.println(entry.getValue().toString());
                        });
                        System.out.println("Digite a ID do Estudante que deseja deletar: ");
                        int deletaChave = sc.nextInt();
                        hm.remove(deletaChave);
                    } else {
                        System.out.println("SEM CADASTROS!");
                    }
                break;
            }
        } while (opcao != 5);
    }

}
