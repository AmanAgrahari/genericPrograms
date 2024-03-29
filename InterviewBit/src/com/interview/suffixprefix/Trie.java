package com.interview.suffixprefix;

/**
 * Date 04/25/2016
 *
 * @author Tushar Roy
 *
 *         Insert/delete/search into trie data structure
 *
 *         Reference https://en.wikipedia.org/wiki/Trie
 */
public class Trie {

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    /**
     * Iterative implementation of insert into trie
     */
    public void insert(final String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            final char ch = word.charAt(i);
            TrieNode node = current.map.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.map.put(ch, node);
            }
            current = node;
        }
        //mark the current nodes endOfWord as true
        current.endOfWord = true;
    }

    /**
     * Recursive implementation of insert into trie
     */
    public void insertRecursive(final String word) {
        insertRecursive(root, word, 0);
    }

    private void insertRecursive(final TrieNode current, final String word, final int index) {
        if (index == word.length()) {
            //if end of word is reached then mark endOfWord as true on current node
            current.endOfWord = true;
            return;
        }
        final char ch = word.charAt(index);
        TrieNode node = current.map.get(ch);

        //if node does not exists in map then create one and put it into map
        if (node == null) {
            node = new TrieNode();
            current.map.put(ch, node);
        }
        insertRecursive(node, word, index + 1);
    }

    /**
     * Iterative implementation of search into trie.
     */
    public boolean search(final String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            final char ch = word.charAt(i);
            final TrieNode node = current.map.get(ch);
            //if node does not exist for given char then return false
            if (node == null) {
                return false;
            }
            current = node;
        }
        //return true of current's endOfWord is true else return false.
        return current.endOfWord;
    }

    /**
     * Recursive implementation of search into trie.
     */
    public boolean searchRecursive(final String word) {
        return searchRecursive(root, word, 0);
    }

    private boolean searchRecursive(final TrieNode current, final String word, final int index) {
        if (index == word.length()) {
            //return true of current's endOfWord is true else return false.
            return current.endOfWord;
        }
        final char ch = word.charAt(index);
        final TrieNode node = current.map.get(ch);
        //if node does not exist for given char then return false
        if (node == null) {
            return false;
        }
        return searchRecursive(node, word, index + 1);
    }

    /**
     * Delete word from trie.
     */
    public void delete(final String word) {
        delete(root, word, 0);
    }

    /**
     * Returns true if parent should delete the mapping
     */
    private boolean delete(final TrieNode current, final String word, final int index) {
        if (index == word.length()) {
            //when end of word is reached only delete if currrent.endOfWord is true.
            if (!current.endOfWord) {
                return false;
            }
            current.endOfWord = false;
            //if current has no other mapping then return true
            return current.map.size() == 0;
        }
        final char ch = word.charAt(index);
        final TrieNode node = current.map.get(ch);
        if (node == null) {
            return false;
        }
        final boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

        //if true is returned then delete the mapping of character and trienode reference from map.
        if (shouldDeleteCurrentNode) {
            current.map.remove(ch);
            //return true if no mappings are left in the map.
            return current.map.size() == 0;
        }
        return false;
    }

    public static void main(final String args[]) {

        final Trie ob = new Trie();
        ob.insert("abc");
        ob.insert("abgl");
        ob.insert("cdf");
        ob.insert("abcd");
        ob.insert("lmn");

        System.out.println(ob.search("cdf"));

    }
}