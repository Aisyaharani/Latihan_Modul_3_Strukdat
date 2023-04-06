/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat3;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author AISYAH
 */
public class MainQueue {
    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.add("PHP");
        queue.add("HTML");
        
        System.out.println("remove :" +queue.remove());
        System.out.println("element :" +queue.element());
        System.out.println("Poll : "+queue.poll());
        System.out.println("peek :" + queue.peek());
    }
        public static void main (String[] args){
            new MainQueue().queueExample();
        }

