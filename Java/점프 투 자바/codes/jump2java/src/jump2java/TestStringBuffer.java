package jump2java;

public class TestStringBuffer {
    public static void main(String[] args) {
    	// StringBuffer ����
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
        
        // String�� ��
        String temp = "";
        temp += "hello";
        temp += " ";
        temp += "jump to java";
        System.out.println(temp);
        
        // insert �޼ҵ� ����
        sb.insert(0, "Wow, ");
        System.out.println(sb.toString());
        
        // substring �޼ҵ� ����
        System.out.println(sb.substring(0, 4));
    }
}
