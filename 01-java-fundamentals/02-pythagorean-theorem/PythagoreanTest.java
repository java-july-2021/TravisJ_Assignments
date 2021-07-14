// TRAVIS JEPSON 2021 JAVA
//
//  This calls the PythagoreanTheorem function
//
public class PythagoreanTest
{
    
    public static void main(String[] args) 
    {
        PythagoreanTheorem linkToClass = new PythagoreanTheorem();
        
        System.out.println();
        System.out.println();
        System.out.println("Your hypotenuse is:  " + linkToClass.calculateHypotenuse(1337,9001));
        System.out.println();
        System.out.println();
    }
}