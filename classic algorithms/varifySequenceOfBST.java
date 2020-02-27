//98. Validate Binary Search Tree
boolean varifySequenceOfBST(int[] sequence){

if(sequence==null||sequence.length<=0)return true;
return varifySequenceOfBST(sequence,0,sequence.length-1);
}
boolean varifySequenceOfBST(int[] sequence,int start,int end){
if(start>=end) return true;
int root=sequence[end];
int i=start;
while(i<end&&sequence[i]<=root){
i++;
}

int j=i;
// verify if right tree is BST
for(;j<end;j++){
if(sequence[j]<=root)return false;
}
return varifySequenceOfBST(sequence,start,i-1)&&varifySequenceOfBST(sequence,i,end-1);
}
