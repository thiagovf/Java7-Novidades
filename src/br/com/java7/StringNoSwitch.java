package br.com.java7;

public class StringNoSwitch {

	public static void main(String[] args) {
		for (String param : args) {
			switch (param) {
			case "-teste": 
				System.out.println("modo teste");
				break;
			case "-producao":
				System.out.println("modo produção");
				break;
			default:
				System.out.println("erro de parâmetro");
				System.exit(-1);
			}
		}
	}
}
