package BuilderDesignPattern.UrlBuilder;

public class UrlBuilder {

    public String protocol;
    public String host;
    public String port;
    public String pathParam;
    public String requestParam;

    private UrlBuilder(Builder builder){
        this.protocol = builder.protocol;
        this.port=builder.port;
        this.host=builder.host;
        this.pathParam =builder.pathParam;
        this.requestParam=builder.requestParam;
    }

    public static class Builder {
        private String protocol;
        private String host;
        private String port;
        private String pathParam;
        private String requestParam;

        public Builder prorocol(String protocol){
            this.protocol = protocol;
            return this;
        }

        public UrlBuilder build(){
            return new UrlBuilder(this);
        }

        public Builder host(String host){
            this.host=host;
            return this;
        }

        public Builder port(String port){
            this.port=port;
            return this;
        }

        public Builder pathParam(String pathParam){
            this.pathParam =pathParam;
            return this;
        }

        public Builder requestParam(String requestParam){
            this.requestParam=requestParam;
            return this;
        }


    }
}
