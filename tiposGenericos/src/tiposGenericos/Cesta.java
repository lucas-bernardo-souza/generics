package tiposGenericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Cesta<E> {
	
	private List<E> lista = new ArrayList<>();
	
	public void adiciona (E elemento) {
		lista.add(elemento);
	}
	
	public E retira() {
		Random r = new Random(System.currentTimeMillis());
		return lista.remove(r.nextInt(lista.size()));
	}
	
	public boolean temItens() {
		return !lista.isEmpty();
	}
	
	// Só aceita coleções de um único tipo
	public void adicionaTodos(Collection<E> elementos) {
		for(E e : elementos) {
			adiciona(e);
		}
	}
	
	// Aceita coleções de subclasses
	public void adicionaTodosDois(Collection<? extends E> elementos) {
		for(E e : elementos) {
			adiciona(e);
		}
	}

}
