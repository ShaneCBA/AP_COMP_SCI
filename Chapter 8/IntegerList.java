// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create and fill
// a list of integers.
//
// ****************************************************************

public class IntegerList
{
    int[] list; //values in the list
    private int count=0;


    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
	list = new int[size];
	count = size;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i<list.length; i++)
	    list[i] = (int)(Math.random() * 100) + 1;

    }


    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
	for (int i=0; i < count; i++)
	    System.out.println(i + ":\t" + list[i]);
    }


    //--------------------------------------------------------------
    // Doubles the size of the list.
    //--------------------------------------------------------------
	public void doubleSize() {
		int[] temp = new int[list.length*2];

		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}
		list = temp;
	}

    //--------------------------------------------------------------
    // Adds an element to the list.  If the array is full its size
    // is doubled first.
    //--------------------------------------------------------------
	public void addElement(int newValue) {
		if (count==list.length) {
			doubleSize();
		}
		list[count]=newValue;
		count++;
	}

    //---------------------------------------------------------------
    // Removes the first occurrence of newVal from the list.
    //---------------------------------------------------------------
	public void removeFirst(int value) {
		boolean found = false;

		for (int i = 0; i < list.length; i++){
			if (list[i]==value){
				found = true;
			}
			if (found){
				if (i+1 < count)
					list[i] = list[i+1];
			}
		}
		if (found) {
			list[count-1]=0;
			count--;
		}
	}

    //-------------------------------------------------------------
    //  Removes all occurrences of newVal from the list.
    //-------------------------------------------------------------
	public void removeAll(int value) {
		int lookAhead=0;
		for (int i = 0; i < list.length; i++){
			if (list[i]==value){
				list[i] = 0;
				count--;
				for (int n = i;n < list.length; n++){
					if(n+1 < count){
						list[n]=list[n+1];
					}
					else {
						list[n]=0;
					}
				}
			}
		}
	}

}

