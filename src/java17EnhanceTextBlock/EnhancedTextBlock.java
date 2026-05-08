package java17EnhanceTextBlock;

public class EnhancedTextBlock {

    static String multiLineStringMethod() {
        var multLineString = "This is a \n " +
                "second line of the string \n" +
                "This is third line";
        return multLineString;
    }

    static String multiLineStringEnhanceMethod() {
        var multLineStringEnhanced = """
                This is a
                second line of the enhanced string
                This is third line of the enhanced string
                """ ;
        return multLineStringEnhanced;
    }
    static String multiLineStringEnhanceMethodWithArgument(String name) {
        var multLineStringEnhanced = """
                My name is %s
                second line of the enhanced string
                This is third line of the enhanced string
                """ .formatted(name);
        return multLineStringEnhanced;
    }
    static String writeTheSQLQuery() {
        var multLineStringEnhanced = """
                select * from the Emp
                where emp_id = 34;
                """;
        return multLineStringEnhanced;
    }
    static String sampleJSON() {
        var multLineStringJson = """
                {
                    "id":1,
                    "fName":"Nadeem",
                    "lName" : "Anwar,
                    "Mobile": "8787878998"
                }
                """;
        return multLineStringJson;
    }

    public static void main(String[] args) {
        System.out.println(multiLineStringMethod());

        System.out.println(multiLineStringEnhanceMethod());

        System.out.println(multiLineStringEnhanceMethodWithArgument("Nadeem"));

        System.out.println("SQL -> "+writeTheSQLQuery());

        System.out.println("JSON -> "+sampleJSON());
    }

}
