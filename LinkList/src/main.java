
import java.util.LinkedList;
import java.util.ListIterator;


public class main {
    public static void listeyi_bastir(LinkedList<String> gidilecekYerler){
       /* for( String s: gidilecekYerler){
            System.out.println(s); burada for each döngüsü ile bastırdık
        }*/
       
        ListIterator<String> iterator = gidilecekYerler.listIterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public static void sirali_ekle(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()){
            
            int karsilastir = iterator.next().compareTo(yeni);//int değer döndürür.
            
            if(karsilastir == 0){
                System.out.println("Girilen değer zaten listede vardır...");
                return;
            }
            else if(karsilastir<0){
                //eğer 
            }
            else if(karsilastir>0){
                iterator.previous();//eğer burada gelen parametre önceyse pozitif bir değer döner ve bir önceki düğüme gitmeliyiz.
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
    public static void main(String[] args) {
        
        LinkedList<String>  gidilecek_yerler = new LinkedList<String>();
        
        sirali_ekle(gidilecek_yerler, "okul");
        sirali_ekle(gidilecek_yerler, "market");
        sirali_ekle(gidilecek_yerler, "züccaciye");
        
        /*gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");*/
        
        listeyi_bastir(gidilecek_yerler);
    }
}
