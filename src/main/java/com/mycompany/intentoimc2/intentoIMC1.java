/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intentoimc2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class intentoIMC1 {
   

         ArrayList<Integer> edad = new ArrayList<>();
    ArrayList<String> nombres = new ArrayList<>();
    ArrayList<Double> altura = new ArrayList<>();
    ArrayList<Double> peso = new ArrayList<>();
    ArrayList<Double> cImc = new ArrayList<>();

    public intentoIMC1() {

    }

    public void Procesos() {
        String menu;
        menu = "OPCIONES\n";
        menu += "1. Registrar personas\n";
        menu += "2. Imprimir nombres\n";
        menu += "3. Buscar por nombre\n";
        menu += "4. Salir\n\n";

        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            validarMenu(opc);
        } while (opc != 4);
    }

    public void validarMenu(int cod) {
        switch (cod) {
            case 1:
                ingresarDatos();
                break;
            case 2:
                imprimirDatos();
                break;
            case 3:
                buscarPorNombre();
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    public boolean validarArreglo() {
        if (nombres.size() > 0) {
            return true;
        } else {
            System.out.println("Debe primero llenar datos");
            return false;
        }
    }

    public void ingresarDatos() {
        System.out.println("Llenar datos");
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas"));

        for (int i = 0; i < tam; i++) {
            String persona = JOptionPane.showInputDialog("Ingrese el nombre " + (i + 1));
            nombres.add(persona);

            int edadPersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad " + (i + 1)));
            edad.add(edadPersona);

            double alturaPersona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura " + (i + 1)));
            altura.add(alturaPersona);

            double pesoPersona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso " + (i + 1)));
            peso.add(pesoPersona);

        }
        
        encontrarImc();
    }

    public void imprimirDatos() {
        System.out.println("Imprimir datos");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i) + " tiene una edad de " + edad.get(i)
                    + " y un IMC de " + cImc.get(i));
        }
    }

    public void encontrarImc() {
        for (int i = 0; i < peso.size(); i++) {
            double imc = peso.get(i) / (altura.get(i) * altura.get(i));
            cImc.add(imc);

            if (imc < 18) {
                System.out.println(nombres.get(i) + " tiene anorexia");
            } else if (imc >= 18 && imc < 20) {
                System.out.println(nombres.get(i) + " tiene delgadez");
            } else if (imc >= 20 && imc < 27) {
                System.out.println(nombres.get(i) + " esta en el peso normal ");
            } else if (imc >= 27 && imc < 30) {
                System.out.println(nombres.get(i) + " tiene obesidad (Grado 1) ");
            } else if (imc >= 30 && imc < 35) {
               
    
            System.out.println(nombres.get(i) + " tiene obesidad (Grado 1) ");
              } else if (imc >= 35 && imc < 40) {
             } else if (imc >= 40) {
                System.out.println(nombres.get(i) + " tiene obesidad (Grado 1) ");
             }
             }
             }

    public void buscarPorNombre() {
    String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
    int cont = 0;

    for (int i = 0; i < nombres.size(); i++) {
        if (nombres.get(i).equalsIgnoreCase(nombreBuscar)) {
            System.out.println("Lo encontré en la posición: " + i);
            cont++;
        }
    }

    if (cont > 0) {
        System.out.println("Encontré a " + nombreBuscar + " " + cont + " veces");
    } else {
        System.out.println("La persona " + nombreBuscar + " no fue registrada");
    }
}
}
   

