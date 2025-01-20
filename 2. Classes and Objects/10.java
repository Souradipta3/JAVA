// Assignment 10: TestScores Class
class TestScores {
    private double score1;
    private double score2;
    private double score3;

    public void setScores(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public double getAverage() {
        return (score1 + score2 + score3) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestScores testScores = new TestScores();

        System.out.print("Enter score 1: ");
        double s1 = scanner.nextDouble();
        System.out.print("Enter score 2: ");
        double s2 = scanner.nextDouble();
        System.out.print("Enter score 3: ");
        double s3 = scanner.nextDouble();

        testScores.setScores(s1, s2, s3);
        System.out.println("Average Score: " + testScores.getAverage());
    }
}
