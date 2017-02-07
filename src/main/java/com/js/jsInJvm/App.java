package com.js.jsInJvm;

import org.apache.bsf.BSFManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        runJs();
    }
    
    
    public static void runJs(){
    	try{
    	final BSFManager manager = new BSFManager(); 
    	 final Object jso = manager.eval("javascript", "(java)", 1, 1, "'hello, Javascript'"); 
    	 System.out.println(jso.toString()); 
    	 
    	 final Object jso1=manager.eval("javascript", "(java)", 1, 1, "var f = function (what) { return 'hello, ' + what; }; f('hii chandu');"); 
    	 System.out.println(jso1.toString()); 
    	 
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	 } 
    
}
