/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvpaulinho;
import java.util.Scanner;
/**
 *
 * @author Marlene Juliana
 */
public class AtvPaulinho {
    //Escreva um programa Java que permita ao usuário inserir uma lista de números inteiros
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números
        System.out.print("Digite a quantidade de numeros: ");
        int n = scanner.nextInt();

       
        int[] numbers = new int[n];

        
        System.out.println("Digite os numeros:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Ordena os números usando Bubble Sort
        bubbleSort(numbers);

        // Imprime os números ordenados
        System.out.println("Numeros ordenados:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    
     // Solicita ao usuário o número a ser pesquisado
        System.out.print("Digite o numero a ser pesquisado: ");
        int searchNumber = scanner.nextInt();

        // Realiza uma pesquisa linear no array ordenado
        int position = linearSearch(numbers, searchNumber);

        // Verifica se o número foi encontrado e imprime a posição
        if (position != -1) {
            System.out.println("O numero " + searchNumber + " foi encontrado na posicao " + (position + 1));
        } else {
            System.out.println("O numero " + searchNumber + " nao foi encontrado na lista.");
        }
        
        scanner.close();
    }
     //seguida, ordene esses números usando um método de ordenação (por exemplo, Bubble Sort)
  
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca os elementos arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método para realizar uma pesquisa linear
    static int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // Retorna a posição se o número for encontrado
            }
        }
        return -1; // Retorna -1 se o número não for encontrado
    }
 }

