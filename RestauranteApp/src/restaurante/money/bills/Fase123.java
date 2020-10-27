package restaurante.money.bills;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**Objectius : Practicar funcionalitats bàsiques com condicionals, variables i bucles.
 * 
 * L’exercici consisteix a mostrar per consola una carta d’un restaurant on afegirem diferents plats i després
*escollirem que volem per menjar. Un cop fet això s’haurà de calcular el preu del menjar el programa ens dirà
*amb quins bitllets hem de pagar.

 * @author monts
 **
 */

// Recursos :  Ejemplo restaurant:
//https://sites.google.com/site/programacionhm/conceptos/dsls/domainspecificlanguage/dsl---ejemplo-restaurante

//https://www.discoduroderoer.es/como-hacer-un-menu-de-opciones-en-consola-en-java/
//Hacer un menu en java paso pas https://www.youtube.com/watch?v=STCR-_bLDH4
//http://tutoriales.duhnnae.com/tutorial_hacer_menu_switch_case_en_java_programacion_basica.php
//https://github.com/vonzhou/Thinking-In-Java/blob/master/src/thinkinginjava/concurrency/Restaurant.java



public class Fase123 {

    public static void main(String[] args) {
             

            // Variables
    	/**
    	 * FASE 1 
    	
    	* Creeu una variable int per cada un dels bitllets que existeixen des de 5€ a 500€, haureu de crear un altre
    	*variable per guardar el preu total del menjar. (1 punt)
    	* Creeu dos arrays, un on guardarem el menú (5 plats) i un altre on guardarem el preu de cada
    	* plat. (1 punt)
    	 */

        int FiveEur = 5;
        int TenEur = 10;
        int TwentyEur = 20;
        int FivetyEur = 50;
        int HundredEur = 100;
        int TwoHunEur = 200;
        int FiveHunEur = 500;

        int TotalPriceMenu = 0;

        String[] Menu = new String[5];
        Integer[] Prices = new Integer[5];

        //  FASE 1

        //  FASE 2 
        /**
         * 
         * Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. Afegirem el nom del plat i després
		 *el preu. 
 		 *Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, guardarem la
		 *informació en una List fent servir un bucle while. 
		 *Haurem de preguntar si es vol seguir demanant menjar. Podeu fer servir el sistema (1:Si / 0:No), per tant
		 *haureu de crear un altre variable int per guardar la informació. 
         * 
         */
        // Fase 3
        /**
         * FASE 3 (5 punts)
 		*Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb l’array que hem fet al
		*principi. En el cas que la informació que hem introduït a la List coincideixi amb la del array, haurem de
        * sumar el preu del producte demanat; en el cas contrari haurem de mostrar un missatge que digui que el
		*producte que hem demanat no existeix.
         * 
         * 
         */

        // Variables  FASE 2 & 3

        System.out.println();
        System.out.println("Hola!");
        System.out.println("El seu Menu.");

        Scanner CreateMenuQuestion = new Scanner(System.in);
        Scanner CreatePriceQuestion = new Scanner(System.in);
        Scanner MenuQuestion = new Scanner(System.in);

        int MaxCounter = 0;
        int count = 0;

        String UserContinue;
        String UserResponse;

        ArrayList Order = new ArrayList<String>();
        List WrongOrder = new ArrayList<String>();

        // Menu Preguntes i respostes Strings[];
    	// Recursos: https://stackoverflow.com/questions/26695433/restaurant-menu-how-to-efficiently-implement-a-nested-loop-to-collect-user-inpu
    	//https://www.geeksforgeeks.org/find-the-point-where-maximum-intervals-overlap/
        //// Recursos: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo?rq=1
        
        label:
        while (MaxCounter < 5) {
            for (int e = 0; e < Menu.length; e++) {
                if (MaxCounter == 0) {
                    System.out.println("Afegir el nom del plat i després el preu(presionar enter): ");
                    Menu[e] = CreateMenuQuestion.nextLine();
                    Prices[e] =Integer.parseInt(CreatePriceQuestion.nextLine());
                    MaxCounter++;
                } else if (MaxCounter >= 1 && MaxCounter < 4) {
                    System.out.println("Seguent plat i preu(presionar enter): ");
                    Menu[e] = CreateMenuQuestion.nextLine();
                    Prices[e] = Integer.parseInt(CreatePriceQuestion.nextLine());
                    MaxCounter++;
                } else {
                    System.out.println("Últim plat i preu(presionar enter): ");
                    Menu[e] = CreateMenuQuestion.nextLine();
                    Prices[e] = Integer.parseInt(CreatePriceQuestion.nextLine());
                    break label;
                }
            }
        }
            // Fi preguntes menú

            // Mostra el programa Array[] Menu via consola

        System.out.println();
        System.out.println("Menu  preus escollits ");
        System.out.println();;

        for(int e = 0; e < Menu.length; e++){
            for(int i = 0; i < Prices.length; i++){
                if(e == i){
                    System.out.println( Menu[e] + "........." + Prices[e] + "€, ");
                }
            }
        }

            // Round of Orders - START
                //The first question, determines your intention, if you want eat or heat a seat.
                // In while, determines the questions of Yes/No, and what do you want more eat.
                // Finally sums all prices accord with your order/selection in a external scope variable.
        /**
         * Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, guardarem la
       
		 *informació en una List fent servir un bucle while. (1 punt)
		 *Haurem de preguntar si es vol seguir demanant menjar. Podeu fer servir el sistema (1:Si / 0:No), per tant
		 *haureu de crear un altre variable int per guardar la informació. (1 punt)
		  */
		 
        System.out.println("qué es vol per menjar?");
        UserResponse = MenuQuestion.nextLine();

        if (UserResponse.equals("")) {
            System.out.println("error, disculpi, no ha escollit cap plat");
            return;
        } else {
            Order.add(UserResponse);
            count++;
            
           
        }

        label:
        while (true){
            System.out.println("vol seguir demanant menjar? ( Si or No)");
            UserContinue = MenuQuestion.nextLine();
            if(UserContinue.matches(".*\\d.*")){
                System.out.println("Digui Sí o No!");
                continue;
            }
            // Recursos : https://www.discoduroderoer.es/como-hacer-un-menu-de-opciones-en-consola-en-java/
            
            switch (UserContinue) {
                case "Si": case "SI": case "sI": case "SSi": case "ssI": case "si": case "S":
                    if(count >= 1 && count < 4){
                        System.out.println("Qué afegim més?");
                        UserResponse = MenuQuestion.nextLine();
                        Order.add(UserResponse);
                        count++;
                        continue;
                    } else if (count == 4){
                        System.out.println("Seria ultim?");
                        UserResponse = MenuQuestion.nextLine();
                        Order.add(UserResponse);
                        break label;
                    } else {
                        System.out.println("Error Switch IF/ELSE IF/ELSE");
                        break label;
                    }
                case "No": case "no": case "nO": case "NO":
                    break label;
                case "":
                    System.out.println("Digui Si o No!");
                    break;
                default:
                    System.out.println("Error ");
                    break label;
            }
        }
        if (Order.equals("")) {
            System.out.println("No ha demanat res!");
        } else {
            System.out.println("D'acord");
            System.out.print("Ha demanat: ");
            for(Object c : Order){
                System.out.print(c + ", ");
            }
            for(int i = 0; i < Menu.length; i++){
                for(Object o : Order){
                    if(Menu[i].equals(o)){
                        TotalPriceMenu += Prices[i];
                    } else {
                        WrongOrder.add(o);
                    }
                }
            }
            // Fi peticions usuari i ordres

            // Li mostrem el que ha esdevingut la seva tria
            System.out.println(" Preu final: " + TotalPriceMenu + "€");
            System.out.println();
            System.out.println("Petició fallida: " + WrongOrder);
            System.out.println();
            if(TotalPriceMenu < 10) {
                System.out.println("Preferirà pagar amb: " + FiveEur + "€");
            } else if(TotalPriceMenu >= 10 && TotalPriceMenu <= 40){
                System.out.println("Preferirà pagar amb: " + FiveEur + ", " + TenEur  + ", "+  "i/o " + TwentyEur + "€");
            } else if(TotalPriceMenu >= 50 && TotalPriceMenu <= 100) {
                System.out.println("Preferirà pagar amb: " + TwentyEur + ", " + FivetyEur  + ", "+  "i/o " + HundredEur + "€");
            } else {
                System.out.println("Preferirà pagar amb: " + FivetyEur + ", "+ HundredEur + ", " + TwoHunEur  + ", "+  "i/o " + FiveHunEur + "€");
            }
        }
            //Fin

        // Recursos https://www.youtube.com/watch?v=7_YWRGVXV1w  Proyecto Restaurante JAVA
    }
}

