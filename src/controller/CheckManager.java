
package controller;

import common.Algorithms;
import common.Library;
import view.Menu;


public class CheckManager extends Menu <String>{
    static String[] mc = {"Input Information.","Exit."};
    private Library l;
    private Algorithms al;
    public CheckManager(){
        super("=====Validate Program=====",mc);
        l = new Library();  
        al = new Algorithms();
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                al.check();
                break;
            case 2:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }
    
}
