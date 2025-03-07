package BuilderDesignPattern.UrlBuilder;

public class CallerPoint {
    public static void main(String[] args) {
        UrlBuilder.Builder builder = new UrlBuilder.Builder();
        builder.prorocol("https://").host("www.google.co.in").port("//1000").pathParam("/NA").requestParam("/NA");
        UrlBuilder build = builder.build();
        System.out.println(build.host);
        System.out.println(build.port);
        System.out.println(build.protocol);
    }
}
