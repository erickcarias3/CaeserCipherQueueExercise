package com.assignment4;
import java.util.*;


public class Codes {
    public static void main(String[] args){
        int [] key = {5, 12, -3, 8, -9, 4, 10};
        Integer keyValue;
        Scanner scanner = new Scanner(System.in);
        String encoded = "", decoded = "";
        System.out.print("enter the message you would like to encode: ");
        String message = scanner.nextLine();

        Queue<Integer> encodingQueue = new LinkedList<Integer>();
        Queue<Integer> decodingQueue = new LinkedList<Integer>();

        for( int scan = 0; scan < key.length; scan++){
            encodingQueue.add(key[scan]);
            decodingQueue.add(key[scan]);
        }

        for( int scan = 0; scan < message.length(); scan++){
            keyValue = encodingQueue.remove();
            encoded += (char) (message.charAt(scan) + keyValue);
            encodingQueue.add(keyValue);

        }

        System.out.println( " encoded message: " + encoded  );
        System.out.print( " press enter to decode ");
        scanner.nextLine();



        for( int scan = 0; scan < encoded.length(); scan++){
            keyValue = decodingQueue.remove();
            decoded += (char) (encoded.charAt(scan) - keyValue);
            decodingQueue.add(keyValue);
        }

        System.out.println(" Original message: " + decoded );

    }
}
