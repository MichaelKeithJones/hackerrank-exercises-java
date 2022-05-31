/**
 * HackerRank exercise that teaches the purpose and use of
 * method overriding in Java
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-31
 */

import java.util.*;
import java.io.*;

class BiCycle{

    String define_me(){

        return "a vehicle with pedals.";

    }

}

class MotorCycle extends BiCycle{

    String define_me(){

        return "a cycle with an engine.";

    }

    MotorCycle(){

        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp = super.define_me();

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
public class JavaMethodOverridingTwo {

    public static void main(String [] args){

        MotorCycle M = new MotorCycle();

    }

}


