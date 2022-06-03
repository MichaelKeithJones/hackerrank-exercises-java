/**
 * HackerRank exercise that teaches the purpose and use of
 * reflection in Java programming and troubleshooting.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-29
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;


public class JavaReflectionAttributes {
    static class Students{
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void anothermethod(){  }
    }

    public static void main(String[] args){
        Class student = Students.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
