package com.company.sub;

import java.util.*;

public class FindMaxChars<Char> {


    private String countMaxChar;
    private String sourceString;
    private HashMap<String,Integer> keypair ;
    public HashMap<String, Integer> getKeypair() {
        return keypair;
    }
    public String getCountMaxChar() {
        return countMaxChar;
    }

    public void setCountMaxChar(String countMaxChar) {
        this.countMaxChar = countMaxChar;
    }
    public void setKeypair(HashMap<String, Integer> keypair) {
        this.keypair = keypair;
    }




    public String getSourceString() {
        return sourceString;
    }

    public void setSourceString(String sourceString) {
        this.sourceString = sourceString;
    }

    public FindMaxChars(String sourceString) {
        this.sourceString = sourceString;
    }

    public void findMaxChar(String sourceString) {
        char [] charArray=sourceString.toLowerCase().toCharArray();
        keypair=new HashMap<>();

//        System.out.println(charArray.length);
        for(int i=0;i<charArray.length;i++){
            int count=0;
            boolean isKeyPresent = keypair.containsKey(String.valueOf(charArray[i]));
            if(!isKeyPresent) {
            for(int j=charArray.length-1;j>=i+1;j--){
                if(charArray[i]==charArray[j] )
                {

                    if(count==0 ) {
                        count+=2;
                        keypair.put(String.valueOf(charArray[i]), count);
                    }
                    else
                    {
                        count++;
                        keypair.put(String.valueOf(charArray[i]), count);
                    }

                }
            }
        }

        }

    }
    public <K, V extends Comparable<V>> K maxChar(HashMap<K, V> map) {
        Optional<HashMap.Entry<K, V>> maxEntry = map.entrySet()
                .stream()
                .max(Comparator.comparing(HashMap.Entry::getValue));
        System.out.println(maxEntry.get().getValue());
        return maxEntry.get()
                .getKey();
    }
}
