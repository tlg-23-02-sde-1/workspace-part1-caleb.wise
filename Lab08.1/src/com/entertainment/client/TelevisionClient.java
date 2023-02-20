/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionClient {
  
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 65, DisplayType.LED);
        tv.changeChannel("FLF TV");
        System.out.println(tv);
        
        // TODO: change the channel
        
        System.out.println(tv);
        System.out.println();

        Television tv1 = new Television("Samsung", 45, DisplayType.LED);
        tv1.changeChannel("PBS");
        System.out.println(tv1);
    }
}