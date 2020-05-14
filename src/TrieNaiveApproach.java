import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class TrieNaiveApproach
{
    ArrayList<String> elementData;

    public TrieNaiveApproach() {
        this.elementData= new ArrayList<>(10);
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        this.elementData.add(word);

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        return elementData.contains(word);

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for (String sea:this.elementData) {
            if(sea.startsWith(prefix)) return true;
        }
        return false;
    }
    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */
    public static void main( String[] args ){
        TrieNaiveApproach t= new TrieNaiveApproach();
        t.insert("apple");
        t.insert("viswanth");
        t.insert("app");
        System.out.println("Elements in List: "+t.elementData);
        System.out.println("Is string app available in list? "+t.search("app"));
        System.out.println("Is there anuy string starts with 'app'?"+t.startsWith("app"));
    }

}



