public class RemoveInformation {
    public static void main(String[] args) {
        String str = "RCC Institute of Information Technology";
        String modifiedStr = str.replace("Information", "").trim();
        System.out.println("Modified String: " + modifiedStr);
    }
}
