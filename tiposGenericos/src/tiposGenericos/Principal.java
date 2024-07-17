package tiposGenericos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		Cesta<Fruta> cestaFrutas = new Cesta<>();
		
		cestaFrutas.adiciona(new Fruta("Maçã"));
		cestaFrutas.adiciona(new Fruta("Banana"));
		cestaFrutas.adiciona(new Fruta("Mamão"));
		cestaFrutas.adiciona(new Fruta("Pera"));
		cestaFrutas.adiciona(new Fruta("Uva"));
		// Por meio dos tipos genéricos é possível adicionar uma subclasse de fruta
		// isso é aceito pois o método adiciona espera um E que é Fruta (E=Fruta)
		// e FrutaVermelha é uma fruta
		cestaFrutas.adiciona(new FrutaVermelha("Morango"));
		
		List<FrutaVermelha> frutasVermelhas = new ArrayList<>();
		frutasVermelhas.add(new FrutaVermelha("Cereja"));
		frutasVermelhas.add(new FrutaVermelha("Amora"));
		
		// O método adicionaTodos espera um List<Fruta> e não é possivel passar uma
		//List de frutas vermelhas pois list de frutasVermelhas não é o mesmo que
		//Lista de frutas pois esse tipo é invariante
		
		cestaFrutas.adicionaTodos(frutasVermelhas);
		// Para funcionar é necessário setar no metodo 'adicionaTodos' que ele recebe os tipos 
		// que extendem a classe fruta
		
		cestaFrutas.adicionaTodosDois(frutasVermelhas);
		
		while(cestaFrutas.temItens()) {
			System.out.println(cestaFrutas.retira());
		}
	}
}
