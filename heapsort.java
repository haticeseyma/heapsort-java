public class heapsort {
void sort ( int[] dizi){
    int n = dizi.length;
    int x;

     //en büyük elamanı bul en başa al
     for (int k=n/2;k>0;k--)//yarı dizi elemanı sorgulanır
     heap(dizi, k, n);
    for (int i = 0; i < n; ++i)
    System.out.print(dizi[i] + " ");
    System.out.println();
    // küçükten büyüğe sıralama için
    while(n>1) {
    x=dizi[0]; 
    dizi[0]=dizi[n-1]; 
    dizi[n-1]=x; 
    --n;
     heap(dizi, 1,n); //en büyük elaman sona atılıyor
     for (int i = 0; i < n; ++i)
            System.out.print(dizi[i] + " ");
            System.out.println();
        }
    }
     

    void heap( int dizi[], int k, int N) 
    {
        int T=dizi[k-1];
        while ( k<=N/2) {
            int j=k+k;
            if( (j<N) && ( dizi[j-1]<dizi[j] ) ) 
                j++;
            if ( T>=dizi[j-1]) 
                break;
            else 
            { 
                dizi[k-1]=dizi[j-1]; 
                k= j;
            }
        }
        dizi[k-1]=T;
    }


	static void printdiziay(int dizi[])
	{
		int n = dizi.length;
		for (int i = 0; i < n; ++i)
			System.out.print(dizi[i] + " ");
		System.out.println();
	}


	public static void main(String args[])
	{
		int dizi[] = { 12, 11, 13, 5, 6, 7 };
		int n = dizi.length;

		heapsort ob = new heapsort();
		ob.sort(dizi);

		System.out.println("Sıralı Dizi");
		printdiziay(dizi);
	}


    
    }
























 














