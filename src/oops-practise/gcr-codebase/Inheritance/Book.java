package Inheritance;

public class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void displayInfo(){
        System.out.println("title "+title+"publicationYear "+publicationYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String title, int publicationYear,String name, String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("name "+name+"bio  "+bio);
    }
}
class BookMain{
    public static void main(String[] args) {
        Author a = new Author("abc",2024,"Apeksha Singh", "sdc");
        a.displayInfo();
    }

}