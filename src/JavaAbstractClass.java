/**
 * HackerRank exercise that teaches the purpose and use of
 * abstract classes.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-31
 */

import java.util.*;

abstract class Book{
    String title;

    abstract void setTitle(String s);

    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    void setTitle(String s) {
        super.title = s;
    }

}

public class JavaAbstractClass{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }

}