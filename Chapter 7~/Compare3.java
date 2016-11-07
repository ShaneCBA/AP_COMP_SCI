public class Compare3 {
	/*public static Integer largest (Integer int1, Integer int2, Integer int3){
		//return (int1 > int2)? ((int1 > int3)?int1:int3) : ((int2 > int3)?int2:int3);
	}*/
	public static Comparable largest (Comparable val1, Comparable val2, Comparable val3){
		return (val1.compareTo(val2)==1)?((val1.compareTo(val3)==1)?val1:val3):((val2.compareTo(val3)==1)?val2:val3);
	}
}