package Eric;

import java.util.Scanner;

public class 函数作业 {

//	private static int jieguo;

	public static void jiajian(String[] str, int diyishu) {
		int jieguo = 0;
		for (int i = 0; i < str.length; i++) {
			int a1 = str[i].indexOf('+');
			int a2 = str[i].indexOf('-');
			if (a1 != -1 || a2 != -1) {
				if (str[i].equals("+")) {
					String marksStr1 = str[i + 1];
					int a = Integer.parseInt(marksStr1);
					jieguo = jieguo + a;
				}
				if (str[i].equals("-")) {
					String marksStr1 = str[i + 1];
					int a = Integer.parseInt(marksStr1);
					jieguo = jieguo - a;
				}

			}
			if (i == str.length - 1) {
				jieguo = jieguo + diyishu;
				System.out.println(jieguo);

			}
		}
	}

	public static int jiacheng(String[] str, int diyishu) {
		int jieguo = 0;
		int jia=0;
		int cheng=1;
		int jiajieguo = 0;
		int chengjieguo=0;
		for (int i = 0; i < str.length; i++) {
			int a1 = str[i].indexOf('+');
			int a2 = str[i].indexOf('*');
			if (a1 != -1 || a2 != -1) {
				if (str[i].equals("+")) {
					String marksStr1 = str[i + 1];
					int a = Integer.parseInt(marksStr1);
					jia=0;
					jia = jia + a;
					jiajieguo=jiajieguo+jia;
					}
					if(str[1].equals("+")) {
						jieguo=jia;
				}else {
					jieguo=jieguo+jia;
				}
				if (str[i].equals("*")) {
					String marksStr1 = str[i + 1];
					int a = Integer.parseInt(marksStr1);
					jieguo = jieguo * a;
				}

			}
			if (i == str.length - 1) {
				if (str[1].equals("+")) {
				jieguo = jieguo + diyishu;
				System.out.println(jieguo);
				}
				if (str[1].equals("*")) {
				jieguo = jieguo * diyishu;
				System.out.println(jieguo);	
				}
			}
		}
//		jieguo = jieguo * diyishu;
		return jieguo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int jieguo = 0;
		int z = in.nextInt();
		int shuzu = z + z - 1;
		String a;
		int diyishu = 0;
		String[] str = new String[shuzu];
		for (int i = 0; i < str.length; i++) {
			str[i] = in.next();
			if (i == 0) {
				a = str[i];
				diyishu = Integer.parseInt(a);
			}
		}
//		if (str[1].equals("+") || str[1].equals("-")) {
//			jiajian(str, diyishu);
//		}

		if (str[1].equals("+") || str[1].equals("*")) {
			jiacheng(str, diyishu);
		}

	}
}
