class Solution {
    boolean isVowel(char c){
       if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
           return true;
       }
       return false;
    }


    public String reverseVowels(String s) {

        char[] s1=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            if(isVowel(s1[i]) && isVowel(s1[j])){

                char temp=s1[i];
                s1[i]=s1[j];
                s1[j]=temp;

                i++;
                j--;
            }
            else if(isVowel(s1[i])==false){
                i++;
            }
            else if(!isVowel(s1[j])){
                j--;
            }
        }

        String s2=new String(s1);

        return s2;
    }
}