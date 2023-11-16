class Logic
{
public static void main(String[] args){
    Logic loop = new Logic();
    loop.diviser(131);
}
void diviser(int no)
{
    int div = 2;
    int count = 0;
    while(div < no)
    {
        if(no % div == 0)
        {
            System.out.println(div);
            count = count + 1;
        } 
    div += 1;   
    }
System.out.println("count : "+count);
if(count == 0)
    {
        System.out.println("Prime");  
    }
else
    {
        System.out.println("Not Prime");    
    }
}

}
