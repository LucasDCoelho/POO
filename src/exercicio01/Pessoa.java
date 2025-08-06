package exercicio01;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private int peso;
    private double altura;



    public void calcularIMC(int peso, double altura){
        double calc = peso / (altura * altura);
        System.out.println("Seu IMC é " + calc);
    }

    public void calcularAguaPorDia(int peso){
        int calc = (peso * 35) / 1000;
        System.out.println("A quantidade de agua por dia é " + calc + "L ");

    }

    public void calcularIdade(int anoNascimento){
        int calc = 2025 - anoNascimento;
        System.out.println("A sua idade é " + calc);
    }


    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.calcularIMC(89, 1.73);
        pessoa.calcularAguaPorDia(89);
        pessoa.calcularIdade(1999);
    }
};