package prg9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> obj = new ArrayList<String>();
		int op,j;
		String str, ch;
		for(;;)
		{
			System.out.println("Select the operation ");
			System.out.print("1.Append - at the end\n2.Insert - add at particular index\n3.Search\n");
			System.out.print("4.List all String starting with given letter\n5.Size\n6.Remove an element from the list\n");
			System.out.print("7.Sort the list\n8.Display the list\n9.Exit\n");
			op = sc.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("Enter the element: ");
				str = sc.next();
				
				obj.add(str);
				break;
			
			case 2:
				System.out.println("Enter the element:");
				str = sc.next();
				System.out.println("Enter the index of the element: ");
				j = sc.nextInt();
				
				obj.add(j, str);
				break;
			
			case 3:
				System.out.println("Enter the element to be searched: ");
				str = sc.next();
				
				j = obj.indexOf(str);
				if(j==-1){
					System.out.println("Element not found");
					break;
				}
				System.out.println("Element found at position: " + j);
				break;
				
			case 4:
				System.out.println("Enter the Specific Character: ");
				ch = sc.next();
				
				for(int i = 0; i<(obj.size()); i++) {
					str= obj.get(i);
					if(str.startsWith(ch)) {
						System.out.println(str+ "\n");
					}
				}
				break;
				
			case 5:
				System.out.println("The size of the list is: " + obj.size());
				break;
			
			case 6:
				System.out.println("Enter the element to be removed: ");
				str = sc.next();
				
				j = obj.indexOf(str);
				obj.remove(j);
				break;
				
			case 7:
				Collections.sort(obj);
				System.out.println("The sorted list is " +obj);
				break;
				
			case 8:
				System.out.println("The following are the elements of the list " + obj + "\n" );
				break;
				
			case 9:System.exit(0);
				   break;
			}
		}
	}

}
