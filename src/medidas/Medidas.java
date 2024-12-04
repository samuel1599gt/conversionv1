/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medidas;
import java.util.Scanner;
/**
 *
 * @author WIN 10
 */
public class Medidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Seleccione el tipo de medida que desea convertir:");
            System.out.println("1. Distancia");
            System.out.println("2. Volumen");
            System.out.println("3. Peso");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                break;
            }
            
            switch (opcion) {
                case 1:
                    convertirDistancia(scanner);
                    break;
                case 2:
                    convertirVolumen(scanner);
                    break;
                case 3:
                    convertirPeso(scanner);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        
        scanner.close();
    }

    private static void convertirDistancia(Scanner scanner) {
        System.out.println("Seleccione la unidad de origen:");
        System.out.println("1. Metros");
        System.out.println("2. Kilómetros");
        System.out.println("3. Millas");
        System.out.println("4. Pies");
        int unidadOrigen = scanner.nextInt();
        
        System.out.println("Seleccione la unidad de destino:");
        System.out.println("1. Metros");
        System.out.println("2. Kilómetros");
        System.out.println("3. Millas");
        System.out.println("4. Pies");
        int unidadDestino = scanner.nextInt();
        
        System.out.print("Ingrese el valor: ");
        double valor = scanner.nextDouble();
        
        double valorConvertido = convertirDistancia(valor, unidadOrigen, unidadDestino);
        System.out.println("Valor convertido: " + valorConvertido);
    }

    private static double convertirDistancia(double valor, int unidadOrigen, int unidadDestino) {
        // Convertir a metros
        switch (unidadOrigen) {
            case 1: // Metros
                break;
            case 2: // Kilómetros
                valor *= 1000;
                break;
            case 3: // Millas
                valor *= 1609.34;
                break;
            case 4: // Pies
                valor *= 0.3048;
                break;
        }
        
        // Convertir de metros a unidad destino
        switch (unidadDestino) {
            case 1: // Metros
                break;
            case 2: // Kilómetros
                valor /= 1000;
                break;
            case 3: // Millas
                valor /= 1609.34;
                break;
            case 4: // Pies
                valor /= 0.3048;
                break;
        }

        return valor;
    }

    private static void convertirVolumen(Scanner scanner) {
        System.out.println("Seleccione la unidad de origen:");
        System.out.println("1. Litros");
        System.out.println("2. Mililitros");
        System.out.println("3. Galones");
        int unidadOrigen = scanner.nextInt();
        
        System.out.println("Seleccione la unidad de destino:");
        System.out.println("1. Litros");
        System.out.println("2. Mililitros");
        System.out.println("3. Galones");
        int unidadDestino = scanner.nextInt();
        
        System.out.print("Ingrese el valor: ");
        double valor = scanner.nextDouble();
        
        double valorConvertido = convertirVolumen(valor, unidadOrigen, unidadDestino);
        System.out.println("Valor convertido: " + valorConvertido);
    }

    private static double convertirVolumen(double valor, int unidadOrigen, int unidadDestino) {
        // Convertir a litros
        switch (unidadOrigen) {
            case 1: // Litros
                break;
            case 2: // Mililitros
                valor /= 1000;
                break;
            case 3: // Galones
                valor *= 3.78541;
                break;
        }
        
        // Convertir de litros a unidad destino
        switch (unidadDestino) {
            case 1: // Litros
                break;
            case 2: // Mililitros
                valor *= 1000;
                break;
            case 3: // Galones
                valor /= 3.78541;
                break;
        }

        return valor;
    }

    private static void convertirPeso(Scanner scanner) {
        System.out.println("Seleccione la unidad de origen:");
        System.out.println("1. Kilogramos");
        System.out.println("2. Gramos");
        System.out.println("3. Libras");
        int unidadOrigen = scanner.nextInt();
        
        System.out.println("Seleccione la unidad de destino:");
        System.out.println("1. Kilogramos");
        System.out.println("2. Gramos");
        System.out.println("3. Libras");
        int unidadDestino = scanner.nextInt();
        
        System.out.print("Ingrese el valor: ");
        double valor = scanner.nextDouble();
        
        double valorConvertido = convertirPeso(valor, unidadOrigen, unidadDestino);
        System.out.println("Valor convertido: " + valorConvertido);
    }

    private static double convertirPeso(double valor, int unidadOrigen, int unidadDestino) {
        // Convertir a kilogramos
        switch (unidadOrigen) {
            case 1: // Kilogramos
                break;
            case 2: // Gramos
                valor /= 1000;
                break;
            case 3: // Libras
                valor *= 0.453592;
                break;
        }
        
        // Convertir de kilogramos a unidad destino
        switch (unidadDestino) {
            case 1: // Kilogramos
                break;
            case 2: // Gramos
                valor *= 1000;
                break;
            case 3: // Libras
                valor /= 0.453592;
                break;
        }

        return valor;
    }


    
}
