{

int c1=0,c2=0,max=0;
        for(int i=0;i<input2-1;i++){
            if(input1[i]>input1[i+1]){
                c1++;
            }
            if((input1[i]<input1[i+1]&&c1!=0) || ((i==input2-2)&&c1!=0)){
                if(max<c1){
                    max=c1;
                }
                c2++;
                c1=0;
            }
        }
        max=max+1;
        if(c2==0){
            max=0;
        }
        if(input2==0){
            max=0;
            c2=0;
        }
        Result r1 = new Result(c2,max);
        return r1;
    }