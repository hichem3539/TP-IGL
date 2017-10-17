import javafx.scene.control.Tab;

public class VectorHelper
{


     public void trier(int[] tab)
     {
         int l=tab.length,x;
         if (l>1)
         {
          for( int i=0; i<=l-2 ; i++ )
          {
              for ( int j=i+1 ; j<=l-1 ; j++ )
              {
                  if (tab[i]>tab[j])
                  {
                   x=tab[i];tab[i]=tab[j];tab[j]=x;
                  }
              }
          }
         }
     }


     public int[] somme(int[] tab1 , int[] tab2 ) throws Exception
     {    int[] tab3=null;
         if ( tab1.length != tab2.length )
             throw new Exception("erreur");
          else
         {    tab3= new int[tab1.length];
             for( int i=0; i<=tab1.length-1 ; i++ )
                 tab3[i]=tab1[i]+tab2[i];
         }

        return tab3 ;
     }


     public void inverser( int[] tab )
     {   int x;
         int l=(tab.length)/2;
         for (int i=0 ; i<=l ; i++ )
         {
             x=tab[i];tab[i]=tab[tab.length-i-1];tab[tab.length-i-1]=x;
         }
     }


     public int[] maxMin (int[] tab)
     {
         int[] tab2 = new int[2];
         if (tab==null)
         {
             tab2[0]=0;tab2[1]=0;
         }
         else
         {
          int[] tab3=new int[tab.length];
          for (int i=0; i<tab.length ;i++)
          tab3[i]=tab[i];
          trier(tab3);
          tab2[0]=tab3[0];
          tab2[1]=tab3[tab.length-1];
         }
      return tab2 ;
     }

     public void fonction(int[] tab)
     {
         if (tab!=null)
             for(int i = 0 ;i<tab.length ; i++)
             {
                 tab[i]=tab[i]*2;
             }


     }

     public void afficher(int[] tab)
     {
         for (int i = 0; i < tab.length ; i++)
         {
          System.out.print(tab[i]+" ");
         }
         System.out.println();

     }

public static void main ( String args[] )
    {
        VectorHelper vector = new VectorHelper();
        int[] tab= {5,6,2,4,8,3,10};
        vector.afficher(tab);
       //added
        vector.afficher(vector.maxMin(tab));

        vector.inverser(tab);
        vector.afficher(tab);

        vector.trier(tab);
        vector.afficher(tab);


    }


}
