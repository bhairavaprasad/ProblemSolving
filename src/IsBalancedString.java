import java.util.Stack;

public class IsBalancedString {

	public static boolean isBalanced(final String str) {

		Stack<Character> stack = new Stack<Character>();

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (isOpeningBracket(charArray[i])) {
				stack.push(charArray[i]);
			} else {
				if (closingBracket(stack.peek()) != null && charArray[i] == closingBracket(stack.pop())) {
					continue;
				}
				return false;
			}
		}

		return stack.isEmpty();
	}

	private static Character closingBracket(Character ch) {
		if (ch == '{') {
			return '}';
		} else if (ch == '[') {
			return ']';
		} else if (ch == '(') {
			return ')';
		}
		return null;
	}

	private static boolean isOpeningBracket(char ch) {
		if (ch == '{' || ch == '[' || ch == '(') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isBalanced("{{}}"));
		System.out.println(isBalanced("{{}"));
		System.out.println(isBalanced("{{"));
		System.out.println(isBalanced("([{{}}])"));
		System.out.println(isBalanced("([{}}])"));
	}

}
