// Create a function boolean starts with (String prefix) for a trie
// Return true if there is a previously inserted string word that has prefix prefix,and false otherwise.

// word[]={"apple","app","mango","man","woman"}
public class StartsWithProblem {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26]; // a to z
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    // if the node doesnot exist then try to create new node
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) { // 0(L); L=key length
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }
    public static boolean prefix(String key) {
        Node current = root;
        for (int i = 0; i < key.length(); i++) { // 0(L)
            int idx = key.charAt(i) - 'a';
            Node node = current.children[idx];
            if (node == null) {
                // add new node
                return false;
            }
            current = current.children[idx];
        }
        return true;
    }
   
    

    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        String key = "app";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        //Prefix:"app" true just check prefix is thier or not where end of the word should not be either true or false
        System.out.println(prefix(key));
    }
}
