//Count Unique Substrings
// Given a string of length n of lowercase alphabet characters,we need to count total number of
// distinct substrings of this strings.
// str = "ababa"
// ans=10
// *? we will be taking prefix and suffix to find the answer
/*  all prefix of all suffix
suffix:        prefix:
ababa -->      a,ab,aba,abab,ababa // reapeating will be deleted
baba  -->      b,ba,bab,baba 
aba   -->       a,ab,aba  //dont include a and ab and aba
ba    -->       b,ba        //dont include b and ba
a     -->       a           //dont include a
" "   -->       " "*/ 

// *? find all suffix of string
// *? create a trie from suffix
// *? count nodes of trie will be ans include root it will 10
// *? total nodes of trie = count of unique prefix/

//code steps
// *! 1)for(int i=0 to n) and when we call substring(i)-->suffix
// *! 2)insert (suffix)
/*step3: 
 * countNodes(root){
 *      count=0;
 *      for(int i=0 to 26){
 *          if(root.children[i]!=null){
 *          count+=countNodes(root.children[i])
 *  }
 *  }
 * return count+1;
 * }
 */
public class CountUniqueSubstrings {
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
    public static boolean search(String key) {
        Node current = root;
        for (int i = 0; i < key.length(); i++) { // 0(L)
            int idx = key.charAt(i) - 'a';
            Node node = current.children[idx];
            if (node == null) {
                // add new node
                return false;
            }
            if (i == key.length() - 1 && node.eow == false) {
                return false;
            }
            current = current.children[idx];
        }
        return true;
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    

    public static void main(String[] args) {
        String str="ababa";

        //find the suffix
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            // ababa
            // baba
            // aba
            // ba
            // a
            // System.out.println(suffix);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}
