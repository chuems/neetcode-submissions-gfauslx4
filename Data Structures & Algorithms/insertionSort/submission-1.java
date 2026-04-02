// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List <List<Pair>> result = new ArrayList<>();
        if(!pairs.isEmpty()){
            result.add(new ArrayList<>(pairs));
        }
        
        int j = 0;
        for (int i = 1; i < pairs.size(); i++){
            Pair current = pairs.get(i);
            j = i - 1;

            while (j >= 0 && pairs.get(j).key > current.key){
            pairs.set(j + 1, pairs.get(j));//set(int index, E element)
            j--;
            }
            pairs.set(j+1, current);
            result.add(new ArrayList<>(pairs));
        }return result;
    }
}
