package exerc_16_1;



public class Lista_Simples_16_1 extends No_16_1 {
	private No cabeca;
	private No fim;
	private int tamanho=0;
	private Object obj;
	
		public Lista_Simples_16_1() {
	
		
	}

		
		
		public boolean verifica_vazia() {
			return cabeca==null;
		}
				
		public void inserirInicio(Object obj, int i) {
			No novo = new No(obj);
			if(verifica_vazia()){
				cabeca=novo;
				fim=novo;
				
			} else{
				novo.setProx(cabeca);
				cabeca=novo;
			}
			
			tamanho++;
			
		}
		public No  remove_inicio(Object obj) {
			
			if (verifica_vazia()) {
				return null;// funcao para testar lissta vazia
			}
			No cursor=cabeca;//
			cabeca=cursor.getProx();//cabeca que agora eo segungo agora aponta para o proximo elemento
			cursor.setProx(null); //antiga cabeca nao aponta para nad
			tamanho--;
			return cursor;
}
		public void insere_fim(Object obj) {
			No novo = new No(obj);
			if (verifica_vazia()){
				cabeca=novo;
				fim=novo;
			}else { //caso ja tenha algum no na lista
				 fim.setProx(novo);//fim aponta para novo que passa a ser o fim
				 fim=novo;
			
			}
			tamanho++;
			
		}
		



}
