{ 

int[] arr = new int[input2];
        arr[input2-1] = input1[input2-1];
        int sum = arr[input2-1];
        for(int i = input2-2;i >= 0;i--){
            arr[i] = input1[i] - arr[i + 1];
            sum+=arr[i];
        }
        Result r1 = new Result(arr[0],sum);
        return r1;
    }