class comparator implements Comparator<Map.Entry<Integer,Integer>>
{

	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
	{
		if(o1.getValue() > o2.getValue())
			return -1;
		else if(o1.getValue() == o2.getValue())
			return 0;
		else if(o1.getValue() < o2.getValue())
			return 1;
		
		return Integer.MIN_VALUE;
	}
	
}
public class SortArrayByFrequency 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(sc.readLine());
		
		while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			String[] temp = sc.readLine().split(" ");
			
			//int[] array = new int[size];
			
			for(int i = 0; i < size; i++)
			{
				int num = Integer.parseInt(temp[i]);
				
				if(map.containsKey(num))
				{
					map.put(num, map.get(num) + 1);
				}
				else
				{
					map.put(num, 0);
				}
			}
			
			List<Map.Entry<Integer,Integer>> set = new ArrayList<Map.Entry<Integer,Integer>> (map.entrySet());
			
			Collections.sort(set,new comparator());
			
			for(int i = 0;i<map.size();i++)
			{
				int count = set.get(i).getValue();
				while(count >= 0)
				{
					System.out.print(set.get(i).getKey() + " ");
					count -- ;
				}
			}
			
			System.out.println();
			n--;
		}
	}
}
