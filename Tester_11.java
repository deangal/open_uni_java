import java.io.*;
import java.util.*;

/** Version 14-02-22 1.4 
 * Last update 22/03/2022 by ilay
 * **/
public class Tester_11
{
	private static int count = 0;
	private static enum tests {TEST_1, TEST_2};
	private static LinkedList<AbstractMap.SimpleEntry<String, String>>  testsList;

	private static void createTest(tests numOfTest) 
	{
		testsList = new LinkedList<AbstractMap.SimpleEntry<String, String>>();

		if(numOfTest == tests.TEST_1)
		{
			testsList.add(new AbstractMap.SimpleEntry<>("5 7", "3 8\n3 6\n4 5\n6 5\n7 6\n7 8")); 
			testsList.add(new AbstractMap.SimpleEntry<>("6 2", "4 1\n4 3\n8 1\n8 3\n5 4\n7 4")); 
			testsList.add(new AbstractMap.SimpleEntry<>("4 5", "2 4\n2 6\n3 3\n3 7\n5 3\n5 7\n6 4\n6 6"));

			testsList.add(new AbstractMap.SimpleEntry<>("1 1", "2 3\n3 2\n"));
			testsList.add(new AbstractMap.SimpleEntry<>("1 8", "3 7\n2 6\n"));
			testsList.add(new AbstractMap.SimpleEntry<>("8 1", "6 2\n7 3\n"));
			testsList.add(new AbstractMap.SimpleEntry<>("8 8", "7 6\n6 7\n"));

			/* ----------------------------- Add more for test 1 here ----------------------------- */

		}
		else if(numOfTest == tests.TEST_2)
		{
			//no threats
			testsList.add(new AbstractMap.SimpleEntry<>("b 2 3 r 5 5", "no threat"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 1 1 b 1 8", "no threat"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 1 1 b 3 2", "no threat"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 2 3 k 4 5", "no threat"));

			//validation error
			
			testsList.add(new AbstractMap.SimpleEntry<>("k 5 3 k 7 5", "Chessmen should be different from each other"));
			testsList.add(new AbstractMap.SimpleEntry<>("b 2 3 b 4 5", "Chessmen should be different from each other"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 5 3 r 7 5", "Chessmen should be different from each other"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 1 1 r 1 8", "Chessmen should be different from each other"));

			testsList.add(new AbstractMap.SimpleEntry<>("k 10 -1 r -5 17", "Position is not legal"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 0 3 b 7 5", "Position is not legal"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 2 9 r 7 5", "Position is not legal"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 5 3 b 9 5", "Position is not legal"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 2 3 r 7 -1", "Position is not legal"));
			testsList.add(new AbstractMap.SimpleEntry<>("k -1 3 b 7 5", "Position is not legal"));

			testsList.add(new AbstractMap.SimpleEntry<>("r 1 1 b 1 1", "Chessmen positions should not be identical"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 2 2 b 2 2", "Chessmen positions should not be identical"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 3 5 k 3 5", "Chessmen positions should not be identical"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 7 7 b 7 7", "Chessmen positions should not be identical"));

			//multiple validation error
			testsList.add(new AbstractMap.SimpleEntry<>("r -1 -1 r -1 -1", "Chessmen should be different from each other"));
			testsList.add(new AbstractMap.SimpleEntry<>("k -1 9 k 2 3", "Chessmen should be different from each other"));
			testsList.add(new AbstractMap.SimpleEntry<>("b 1 2 b 1 2", "Chessmen should be different from each other"));

			testsList.add(new AbstractMap.SimpleEntry<>("b -1 2 r -1 2", "Position is not legal"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 9 2 b 9 2", "Position is not legal"));

			//threats
			testsList.add(new AbstractMap.SimpleEntry<>("r 1 1 b 1 8", "rook threats bishop"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 1 1 k 1 8", "rook threats knight"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 1 1 b 3 2", "knight threats bishop"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 1 1 r 2 3", "knight threats rook"));
			testsList.add(new AbstractMap.SimpleEntry<>("b 2 3 r 4 5", "bishop threats rook"));
			testsList.add(new AbstractMap.SimpleEntry<>("b 2 3 k 4 5", "bishop threats knight"));
			testsList.add(new AbstractMap.SimpleEntry<>("b 2 2 r 1 1", "bishop threats rook"));
			testsList.add(new AbstractMap.SimpleEntry<>("b 2 2 k 1 3", "bishop threats knight"));
			testsList.add(new AbstractMap.SimpleEntry<>("r 3 1 b 2 2", "bishop threats rook"));
			testsList.add(new AbstractMap.SimpleEntry<>("k 3 3 b 2 2", "bishop threats knight"));


			/* ----------------------------- Add more for test 2 here ----------------------------- */

		}
		else
			System.out.println("Error in createTest number " + numOfTest);

	}

	public static void main(String[] args) 
	{
		System.out.println("------------ BEGIN TEST Q1 ------------");
		runTest(tests.TEST_1);
		System.out.println("------------ End TEST Q1 ------------\n\n");

		System.out.println("------------ BEGIN TEST Q2 ------------");
		runTest(tests.TEST_2);
		System.out.println("------------ End TEST Q2 ------------");
	}

	private static void runTest(tests numOfTest) 
	{
		createTest(numOfTest);
		count = 0;

		for (int i = 0; i < testsList.size(); i++)
			test(testsList.get(i).getKey(),testsList.get(i).getValue(), numOfTest);
	}

	private static void test(String input, String output, tests numOfTest) 
	{
		count++;

		InputStream stdin = System.in;
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		PrintStream old = System.out;
		System.setOut(new PrintStream(b));
		try 
		{
			System.setIn(new ByteArrayInputStream(input.getBytes()));
			if (numOfTest == tests.TEST_1)
				Knight.main(new String[] {});
			else if(numOfTest == tests.TEST_2)
				Chess.main(new String[] {});
			else
				System.out.println("Error in test number " + numOfTest);
		} catch (Exception e) 
		{
			System.out.println("Error!!!\n" + e.getMessage());
		}
		finally 
		{
			System.setIn(stdin);
			System.out.flush();
			System.setOut(old);
		}

		String outputStudent = b.toString();

		if (match(outputStudent, output, numOfTest))
		{
			System.out.printf("%s %30s\n","Test #" + count, "\t\tPassed");
		}
		else
		{
			System.out.printf("\n%s %30s","Test #" + count, "\t\tFAILED!!!!\n");
			System.out.println("Input is:\n" + input);
			System.out.println("Student's output is:\n" + outputStudent);
			System.out.println("Output should contain:\n" + output);
		}
	}

	private static boolean match(String result, String ans, tests numOfTest) {
		if (numOfTest == tests.TEST_1) {
			result = result.replace("\r", "");
			result = result.substring(result.lastIndexOf(":") + 2);

			String[] resultArr = result.split("\n");
			String[] ansArr = ans.split("\n");

			if (resultArr.length != ansArr.length)
				return false;

			Arrays.sort(resultArr);
			Arrays.sort(ansArr);

			for (int i = 0; i < resultArr.length; i++) {
				if (!resultArr[i].equals(ansArr[i]))
					return false;
			}
			return true;
		}
		else if (numOfTest == tests.TEST_2) {
			int lines = result.length() - result.replace("\n", "").length();
			if (result.contains(ans) && lines<=7)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}