import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
       
        
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int IntentosMaximos = 10;
        int Intentos = 0;
        boolean palabraAdivinada = false;

        //arreglos 
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        //estructuras de control iterativa(bucle)
        while(!palabraAdivinada && Intentos < IntentosMaximos){
            System.out.println("palabra a adivinar:" + String.valueOf(letrasAdivinadas));
            System.out.println("introduce una letra, por favor");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                Intentos++;
                System.out.println("incorrecto, te quedan"+ (IntentosMaximos-Intentos)+ "intentos");

            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("felicidades, has adivinado la palabra secreta:"+palabraSecreta);

            }     
        }
        if(!palabraAdivinada){
            System.out.println("que pena te has quedado sin intentos!GAME OVER");
        }
        scanner.close();
    }
}
