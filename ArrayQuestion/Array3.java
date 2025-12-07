public class Array3 {
 

    public static void main(String[] args) {
        int[] arr= {2,3,2,3,5,5,5,4};
        // int res = secondBiggestElement(arr);
        // System.out.println(res);
        //getFrequency(arr);
        //printEleWithMultipleTimes(arr);
        //getOddFrequency(arr);
        //maxFrequencyElement(arr);
        //maxFrequencyBiggerElement(arr);
        int res = nonReapitingElement(arr);
        System.out.println(res);
    }

    // q. 32
    // q. 33
    // q. 34............
   // q. 55 ........ not undersatnd this question
    // q. 45
    public static int secondBiggestElement(int[] arr){
        int max = Integer.MIN_VALUE; int secondMax = Integer.MIN_VALUE;

        for(int i= 0;i<arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){ // handle the duplicate 
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    // q. 46
    public static void secondSmallestEle(int[] arr){
        int smallest = Integer.MAX_VALUE; int secondSmall = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < smallest){
                secondSmall = smallest;
                smallest = arr[i];
            }
        }
    }

    // frequency array
    // q. 48
    // public static void getFrequency(int[] a){
    //     int max = a[0] ; int min = a[0];

    //     for(int x:a){
    //         if(x>max){
    //             max = x;
    //         }else if(x<min){
    //             min = x;
    //         }
    //     }
    //     int[] freq = new int[max-min+1];
    //     for(int x:a){
    //         freq[x-min]++;
    //     }

    //     for(int i = 0;i<freq.length;i++){
    //         if(freq[i] >0){
    //             System.out.println((i+min) +" is  " + freq[i]);
    //         }
    //     }
    // }

    // q 52
    // public static void getFrequency(int[] a){
    //     int max = a[0] ; int min = a[0];

    //     for(int x:a){
    //         if(x>max){
    //             max = x;
    //         }else if(x<min){
    //             min = x;
    //         }
    //     }
    //     int[] freq = new int[max-min+1];
    //     for(int x:a){
    //         freq[x-min]++;
    //     }

    //     for(int i = 0;i<freq.length;i++){
    //         if(freq[i] == 1){
    //             System.out.println((i+min) +" is  " + freq[i]);
    //         }
    //     }
    // }
 

    // q. 53
    // public static void getFrequency(int[] a){
    //     int max = a[0] ; int min = a[0];

    //     for(int x:a){
    //         if(x>max){
    //             max = x;
    //         }else if(x<min){
    //             min = x;
    //         }
    //     }
    //     int[] freq = new int[max-min+1];
    //     for(int x:a){
    //         freq[x-min]++;
    //     }

    //     for(int i = 0;i<freq.length;i++){
    //         if(freq[i] > 0)
    //             System.out.print(i+min + " ");
            
    //     }
    // }

    // q. 56
     public static void getFrequency(int[] a){
        int max = a[0] ; int min = a[0];

        for(int x:a){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }

        for(int i = 0;i<freq.length;i++){
            if(freq[i] > 1)
                System.out.print(i+min + " ");
            
        }
    }

    // q. 56
    public static void printEleWithMultipleTimes(int[] a){
        for(int i = 0;i<a.length;i++){
            int count = 0;
            for(int j = 0;j<a.length;j++){
                if(a[i] == a[j]){
                    count ++;
                }
            }
            if(count > 1){
                boolean alreadyPrinted = false;

                for(int k =0;k<i;k++){
                    if(a[k] == a[i]){
                        alreadyPrinted = true;
                        break;
                    }
                }

                if(!alreadyPrinted){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
   
    // q. 57
    public static void getEvenFrequency(int[] a){
        int max = a[0] ; int min = a[0];

        for(int x:a){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }

        for(int i = 0;i<freq.length;i++){
             if(freq[i] % 2 == 0 && freq[i] != 0)
                System.out.println(i+min );
            
        }
    }

    // 58
    public static void getOddFrequency(int[] a){
        int max = a[0] ; int min = a[0];

        for(int x:a){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }

        for(int i = 0;i<freq.length;i++){
             if(freq[i] % 2 != 0 && freq[i] != 0)
                System.out.println(i+min );
            
        }
    }

    // q. 59
    public static void maxFrequencyElement(int[] a){
        int max = a[0] ; int min = a[0];

        for(int x:a){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }

        for(int i = 0;i<freq.length;i++){
            
            int maxFreq = freq[0];
             if(freq[i] > maxFreq){
                maxFreq = freq[i];
                System.out.println(min + i);
             }
        }
    }

    // q. 61
    public static void maxFrequencySmallerElement(int[] a){
        int max = a[0] ; int min = a[0];

        for(int x:a){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }
        
        // find the maximum frequency element
        int maxFreq = freq[0];
        for(int f : freq){
            if(f>maxFreq)
            maxFreq = f;
        }
        // compare the 
        for(int i = 0;i<freq.length;i++){
            
            if(freq[i] == maxFreq){
                System.out.println((min+i));
                break;
            }
        }
    }

    // q. 62
    public static void maxFrequencyBiggerElement(int[] a){
        int max = a[0] ; int min = a[0];

        for(int x:a){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }
        
        // find the maximum frequency element
        int maxFreq = freq[0];
        for(int f : freq){
            if(f>maxFreq)
            maxFreq = f;
        }
        // compare the 

        int bigElement = Integer.MIN_VALUE;
        for(int i = 0;i<freq.length;i++){
            
            if(freq[i] == maxFreq){
                int element = min+i;

                if(element > bigElement){
                    bigElement = element;
                }
            }

        }
        System.out.println(bigElement);
    }

    // q. 63
    public static int nonReapitingElement(int[] a){
        int max = a[0] ; int min = a[0];

        for(int x:a){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }
    
        // compare the 
        for(int i = 0;i<freq.length;i++){
            if(freq[i] == 1){
                return i;
            }
        }
        return -1;
    }

    // q. 64
    public static void majorityElement(int[] a){
        int max = a[0] ; int min = a[0];

        for(int x:a){
            if(x>max){
                max = x;
            }else if(x<min){
                min = x;
            }
        }
        int[] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }
    
        // compare the 
        for(int i = 0;i<freq.length;i++){
            if(freq[i] /freq.length){
                
            }
        }
    }

    //q. 49. kth largest element in aaray

    public static void findKthLargest(int[] arr,int k)
    {

    }
     

}
