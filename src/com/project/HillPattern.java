public class HillPattern
{
	public static void main(String[] args) {
	HillPattern m=new HillPattern();
    m.totalHillPatern(5,10,2);
	}
	public void totalHillPatern(int input1, int input2, int input3){
    int row=1,num=input2,sum=0,i;
    while(input1-- >0)
    {
    i=0;
    while(i++ < row)
    {
    sum+=num;
    }
    num+=input3;
    row++;
    }
     System.out.println(sum);
}
}
