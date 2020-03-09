package com.epam.custom_list;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Customlist list = new Customlist();
        System.out.println("Initial size of the list :"+list.size());
        list.add(10);
        list.add(8);
        list.add(5);
       list.add(21);
        System.out.println("Size of List after insertion: "+list.size());
        System.out.println(list);
        list.removeByIndex(2);
        System.out.println(list);
        for(int i=0;i<10;i++)
        {
        	list.add(i*10);
        }
        list.removeByValue(20);
        System.out.println(list);
        Customlist arr1 = new Customlist();
        arr1.add(1);
        System.out.println(arr1);
        arr1.removeByValue(1);
        arr1.add(12);
        arr1.removeByValue(12);
    }
}