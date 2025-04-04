import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Configurando PC 1
        Computador pc1 = new Computador();
        pc1.marca = "Apple";
        pc1.preco = 9856f;

        pc1.hard[0].nome = "Pentium Core i3";
        pc1.hard[0].capacidade = 2200;
        pc1.hard[1].nome = "Memoria RAM";
        pc1.hard[1].capacidade = 8;
        pc1.hard[2].nome = "HD";
        pc1.hard[2].capacidade = 500;

        pc1.sist.nome = "Linux Ubuntu";
        pc1.sist.tipo = 32;

        MemoriaUSB mem1 = new MemoriaUSB();
        mem1.nome = "Pen-Drive";
        mem1.capacidade = 16;
        pc1.addMemoriaUSB(mem1);

        //Configurando PC 2
        Computador pc2 = new Computador();
        pc2.marca = "Samsung";
        pc2.preco = 11090f;

        pc2.hard[0].nome = "Pentium Core i5";
        pc2.hard[0].capacidade = 3370;
        pc2.hard[1].nome = "Memoria RAM";
        pc2.hard[1].capacidade = 16;
        pc2.hard[2].nome = "HD";
        pc2.hard[2].capacidade = 1000;

        pc2.sist.nome = "Windows 8";
        pc2.sist.tipo = 64;

        MemoriaUSB mem2 = new MemoriaUSB();
        mem2.nome = "Pen-Drive";
        mem2.capacidade = 32;
        pc2.addMemoriaUSB(mem2);

        //Configurando PC 3
        Computador pc3 = new Computador();
        pc3.marca = "Dell";
        pc3.preco = 15534f;

        pc3.hard[0].nome = "Pentium Core i7";
        pc3.hard[0].capacidade = 4500;
        pc3.hard[1].nome = "Memoria RAM";
        pc3.hard[1].capacidade = 32;
        pc3.hard[2].nome = "HD";
        pc3.hard[2].capacidade = 2000;

        pc3.sist.nome = "Windows 10";
        pc3.sist.tipo = 64;

        MemoriaUSB mem3 = new MemoriaUSB();
        mem3.nome = "HD externo";
        mem3.capacidade = 1000;
        pc3.addMemoriaUSB(mem3);

        //Criando o cliente
        Cliente pessoa = new Cliente();
        pessoa.nome = "José Eduardo";
        pessoa.cpf = 70337433604L;

        //Interface do sistema
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Ola " + pessoa.nome + ", bem vindo a PC Mania!");
        System.out.println("Hoje estamos com uma promocao, gostaria de comprar alguma coisa?");
        System.out.println();

        System.out.println("Temos 3 computadores");
        System.out.println();

        System.out.println("Computador 1:");
        pc1.mostraPCConfigs();

        System.out.println();
        System.out.println("======================================");
        System.out.println();

        System.out.println("Computador 2:");
        pc2.mostraPCConfigs();

        System.out.println();
        System.out.println("======================================");
        System.out.println();

        System.out.println("Computador 3:");
        pc3.mostraPCConfigs();
        System.out.println();

        System.out.println("============================");
        System.out.println("Digite 1 para comprar o PC 1");
        System.out.println("Digite 2 para comprar o PC 2");
        System.out.println("Digite 3 para comprar o PC 3");
        System.out.println("============================");
        System.out.println();


        //lendo a escolha do cliente
        opcao = sc.nextInt();

        while (opcao != 0) {
            if (opcao == 1) {
                for(int i = 0; i < pessoa.comps.length; i++){
                    if(pessoa.comps[i] == null){
                        pessoa.comps[i] = pc1;
                        break;
                    }
                }
                System.out.println("Computador 1 adicionado");
                System.out.println("Gostaria da comprar mais um?");
            } else if (opcao == 2) {
                for(int i = 0; i < pessoa.comps.length; i++){
                    if(pessoa.comps[i] == null){
                        pessoa.comps[i] = pc2;
                        break;
                    }
                }
                System.out.println("Computador 2 adicionado");
                System.out.println("Gostaria da comprar mais um?");
            } else if (opcao == 3) {
                for(int i = 0; i < pessoa.comps.length; i++){
                    if(pessoa.comps[i] == null){
                        pessoa.comps[i] = pc3;
                        break;
                    }
                }
                System.out.println("Computador 3 adicionado");
                System.out.println("Gostaria da comprar mais um?");
            } else {
                System.out.printf("Opcao invalida");
                System.out.println();
            }
            opcao = sc.nextInt();
        }

        pessoa.calculaTotalCompra();
    }
}