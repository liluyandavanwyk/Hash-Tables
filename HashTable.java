import java.util.*;
import java.io.*;
public class HashTable{



      private int arraySize = 100;
      private dataObject[] hashTableArray = new dataObject[arraySize];


      /*public HashTable(int arraySize){
          this.arraySize = arraySize;
          hashArray = new dataItem[arraySize];
      }*/

      public long getHashValue(long iD){
          return iD % arraySize;

      }

      public dataObject find(long iD){
         int hashValue = (int)(getHashValue(iD));
         while(hashTableArray[hashValue]!=null){
           if(hashTableArray[hashValue].getId()== iD){
             return hashTableArray[hashValue];
           }
           ++hashValue;
           hashValue %= arraySize;
         }
         return null;
      }

      public void insert(dataObject item){
          long theId = item.getId();
          int hashValue = (int)(getHashValue(theId));
          while(hashTableArray[hashValue]!=null){
              ++hashValue;
              hashValue %= arraySize;
          }
          hashTableArray[hashValue] = item;
      }

      /*public void delete(int Id){
         int hashValue = getHashValue(Id);
         while(hashArray[hashValue]!=null){
            if(hashArray[hashValue].getId()==Id){
              hashArray[hashValue]=null;
            }
            ++hashValue;
            hashValue %= arraySize;
         }
      }*/




}
