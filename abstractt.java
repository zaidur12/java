// You have to create another class that extends the abstract class. Then you can create an instance of the new class.

// Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.

// In the editor, we have provided the abstract Book class and a Main class. In the Main class, we created an instance of a class called MyBook. Your task is to write just the MyBook class.

// Your class mustn't be public

import java.util.Scanner;

abstract class Book {
     String title;
     abstract void setTitle(String s);
    
     String getTitle() {
        return title;
    }
}

class  book2 extends Book{
   @Override
   void setTitle(String s) {
        this.title = s;
    }
}

public class abstractt {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
		String title=sc.nextLine();
		Book new_novel= new book2();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
        } catch (Exception e) {
            System.err.println(e);
        }
     
        
       
    }
}
