import java.util.Scanner;

/*
İşleri biraz geliştirelim istedim ve derslerin
kredi değerini alarak öyle hesaplama yaptım.
*/
public class notHesaplama2 {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik, pay = 0, payda = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = input.nextInt();
        if (mat > 0 && mat < 100) {
            pay += (mat * 6);
            payda += 6;
        }
        System.out.print("Türkçe notunu giriniz : ");
        turkce = input.nextInt();
        if (turkce > 0 && turkce < 100) {
            pay += (turkce * 6);
            payda += 6;
        }
        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();
        if (fizik > 0 && fizik < 100) {
            pay += (fizik * 4);
            payda += 4;
        }
        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();
        if (kimya > 0 && kimya < 100) {
            pay += (kimya * 4);
            payda += 4;
        }
        System.out.print("Müzik notunu giriniz : ");
        muzik = input.nextInt();
        if (muzik > 0 && muzik < 100) {
            pay += (muzik * 2);
            payda += 2;
        }

        pay /= payda;


        System.out.println(pay > 55 ? "Tebrikler sınıfı geçtiniz." : "Üzgünüz sınıfı geçemediniz.");
        System.out.print("Ortalamanız : " + pay);

    }
}