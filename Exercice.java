public class Exercice
 {
 static private String msg = null;
 static private int n;

 Exercice(){
 n = 1;
 if (msg == null)
 msg = "Rouge";
 affiche();
 }

 private void affiche(){
 //System.out.println(n + msg);
 if (!msg.equals("Vert")){
 msg = "purple";
 new Exercice();
 }
 }

 public static void main(String[] args){
 Exercice x = new Exercice();
 n++;
  System.out.println("la valeur de n after calling constructor x step 0 :"+n);
// x.affiche(); comment line from machine 2
 Exercice y = new Exercice();
 n++;
 x.affiche();
 y.affiche();
 System.out.println("la valeur de n after calling constructor y step 1 :"+n);
 }

}
