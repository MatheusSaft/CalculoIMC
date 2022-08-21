import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        
        String nome;
        int genero;
        double peso;
        double altura;

        Scanner lerTeclado = new Scanner(System.in);


        System.out.println("Informe seu nome: ");
        nome = lerTeclado.nextLine();
        System.out.println("Informe seu gênero: ");
        genero = lerTeclado.next().charAt(0);
        System.out.println("Informe o seu peso: ");
        peso = lerTeclado.nextDouble();
        System.out.println("Informe a sua altura: ");
        altura = lerTeclado.nextDouble();

        double imc;
        imc = peso / (altura*altura);

        double imcFem;
        imcFem = peso / (altura*altura);

        
        if(genero == 'm'){
            if(imc < 20){
                System.out.println("Abaixo do peso!");
            }else if(imc >= 20 && imc <= 24.9){
                System.out.println("Peso saudável");
            }else if(imc >= 25 && imc <= 29.9){
                System.out.println("Obesidade leve");
            }else if(imc >= 30 && imc <= 39.9){
                System.out.println("Obesidade moderada");
            }else{
                System.out.println("Obesidade avançada");
            }
        }
        if(genero == 'n' && genero == 'f'){
            if(imcFem < 19){
                System.out.println("Abaixo do peso!");
            }else if(imcFem >= 19 && imc <= 23.9){
                System.out.println("Peso saudável");
            }else if(imcFem >= 24 && imc <= 28.9){
                System.out.println("Obesidade leve");
            }else if(imcFem >= 29 && imc <= 38.9){
                System.out.println("Obesidade moderada");
            }else{
                System.out.println("Obesidade avançada");
        }
        }
        


    }
}
