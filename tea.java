
class tea {

    
    public static void teaencryption(int [] plaintext,int [] key)
    {

        int split1= plaintext[0];//assigning both array index 0 and 1 to an int variable in order to perform operation
        int split2= plaintext[1];//second half of my palintext initialized to an int 

        int delta =0x9e3779b9;//delta declared
        int sum=0; //sum set to 0 

        for (int i= 0; i<32;i++)//for loop stopping at 32 incrementing i 
            {
            sum=sum+delta;
            int left=(split2<<4)+key[0];// shift right 
            int middle= split2+sum;
            int right = (split2>>5)+key[1];// shift 5 places to the left 
            int firsthalf= left^middle^right;//xor to get first half 

            split1+=firsthalf;//add first half to split1 in order for split2 to use the right variable 

            int lside=(split1<<4)+key[2];//shift right 4 
            int mid= split1+sum;
            int rside = (split1>>5)+key[3];//shift unsigned 
            int sechalf= lside^mid^rside;//xor 


            
            split2+=sechalf;//declare to split2

        }

        //results 
        plaintext[0]=split1;
        plaintext[1]=split2;


    }

    public static void teadecryption(int [] ciphertext,int [] key)// takes array and key array 
    {

        int split1= ciphertext[0];//splits it to sections , I could replaces this for cbc by replacing it into a for loop that uses temporary variables to 
        int split2= ciphertext[1];//implements cbc method of xor-ing the IV and the plaintextt then using the key to encrypt and pushing that encryption as the IV got the next code 

        int delta =0x9e3779b9;//delta 
        int sum= delta<<5;//shift bits 5 places to the left

        for (int i=0; i<32;i++)//for statement 
            {

            int lside=(split1<<4)+key[2];//shifts 4 places to the left 
            int mid= split1+sum;// add sum and split one 
            int rside = (split1>>5)+key[3];//shift 3 places to the right 
            int sechalf= lside^mid^rside;//gets sec half by xoring all my variables 

            split2-=sechalf;//initialized opposite order from encryption because we're doing the opposite -- same would follow the method for cbc 


            int left=(split2<<4)+key[0];
            int middle= split2+sum;
            int right = (split2>>5)+key[1];//shift unsigned 
            int firsthalf= left^middle^right;

            split1-=firsthalf;

            


            sum= sum-delta;

        }

        ciphertext[0]=split1;
        ciphertext[1]=split2;


    }


    public static void main (String[]args )
    {
        int [] plaintext= {0x01CA4567,0x0C4BCDEF };// if coding for cbc I would find a method probably using a parse and a long to break down the plaintext
        int [] key= {0xAF6BABCD,0xEF00F000,0xFEAFAFAF,0xACCDEF01};// by reading a string instead and then changing it into a hex removing the "0x" infront of the hex number that way it can be set to a longer array

        String original = String.format("%08x%08x", plaintext[0],plaintext[1]);// the array wouldnt be fixed like it is right now , and i would implement a scanner class 
        System.out.println("before encyption : ");
        System.out.println(original);//plaintext original 

        teaencryption(plaintext,key);

        String result = String.format("%08x%08x", plaintext[0],plaintext[1]);

        System.out.println("\n Result: "+result);//used to merge my plaintext split array together 
        System.out.println();//for organization 

       
        int [] ciphertext= {0x3c265fc3,0xf6cf4846};

        teadecryption(ciphertext, key);
        String res = String.format("%08x%08x", ciphertext[0],ciphertext[1]);
        System.out.println("\n Decryption: "+ res);
        System.out.println();


        


    }
}