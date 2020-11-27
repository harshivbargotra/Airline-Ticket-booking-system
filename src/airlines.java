import java.util.Scanner;
public class airlines
{
    Scanner s = new Scanner (System.in);
    String [] a =new String[50];
    String [] y =new String[30];
    String [] x =new String[20];
    String name;
    String gender;
    int age,i,b,p,z=0,d,c,price,n,m,totalprice=0;
    String l;

    public void persons()
    {
        System.out.print("Enter the no. of Passengers : ");
        p=s.nextInt();
        System.out.print(" PRESS 1 : Delhi to Banglore \n PRESS 2 : Delhi to Chennai \n PRESS 3 : Delhi to Jammu \n PRESS 4 : Delhi to Mumbai\n");
        d=s.nextInt();
        System.out.print("PRESS 1 : FOR ONE WAY    &     PRESS 2 : FOR TWO WAY\n");
        c=s.nextInt();
    }

    public void input()
    {
        for(b=1 ; b<=p ; b++)
        {
            System.out.println("Your Name : ");
            name=s.next();
            System.out.println("Your Age : ");
            age=s.nextInt();
            System.out.println("Your Gender : ");
            gender=s.next();

            System.out.println("Hello..!! "+ name +" which class you would like to travel");
            System.out.println("Economy or First or Business");
            l=s.next();
            if(l.equalsIgnoreCase("First"))
            {
                n = 4000;
                System.out.println("Choose your seat no.");
                i=s.nextInt();
                if(x[i]=="B")
                {
                    System.out.println("SEAT IS ALREADY BOOKED");
                }
                x [i] = "B";
                System.out.println("YOUR TICKET IS BOOKED *FIRST*"+i);
                z++;
                m=30;

            }
            else if(l.equalsIgnoreCase("Economy"))
            {	n = 1200;
                System.out.println("choose your seat no.");
                i=s.nextInt();
                if(a[i]=="B")
                {
                    System.out.println("SEAT IS ALREADY BOOKED");
                }
                a [i] = "B";
                System.out.println("YOUR TICKET IS BOOKED *ECONOMY*"+i);
                z++;
                m=10;
            }
            else if(l.equalsIgnoreCase("Business"))
            {	n = 3600;
                System.out.println("choose your seat no.");
                i=s.nextInt();
                if(y[i]=="B")
                {
                    System.out.println("SEAT IS ALREADY BOOKED");
                }
                y [i] = "B";
                System.out.println("YOUR TICKET IS BOOKED *BUSINESS*"+i);
                z++;
                m=20;
            }

            System.out.print("NAME : " + name +  "\n AGE : " + age + "\n GENDER : " + gender+"\n" );


            switch (d)
            {
                case 1 :
                    price = 2000;
                    if(m==10)
                    {
                        price=price+1200;
                        price=price*c;
                        break;
                    }
                    else if(m==20)
                    {
                        price=price+3600;
                        price=price*c;
                        break;
                    }
                    else if(m==30)
                    {
                        price=price+4000;
                        price=price*c;
                        break;
                    }
                    break;

                case 2 :
                    price = 2500;
                    if(m==10)
                    {
                        price=price+1200;
                        price=price*c;
                        break;
                    }
                    else if(m==20)
                    {
                        price=price+3600;
                        price=price*c;
                        break;
                    }
                    else if(m==30)
                    {
                        price=price+4000;
                        price=price*c;
                        break;
                    }
                    break;

                case 3 :
                    price = 1000;
                    if(m==10)
                    {
                        price=price+1200;
                        price=price*c;
                        break;
                    }
                    else if(m==20)
                    {
                        price=price+3600;
                        price=price*c;
                        break;
                    }
                    else if(m==30)
                    {
                        price=price+4000;
                        price=price*c;
                        break;
                    }
                    break;

                case 4 :
                    price = 2300;
                    if(m==10)
                    {
                        price=price+1200;
                        price=price*c;
                        break;
                    }
                    else if(m==20)
                    {
                        price=price+3600;
                        price=price*c;
                        break;
                    }
                    else if(m==30)
                    {
                        price=price+4000;
                        price=price*c;
                        break;
                    }
                    break;
            }

            System.out.print( " CLASS : " + l + "\n PASSENGER NO. : " + b + "\n PRICE : " + price+"\n\n" );
            totalprice=totalprice+price;
        }
        System.out.println("***TOTAL PASSENGERS*** : "+p);
        System.out.println("***TOTAL PRICE***: "+totalprice);
    }



    public static void main(String [] args)
    {
        airlines obj= new airlines();
        obj.persons();
        obj.input();

    }
}

