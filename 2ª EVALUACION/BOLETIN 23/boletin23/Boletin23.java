package boletin23;

/**
 * @author Roi Martínez
 */

public class Boletin23 {
    public static void main(String[] args) {
        System.out.println("1. "+"Esto é Java!".length());
        
        System.out.print("2. ");
        String str2 = "Java";
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i)+"  ");
        }
        System.out.println();
        
        System.out.print("3. ");
        String str3 = "Java desde 0";
        StringBuilder strb = new StringBuilder(str3);
        str3 = strb.reverse().toString();
        System.out.println(str3);
        
        System.out.print("4. ");
        String str4 = "James Gosling Created Xava";
        System.out.println(str4.replace(" ", ""));
        
        System.out.print("5. ");
        String str5 = "java java java";
        int contV = 0;
        int contC = 0;
        for (int i = 0; i < str5.length(); i++) {
            if (str5.charAt(i)=='a' || str5.charAt(i)=='e' || str5.charAt(i)=='i'
            || str5.charAt(i)=='o' || str5.charAt(i)=='u') {
                contV++;
            } else if (Character.isLetter(str5.charAt(i))) {
                contC++;
            }
        }
        System.out.println("'"+str5+"' contiene "+contV+" vocales, y "+contC+" consonantes");
        
        System.out.print("6. ");
        String str6 = "www.javadesde0.com";
        String substr1 = str6.substring(0,8), substr2 = str6.substring(8);
        System.out.print(substr1+"  "+substr2);
        System.out.println("  //  "+substr1.concat(substr2));
        
        System.out.print("7. ");
        String str7 = "javeros";
        str7 = str7.toUpperCase();
        System.out.print(str7+"  -  ");
        str7 = str7.toLowerCase();
        System.out.println(str7);
        
        System.out.print("8. ");
        System.out.println("Java".equals("JavaScript"));
        
        System.out.print("9. ");
        String str9 = "Jeve jeve jeve";
        str9 = str9.replace("e", "a");
        System.out.println(str9);
        
        System.out.println("10. ");
        String str10 = "ABCD";
        int ascii;
        for (int i = 0; i < str10.length(); i++) {
            ascii = str10.charAt(i);
            System.out.println(str10.charAt(i)+" = "+ascii);
        }
        
        System.out.print("11. ");
        calculador("Ola, son alumno de DAM1, e son programador desde o 2021");
        
        
    }
    
    public static void calculador(String str) {
        int nLetras=0, nDigit=0, nEsp=0;
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                nLetras++;
            } else if (Character.isDigit(str.charAt(i))) {
                nDigit++;
            } else if (Character.isSpaceChar(str.charAt(i))) {
                nEsp++;
            }
        }
        
        System.out.println(str+"\nContiene: "+nLetras+" letras, "+nDigit+" dígitos, "+nEsp+" espacios");
    }
    
}
