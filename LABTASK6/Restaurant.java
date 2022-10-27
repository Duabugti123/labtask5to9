import java.util.*;
class Restaurant{
        public static void main(String args[]){
       int a;
     Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
   System.out.println("enter 1 for Biryani*** 2 for Quorma*** 3 for Pizza*** 4 for Pasta*** 5 for Tikka");
   switch(a){
  case 1:
  System.out.println("Biryani = Rs=200");
  break;

  case 2:
  System.out.println("Quorma = Rs=300");
  break;

   case 3:
  System.out.println("Pizza = Rs=400");
  break;

    case 4:
  System.out.println("Pasta = Rs=500");
  break;


    case 5:
  System.out.println("Tikka = Rs=600");
  break;

    default:
    System.out.println("Please Enter Number From 1 to 5");

}
       

}
  }