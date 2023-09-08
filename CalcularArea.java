package Programas;

import java.util.Scanner;

public class CalcularArea {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sistema que Cálcula a área de um Retângulo");
		
		double area, altura, largura;
		
		System.out.println("Digite a Altura do Retângulo: ");
		altura = sc.nextDouble();
		System.out.println("Digite a largura do Retângulo: ");
		largura = sc.nextDouble();
		
		area = altura * largura;
		
		System.out.println("A Área deste Retângulo é de: " + area + " m²");
		
		
		
	}
}
