package com.aincrad.controlefluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite o primeiro valor:");
			int numero1 = entrada.nextInt();
			System.out.println("Digite o segundo valor");
			int numero2 = entrada.nextInt();
			
			try {				
				imprimirContador(numero1, numero2);
			} catch (Exception e)  {
				System.err.println("O segundo numero deve ser maior ou igual ao primeiro");
			}
			
		} catch (InputMismatchException e) {
			System.err.println("São permitidos apenas numeros interioros");
		}
	}
	
	static void imprimirContador(int valorInicial, int valorFinal) throws ParametrosInvalidosException  {
		int totalLoop = valorFinal - valorInicial;
		if (totalLoop < 0) {
			throw new ParametrosInvalidosException();
		} 
		
		for (int numeroAtual = 0; numeroAtual <= totalLoop; numeroAtual++ ) {
			System.out.println("Imprimindo o número " + (numeroAtual+1));
		}
		
	}	
}
