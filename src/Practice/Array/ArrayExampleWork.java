package Practice.Array;
// index always start from 0
//Length always start from 1

public class ArrayExampleWork {
    public static void main(String[] args) {
        String [] names={"hero", "Rame","Shayam"};
       // System.out.println(names[1]); //o/p= Rame
       // System.out.println(names.length);
        System.out.println("total names:"+ names.length);

        //change names hero to gopal
        names[0]="gopal";

      //  for(int i=0; i< names.length; i++){
        //    System.out.println(names[i]);

            //foreach loop
            for(String name: names){
                System.out.println(name);
            }

        }


}
