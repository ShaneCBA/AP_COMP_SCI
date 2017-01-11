public class SortedIntList extends IntList {

	public SortedIntList (int size){
		super(size);
	}

	public void add(int value)
	{
		if (numElements == list.length)
			System.out.println("Can't add, list is full");
		else {
			if (numElements == 0){
				list[0]=value;
				numElements++;
			}
			else{
				for (int i = 0; i < numElements; i++){
					if (list[numElements-1] < value)
					{
						list[numElements]=value;
						break;
					}
					if (list[i] >= value) {
						int temp;
						int temp2 = list[i];
						list[i] = value;
						list[i+1]=temp2;

						for (int n = i+1; n < numElements; n++) {
							temp = list[n];
							list[n] = temp2;
							temp2 = list[n+1];
							System.out.println(this);
						}
						break;
					}
					System.out.println(this);
				}
			numElements++;
			}
		}
    }
}