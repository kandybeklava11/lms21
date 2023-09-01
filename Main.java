import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Атынызды жазыныз:");
        String aty=scanner.nextLine();
        System.out.println("Дата рождения:");
        String data=scanner.nextLine();
        System.out.println("Жумушка кайсы жылы киргени:");
        String jumush =scanner.nextLine();
        System.out.println("Атыныз: " + aty + "  \nдата рождения: "+ data+"\nЖумушка кайсы жылы кирдиниз: "+ jumush );

         */
        /*Scanner scanner=new Scanner(System.in);
        int a =10;
        a--;
        a--;
        a--;
        a--;
        a--;
        a--;
        a--;
        a--;
        System.out.println(a);

         */
        /*double number = 4.7%4;
        System.out.println(number);


        /*Random random= new Random();
        System.out.println(random.nextInt(10,100));
        double randomnumber=random.nextDouble();
        System.out.println(randomnumber);

         */
        /* Random random=new Random();
        double randomNumber=random.nextInt();
        double randomNumber2=random.nextInt();
        System.out.println(randomNumber);
        System.out.printf("(randomNumber)/2 = %f", (randomNumber+randomNumber2)/2);

        */
        /*double doubleNumber = 4.13;
        System.out.println(doubleNumber);
        int intNumber = (int) doubleNumber;
        System.out.println(intNumber);

         */
        /*int a=100;
        byte b = (byte)a;
        System.out.println(b);
        byte c =90;
        int d =c;

         */
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Введите цифру:");
        Short num1 =scanner.nextShort();
        Short num2 =scanner.nextShort();
        Short num3 =scanner.nextShort();
        String a=(";");
        System.out.println("Вывод:"+num1+a+num2+a+num3);

         */
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Введите цифру:");
        int a = scanner.nextInt();
        int c = a/100;
        int v = a%013;
        int h = a%10;

        System.out.println(c+","+v+","+h);

         */
        /*Scanner scanner =new Scanner(System.in);
            System.out.println("Введите цифру:");
            int a = scanner.nextInt();
            int b = a/100;
            int c =(a/10)%10;
            int d =a%10;
            System.out.println(b+","+c+","+d);

             */
/*
Random random=new Random();
        List<Integer> fff= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            fff.add(random.nextInt(1,100));
        }
        List<Integer> addNumbers=new ArrayList<>() ;
        List<Integer>evenNUmbers=new ArrayList<>();

 */
        //Database database=new Database(li)
        Reader reader=new Reader("Markos Alonso","MarAl@email.com",1775530,ReaderGender.MALE);
        Reader reader2=new Reader("Shacher Kari","Shacherka@email.com",7397746,ReaderGender.MALE);
        Reader reader3=new Reader("Dranso Polo","Polo@email.com",22304888,ReaderGender.MALE);

        Book book=new Book("Alison","Basova",BooksGenre.DRAMA);
        Book book2=new Book("Daria","Jekson",BooksGenre.HISTORICAL);
        Book book3=new Book("Runner","Balova",BooksGenre.LIVEEVENTS);


        List<Book>bookList=new ArrayList<>();
        bookList.add(book);
        List<Book>bookList2=new ArrayList<>();
        bookList2.add(book2);
        List<Book>bookList3=new ArrayList<>();
        bookList3.add(book3);
      //  bookList.remove(book);




        List<Reader>readerList=new ArrayList<>();
        readerList.add(reader);
        List<Reader>readerList2=new ArrayList<>();
        readerList2.add(reader2);
        List<Reader>readerList3=new ArrayList<>();
        readerList3.add(reader3);
      //  readerList.remove(reader);


        Librery librery=new Librery("Fasion","Toktogulova 34",bookList,readerList);
        Librery librery2=new Librery("Fasion","Toktogulova 34",bookList2,readerList2);
        Librery librery3=new Librery("Fasion","Toktogulova 34",bookList3,readerList3);

        List<Librery>libreries=new ArrayList<>();
        libreries.add(librery);
        List<Librery>libreries2=new ArrayList<>();
        libreries2.add(librery2);
        List<Librery>libreries3=new ArrayList<>();
        libreries3.add(librery3);
int vvod=0;
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("1.Check All Readers");
            System.out.println("2.Check All Books");
            System.out.println("3.Check All Libraries");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1.All Readers");
                    for (int i = 0; i <readerList.size(); i++) {
                        System.out.println(readerList.get(i));
                    }
                    for (int i = 0; i <readerList2.size(); i++) {
                        System.out.println(readerList2.get(i));
                    }
                    for (int i = 0; i <readerList3.size(); i++) {
                        System.out.println(readerList3.get(i));
                    }
                    break;
                case 2:
                    System.out.println("1.All Books");
                    for (Book nn:bookList) {
                        System.out.println(nn);
                    }
                    for (Book nn:bookList2) {
                        System.out.println(nn);
                    }
                    for (Book nn:bookList3) {
                        System.out.println(nn);
                    }
                    break;
                case 3:
                    }
                    System.out.println("1.All Libraries");
                    for (Librery kk:libreries) {
                        System.out.println(kk);
                    }
                    for (Librery kk:libreries2) {
                        System.out.println(kk);
                    }
                    for (Librery kk:libreries3) {
                        System.out.println(kk);
                    }
            System.out.println("1.Delete Libraries by id");
            int secondvybor=scanner.nextInt();
            switch (secondvybor){
                case 1:
                break;
                default:
                    System.out.println("You wrote another variant"+
                            "\nPlease write the correct variant ");
            }

        }while (vvod!=4);
    }
}












