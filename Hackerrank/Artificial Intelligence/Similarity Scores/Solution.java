/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/nlp-similarity-scores/
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static double tf(HashMap<String, Integer> hashMap, int documentSize, String word){
        int counter = (hashMap.containsKey(word)) ? hashMap.get(word) : 0;
        return (double)counter/(double)documentSize;
    }
    public static double idf(ArrayList<HashMap<String,Integer>> hashMaps, String word){
        int counter = 0;
        for(HashMap<String, Integer> hashMap : hashMaps){
            if(hashMap.containsKey(word))
                counter += hashMap.get(word);
        }
        return (counter > 0) ? Math.log((double)hashMaps.size()/(double)counter) : 0.0;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        ArrayList<String[]> documents = new ArrayList<>();
        documents.add(0,"I'd like an apple".toLowerCase().split(" "));
        documents.add(1,"An apple a day keeps the doctor away".toLowerCase().split(" "));
        documents.add(2,"Never compare an apple to an orange".toLowerCase().split(" "));
        documents.add(3,"I prefer scikit-learn to orange".toLowerCase().split(" "));
        
        ArrayList<HashMap<String,Integer>> hashMaps = new ArrayList<>();
        for(int i = 0; i < documents.size(); i++)
            hashMaps.add(i,new HashMap<String, Integer>());
       
        for(int i = 0; i < documents.size(); i++){
            String[] document = documents.get(i);
            HashMap<String,Integer> hashMap = hashMaps.get(i);
            for(int j = 0; j < document.length; j++){
                String word = document[j];
                
                int count = 1;
                if(hashMap.containsKey(word)){
                    count = hashMap.get(word) + count;
                }
                hashMap.put(word,count);
            }
            
        }
        
        double max_sum_of_tf_idf = 0.0;
        int selectedDocument = 0;
        for(int i = 1; i < hashMaps.size(); i++){
            HashMap<String, Integer> hashMap = hashMaps.get(i);
            double sum_of_tf_idf = 0.0;
            for(String word : hashMaps.get(0).keySet()){
                double tempTf = tf(hashMap,documents.get(i).length,word);
                double tempIdf = idf(hashMaps,word);
                double tempifidf = tempTf*tempIdf;
                sum_of_tf_idf += tempifidf;
            }
            if(sum_of_tf_idf > max_sum_of_tf_idf){
                max_sum_of_tf_idf = sum_of_tf_idf;
                selectedDocument = i;
            }
        }
        selectedDocument++;
        System.out.println(selectedDocument);
    }
}