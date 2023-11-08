import work01.Utilitor;
        import work02.Person;

public class Main {
    public static void main(String[] args) {
        var utilitor = new Utilitor();
        var person = new Person("Trin", "Meesuannil");
        //utilitor.testString("");
        //utilitor.testPositive(-5);
        System.out.println(utilitor.computeIsbn10(992_158_109L));//992156109
    }
}
