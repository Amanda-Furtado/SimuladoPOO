package q4;

import java.util.ArrayList;

public class GestaoPedidos{
	private ArrayList<String> pedidos;

	public GestaoPedidos(){
		this.pedidos = new ArrayList<>();
	}	

	public void adicionarPedido(String item) {
        	pedidos.add(item);
    	}

	public String proximoPedido(){
        	if (pedidos.isEmpty()){
           		return "Fila Vazia";
        	}
        	return pedidos.remove(0);
    	}

	public int quantidadePendentes(){
        	return pedidos.size();
    	}

	public void listarPedidos(){
        	if (pedidos.isEmpty()){
           		System.out.println("A fila está vazia.");
        	}else{
            		for (int i = 0; i < pedidos.size(); i++){
                		System.out.println((i + 1) + ". " + pedidos.get(i));
            		}
		}
	}
}