class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        
        HashMap <String, List<String>> mp = new HashMap<>();
        List<List<String>> ans = new ArrayList <List<String>>();
        
        for(String i: string_list)
        {
            char ch[] = i.toCharArray();
            Arrays.sort(ch);
            // Convert the string to its lexicographically 
            // least representation, 
            // e.g. cat->act, act->act, tac->act 
            String s = String.valueOf(ch);
            
            // Check if that representation has 
            // occurred already
            if(mp.containsKey(s))
            {
                // If occurred add the original string to the map
                mp.get(s).add(i);
            }
            
            // If not present
            else
            {
                // Create a new list
                List<String> li = new ArrayList<>();
                // Add the original string
                li.add(i);
                ans.add(li);
                // Insert into the map the string as key 
                // and the new list as value
                mp.put(s,li);
            }
        }
        
        return ans;
        
    }
}
