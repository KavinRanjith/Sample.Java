public class Main
{
    public static void main(String[] args)
    {
        String name = "JavaConceptOfTheDay".substring(4);   //cut the prefix value
        String name1 = "Gokul".repeat(10); //count increment
        String name3 = "food".replace('o', 'a');  //replace the string
        String str = "   Java\tConcept\tOf\tThe\tDay    ".strip(); //just like trim()
        String str1 = "Java";
        String str2 = str1.intern();
        String str3 = new String("java");
        String str4 = new String("1");
        String str5 = new String("22");
        String str6 = new String("333");

        System.out.println(name);
        System.out.println(name1);
        System.out.println("1".concat("2").concat("3").repeat(3).charAt(8)); //concat and locate
        System.out.println(name3.substring(1,3));  //cut f and d from food
        System.out.println(str);
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str1);
        System.out.println(str4.concat(str5).concat(str6).repeat(3));

    }
}
