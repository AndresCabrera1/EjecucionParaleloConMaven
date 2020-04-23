package co.com.zalenium.test.userinterface;

public enum HomeGoogle {
    UrlGoogle("https://www.google.com/");

    private final String url;

    HomeGoogle(String url){
        this.url = url;
    }

    public String Url(){
        return url;
    }

}
