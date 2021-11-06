package jump2java;

public class TestStringBuffer {
    public static void main(String[] args) {
    	// StringBuffer 예제
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
        
        // String과 비교
        String temp = "";
        temp += "hello";
        temp += " ";
        temp += "jump to java";
        System.out.println(temp);
        
        // insert 메소드 예제
        sb.insert(0, "Wow, ");
        System.out.println(sb.toString());
        
        // substring 메소드 예제
        System.out.println(sb.substring(0, 4));
    }
}
