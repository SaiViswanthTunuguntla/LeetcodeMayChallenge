public class Trie {
    class Node {
        char value;
        Node[] children;
        boolean isEnd;

        public Node(char value){
            this.value = value;
            this.children = new Node[26];
            this.isEnd = false;
        }

        public Node(){
            this.children = new Node[26];
            this.isEnd = false;
        }

    }

    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        this.root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node pointer = root;
        for (char c : word.toCharArray()) {
            if (pointer.children[c - 'a'] == null) {
                pointer.children[c - 'a'] = new Node(c);
            }
            pointer = pointer.children[c - 'a'];
        }
        pointer.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node pointer = root;
        for (char c : word.toCharArray()) {
            if (pointer.children[c - 'a'] == null) {
                return false;
            }
            pointer = pointer.children[c - 'a'];
        }
        return pointer.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node pointer = root;
        for (char c : prefix.toCharArray()) {
            if (pointer.children[c - 'a'] == null) {
                return false;
            }
            pointer = pointer.children[c - 'a'];
        }
        return true;
    }
    public static void main( String[] args ){
        Trie t= new Trie();
        t.insert("apple");
        t.insert("viswanth");
        t.insert("app");
       // System.out.println("Elements in List: "+t.root);
        System.out.println("Is string app available in list? "+t.search("app"));
        System.out.println("Is there anuy string starts with 'app'?"+t.startsWith("app"));
    }

}
