public class Average {
	public static void main(String[] args){
		if (args.length==0){
			System.out.println("Add Arguements");
			return;
		}
		int total=0;
		for (int i = 0; i < args.length; i++){
			total+=Integer.parseInt(args[i]);
		}
		double avg=(double)total/args.length;
		System.out.println("Average: "+avg);
	}
}