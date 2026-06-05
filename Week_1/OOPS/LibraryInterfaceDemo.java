public class LibraryInterfaceDemo
{
    public static void main(String[] args) 
    {
       KidUsers k1=new KidUsers();
       k1.age=10;
       k1.requestAccount();
       k1.age=18;   
       k1.requestAccount();

       k1.bookType="Kids";
       k1.requestBook();
       k1.bookType="Fiction";
       k1.requestBook();

       AdultUser a1=new AdultUser();
       a1.age=5;
       a1.requestAccount();
       a1.age=23;   
       a1.requestAccount();

       a1.bookType="Kids";
       a1.requestBook();
       a1.bookType="Fiction";
       a1.requestBook();

    }
}