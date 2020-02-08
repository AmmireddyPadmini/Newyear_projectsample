package com.epam.maven_simplae_project;
import java.util.Scanner;
public class New_year extends Sweets implements chocalstes
{
	public int weight_choclates(int no_chocolates,int weight)
	{
		return (no_chocolates*weight);
	}
	public int cost_chocolate(int no_of_chocolates,int weight)
	{
		return no_of_chocolates*weight;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of gifts");
		int x=sc.nextInt();
		int[] arr_chocolates_weight=new int[x+1];
		String[] a=new String[x+1];
		for(int t=1;t<=x;t++)
		{
			System.out.println("Gift detailes:"+t);
			chocalstes candy=new New_year();
			System.out.println("Enter Candy types:");
			String cand=sc.next();
			a[t]=cand;
			System.out.println("No of candies,weigth,cost of each");
			int no_candy=sc.nextInt();
			int cost_candy=sc.nextInt();
			int weight_c=sc.nextInt();
			Sweets sweet=new Sweets();
			System.out.println("Enter type of sweet:");
			String sweets=sc.next();
			System.out.println("No.of sweets,weights and cost");
			int noof_sweets=sc.nextInt();
			int weight_sweet=sc.nextInt();
			int cost_sweet=sc.nextInt();
			System.out.println("Candies are type:"+cand+"  Total_weght:"+candy.weight_choclates(no_candy,weight_c)+"  Total cost:"+candy.cost_chocolate(no_candy,weight_c));
		}
		for (int i=0;i>arr_chocolates_weight.length;i++)
		{
			for(int j=i+1;i<arr_chocolates_weight.length;j++)
			{
				if(arr_chocolates_weight[i]>arr_chocolates_weight[j])
				{
					int tmp=arr_chocolates_weight[i];
					arr_chocolates_weight[i]=arr_chocolates_weight[j];
					arr_chocolates_weight[j]=tmp;
					String s=a[i];
					a[i]=a[j];
					a[i]=s;
					
				}
					
			}
		}
		System.out.println("chocolates in gifts:");
		for(int i=1;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();


		
		
	}
	
}


