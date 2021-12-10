package com.letscode.aula04;

public class Main {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        double quebrado = Double.parseDouble(sc.nextLine());
*/
/*
        Pessoas < 16 -> NÃ£o pode votar
        Pessoas >= 16 -> opcional && < 18
        Pessoas > 70 -> opcional
        Pessoas > 18 -> obirgatÃ³rio
        Pessoas < 70 -> obirgatÃ³rio
*/
//        IF , IF ELSE, ELSE IF
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        if (idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Seu voto Ã© opcional.");
        }
        else if (idade < 16){
            System.out.println("VocÃª nÃ£o pode votar.");
        }else {
            System.out.println("Seu voto Ã© obrigatÃ³rio.");
        }
*/
//        SWITCH CASE
/*
        int month = 5;
        String monthString;

        switch (month){
            case 1:
                monthString = "Janeiro";
                break;
            case 2:
                monthString = "Fevereiro";
                break;
            case 3:
                monthString = "MarÃ§o";
                break;
            case 4:
                monthString ="Abril";
                break;
            case 5:
                monthString = "Maio";
                break;
            default:
                monthString = "Outro mÃªs";
        }
        System.out.println(monthString);
*/
/*
    int mes;
    int dias = 31;

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o mÃªs [1-12]: ");
    mes = sc.nextInt();

    if ( mes > 12 || mes < 1){
        System.out.println("MÃªs invÃ¡lido");
    }
    switch (mes){
        case 2 :
            dias -= 3;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            dias -= 1;
            break;
    }
        System.out.printf("O mÃªs %d possui %d dias", mes , dias);
*/
// OBS -  Crtl + alt + l -> indenta o cÃ³digo
//        Crtl + alt + o -> retira os impots nÃ£o usados

//        For , Wile , Do Wile
/*
        int count = 0;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++ ;
        }

        count = 0;
        do {
            System.out.println("Dentro o do while" + count);
            count++;
        }while ( count < 5);
*/
/*
       Scanner sc = new Scanner(System.in);
        float notas;
        float total = 0f;
        float media ;
        int count = 0;

        System.out.println("Informe a quantidade de notas: ");
        int quantidadeDeNotas = Integer.parseInt(sc.nextLine());

        while (count < quantidadeDeNotas){
            count +=1;
            System.out.printf("informe a %d nota:", count);
            notas = sc.nextFloat();
            total += notas;
        }
        media = total / quantidadeDeNotas;
        System.out.println("A mÃ©dia Ã©: " +media);
*/
    	/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nÃºmero: ");
        for (int i = sc.nextInt() , count = 0 ; count < i ; count +=2) {
            System.out.println(count);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nÃºmero: ");
        int i = sc.nextInt();

        for ( count = 0 ; count < i ; count +=2) {
            System.out.println(count);
        }
*/
    }
}
