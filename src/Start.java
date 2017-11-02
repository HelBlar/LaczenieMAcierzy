/**
 *
 * @author HelBlar
 */
public class Start {

    public static void main(String[] args) {
     int iOkres=2,iWartosc=5,iWielkosc=iOkres*iWartosc;
     int iTablica[] = new int [iWielkosc];
     int iRozmiar = iTablica.length;
           
              
          
          for(int i=0;i<iOkres;i++){
               for(int j=0;j<iWartosc;j++){
                   
 
                  iTablica[j+(i*iWartosc)]=j+1;
                }
              
          }
     for(int i=0;i<iRozmiar;i++){
         System.out.print(iTablica[i]);
     }
    }
    
}
