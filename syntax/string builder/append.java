StringBuilder append(String istr) 
  sbf.append(strvalue);




StringBuilder append(StringBuilder sbf) 
  

  
  
  
  public StringBuilder append(char[] cstr, int iset, int ilenght)
Parameter : This method accepts three parameters:

cstr – This refers to the Char sequence.
iset – This refers to the index of the first char to append.
ilenght – This refers to the number of chars to append
             StringBuilder sb = new 
                              StringBuilder("Geeks");
        System.out.println("String Builder "+
                                   "before = " + sb);
  
        char[] cstr = new char[] 
          { 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's','q','q' };
  
        /* appends the string representation of char array 
           argument to this String Builder with offset initially 
           at index 0 and length as 8 */
        sb.append(cstr, 0, 8);
