public class SmallestLetter {
    static char nextGreatestLetter(char[] letters,char target){
        int start=0;
        int end=letters.length;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
    public static void main(String args[]){
        char[] letters={'a','d','g','j','r','x','y'};
        char target='o';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
}
