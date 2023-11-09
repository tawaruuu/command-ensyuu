import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("身長(m)を入力してください。");
        double height = Double.parseDouble(sc.nextLine());

        System.out.println("体重(kg)を入力してください。");
        double weight = Double.parseDouble(sc.nextLine());

        double bmi = weight / (height * height);
        System.out.println("BMI値：" + String.format("%.2f", bmi));
        double Appropriate = height * height * 22;
        System.out.println("適正体重：" + String.format("%.2f", Appropriate));
        if (bmi < 18.5) {
            System.out.println("肥満度：低体重（やせ）");
            System.out.println("もっと食べましょう。");
        } else if (bmi < 25) {
            System.out.println("肥満度：普通体重");
            System.out.println("その体系をキープしましょう。");
        } else if (bmi < 30) {
            System.out.println("肥満度：肥満（１度）");
            System.out.println("もっとやせましょう");
        } else if (bmi < 35) {
            System.out.println("肥満度：肥満（２度）");
            System.out.println("もっとやせましょう");
        } else if (bmi < 40) {
            System.out.println("肥満度：肥満（３度）");
            System.out.println("もっとやせましょう");
        }  else {
            System.out.println("肥満度：肥満（４度）");
            System.out.println("やばい");
        }
    }

}
