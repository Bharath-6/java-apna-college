import java.util.*;
class TrieNode{
    Map<Character,TrieNode> children;
    boolean isEndOfWord;
    
    TrieNode(){
        children = new HashMap<>();
        isEndOfWord = false;
    }
}
class Trie{
    TrieNode root;
    
    Trie(){
        root = new TrieNode();
    }
    void insert(String word){
        TrieNode current = root;
        for(char c:word.toCharArray()){
            current.children.putIfAbsent(c,new TrieNode());
            current.isEndOfWord = true;
        }
        
        }
        boolean isPrefix(String prefix){
            TrieNode current = root;
            for(char c:prefix.toCharArray()){
                if(!current.children.containsKey(c)){
                    return false;
                }
                current = current.children.get(c);
            }
            return true;
    }
    