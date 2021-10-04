public class LinearPolyominoCovering {
    public static String findCovering(String region) {
        String covering = region.replaceAll("XXXX", "AAAA").replaceAll("XX",
                "BB");
        if (covering.indexOf("X") >= 0) {
            return "impossible";
        } else {
            return covering;
        }
    }

    public static void main(String[] args) {
        System.out.println(findCovering("XXXX....XXX.....XX"));
    }
}