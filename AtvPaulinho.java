/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvpaulinho;
import javax.swing.JOptionPane;
/**
 *
 * @author Marlene Juliana
 */
public class AtvPaulinho {
    // Método para ordenar os números usando Bubble Sort
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
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
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        // Solicita ao usuário a quantidade de números
        String input = JOptionPane.showInputDialog("Digite a quantidade de numeros:");
        int n = Integer.parseInt(input);

        // Cria um array para armazenar os numeros
        int[] numbers = new int[n];

        // Preenche o array com os números fornecidos pelo usuário
        StringBuilder numbersInput = new StringBuilder();
        numbersInput.append("Digite os números separados por espaço:");
        for (int i = 0; i < n; i++) {
            String num = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":");
            numbers[i] = Integer.parseInt(num);
            numbersInput.append(" ").append(num);
        }

        // Ordena 
        bubbleSort(numbers);

        // Imprime 
        StringBuilder sortedNumbers = new StringBuilder();
        sortedNumbers.append("Números ordenados:\n");
        for (int i = 0; i < n; i++) {
            sortedNumbers.append(numbers[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, sortedNumbers);

        // Solicita ao usuário o número a ser pesquisado
        input = JOptionPane.showInputDialog("Digite o número a ser pesquisado:");
        int searchNumber = Integer.parseInt(input);

        // Realiza uma pesquisa linear no array ordenado
        int position = linearSearch(numbers, searchNumber);

        // Verifica se o número foi encontrado e imprime a posição
        if (position != -1) {
            JOptionPane.showMessageDialog(null, "O número " + searchNumber + " foi encontrado na posição " + (position + 1));
        } else {
            JOptionPane.showMessageDialog(null, "O número " + searchNumber + " não foi encontrado na lista.");
        }
    }
}
