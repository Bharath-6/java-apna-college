// *? Longest word with all Prefixes

/*Find the longest string in words such that every prefix of it is also in words.
words=["a","banana","app","appl","ap","apple"]
ans = "apple"*/

public class LongestWordwithAllPrefix {
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
    // *!where each node end of the word should be true then the longest prefix will be my answer
    // *! temp + char
    // *! temp=ans compare temp and ans
    // *!recursively go to the child
    public static String ans="";
    public static void Longestword(Node root, StringBuilder temp) {
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                Longestword(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
   
    

    public static void main(String[] args) {
        String[] words={"a","banana","app","appl","ap","apply","apple"};
        //ans=apple
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        Longestword(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
