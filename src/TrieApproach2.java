import java.util.HashMap;
import java.util.Map;

public class TrieApproach2 {

    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;
    public TrieApproach2() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        //mark the current nodes endOfWord as true
        current.endOfWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            //if node does not exist for given char then return false
            if (node == null) {
                return false;
            }
            current = node;
        }
        //return true of current's endOfWord is true else return false.
        return current.endOfWord;
    }
    public boolean startsWith(String prefix) {
        TrieNode current=root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch=prefix.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node== null) return false;
            current=node;
        }
        return true;
    }
    public static void main( String[] args ){
        TrieApproach2 t= new TrieApproach2();
        t.insert("apple");
        t.insert("viswanth");
        //t.insert("app");
        System.out.println(t.root.children.entrySet());
        //System.out.println("Elements in List: "+t.elementData);
        System.out.println("Is string app available in list? "+t.search("app"));
       System.out.println("Is there anuy string starts with 'app'?"+t.startsWith("vis"));
    }












}
