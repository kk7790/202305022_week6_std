package org.example;

import java.util.ArrayList;
import java.util.List;

public class HashMake extends ObjectMake {
    //리스트를 요소로 갖는 리스트
    //해시값,key,value 해시값이 같아도 key가 다르면 저장 위치가 달라서 관리 가능
    List<List<Object>> hashTable = new ArrayList<>();

    //해시 값 만드는 부분..
    public int hashMake(int key) {
        return key % 10;
    }

    public void saveData(int key, String value) {
        List<Object> allData = new ArrayList<>();
        int hashValue = hashMake(key);
        allData.add(key);
        allData.add(hashValue);
        allData.add(value);
        hashTable.add(allData);
    }

    public Object readValue(int key) { //hash 전체데이터 출력
        int hashAddress = hashMake(key);
        for (int i = 0; i < hashTable.size(); i++) {
            int findHash;
            findHash = (int) hashTable.get(i).get(1);
            if (findHash == hashAddress) {
                return hashTable.get(i).get(2);
            }
        }
        return false;
    }

    public Object readAllData() {
        return hashTable;
    }

    public void deleteData(int key) {
        int hashAddress = hashMake(key);
        for (int i = 0; i < hashTable.size(); i++) {
            int findHash;
            findHash = (int) hashTable.get(i).get(1);
            if (findHash == hashAddress) {
                hashTable.remove(i);
            }
        }

    }
}
