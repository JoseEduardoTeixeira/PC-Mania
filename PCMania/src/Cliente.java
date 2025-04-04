public class Cliente {
    String nome;
    long cpf;
    float total;
    Computador[] comps = new Computador[20];

    void calculaTotalCompra(){
        total = 0;
        for (Computador comp : comps) {
            if(comp != null) {
                total += comp.preco;
            }
            else{
                break;
            }
        }

        System.out.println("Preco total: " + total);
    }
}
