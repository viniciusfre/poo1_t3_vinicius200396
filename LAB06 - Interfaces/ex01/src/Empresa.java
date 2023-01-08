public class Empresa {
    public static void main(String[] args) throws Exception {
        Cliente cliente[] = new Cliente[3];
        Produto produto[] = new Produto[3];
        Servico servico[] = new Servico[3];
        Classificador classificador = new Classificador();
        
        cliente[0] = new Cliente("Santiago");
        cliente[1] = new Cliente("Zack");
        cliente[2] = new Cliente("Abel");

        produto[0] = new Produto(1234);
        produto[1] = new Produto(9876);
        produto[2] = new Produto(5674);

        servico[0] = new Servico(10.50);
        servico[1] = new Servico(5.30);
        servico[2] = new Servico(90.35);

        classificador.ordena(cliente);
        classificador.ordena(servico);
        classificador.ordena(produto);

        for(int i =0;i<cliente.length;i++){
            System.out.println(cliente[i]);
            System.out.println(produto[i]);
            System.out.println(servico[i]);
        }
        

    }
}
