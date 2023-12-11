import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1人目の身長(m)を入力してください。");
        double height = Double.parseDouble(sc.nextLine());

        System.out.println("1人目の体重(kg)を入力してください。");
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
            System.out.println("------------------------------");
            System.out.println("2人目の身長(m)を入力してください。");
        double height2 = Double.parseDouble(sc.nextLine());

        System.out.println("2人目の体重(kg)を入力してください。");
        double weight2 = Double.parseDouble(sc.nextLine());

        double bmi2 = weight2 / (height2 * height2);
        System.out.println("BMI値：" + String.format("%.2f", bmi2));
        double Appropriate2 = height2 * height2 * 22;
        System.out.println("適正体重：" + String.format("%.2f", Appropriate));

        if (bmi2 < 18.5) {
            System.out.println("肥満度：低体重（やせ）");
            System.out.println("もっと食べましょう。");
        } else if (bmi2 < 25) {
            System.out.println("肥満度：普通体重");
            System.out.println("その体系をキープしましょう。");
        } else if (bmi2 < 30) {
            System.out.println("肥満度：肥満（１度）");
            System.out.println("もっとやせましょう");
        } else if (bmi2 < 35) {
            System.out.println("肥満度：肥満（２度）");
            System.out.println("もっとやせましょう");
        } else if (bmi2 < 40) {
            System.out.println("肥満度：肥満（３度）");
            System.out.println("もっとやせましょう");
        }  else {
            System.out.println("肥満度：肥満（４度）");
            System.out.println("やばい");

        }
    }

}
