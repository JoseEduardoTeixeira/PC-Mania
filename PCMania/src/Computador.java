import java.sql.SQLOutput;

public class Computador {
    String marca;
    float preco;

    HardwareBasico[] hard = new HardwareBasico[3];
    HardwareBasico hard1;
    HardwareBasico hard2;
    HardwareBasico hard3;
    SistemaOperacional sist;
    MemoriaUSB[] mem = new MemoriaUSB[1];

    public Computador(){
        hard1 = new HardwareBasico();
        hard2 = new HardwareBasico();
        hard3 = new HardwareBasico();

        hard[0] = hard1;
        hard[1] = hard2;
        hard[2] = hard3;

        sist = new SistemaOperacional();
    }

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: R$" + preco);
        System.out.println();
        System.out.println("HardwareBasico:");
        System.out.println(hard[0].nome + " (" + hard[0].capacidade + " Mhz)");
        System.out.println(hard[1].nome + " " + hard[1].capacidade + " Gb");
        System.out.println(hard[2].nome + " " + hard[2].capacidade + " Gb");
        System.out.println();
        System.out.println("Sistema operacional:" + sist.nome + " (" + sist.tipo + " bits)");
        System.out.println();
        System.out.println("Memoria USB: " );
        if(mem[0] != null){
            System.out.println(mem[0].nome + " " + mem[0].capacidade + "Gb");
        }
        else{
            System.out.println("Nao possui memoria usb");
        }

    }

    void addMemoriaUSB(MemoriaUSB novaMem){
        mem[0] = novaMem;
    }
}
