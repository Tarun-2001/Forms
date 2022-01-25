class Solution {
    public boolean detectCapitalUse(String w) {
        if(w.equals(w.toUpperCase())) return true;
        else if(w.equals(w.toLowerCase())) return true;
        else if(w.substring(0,1)>=65&&w.substring(0,1)<=90&&(w.substring(1).equals(w.substring(1).toLowerCase()))) 
    }
}
