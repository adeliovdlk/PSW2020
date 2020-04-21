package exerc_16_2;

public class Principal_16_2{

	public static void main(String[] args) {
	
			ListaEncadeada lista = new ListaEncadeada();
				
			lista.inserirInicio(5);
			lista.inserirInicio(8);
			lista.inserir(3, 2);
			lista.inserirFim(12);
			lista.inserirFim(14);
			mostraLista(lista);
			System.out.println("RemoverInicio: " +lista.removerInicio());
			System.out.println("RemoverFim: " +lista.removerFim());
			System.out.println("Remover pos 2: " +lista.remover(2));
			mostraLista(lista);
		}
		
		public static void mostraLista(ListaEncadeada lista) {
			
			
			System.out.println("Lista com " + lista.getTamanho() + " nós.");
			Iterador_lista_dupla it = lista.getInicio();
			Object obj = it.getObjeto();
			int i = 1;
			while(obj != null) {
				System.out.println("iterador na pos: " + i++ + " -> " + obj);
				obj = it.proximo();
			}
			System.out.println("Fim da lista.");
		}

	}
