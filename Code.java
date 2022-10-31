import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil;
        
        System.out.print("Artik yil sorgulamak istediginiz yili giriniz : ");
        yil=input.nextInt();

        if(yil>=0&&(yil%4==0)){
            if(yil%100==0&&yil%400!=0){
                System.out.println(yil+" Bir Artik Yil Degildir. ");}
            else{
                System.out.println(yil+" Bir Artik Yildir.");}}
        else{
            System.out.println(yil+" Bir Artik Yil Degildir. ");}
    }
    
}
