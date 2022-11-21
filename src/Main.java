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
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        String[] strings = {"Java", "Python", "JavaScript", "HTML", "CSS"};
        String languages = String.join(" hurrah!  ", strings);

        System.out.println(name);
        System.out.println(name1);
        System.out.println("1".concat("2").concat("3").repeat(3).charAt(8)); //concat and locate
        System.out.println(name3.substring(1,3));  //cut f and d from food
        System.out.println(str);
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str1);
        System.out.println(str4.concat(str5).concat(str6).repeat(3));
        System.out.println("java"+1000+2000+3000);
        System.out.println(1000+2000+3000+ "Java");
        System.out.println(7.7+3.3+"Java"+3.3+7.7);
        System.out.println("ONE"+2+3+4+"FIVE");
        System.out.println("JAVAJ2EE".substring(2,5).substring(1).charAt(1));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2.intern());
        System.out.println(s1.intern() == s2.intern());
        System.out.println(s2 == s1.intern());
        System.out.print("0"+"0".indent(0).indent(8));
        System.out.print("0"+"0".indent(0).indent(6));
        System.out.print("0"+"0".indent(0).indent(4));
        System.out.print("0"+"0".indent(0).indent(2));
        System.out.print("0"+"0".indent(0).indent(2));
        System.out.print("0"+"0".indent(0).indent(4));
        System.out.print("0"+"0".indent(0).indent(6));
        System.out.print("0"+"0".indent(0).indent(8));
        System.out.println(languages);
        System.out.println("D".compareTo("B"));
        System.out.println("B".compareTo("A"));

        String string = "JAVA";

        StringBuffer sbuffer = new StringBuffer(string);

        StringBuilder sBuilder = new StringBuilder(string);

        System.out.println(string.equals(sbuffer));

        System.out.println(string.equals(sBuilder));

        System.out.println(sbuffer.equals(sBuilder));


        "ABC123abc".chars().forEach(System.out::println);
        String s3 = "null"+null+1;

        System.out.println(s3);

        String str7 = "Java Concept Of The Day";

        System.out.println(str7.indexOf('a') + str7.indexOf("Day"));

        String str8 = "Java Concept Of The Day";

        System.out.println(str8.replace("a", "A").lastIndexOf('a'));

//        StringBuilder sb = new StringBuilder(-1); //Initial capacity of StringBuilder can’t be negative.
//
//        sb.append("ABC");
//
//        System.out.println(sb);

        String str9 = "";   //or str9 = null Exception in thread “main” java.lang.NullPointerException: Cannot invoke “String.isBlank()” because “str” is null

        System.out.println(str9.isBlank());

        String str10 = " ";

        System.out.println(str10.isBlank());

        System.out.println(str10.isEmpty());

        StringBuffer sb = new StringBuffer("01234");

        sb.append(1.1).append('A').append(22).append(true).append("null");

        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("0123456789");

        System.out.println(sb1.delete(3, 6).deleteCharAt(4).deleteCharAt(5));

        String str11 = "Java J2EE Spring Hibenate SQL";

        String str12 = "Python Java Scala C C++";

        System.out.println(str11.contains("HTML") == str12.contains("HTML"));

        String str13 = "OnE tWo ThReE fOuR";

        String str14 = "oNeTwOtHrEeFoUr";

        System.out.println(str13.trim().equals(str14));

        StringBuffer sb3 = new StringBuffer("One Two Three Four Five");
        System.out.println(sb3.reverse().indexOf("Two"));

        StringBuffer sb4 = new StringBuffer("One Two Three Four Five");
        System.out.println(sb4.reverse().indexOf("owT"));

        "Java\nConcept\nOf\nThe\nDay".lines().forEach(System.out::println);


        String[] strings1 = "Java_Concept_Of_The_Day".split("_", 3);

        for (String string1 : strings1)
        {
            System.out.println(string1);
        }

        System.out.println(String.valueOf(10)+String.valueOf(1.1)+String.valueOf(true));

            System.out.println(String.join(",", "1", "2", "3").concat(",").repeat(3).lastIndexOf(','));

        StringBuffer sb0 = new StringBuffer("11111");

        StringBuffer sb2 = sb0.append(22222).reverse();

        System.out.println(sb0 == sb2);

        int i = 11;

        i = i++ + ++i;

        System.out.println(i);

    }
}
