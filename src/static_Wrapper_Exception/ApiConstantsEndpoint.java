package static_Wrapper_Exception;

public enum ApiConstantsEndpoint {
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dashboard"),
    CHATBOAT_PAGE("https://app.vwo.com/chat");

    private String name;
//we can create a constructer of a enum.
    ApiConstantsEndpoint(String name){
        this.name = name;
    }
    String getValue(){
        return name;
    }
}
