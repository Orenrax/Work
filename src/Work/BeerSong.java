package Work;

public class BeerSong{
    public static void song () {
        int beerNum = 11;
        String word="бутылок (бутылки)";
        while (beerNum >0){
            if (beerNum==1){
                word= "бутылка";

            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.print("Возьми одну.");
            System.out.println("пусти по кругу.");
            beerNum=beerNum-1;
            if (beerNum>0){
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");

            }

        }
    }
}